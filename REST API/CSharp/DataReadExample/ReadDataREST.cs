using Models;
using Models.Backend.DTO.V1_1;
using Models.DTO.V1;
using ServiceStack;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;

namespace ReadDataREST
{
    internal class Program
    {

        public static void Main(string[] args)
        {
            try
            {
                // Connect to REST API Server.
                ServiceClientBase _client = Connect();

                // Get list of RAPID databases on system.
                List<string> databases = GetDatabases(_client);

                // Iterate through databases.
                foreach (string db in databases)
                {
                    // Get alarm nodes in database.
                    List<string> alarmNodes = GetAlarmNodes(_client, db);

                    // Iterate through alarm nodes.
                    foreach (string alarmNode in alarmNodes)
                    {
                        // Get alarm areas in alarm node.
                        List<string> alarmAreas = GetAlarmAreas(_client, db, alarmNode);

                        // Get alarm data for alarm areas in node.
                        AlarmDataResponse alarmData = GetAlarmData(_client, db, alarmNode, alarmAreas);

                        // Iterate through alarm data points and output to console.
                        foreach (AlarmDataPoint point in alarmData.AlarmData)
                        {
                            // Build Vendor Defined attribute summary string.
                            string vdaSummary = "";
                            for (int i=0;i<point.VendorDefinedAttributeIDs.Count;i++)
                            {
                                vdaSummary += point.VendorDefinedAttributeIDs[i] + ":" + point.VendorDefinedAttributeValues[i];
                                if (i < point.VendorDefinedAttributeIDs.Count - 1)
                                    vdaSummary += ";";
                            }

                            // Output alarm data point to console.
                            Console.WriteLine("Alarm time: " + point.EventTime + ",Source: " + point.Source + ",Message: " + point.Message + ",Severity: " + point.Severity + ",Attribute data: " + vdaSummary);
                        }
                    }

                    // Get process nodes in database.
                    List<string> processNodes = GetProcessNodes(_client, db);

                    // Iterate through process nodes.
                    foreach (string processNode in processNodes)
                    {
                        // Get alarm areas in alarm node.
                        List<string> itemNames = GetItems(_client, db, processNode);

                        foreach (string itemName in itemNames)
                        {
                            // Get process data for node.
                            ProcessDataResponse procesData = GetProcessData(_client, db, processNode, itemName);

                            // Iterate through process data points and output to console.
                            foreach (ProcessDataPoint point in procesData.ProcessData)
                            {
                                // Output alarm data point to console.
                                Console.WriteLine("Time: " + point.EventTime + ",Value: " + point.EventValue + ",Quality: " + point.Quality.ToString());
                            }
                        }
                    }

                }
            }
            catch (Exception ex)
            {
                Debug.WriteLine("\nException: " + ex.Message);
                Console.WriteLine("\nException: " + ex.Message);
            }
        }

        /// <summary>
        /// Get databases on system.
        /// </summary>
        /// <param name="client"></param>
        /// <returns></returns>
        public static List<string> GetDatabases(ServiceClientBase client)
        {
            return new List<string>(client.Get(new DatabaseList()) as string[]);
        }

   
        #region ALARM_CALLS
        /// <summary>
        /// Get alarm nodes from database.
        /// </summary>
        /// <param name="client"></param>
        /// <param name="dbName"></param>
        /// <returns></returns>
        public static List<string> GetAlarmNodes(ServiceClientBase client, string dbName)
        {
            string rawDBName = dbName.Substring(dbName.LastIndexOf("/") + 1);
            return new List<string>(client.Get(new NodeList() { DbName = rawDBName, Filter = "*", Type = "OPC_AE" }) as string[]);
        }

        /// <summary>
        /// Get alarm areas from database, node.
        /// </summary>
        /// <param name="client"></param>
        /// <param name="dbName"></param>
        /// <param name="nodeName"></param>
        /// <returns></returns>
        public static List<string> GetAlarmAreas(ServiceClientBase client, string dbName, string nodeName)
        {
            string rawDBName = dbName.Substring(dbName.LastIndexOf("/") + 1);
            string rawAlarmNodeName = nodeName.Substring(nodeName.LastIndexOf("/") + 1);
            return client.Get(new AlarmAreaList() { DbName = rawDBName, NodeName = rawAlarmNodeName });
        }


