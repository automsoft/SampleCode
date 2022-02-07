using System;
using System.Collections.Generic;
using System.Diagnostics;
using ServiceStack;
using Models.Backend.DTO.V1_2;
using Models.DTO.V1;

namespace ReadDataREST
{
    class SampleClient
    {
        public static void Main(string[] args)
        {
            try
            {
                var _client = new SampleClient();

                _client.Connect();
                _client.QueryData();
            }
            catch (Exception ex)
            {
                Debug.WriteLine("\nException: " + ex.Message);
                Console.WriteLine("\nException: " + ex.Message);
            }
        }

        public void QueryData()
        {
            // Get list of RAPID databases on system.
            var databases = GetDatabases();

            // Iterate through databases.
            foreach (var db in databases)
            {
                // query process data for database
                QueryProcessData(db);

                // query alarm data for database
                QueryAlarmData(db);
            }
        }

        void QueryProcessData(string db)
        {
            // Get process nodes in database.
            var processNodes = GetProcessNodes(db);

            // Iterate through process nodes.
            foreach (var processNode in processNodes)
            {
                // Get alarm areas in alarm node.
                var itemNames = GetItems(db, processNode);

                foreach (var itemName in itemNames)
                {
                    // Get process data for node.
                    var procesData = GetProcessData(db, processNode, itemName);

                    // Iterate through process data points and output to console.
                    foreach (var point in procesData.ProcessData)
                    {
                        // Output alarm data point to console.
                        Console.WriteLine("Time: " + point.EventTime + ",Value: " + point.EventValue + ",Quality: " + point.Quality.ToString());
                    }
                }
            }
        }

        void QueryAlarmData(string db)
        {
            // Get alarm nodes in database.
            var alarmNodes = GetAlarmNodes(db);

            // Iterate through alarm nodes.
            foreach (var alarmNode in alarmNodes)
            {
                // Get alarm areas in alarm node.
                var alarmAreas = GetAlarmAreas(db, alarmNode);

                // Get alarm data for alarm areas in node.
                var alarmData = GetAlarmData(db, alarmNode, alarmAreas);

                // Iterate through alarm data points and output to console.
                foreach (var point in alarmData.AlarmData)
                {
                    // Build Vendor Defined attribute summary string.
                    var vdaSummary = "";
                    for (var i = 0; i < point.VendorDefinedAttributeIDs.Count; i++)
                    {
                        vdaSummary += point.VendorDefinedAttributeIDs[i] + ":" + point.VendorDefinedAttributeValues[i];
                        if (i < point.VendorDefinedAttributeIDs.Count - 1)
                            vdaSummary += ";";
                    }

                    // Output alarm data point to console.
                    Console.WriteLine("Alarm time: " + point.EventTime + ",Source: " + point.Source + ",Message: " + point.Message + ",Severity: " + point.Severity + ",Attribute data: " + vdaSummary);
                }
            }
        }

        /// <summary>
        /// Get databases from REST Server.
        /// </summary>
        /// <param name="_client"></param>
        /// <returns></returns>
        List<string> GetDatabases()
        {
            return new List<string>(_client.Get(new DatabaseList()) as string[]);
        }

   
        #region ALARM_CALLS
        /// <summary>
        /// Get alarm nodes from database.
        /// </summary>
        /// <param name="_client"></param>
        /// <param name="dbName"></param>
        /// <returns></returns>
        List<string> GetAlarmNodes(string dbName)
        {
            var rawDBName = dbName.Substring(dbName.LastIndexOf("/") + 1);
            return new List<string>(_client.Get(new NodeList() { DbName = rawDBName, Filter = "*", Type = "OPC_AE" }) as string[]);
        }

        /// <summary>
        /// Get alarm areas from database, node.
        /// </summary>
        /// <param name="_client"></param>
        /// <param name="dbName"></param>
        /// <param name="nodeName"></param>
        /// <returns></returns>
        public List<string> GetAlarmAreas(string dbName, string nodeName)
        {
            var rawDBName = dbName.Substring(dbName.LastIndexOf("/") + 1);
            var rawAlarmNodeName = nodeName.Substring(nodeName.LastIndexOf("/") + 1);
            return _client.Get(new AlarmAreaList() { DbName = rawDBName, NodeName = rawAlarmNodeName });
        }


