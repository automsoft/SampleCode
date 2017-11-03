import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map;
import net.servicestack.client.JsonServiceClient;
import com.automsoft.rapid.dto.*;

public class rest_client
{
    public static void main(String[] args)
    {
        try
        {
            // setup
            JsonServiceClient client = new JsonServiceClient("http://api.automsoft.com:3001");
            //client = new JsonServiceClient("http://localhost:3001");

            // credentials
            Authenticate auth = new Authenticate();
            auth.UserName = "admin";
            auth.Password = "admin";

            // authenticate
            AuthenticateResponse authResponse = client.get(auth);

            // retrieving data inserted with dbperfwrite
            String dbName = "DB1";
            String nodeName = "PerformanceTest";
            String itemName = "PerfTest_0";
            Calendar cal = Calendar.getInstance();
            Date endTime = cal.getTime();
            cal.add(Calendar.YEAR, -1);
            Date startTime = cal.getTime();
            //startTime = df.parse("2018/01/01");
            //endTime = df.parse("2018/01/02");

            // retrieve list of databases
            ArrayList<String> dbList = client.get(new DatabaseList());

            // filter using the bistel database
            Map<String, String> queryParam = new HashMap<String, String>();
            queryParam.put("DbName", dbName);

            // get nodes
            ArrayList<String> nodeList = client.get(new NodeList(), queryParam);

            // filter using the bistel node
            queryParam.put("NodeName", nodeName);

            // get items
            ArrayList<String> itemList = client.get(new ItemList(), queryParam);

            DateFormat df = new SimpleDateFormat("yyyy/MM/dd");

            // setup the data request paramters - count aggregate
            ProcessDataReadV1_1 pdRead = new ProcessDataReadV1_1();
            pdRead.DbName = dbName;
            pdRead.NodeName = nodeName;
            pdRead.ItemName = itemName;
            pdRead.Aggregate = Aggregate_e.Count;
            pdRead.StartTime = startTime;
            pdRead.EndTime = endTime;
            pdRead.ResampleCount = 1;

            long tStart = System.currentTimeMillis();

            // get data
            ProcessDataResponse processData = client.put(pdRead);

            // stats
            System.out.print(String.format("Found %s data points (Count) for %s.%s.%s (took %f seconds)\n", processData.ProcessData.get(0).EventValue.SerialisedValue, dbName, nodeName, itemName, (System.currentTimeMillis()-tStart)/1000.0));

            // query raw data via DAL
            ProcessDataReadV1_1 pdReadRaw = new ProcessDataReadV1_1();
            pdReadRaw.DbName = dbName;
            pdReadRaw.NodeName = nodeName;
            pdReadRaw.ItemName = itemName;
            pdReadRaw.Aggregate = Aggregate_e.Direct;
            pdReadRaw.StartTime = startTime;
            pdReadRaw.EndTime = endTime;
            pdReadRaw.RecordCount = 50000;

            tStart = System.currentTimeMillis();

            // get data
            ProcessDataResponse processDataRaw = client.put(pdReadRaw);
            int recordCount = processDataRaw.ProcessData.size();

            while (processDataRaw.NextDataBlock != null)
            {
                processDataRaw = client.put((ProcessDataReadV1_1)processDataRaw.NextDataBlock);
                recordCount += processDataRaw.ProcessData.size();
            }

            // stats
            System.out.print(String.format("Found %d data points (Direct) for %s.%s.%s (took %f seconds)\n", recordCount, dbName, nodeName, itemName, (System.currentTimeMillis()-tStart)/1000.0));

            // query raw data via HDAServer
            pdReadRaw = new ProcessDataReadV1_1();
            pdReadRaw.DbName = dbName;
            pdReadRaw.NodeName = nodeName;
            pdReadRaw.ItemName = itemName;
            pdReadRaw.Aggregate = Aggregate_e.NoAggregate;
            pdReadRaw.StartTime = startTime;
            pdReadRaw.EndTime = endTime;
            pdReadRaw.RecordCount = 50000;

            tStart = System.currentTimeMillis();

            // get data
            processDataRaw = client.put(pdReadRaw);
            recordCount = processDataRaw.ProcessData.size();

            while (processDataRaw.NextDataBlock != null)
            {
                processDataRaw = client.put((ProcessDataReadV1_1)processDataRaw.NextDataBlock);
                recordCount += processDataRaw.ProcessData.size();
            }

            // stats
            System.out.print(String.format("Found %d data points (NoAggregate) for %s.%s.%s (took %f seconds)\n", recordCount, dbName, nodeName, itemName, (System.currentTimeMillis()-tStart)/1000.0));

            // retrieve list of engineering units
            ArrayList<EngineeringUnit> euList = client.get(new EngineeringUnitList2());

        }
        catch (Throwable e)
        {
            e.printStackTrace();
        }
    }
}