        /// <summary>
        /// Get Alarm data for alarm areas (for last day)
        /// </summary>
        /// <param name="client"></param>
        /// <param name="dbName"></param>
        /// <param name="nodeName"></param>
        /// <param name="alarmAreas"></param>
        /// <returns></returns>
        public static AlarmDataResponse GetAlarmData(ServiceClientBase client, string dbName, string nodeName, List<string> alarmAreas)
        {
            string rawDBName = dbName.Substring(dbName.LastIndexOf("/") + 1);
            string rawAlarmNodeName = nodeName.Substring(nodeName.LastIndexOf("/") + 1);

            List<string> rawAlarmAreas = new List<string>();
            for (int i = 0; i < alarmAreas.Count; i++)
                rawAlarmAreas.Add(alarmAreas[i].Substring(alarmAreas[i].LastIndexOf("/") + 1));

            AlarmDataRead alarmDataRead = new AlarmDataRead();
            alarmDataRead.DbName = rawDBName;
            alarmDataRead.NodeName = rawAlarmNodeName;
            alarmDataRead.AlarmAreas = rawAlarmAreas;
            alarmDataRead.StartTime = DateTime.Now.Subtract(TimeSpan.FromDays(30)).ToString();
            alarmDataRead.EndTime = DateTime.Now.ToString();
            alarmDataRead.FieldFilterIDs = new List<AlarmFieldFilter_e>() { AlarmFieldFilter_e.Source };

            List<nuaViews.Model.ExternalServices.Variant> sourceFilter = new List<nuaViews.Model.ExternalServices.Variant>() { new nuaViews.Model.ExternalServices.Variant("*") };
            alarmDataRead.FieldFilterValues = new List<List<nuaViews.Model.ExternalServices.Variant>>() { sourceFilter };
            alarmDataRead.ReturnedFields = new List<AlarmFieldFilter_e>() { AlarmFieldFilter_e.Source, AlarmFieldFilter_e.EventType, AlarmFieldFilter_e.VendorAttributeID, AlarmFieldFilter_e.Message, AlarmFieldFilter_e.Severity };

            // Return alarm data.
            return client.Put(alarmDataRead);
        }

        #endregion

        #region PROCESS_CALLS

        /// <summary>
        /// Get process nodes from database.
        /// </summary>
        /// <param name="client"></param>
        /// <param name="dbName"></param>
        /// <returns></returns>
        public static List<string> GetProcessNodes(ServiceClientBase client, string dbName)
        {
            string rawDBName = dbName.Substring(dbName.LastIndexOf("/") + 1);
            return new List<string>(client.Get(new NodeList() { DbName = rawDBName, Filter = "*", Type= "OPC,DataEntry" }) as string[]);
        }


        /// <summary>
        /// Get alarm areas from database, node.
        /// </summary>
        /// <param name="client"></param>
        /// <param name="dbName"></param>
        /// <param name="nodeName"></param>
        /// <returns></returns>
        public static List<string> GetItems(ServiceClientBase client, string dbName, string nodeName)
        {
            string rawDBName = dbName.Substring(dbName.LastIndexOf("/") + 1);
            string rawNodeName = nodeName.Substring(nodeName.LastIndexOf("/") + 1);
            return new List<string>(client.Get(new ItemList() { DbName = rawDBName, NodeName = rawNodeName }));
        }


        /// <summary>
        /// Get process data for process node.
        /// </summary>
        /// <param name="client"></param>
        /// <param name="dbName"></param>
        /// <param name="nodeName"></param>
        /// <returns></returns>
        public static ProcessDataResponse GetProcessData(ServiceClientBase client, string dbName, string nodeName, string itemName)
        {
            string rawDBName = dbName.Substring(dbName.LastIndexOf("/") + 1);
            string rawNodeName = nodeName.Substring(nodeName.LastIndexOf("/") + 1);
            string rawItemName = itemName.Substring(itemName.LastIndexOf("/") + 1);

            ProcessDataReadV1_1 processDataRead = new ProcessDataReadV1_1();
            processDataRead.DbName = rawDBName;
            processDataRead.NodeName = rawNodeName;
            processDataRead.ItemName = rawItemName;
            processDataRead.StartTime = DateTime.Now.Subtract(TimeSpan.FromDays(30));
            processDataRead.EndTime = DateTime.Now;
            processDataRead.Aggregate = ProcessDataRequest.Aggregate_e.Maximum;
            processDataRead.ResampleCount = 100;
            

            // Return alarm data.
            return client.Put(processDataRead);
        }

   /// <summary>
        /// Connect to REST Server. ** Note: username and password should be changed according to REST Server authentication.
        /// </summary>
        /// <param name="serverURL"></param>
        /// <param name="username"></param>
        /// <param name="password"></param>
        /// <returns></returns>
        public static ServiceClientBase Connect(string serverURL = "http://localhost:3001", string username = "admin", string password = "admin")
        {
            //TODO: Check lifetime on connection. If it has expired, make a new connection
            JsonServiceClient client = new JsonServiceClient(serverURL);

            if (!string.IsNullOrEmpty(username))
            {
                var response = client.Post(new Authenticate
                {
                    provider = "AutomsoftAuthProvider",
                    UserName = username,
                    Password = password,
                    RememberMe = true, //important tell client to retain permanent cookies
                });

            }
            return client;
        }

        #endregion
    }
}