        /// <summary>
        /// Get Alarm data for alarm areas (for last day)
        /// </summary>
        /// <param name="_client"></param>
        /// <param name="dbName"></param>
        /// <param name="nodeName"></param>
        /// <param name="alarmAreas"></param>
        /// <returns></returns>
        AlarmDataResponseV1_2 GetAlarmData(string dbName, string nodeName, List<string> alarmAreas)
        {
            var rawDBName = dbName.Substring(dbName.LastIndexOf("/") + 1);
            var rawAlarmNodeName = nodeName.Substring(nodeName.LastIndexOf("/") + 1);

            var rawAlarmAreas = new List<string>();
            for (var i = 0; i < alarmAreas.Count; i++)
                rawAlarmAreas.Add(alarmAreas[i].Substring(alarmAreas[i].LastIndexOf("/") + 1));

            var alarmDataRead = new AlarmDataReadV1_2();
            alarmDataRead.DbName = rawDBName;
            alarmDataRead.NodeName = rawAlarmNodeName;
            alarmDataRead.AlarmAreas = rawAlarmAreas;

            // retrieve alarms from last 30 days
            alarmDataRead.StartTime = DateTime.Now.Subtract(TimeSpan.FromDays(30)).ToString();
            alarmDataRead.EndTime = DateTime.Now.ToString();
            alarmDataRead.FieldFilterIDs = new List<AlarmFieldFilter_e>() { AlarmFieldFilter_e.Source };

            alarmDataRead.FieldFilterValues = new List<string>() { "*" };
            alarmDataRead.ReturnedFields = new List<AlarmFieldFilter_e>() { AlarmFieldFilter_e.Source, AlarmFieldFilter_e.EventType, AlarmFieldFilter_e.VendorAttributeID, AlarmFieldFilter_e.Message, AlarmFieldFilter_e.Severity };

            // Return alarm data.
            return _client.Put(alarmDataRead);
        }

        #endregion

        #region PROCESS_CALLS

        /// <summary>
        /// Get process nodes from database.
        /// </summary>
        /// <param name="_client"></param>
        /// <param name="dbName"></param>
        /// <returns></returns>
        List<string> GetProcessNodes(string dbName)
        {
            var rawDBName = dbName.Substring(dbName.LastIndexOf("/") + 1);
            return new List<string>(_client.Get(new NodeList() { DbName = rawDBName, Filter = "*", Type= "OPC,DataEntry" }) as string[]);
        }


        /// <summary>
        /// Get alarm areas from database, node.
        /// </summary>
        /// <param name="_client"></param>
        /// <param name="dbName"></param>
        /// <param name="nodeName"></param>
        /// <returns></returns>
        List<string> GetItems(string dbName, string nodeName)
        {
            var rawDBName = dbName.Substring(dbName.LastIndexOf("/") + 1);
            var rawNodeName = nodeName.Substring(nodeName.LastIndexOf("/") + 1);
            return new List<string>(_client.Get(new ItemList() { DbName = rawDBName, NodeName = rawNodeName }));
        }


        /// <summary>
        /// Get process data for process node.
        /// </summary>
        /// <param name="_client"></param>
        /// <param name="dbName"></param>
        /// <param name="nodeName"></param>
        /// <returns></returns>
        ProcessDataResponseV1_2 GetProcessData(string dbName, string nodeName, string itemName)
        {
            var rawDBName = dbName.Substring(dbName.LastIndexOf("/") + 1);
            var rawNodeName = nodeName.Substring(nodeName.LastIndexOf("/") + 1);
            var rawItemName = itemName.Substring(itemName.LastIndexOf("/") + 1);

            var processDataRead = new ProcessDataReadV1_2();
            processDataRead.DbName = rawDBName;
            processDataRead.NodeName = rawNodeName;
            processDataRead.ItemName = rawItemName;

            // retrieve 100 data points from last 30 days
            processDataRead.StartTime = DateTime.Now.Subtract(TimeSpan.FromDays(30));
            processDataRead.EndTime = DateTime.Now;
            processDataRead.Aggregate = ProcessDataRequest.Aggregate_e.Maximum;
            processDataRead.ResampleCount = 100;

            // Return alarm data.
            return _client.Put(processDataRead);
        }
        #endregion

        ServiceClientBase _client;

        /// <summary>
        /// Connect to REST Server. ** Note: username and password should be changed according to REST Server authentication.
        /// </summary>
        /// <param name="serverURL"></param>
        /// <param name="username"></param>
        /// <param name="password"></param>
        /// <returns></returns>
        public void Connect(string serverURL = "http://localhost:3001", string username = "admin", string password = "admin")
        {
            //TODO: Check lifetime on connection. If it has expired, make a new connection
            _client = new JsonServiceClient(serverURL);

            if (!string.IsNullOrEmpty(username))
            {
                var response = _client.Post(new Authenticate
                {
                    provider = "AutomsoftAuthProvider",
                    UserName = username,
                    Password = password,
                    RememberMe = true, //important tell _client to retain permanent cookies
                });

            }
        }
    }
}