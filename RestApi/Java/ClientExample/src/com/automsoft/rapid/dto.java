/* Options:
Date: 2017-09-11 16:35:11
Version: 4.54
Tip: To override a DTO option, remove "//" prefix before updating
BaseUrl: http://54.194.224.88:3001

Package: com.automsoft.rapid;
//GlobalNamespace: dtos
//AddPropertyAccessors: True
//SettersReturnThis: True
//AddServiceStackTypes: True
//AddResponseStatus: False
//AddDescriptionAsComments: True
//AddImplicitVersion: 
//IncludeTypes: 
//ExcludeTypes: 
//TreatTypesAsStrings: 
//DefaultImports: java.math.*,java.util.*,net.servicestack.client.*,com.google.gson.annotations.*,com.google.gson.reflect.*
*/

package com.automsoft.rapid;

import java.math.*;
import java.util.*;
import net.servicestack.client.*;
import com.google.gson.annotations.*;
import com.google.gson.reflect.*;

public class dto
{
    @Route(Path="/api/v1/database/{DbName}/alarmnode/alarmarea", Verbs="GET")
    public static class AlarmAreaList implements IReturn<ArrayList<String>>
    {
        /**
        * Database name containing the alarm areas
        */
        @ApiMember(ParameterType="query", Description="Database name containing the alarm areas", DataType="string", IsRequired=true)
        public String DbName = null;

        /**
        * Node name containing the alarm areas
        */
        @ApiMember(Description="Node name containing the alarm areas", ParameterType="query", DataType="string", IsRequired=true)
        public String NodeName = null;

        /**
        * Alarm area name filter, supports wildcard characters (* and ?)
        */
        @ApiMember(Description="Alarm area name filter, supports wildcard characters (* and ?)", ParameterType="query", DataType="string")
        public String Filter = null;
        
        public String getDbName() { return DbName; }
        public AlarmAreaList setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public AlarmAreaList setNodeName(String value) { this.NodeName = value; return this; }
        public String getFilter() { return Filter; }
        public AlarmAreaList setFilter(String value) { this.Filter = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<String>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/alarmnode/alarmareadetail", Verbs="GET")
    public static class AlarmAreaDetailList implements IReturn<ArrayList<AlarmArea>>
    {
        /**
        * Database name containing the alarm areas
        */
        @ApiMember(Description="Database name containing the alarm areas", ParameterType="query", DataType="string", IsRequired=true)
        public String DbName = null;

        /**
        * Node name containing the alarm areas
        */
        @ApiMember(Description="Node name containing the alarm areas", ParameterType="query", DataType="string", IsRequired=true)
        public String NodeName = null;

        /**
        * Alarm area name filter, supports wildcard characters (* and ?)
        */
        @ApiMember(Description="Alarm area name filter, supports wildcard characters (* and ?)", ParameterType="query", DataType="string")
        public String Filter = null;

        /**
        * Alarm area fields to be returned, separated by ','
        */
        @ApiMember(Description="Alarm area fields to be returned, separated by ','", ParameterType="query", DataType="string")
        public String FieldFilter = null;
        
        public String getDbName() { return DbName; }
        public AlarmAreaDetailList setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public AlarmAreaDetailList setNodeName(String value) { this.NodeName = value; return this; }
        public String getFilter() { return Filter; }
        public AlarmAreaDetailList setFilter(String value) { this.Filter = value; return this; }
        public String getFieldFilter() { return FieldFilter; }
        public AlarmAreaDetailList setFieldFilter(String value) { this.FieldFilter = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<AlarmArea>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/alarmnode/alarmarea", Verbs="POST")
    public static class AlarmAreaCreate extends AlarmArea implements IReturn<Boolean>
    {
        /**
        * Database name containing the node
        */
        @ApiMember(Description="Database name containing the node", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Node name containing the alarm area
        */
        @ApiMember(Description="Node name containing the alarm area", ParameterType="query", DataType="string")
        public String NodeName = null;
        
        public String getDbName() { return DbName; }
        public AlarmAreaCreate setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public AlarmAreaCreate setNodeName(String value) { this.NodeName = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/alarmnode/alarmarea", Verbs="PUT")
    public static class AlarmAreaUpdate extends AlarmArea implements IReturn<Boolean>
    {
        /**
        * Database name containing the node
        */
        @ApiMember(Description="Database name containing the node", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Node name containing the alarm area
        */
        @ApiMember(Description="Node name containing the alarm area", ParameterType="query", DataType="string")
        public String NodeName = null;
        
        public String getDbName() { return DbName; }
        public AlarmAreaUpdate setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public AlarmAreaUpdate setNodeName(String value) { this.NodeName = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/attribute", Verbs="GET")
    // @Route(Path="/api/v1/database/{DbName}/group/{GroupPath*}/attribute", Verbs="GET")
    // @Route(Path="/api/v1/database/{DbName}/node/{NodeName}/attribute", Verbs="GET")
    // @Route(Path="/api/v1/database/{DbName}/node/{NodeName}/item/{ItemName}/attribute", Verbs="GET")
    // @Route(Path="/api/v1/database/{DbName}/route/{RouteName}/attribute", Verbs="GET")
    // @ApiResponse(404, "Database not found")
    // @ApiResponse(500, "Server error")
    public static class AttributeRead implements IReturn<ArrayList<Attribute>>
    {
        /**
        * Database name containing the attributes
        */
        @ApiMember(Description="Database name containing the attributes", ParameterType="query", DataType="string", IsRequired=true)
        public String DbName = null;

        /**
        * Node name containing the attributes
        */
        @ApiMember(Description="Node name containing the attributes", ParameterType="query", DataType="string")
        public String NodeName = null;

        /**
        * Item name containing the attributes
        */
        @ApiMember(Description="Item name containing the attributes", ParameterType="query", DataType="string")
        public String ItemName = null;

        /**
        * Route name containing the attributes
        */
        @ApiMember(Description="Route name containing the attributes", ParameterType="query", DataType="string")
        public String RouteName = null;

        /**
        * Group path name containing the attributes
        */
        @ApiMember(Description="Group path name containing the attributes", ParameterType="query", DataType="string")
        public String GroupPath = null;
        
        public String getDbName() { return DbName; }
        public AttributeRead setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public AttributeRead setNodeName(String value) { this.NodeName = value; return this; }
        public String getItemName() { return ItemName; }
        public AttributeRead setItemName(String value) { this.ItemName = value; return this; }
        public String getRouteName() { return RouteName; }
        public AttributeRead setRouteName(String value) { this.RouteName = value; return this; }
        public String getGroupPath() { return GroupPath; }
        public AttributeRead setGroupPath(String value) { this.GroupPath = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<Attribute>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/attribute", Verbs="PUT")
    // @Route(Path="/api/v1/database/{DbName}/group/{GroupPath*}/attribute", Verbs="PUT")
    // @Route(Path="/api/v1/database/{DbName}/node/{NodeName}/attribute", Verbs="PUT")
    // @Route(Path="/api/v1/database/{DbName}/node/{NodeName}/item/{ItemName}/attribute", Verbs="PUT")
    // @Route(Path="/api/v1/database/{DbName}/route/{RouteName}/attribute", Verbs="PUT")
    // @ApiResponse(404, "Database not found")
    // @ApiResponse(500, "Server error")
    public static class AttributeWrite implements IReturn<Boolean>
    {
        /**
        * Database name to set attributes
        */
        @ApiMember(Description="Database name to set attributes", ParameterType="query", DataType="string", IsRequired=true)
        public String DbName = null;

        /**
        * Node name to set  attributes
        */
        @ApiMember(Description="Node name to set  attributes", ParameterType="query", DataType="string")
        public String NodeName = null;

        /**
        * Item name to set  attributes
        */
        @ApiMember(Description="Item name to set  attributes", ParameterType="query", DataType="string")
        public String ItemName = null;

        /**
        * Route name to set  attributes
        */
        @ApiMember(Description="Route name to set  attributes", ParameterType="query", DataType="string")
        public String RouteName = null;

        /**
        * Group path name to set attributes
        */
        @ApiMember(Description="Group path name to set attributes", ParameterType="query", DataType="string")
        public String GroupPath = null;

        /**
        * Names of attributes to be set
        */
        @ApiMember(Description="Names of attributes to be set", ParameterType="body", DataType="string[]")
        public ArrayList<String> AttributeNames = null;

        /**
        * Values of attributes to be set
        */
        @ApiMember(Description="Values of attributes to be set", ParameterType="body", DataType="string[]")
        public ArrayList<String> AttributeValues = null;
        
        public String getDbName() { return DbName; }
        public AttributeWrite setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public AttributeWrite setNodeName(String value) { this.NodeName = value; return this; }
        public String getItemName() { return ItemName; }
        public AttributeWrite setItemName(String value) { this.ItemName = value; return this; }
        public String getRouteName() { return RouteName; }
        public AttributeWrite setRouteName(String value) { this.RouteName = value; return this; }
        public String getGroupPath() { return GroupPath; }
        public AttributeWrite setGroupPath(String value) { this.GroupPath = value; return this; }
        public ArrayList<String> getAttributeNames() { return AttributeNames; }
        public AttributeWrite setAttributeNames(ArrayList<String> value) { this.AttributeNames = value; return this; }
        public ArrayList<String> getAttributeValues() { return AttributeValues; }
        public AttributeWrite setAttributeValues(ArrayList<String> value) { this.AttributeValues = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/route/batch", Verbs="GET")
    public static class BatchDataList implements IReturn<ArrayList<BatchData>>
    {
        /**
        * Database name containing the batches
        */
        @ApiMember(Description="Database name containing the batches", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Route name containing the batches
        */
        @ApiMember(Description="Route name containing the batches", ParameterType="query", DataType="string")
        public String RouteName = null;

        /**
        * Batch ID filter, supports wildcard characters (* and ?)
        */
        @ApiMember(Description="Batch ID filter, supports wildcard characters (* and ?)", ParameterType="query", DataType="string")
        public String Filter = null;

        /**
        * Batch start time filter
        */
        @ApiMember(Description="Batch start time filter", ParameterType="query", DataType="string")
        public String StartTime = null;

        /**
        * Batch end time filter
        */
        @ApiMember(Description="Batch end time filter", ParameterType="query", DataType="string")
        public String EndTime = null;
        
        public String getDbName() { return DbName; }
        public BatchDataList setDbName(String value) { this.DbName = value; return this; }
        public String getRouteName() { return RouteName; }
        public BatchDataList setRouteName(String value) { this.RouteName = value; return this; }
        public String getFilter() { return Filter; }
        public BatchDataList setFilter(String value) { this.Filter = value; return this; }
        public String getStartTime() { return StartTime; }
        public BatchDataList setStartTime(String value) { this.StartTime = value; return this; }
        public String getEndTime() { return EndTime; }
        public BatchDataList setEndTime(String value) { this.EndTime = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<BatchData>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/route/batch", Verbs="GET")
    public static class BatchDataRead implements IReturn<BatchData>
    {
        /**
        * Database name containing the batches
        */
        @ApiMember(Description="Database name containing the batches", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Route name containing the batches
        */
        @ApiMember(Description="Route name containing the batches", ParameterType="query", DataType="string")
        public String RouteName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="string")
        public String BatchID = null;
        
        public String getDbName() { return DbName; }
        public BatchDataRead setDbName(String value) { this.DbName = value; return this; }
        public String getRouteName() { return RouteName; }
        public BatchDataRead setRouteName(String value) { this.RouteName = value; return this; }
        public String getBatchID() { return BatchID; }
        public BatchDataRead setBatchID(String value) { this.BatchID = value; return this; }
        private static Object responseType = BatchData.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/route/batch", Verbs="DELETE")
    public static class BatchDataDelete implements IReturn<Boolean>
    {
        /**
        * Database name containing the batches
        */
        @ApiMember(Description="Database name containing the batches", ParameterType="query", DataType="string", IsRequired=true)
        public String DbName = null;

        /**
        * Route name containing the batches
        */
        @ApiMember(Description="Route name containing the batches", ParameterType="query", DataType="string")
        public String RouteName = null;

        /**
        * Batch ID filter, supports wildcard characters (* and ?)
        */
        @ApiMember(Description="Batch ID filter, supports wildcard characters (* and ?)", ParameterType="query", DataType="string")
        public String Filter = null;

        /**
        * Batch start time filter
        */
        @ApiMember(Description="Batch start time filter", ParameterType="query", DataType="string")
        public String StartTime = null;

        /**
        * Batch end time filter
        */
        @ApiMember(Description="Batch end time filter", ParameterType="query", DataType="string")
        public String EndTime = null;

        /**
        * Flag to indicate whether we are to delete by ID or by time
        */
        @ApiMember(Description="Flag to indicate whether we are to delete by ID or by time", ParameterType="query", DataType="boolean")
        public Boolean DeleteByBatchID = null;
        
        public String getDbName() { return DbName; }
        public BatchDataDelete setDbName(String value) { this.DbName = value; return this; }
        public String getRouteName() { return RouteName; }
        public BatchDataDelete setRouteName(String value) { this.RouteName = value; return this; }
        public String getFilter() { return Filter; }
        public BatchDataDelete setFilter(String value) { this.Filter = value; return this; }
        public String getStartTime() { return StartTime; }
        public BatchDataDelete setStartTime(String value) { this.StartTime = value; return this; }
        public String getEndTime() { return EndTime; }
        public BatchDataDelete setEndTime(String value) { this.EndTime = value; return this; }
        public Boolean isDeleteByBatchID() { return DeleteByBatchID; }
        public BatchDataDelete setDeleteByBatchID(Boolean value) { this.DeleteByBatchID = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database", Verbs="GET")
    // @ApiResponse(500, "Server error")
    public static class DatabaseList implements IReturn<ArrayList<String>>
    {
        
        private static Object responseType = new TypeToken<ArrayList<String>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{Name}", Verbs="GET")
    // @ApiResponse(400, "Invalid ID supplied")
    // @ApiResponse(404, "Database not found")
    // @ApiResponse(500, "Server error")
    public static class DatabaseRead implements IReturn<Database>
    {
        /**
        * Name of the database
        */
        @ApiMember(Description="Name of the database", ParameterType="body", DataType="string", IsRequired=true)
        public String Name = null;
        
        public String getName() { return Name; }
        public DatabaseRead setName(String value) { this.Name = value; return this; }
        private static Object responseType = Database.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database", Verbs="POST")
    // @ApiResponse(400, "Invalid database")
    // @ApiResponse(404, "Database not found")
    // @ApiResponse(500, "Server error")
    public static class DatabaseCreate extends Database implements IReturn<Database>
    {
        
        private static Object responseType = Database.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database", Verbs="PUT")
    // @Route(Path="/api/v1/database/{Name}", Verbs="PUT")
    // @ApiResponse(400, "Invalid database")
    // @ApiResponse(404, "Database not found")
    // @ApiResponse(500, "Server error")
    public static class DatabaseUpdate extends Database implements IReturn<Boolean>
    {
        
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/group", Verbs="GET")
    public static class GroupList implements IReturn<ArrayList<String>>
    {
        /**
        * Database name containing the groups
        */
        @ApiMember(Description="Database name containing the groups", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Group name filter, supports wildcard characters (* and ?)
        */
        @ApiMember(Description="Group name filter, supports wildcard characters (* and ?)", ParameterType="query", DataType="string")
        public String Filter = null;
        
        public String getDbName() { return DbName; }
        public GroupList setDbName(String value) { this.DbName = value; return this; }
        public String getFilter() { return Filter; }
        public GroupList setFilter(String value) { this.Filter = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<String>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/group", Verbs="GET")
    // @Route(Path="/api/v1/database/{DbName}/group/{Path*}/", Verbs="GET")
    public static class GroupRead implements IReturn<Group>
    {
        /**
        * Database name containing the groups
        */
        @ApiMember(Description="Database name containing the groups", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Group path name to the group
        */
        @ApiMember(Description="Group path name to the group", ParameterType="query", DataType="string")
        public String Path = null;
        
        public String getDbName() { return DbName; }
        public GroupRead setDbName(String value) { this.DbName = value; return this; }
        public String getPath() { return Path; }
        public GroupRead setPath(String value) { this.Path = value; return this; }
        private static Object responseType = Group.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/group/{Path*}", Verbs="POST")
    public static class GroupCreate extends Group implements IReturn<Boolean>
    {
        /**
        * Database name containing the groups
        */
        @ApiMember(Description="Database name containing the groups", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Group path name to the group(s)
        */
        @ApiMember(Description="Group path name to the group(s)", ParameterType="query", DataType="string")
        public String Path = null;
        
        public String getDbName() { return DbName; }
        public GroupCreate setDbName(String value) { this.DbName = value; return this; }
        public String getPath() { return Path; }
        public GroupCreate setPath(String value) { this.Path = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/group/{Path*}", Verbs="PUT")
    public static class GroupUpdate extends Group implements IReturn<Boolean>
    {
        /**
        * Database name containing the groups
        */
        @ApiMember(Description="Database name containing the groups", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Group path name to the group
        */
        @ApiMember(Description="Group path name to the group", ParameterType="query", DataType="string")
        public String Path = null;
        
        public String getDbName() { return DbName; }
        public GroupUpdate setDbName(String value) { this.DbName = value; return this; }
        public String getPath() { return Path; }
        public GroupUpdate setPath(String value) { this.Path = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/group/{Path*}", Verbs="DELETE")
    public static class GroupDelete implements IReturn<Boolean>
    {
        /**
        * Database name containing the groups
        */
        @ApiMember(Description="Database name containing the groups", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Group path name to the group
        */
        @ApiMember(Description="Group path name to the group", ParameterType="query", DataType="string")
        public String Path = null;

        /**
        * Flag indicating whether a forced deletion is required
        */
        @ApiMember(Description="Flag indicating whether a forced deletion is required", ParameterType="query", DataType="boolean")
        public Boolean Force = null;
        
        public String getDbName() { return DbName; }
        public GroupDelete setDbName(String value) { this.DbName = value; return this; }
        public String getPath() { return Path; }
        public GroupDelete setPath(String value) { this.Path = value; return this; }
        public Boolean isForce() { return Force; }
        public GroupDelete setForce(Boolean value) { this.Force = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/node/{NodeName}/item", Verbs="GET")
    public static class ItemList implements IReturn<ArrayList<String>>
    {
        /**
        * Database name containing the items
        */
        @ApiMember(Description="Database name containing the items", ParameterType="query", DataType="string", IsRequired=true)
        public String DbName = null;

        /**
        * Node name containing the items
        */
        @ApiMember(Description="Node name containing the items", ParameterType="query", DataType="string", IsRequired=true)
        public String NodeName = null;

        /**
        * Item name filter, supports wildcard characters (* and ?)
        */
        @ApiMember(Description="Item name filter, supports wildcard characters (* and ?)", ParameterType="query", DataType="string")
        public String Filter = null;
        
        public String getDbName() { return DbName; }
        public ItemList setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public ItemList setNodeName(String value) { this.NodeName = value; return this; }
        public String getFilter() { return Filter; }
        public ItemList setFilter(String value) { this.Filter = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<String>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1.1/itemList", Verbs="GET")
    public static class ItemListV1_1 implements IReturn<ArrayList<String>>
    {
        /**
        * Database name containing the items
        */
        @ApiMember(Description="Database name containing the items", ParameterType="query", DataType="string", IsRequired=true)
        public String DbName = null;

        /**
        * Node name containing the items
        */
        @ApiMember(Description="Node name containing the items", ParameterType="query", DataType="string", IsRequired=true)
        public String NodeName = null;

        /**
        * Item name filter, supports wildcard characters (* and ?)
        */
        @ApiMember(Description="Item name filter, supports wildcard characters (* and ?)", ParameterType="query", DataType="string")
        public String Filter = null;
        
        public String getDbName() { return DbName; }
        public ItemListV1_1 setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public ItemListV1_1 setNodeName(String value) { this.NodeName = value; return this; }
        public String getFilter() { return Filter; }
        public ItemListV1_1 setFilter(String value) { this.Filter = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<String>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/node/{NodeName}/itemdetail", Verbs="GET")
    public static class ItemDetailList implements IReturn<ArrayList<Item>>
    {
        /**
        * Database name containing the items
        */
        @ApiMember(Description="Database name containing the items", ParameterType="query", DataType="string", IsRequired=true)
        public String DbName = null;

        /**
        * Node name containing the items
        */
        @ApiMember(Description="Node name containing the items", ParameterType="query", DataType="string", IsRequired=true)
        public String NodeName = null;

        /**
        * Item name filter, supports wildcard characters (* and ?)
        */
        @ApiMember(Description="Item name filter, supports wildcard characters (* and ?)", ParameterType="query", DataType="string")
        public String Filter = null;

        /**
        * Item fields to be returned, separated by ','
        */
        @ApiMember(Description="Item fields to be returned, separated by ','", ParameterType="query", DataType="string")
        public String FieldFilter = null;
        
        public String getDbName() { return DbName; }
        public ItemDetailList setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public ItemDetailList setNodeName(String value) { this.NodeName = value; return this; }
        public String getFilter() { return Filter; }
        public ItemDetailList setFilter(String value) { this.Filter = value; return this; }
        public String getFieldFilter() { return FieldFilter; }
        public ItemDetailList setFieldFilter(String value) { this.FieldFilter = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<Item>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1.1/itemdetail", Verbs="GET")
    public static class ItemDetailListV1_1 implements IReturn<ArrayList<Item>>
    {
        /**
        * Database name containing the items
        */
        @ApiMember(Description="Database name containing the items", ParameterType="query", DataType="string", IsRequired=true)
        public String DbName = null;

        /**
        * Node name containing the items
        */
        @ApiMember(Description="Node name containing the items", ParameterType="query", DataType="string", IsRequired=true)
        public String NodeName = null;

        /**
        * Item name filter, supports wildcard characters (* and ?)
        */
        @ApiMember(Description="Item name filter, supports wildcard characters (* and ?)", ParameterType="query", DataType="string")
        public String Filter = null;

        /**
        * Item fields to be returned, separated by ','
        */
        @ApiMember(Description="Item fields to be returned, separated by ','", ParameterType="query", DataType="string")
        public String FieldFilter = null;
        
        public String getDbName() { return DbName; }
        public ItemDetailListV1_1 setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public ItemDetailListV1_1 setNodeName(String value) { this.NodeName = value; return this; }
        public String getFilter() { return Filter; }
        public ItemDetailListV1_1 setFilter(String value) { this.Filter = value; return this; }
        public String getFieldFilter() { return FieldFilter; }
        public ItemDetailListV1_1 setFieldFilter(String value) { this.FieldFilter = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<Item>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/node/{NodeName}/item/{Name}", Verbs="GET")
    public static class ItemRead implements IReturn<Item>
    {
        /**
        * Database name containing the items
        */
        @ApiMember(Description="Database name containing the items", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Node name containing the item
        */
        @ApiMember(Description="Node name containing the item", ParameterType="query", DataType="string")
        public String NodeName = null;

        /**
        * Item name
        */
        @ApiMember(Description="Item name", ParameterType="query", DataType="string")
        public String Name = null;
        
        public String getDbName() { return DbName; }
        public ItemRead setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public ItemRead setNodeName(String value) { this.NodeName = value; return this; }
        public String getName() { return Name; }
        public ItemRead setName(String value) { this.Name = value; return this; }
        private static Object responseType = Item.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1.1/item", Verbs="GET")
    public static class ItemReadV1_1 implements IReturn<Item>
    {
        /**
        * Database name containing the items
        */
        @ApiMember(Description="Database name containing the items", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Node name containing the item
        */
        @ApiMember(Description="Node name containing the item", ParameterType="query", DataType="string")
        public String NodeName = null;

        /**
        * Item name
        */
        @ApiMember(Description="Item name", ParameterType="query", DataType="string")
        public String Name = null;
        
        public String getDbName() { return DbName; }
        public ItemReadV1_1 setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public ItemReadV1_1 setNodeName(String value) { this.NodeName = value; return this; }
        public String getName() { return Name; }
        public ItemReadV1_1 setName(String value) { this.Name = value; return this; }
        private static Object responseType = Item.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/node/{NodeName}/item", Verbs="POST")
    public static class ItemCreate extends Item implements IReturn<Boolean>
    {
        /**
        * Database name containing the items
        */
        @ApiMember(Description="Database name containing the items", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Node name containing the item
        */
        @ApiMember(Description="Node name containing the item", ParameterType="query", DataType="string")
        public String NodeName = null;
        
        public String getDbName() { return DbName; }
        public ItemCreate setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public ItemCreate setNodeName(String value) { this.NodeName = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1.1/item", Verbs="POST")
    public static class ItemCreateV1_1 extends Item implements IReturn<Boolean>
    {
        /**
        * Database name containing the items
        */
        @ApiMember(Description="Database name containing the items", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Node name containing the item
        */
        @ApiMember(Description="Node name containing the item", ParameterType="query", DataType="string")
        public String NodeName = null;
        
        public String getDbName() { return DbName; }
        public ItemCreateV1_1 setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public ItemCreateV1_1 setNodeName(String value) { this.NodeName = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/node/{NodeName}/item/{Name}", Verbs="PUT")
    public static class ItemUpdate extends Item implements IReturn<Boolean>
    {
        /**
        * Database name containing the items
        */
        @ApiMember(Description="Database name containing the items", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Node name containing the item
        */
        @ApiMember(Description="Node name containing the item", ParameterType="query", DataType="string")
        public String NodeName = null;
        
        public String getDbName() { return DbName; }
        public ItemUpdate setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public ItemUpdate setNodeName(String value) { this.NodeName = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1.1/item", Verbs="PUT")
    public static class ItemUpdateV1_1 extends Item implements IReturn<Boolean>
    {
        /**
        * Database name containing the items
        */
        @ApiMember(Description="Database name containing the items", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Node name containing the item
        */
        @ApiMember(Description="Node name containing the item", ParameterType="query", DataType="string")
        public String NodeName = null;
        
        public String getDbName() { return DbName; }
        public ItemUpdateV1_1 setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public ItemUpdateV1_1 setNodeName(String value) { this.NodeName = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/node/{NodeName}/item/{Name}", Verbs="DELETE")
    public static class ItemDelete implements IReturn<Boolean>
    {
        /**
        * Database name containing the items
        */
        @ApiMember(Description="Database name containing the items", ParameterType="body", DataType="string")
        public String DbName = null;

        /**
        * Node name containing the item
        */
        @ApiMember(Description="Node name containing the item", ParameterType="query", DataType="string")
        public String NodeName = null;

        /**
        * Item name
        */
        @ApiMember(Description="Item name", ParameterType="query", DataType="string")
        public String Name = null;

        /**
        * Flag indicating whether a forced deletion is required
        */
        @ApiMember(Description="Flag indicating whether a forced deletion is required", ParameterType="query", DataType="boolean")
        public Boolean Force = null;
        
        public String getDbName() { return DbName; }
        public ItemDelete setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public ItemDelete setNodeName(String value) { this.NodeName = value; return this; }
        public String getName() { return Name; }
        public ItemDelete setName(String value) { this.Name = value; return this; }
        public Boolean isForce() { return Force; }
        public ItemDelete setForce(Boolean value) { this.Force = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1.1/item", Verbs="DELETE")
    public static class ItemDeleteV1_1 implements IReturn<Boolean>
    {
        /**
        * Database name containing the items
        */
        @ApiMember(Description="Database name containing the items", ParameterType="body", DataType="string")
        public String DbName = null;

        /**
        * Node name containing the item
        */
        @ApiMember(Description="Node name containing the item", ParameterType="query", DataType="string")
        public String NodeName = null;

        /**
        * Item name
        */
        @ApiMember(Description="Item name", ParameterType="query", DataType="string")
        public String Name = null;

        /**
        * Flag indicating whether a forced deletion is required
        */
        @ApiMember(Description="Flag indicating whether a forced deletion is required", ParameterType="query", DataType="boolean")
        public Boolean Force = null;
        
        public String getDbName() { return DbName; }
        public ItemDeleteV1_1 setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public ItemDeleteV1_1 setNodeName(String value) { this.NodeName = value; return this; }
        public String getName() { return Name; }
        public ItemDeleteV1_1 setName(String value) { this.Name = value; return this; }
        public Boolean isForce() { return Force; }
        public ItemDeleteV1_1 setForce(Boolean value) { this.Force = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/alarmnode", Verbs="GET")
    public static class AlarmNodeRead implements IReturn<AlarmNode>
    {
        /**
        * Database name containing the nodes
        */
        @ApiMember(Description="Database name containing the nodes", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="string")
        public String Name = null;
        
        public String getDbName() { return DbName; }
        public AlarmNodeRead setDbName(String value) { this.DbName = value; return this; }
        public String getName() { return Name; }
        public AlarmNodeRead setName(String value) { this.Name = value; return this; }
        private static Object responseType = AlarmNode.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/alarmnode", Verbs="POST")
    // @ApiResponse(400, "Invalid database")
    // @ApiResponse(404, "Database not found")
    // @ApiResponse(500, "Server error")
    public static class AlarmNodeCreate extends AlarmNode implements IReturn<Boolean>
    {
        /**
        * Database name containing the nodes
        */
        @ApiMember(Description="Database name containing the nodes", ParameterType="query", DataType="string", IsRequired=true)
        public String DbName = null;
        
        public String getDbName() { return DbName; }
        public AlarmNodeCreate setDbName(String value) { this.DbName = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/alarmnode", Verbs="PUT")
    public static class AlarmNodeUpdate extends AlarmNode implements IReturn<Boolean>
    {
        /**
        * Database name containing the nodes
        */
        @ApiMember(Description="Database name containing the nodes", ParameterType="query", DataType="string")
        public String DbName = null;
        
        public String getDbName() { return DbName; }
        public AlarmNodeUpdate setDbName(String value) { this.DbName = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{dbName}/node", Verbs="GET")
    // @ApiResponse(500, "Server error")
    public static class NodeList implements IReturn<ArrayList<String>>
    {
        /**
        * Database name containing the nodes
        */
        @ApiMember(Description="Database name containing the nodes", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Node name filter, supports wildcard characters (* and ?)
        */
        @ApiMember(Description="Node name filter, supports wildcard characters (* and ?)", ParameterType="query", DataType="string")
        public String Filter = null;

        /**
        * Node type filter, specify list of NodeType_e
        */
        @ApiMember(Description="Node type filter, specify list of NodeType_e", ParameterType="query", DataType="string")
        public String Type = null;
        
        public String getDbName() { return DbName; }
        public NodeList setDbName(String value) { this.DbName = value; return this; }
        public String getFilter() { return Filter; }
        public NodeList setFilter(String value) { this.Filter = value; return this; }
        public String getType() { return Type; }
        public NodeList setType(String value) { this.Type = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<String>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/node/{Name}", Verbs="GET")
    public static class NodeRead implements IReturn<Node>
    {
        /**
        * Database name containing the nodes
        */
        @ApiMember(Description="Database name containing the nodes", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="string")
        public String Name = null;
        
        public String getDbName() { return DbName; }
        public NodeRead setDbName(String value) { this.DbName = value; return this; }
        public String getName() { return Name; }
        public NodeRead setName(String value) { this.Name = value; return this; }
        private static Object responseType = Node.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/node", Verbs="POST")
    // @ApiResponse(400, "Invalid database")
    // @ApiResponse(404, "Database not found")
    // @ApiResponse(500, "Server error")
    public static class NodeCreate extends Node implements IReturn<Boolean>
    {
        /**
        * Database name containing the nodes
        */
        @ApiMember(Description="Database name containing the nodes", ParameterType="query", DataType="string", IsRequired=true)
        public String DbName = null;
        
        public String getDbName() { return DbName; }
        public NodeCreate setDbName(String value) { this.DbName = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/node/{Name}", Verbs="PUT")
    public static class NodeUpdate extends Node implements IReturn<Boolean>
    {
        /**
        * Database name containing the nodes
        */
        @ApiMember(Description="Database name containing the nodes", ParameterType="query", DataType="string")
        public String DbName = null;
        
        public String getDbName() { return DbName; }
        public NodeUpdate setDbName(String value) { this.DbName = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/route/phasedef", Verbs="GET")
    public static class PhaseDefinitionList implements IReturn<ArrayList<PhaseDefinition>>
    {
        /**
        * Database name containing the phase definitions
        */
        @ApiMember(Description="Database name containing the phase definitions", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Route name containing the phase definitions
        */
        @ApiMember(Description="Route name containing the phase definitions", ParameterType="query", DataType="string")
        public String RouteName = null;
        
        public String getDbName() { return DbName; }
        public PhaseDefinitionList setDbName(String value) { this.DbName = value; return this; }
        public String getRouteName() { return RouteName; }
        public PhaseDefinitionList setRouteName(String value) { this.RouteName = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<PhaseDefinition>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/route/{RouteName}/phasedef/{Name}", Verbs="GET")
    public static class PhaseDefinitionRead implements IReturn<PhaseDefinition>
    {
        /**
        * Database name containing the phase definitions
        */
        @ApiMember(Description="Database name containing the phase definitions", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Route name containing the phase definitions
        */
        @ApiMember(Description="Route name containing the phase definitions", ParameterType="query", DataType="string")
        public String RouteName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="string")
        public String Name = null;
        
        public String getDbName() { return DbName; }
        public PhaseDefinitionRead setDbName(String value) { this.DbName = value; return this; }
        public String getRouteName() { return RouteName; }
        public PhaseDefinitionRead setRouteName(String value) { this.RouteName = value; return this; }
        public String getName() { return Name; }
        public PhaseDefinitionRead setName(String value) { this.Name = value; return this; }
        private static Object responseType = PhaseDefinition.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/route/{RouteName}/phasedef", Verbs="POST")
    public static class PhaseDefinitionCreate extends PhaseDefinition implements IReturn<Boolean>
    {
        /**
        * Database name containing the phase definitions
        */
        @ApiMember(Description="Database name containing the phase definitions", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Route name containing the phase definitions
        */
        @ApiMember(Description="Route name containing the phase definitions", ParameterType="query", DataType="string")
        public String RouteName = null;
        
        public String getDbName() { return DbName; }
        public PhaseDefinitionCreate setDbName(String value) { this.DbName = value; return this; }
        public String getRouteName() { return RouteName; }
        public PhaseDefinitionCreate setRouteName(String value) { this.RouteName = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/route/{RouteName}/phasedef/{Name}", Verbs="PUT")
    public static class PhaseDefinitionUpdate extends PhaseDefinition implements IReturn<Boolean>
    {
        /**
        * Database name containing the phase definitions
        */
        @ApiMember(Description="Database name containing the phase definitions", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Route name containing the phase definitions
        */
        @ApiMember(Description="Route name containing the phase definitions", ParameterType="query", DataType="string")
        public String RouteName = null;
        
        public String getDbName() { return DbName; }
        public PhaseDefinitionUpdate setDbName(String value) { this.DbName = value; return this; }
        public String getRouteName() { return RouteName; }
        public PhaseDefinitionUpdate setRouteName(String value) { this.RouteName = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/route/{RouteName}/phasedef/{Name}", Verbs="DELETE")
    public static class PhaseDefinitionDelete implements IReturn<Boolean>
    {
        /**
        * Database name containing the phase definitions
        */
        @ApiMember(Description="Database name containing the phase definitions", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Route name containing the phase definitions
        */
        @ApiMember(Description="Route name containing the phase definitions", ParameterType="query", DataType="string")
        public String RouteName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="string")
        public String Name = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="boolean")
        public Boolean DeleteData = null;
        
        public String getDbName() { return DbName; }
        public PhaseDefinitionDelete setDbName(String value) { this.DbName = value; return this; }
        public String getRouteName() { return RouteName; }
        public PhaseDefinitionDelete setRouteName(String value) { this.RouteName = value; return this; }
        public String getName() { return Name; }
        public PhaseDefinitionDelete setName(String value) { this.Name = value; return this; }
        public Boolean isDeleteData() { return DeleteData; }
        public PhaseDefinitionDelete setDeleteData(Boolean value) { this.DeleteData = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/node/{NodeName}/processdata", Verbs="POST")
    public static class ProcessDataBulkCreate implements IReturn<ProcessDataResult>
    {
        /**
        * Database name containing the process data
        */
        @ApiMember(Description="Database name containing the process data", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="string")
        public String NodeName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="boolean")
        public Boolean MoreData = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="integer")
        public Integer SessionId = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="ProcessDataContainer[]")
        public ArrayList<ProcessDataContainer> Data = null;
        
        public String getDbName() { return DbName; }
        public ProcessDataBulkCreate setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public ProcessDataBulkCreate setNodeName(String value) { this.NodeName = value; return this; }
        public Boolean isMoreData() { return MoreData; }
        public ProcessDataBulkCreate setMoreData(Boolean value) { this.MoreData = value; return this; }
        public Integer getSessionId() { return SessionId; }
        public ProcessDataBulkCreate setSessionId(Integer value) { this.SessionId = value; return this; }
        public ArrayList<ProcessDataContainer> getData() { return Data; }
        public ProcessDataBulkCreate setData(ArrayList<ProcessDataContainer> value) { this.Data = value; return this; }
        private static Object responseType = ProcessDataResult.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/node/alarmdata", Verbs="POST")
    public static class AlarmDataCreate implements IReturn<Boolean>
    {
        /**
        * Database name containing the node
        */
        @ApiMember(Description="Database name containing the node", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Node name containing the alarm area
        */
        @ApiMember(Description="Node name containing the alarm area", ParameterType="query", DataType="string", IsRequired=true)
        public String NodeName = null;

        /**
        * Alarm area containing the alarm data
        */
        @ApiMember(Description="Alarm area containing the alarm data", ParameterType="query", DataType="string", IsRequired=true)
        public String AlarmAreaName = null;

        /**
        * Flag to indicate more data is to be retrieved
        */
        @ApiMember(Description="Flag to indicate more data is to be retrieved", ParameterType="query", DataType="boolean", IsRequired=true)
        public Boolean MoreData = null;

        /**
        * Session ID
        */
        @ApiMember(Description="Session ID", ParameterType="query", DataType="integer")
        public Integer SessionId = null;

        /**
        * Alarm data to be inserted
        */
        @ApiMember(Description="Alarm data to be inserted", ParameterType="body", DataType="AlarmDataPoint[]", IsRequired=true)
        public ArrayList<AlarmDataPoint> Data = null;
        
        public String getDbName() { return DbName; }
        public AlarmDataCreate setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public AlarmDataCreate setNodeName(String value) { this.NodeName = value; return this; }
        public String getAlarmAreaName() { return AlarmAreaName; }
        public AlarmDataCreate setAlarmAreaName(String value) { this.AlarmAreaName = value; return this; }
        public Boolean isMoreData() { return MoreData; }
        public AlarmDataCreate setMoreData(Boolean value) { this.MoreData = value; return this; }
        public Integer getSessionId() { return SessionId; }
        public AlarmDataCreate setSessionId(Integer value) { this.SessionId = value; return this; }
        public ArrayList<AlarmDataPoint> getData() { return Data; }
        public AlarmDataCreate setData(ArrayList<AlarmDataPoint> value) { this.Data = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/node/alarmdata", Verbs="DELETE")
    public static class AlarmDataDelete implements IReturn<Boolean>
    {
        /**
        * Database name containing the node
        */
        @ApiMember(Description="Database name containing the node", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Node name containing the alarm area
        */
        @ApiMember(Description="Node name containing the alarm area", ParameterType="query", DataType="string")
        public String NodeName = null;

        /**
        * Alarm area containing the alarm data
        */
        @ApiMember(Description="Alarm area containing the alarm data", ParameterType="query", DataType="string")
        public String AlarmAreaName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="datetime")
        public Date StartTime = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="datetime")
        public Date EndTime = null;
        
        public String getDbName() { return DbName; }
        public AlarmDataDelete setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public AlarmDataDelete setNodeName(String value) { this.NodeName = value; return this; }
        public String getAlarmAreaName() { return AlarmAreaName; }
        public AlarmDataDelete setAlarmAreaName(String value) { this.AlarmAreaName = value; return this; }
        public Date getStartTime() { return StartTime; }
        public AlarmDataDelete setStartTime(Date value) { this.StartTime = value; return this; }
        public Date getEndTime() { return EndTime; }
        public AlarmDataDelete setEndTime(Date value) { this.EndTime = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/node/alarmdata", Verbs="PUT")
    public static class AlarmDataRequest implements IReturn<AlarmDataResponse>
    {
        /**
        * Database name containing the node
        */
        @ApiMember(Description="Database name containing the node", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Node name containing the alarm area
        */
        @ApiMember(Description="Node name containing the alarm area", ParameterType="query", DataType="string")
        public String NodeName = null;

        /**
        * Number of returned records
        */
        @ApiMember(Description="Number of returned records", ParameterType="query", DataType="integer")
        public Integer RecordCount = null;

        /**
        * Alarm areas name for which data is to be returned
        */
        @ApiMember(Description="Alarm areas name for which data is to be returned", ParameterType="body", DataType="string")
        public ArrayList<String> AlarmAreas = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="datetime")
        public String StartTime = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="datetime")
        public String EndTime = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="boolean")
        public Boolean StartAtOnlineData = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="integer")
        public Integer Session = null;

        /**
        * Field filter IDs
        */
        @ApiMember(Description="Field filter IDs", ParameterType="body", DataType="integer")
        public ArrayList<AlarmFieldFilter_e> FieldFilterIDs = null;

        /**
        * Field filter values
        */
        @ApiMember(Description="Field filter values", ParameterType="body", DataType="integer")
        public ArrayList<FilterFieldValue> FieldFilterValues = null;

        /**
        * Returned fields
        */
        @ApiMember(Description="Returned fields", ParameterType="body", DataType="integer")
        public ArrayList<AlarmFieldFilter_e> ReturnedFields = null;
        
        public String getDbName() { return DbName; }
        public AlarmDataRequest setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public AlarmDataRequest setNodeName(String value) { this.NodeName = value; return this; }
        public Integer getRecordCount() { return RecordCount; }
        public AlarmDataRequest setRecordCount(Integer value) { this.RecordCount = value; return this; }
        public ArrayList<String> getAlarmAreas() { return AlarmAreas; }
        public AlarmDataRequest setAlarmAreas(ArrayList<String> value) { this.AlarmAreas = value; return this; }
        public String getStartTime() { return StartTime; }
        public AlarmDataRequest setStartTime(String value) { this.StartTime = value; return this; }
        public String getEndTime() { return EndTime; }
        public AlarmDataRequest setEndTime(String value) { this.EndTime = value; return this; }
        public Boolean isStartAtOnlineData() { return StartAtOnlineData; }
        public AlarmDataRequest setStartAtOnlineData(Boolean value) { this.StartAtOnlineData = value; return this; }
        public Integer getSession() { return Session; }
        public AlarmDataRequest setSession(Integer value) { this.Session = value; return this; }
        public ArrayList<AlarmFieldFilter_e> getFieldFilterIDs() { return FieldFilterIDs; }
        public AlarmDataRequest setFieldFilterIDs(ArrayList<AlarmFieldFilter_e> value) { this.FieldFilterIDs = value; return this; }
        public ArrayList<FilterFieldValue> getFieldFilterValues() { return FieldFilterValues; }
        public AlarmDataRequest setFieldFilterValues(ArrayList<FilterFieldValue> value) { this.FieldFilterValues = value; return this; }
        public ArrayList<AlarmFieldFilter_e> getReturnedFields() { return ReturnedFields; }
        public AlarmDataRequest setReturnedFields(ArrayList<AlarmFieldFilter_e> value) { this.ReturnedFields = value; return this; }
        private static Object responseType = AlarmDataResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1.1/database/{DbName}/node/{NodeName}/itemdata/processdata", Verbs="POST")
    public static class ProcessDataCreateV1_1 implements IReturn<ProcessDataResult>
    {
        /**
        * Database name containing the process data
        */
        @ApiMember(Description="Database name containing the process data", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="string", IsRequired=true)
        public String NodeName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="string", IsRequired=true)
        public String ItemName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="boolean", IsRequired=true)
        public Boolean MoreData = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="integer")
        public Integer SessionId = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="ProcessDataPoint[]", IsRequired=true)
        public ArrayList<ProcessDataPoint> Data = null;
        
        public String getDbName() { return DbName; }
        public ProcessDataCreateV1_1 setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public ProcessDataCreateV1_1 setNodeName(String value) { this.NodeName = value; return this; }
        public String getItemName() { return ItemName; }
        public ProcessDataCreateV1_1 setItemName(String value) { this.ItemName = value; return this; }
        public Boolean isMoreData() { return MoreData; }
        public ProcessDataCreateV1_1 setMoreData(Boolean value) { this.MoreData = value; return this; }
        public Integer getSessionId() { return SessionId; }
        public ProcessDataCreateV1_1 setSessionId(Integer value) { this.SessionId = value; return this; }
        public ArrayList<ProcessDataPoint> getData() { return Data; }
        public ProcessDataCreateV1_1 setData(ArrayList<ProcessDataPoint> value) { this.Data = value; return this; }
        private static Object responseType = ProcessDataResult.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/node/{NodeName}/item/{ItemName}/processdata", Verbs="POST")
    public static class ProcessDataCreate implements IReturn<ProcessDataResult>
    {
        /**
        * Database name containing the process data
        */
        @ApiMember(Description="Database name containing the process data", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="string", IsRequired=true)
        public String NodeName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="string", IsRequired=true)
        public String ItemName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="boolean", IsRequired=true)
        public Boolean MoreData = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="integer")
        public Integer SessionId = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="ProcessDataPoint[]", IsRequired=true)
        public ArrayList<ProcessDataPoint> Data = null;
        
        public String getDbName() { return DbName; }
        public ProcessDataCreate setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public ProcessDataCreate setNodeName(String value) { this.NodeName = value; return this; }
        public String getItemName() { return ItemName; }
        public ProcessDataCreate setItemName(String value) { this.ItemName = value; return this; }
        public Boolean isMoreData() { return MoreData; }
        public ProcessDataCreate setMoreData(Boolean value) { this.MoreData = value; return this; }
        public Integer getSessionId() { return SessionId; }
        public ProcessDataCreate setSessionId(Integer value) { this.SessionId = value; return this; }
        public ArrayList<ProcessDataPoint> getData() { return Data; }
        public ProcessDataCreate setData(ArrayList<ProcessDataPoint> value) { this.Data = value; return this; }
        private static Object responseType = ProcessDataResult.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/node/{NodeName}/processdata", Verbs="DELETE")
    // @Route(Path="/api/v1/database/{DbName}/node/{NodeName}/item/{ItemName}/processdata", Verbs="DELETE")
    public static class ProcessDataDelete implements IReturn<Boolean>
    {
        /**
        * Database name containing the process data
        */
        @ApiMember(Description="Database name containing the process data", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="string")
        public String NodeName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="string")
        public String ItemName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="datetime")
        public Date StartTime = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="datetime")
        public Date EndTime = null;
        
        public String getDbName() { return DbName; }
        public ProcessDataDelete setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public ProcessDataDelete setNodeName(String value) { this.NodeName = value; return this; }
        public String getItemName() { return ItemName; }
        public ProcessDataDelete setItemName(String value) { this.ItemName = value; return this; }
        public Date getStartTime() { return StartTime; }
        public ProcessDataDelete setStartTime(Date value) { this.StartTime = value; return this; }
        public Date getEndTime() { return EndTime; }
        public ProcessDataDelete setEndTime(Date value) { this.EndTime = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/node/{NodeName}/item/{ItemName}/processData", Verbs="PUT")
    public static class ProcessDataRead extends ProcessDataRequest implements IReturn<ProcessDataResponse>
    {
        /**
        * Database name containing the process data
        */
        @ApiMember(Description="Database name containing the process data", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="string")
        public String NodeName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="integer")
        public Integer RecordCount = null;
        
        public String getDbName() { return DbName; }
        public ProcessDataRead setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public ProcessDataRead setNodeName(String value) { this.NodeName = value; return this; }
        public Integer getRecordCount() { return RecordCount; }
        public ProcessDataRead setRecordCount(Integer value) { this.RecordCount = value; return this; }
        private static Object responseType = ProcessDataResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1.1/database/{DbName}/node/{NodeName}/itemdata/processData", Verbs="PUT")
    public static class ProcessDataReadV1_1 extends ProcessDataRequest implements IReturn<ProcessDataResponse>
    {
        /**
        * Database name containing the process data
        */
        @ApiMember(Description="Database name containing the process data", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="string")
        public String NodeName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="integer")
        public Integer RecordCount = null;
        
        public String getDbName() { return DbName; }
        public ProcessDataReadV1_1 setDbName(String value) { this.DbName = value; return this; }
        public String getNodeName() { return NodeName; }
        public ProcessDataReadV1_1 setNodeName(String value) { this.NodeName = value; return this; }
        public Integer getRecordCount() { return RecordCount; }
        public ProcessDataReadV1_1 setRecordCount(Integer value) { this.RecordCount = value; return this; }
        private static Object responseType = ProcessDataResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/route", Verbs="GET")
    // @ApiResponse(500, "Server error")
    public static class RouteList implements IReturn<ArrayList<String>>
    {
        /**
        * Database name containing the routes
        */
        @ApiMember(Description="Database name containing the routes", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * Route name filter, supports wildcard characters (* and ?)
        */
        @ApiMember(Description="Route name filter, supports wildcard characters (* and ?)", ParameterType="query", DataType="string")
        public String Filter = null;
        
        public String getDbName() { return DbName; }
        public RouteList setDbName(String value) { this.DbName = value; return this; }
        public String getFilter() { return Filter; }
        public RouteList setFilter(String value) { this.Filter = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<String>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/route/{Name}", Verbs="GET")
    public static class RouteRead implements IReturn<Route>
    {
        /**
        * Database name containing the routes
        */
        @ApiMember(Description="Database name containing the routes", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="string")
        public String Name = null;
        
        public String getDbName() { return DbName; }
        public RouteRead setDbName(String value) { this.DbName = value; return this; }
        public String getName() { return Name; }
        public RouteRead setName(String value) { this.Name = value; return this; }
        private static Object responseType = Route.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/route", Verbs="POST")
    // @ApiResponse(400, "Invalid database")
    // @ApiResponse(404, "Database not found")
    // @ApiResponse(500, "Server error")
    public static class RouteCreate extends Route2 implements IReturn<Boolean>
    {
        /**
        * Database name containing the routes
        */
        @ApiMember(Description="Database name containing the routes", ParameterType="query", DataType="string", IsRequired=true)
        public String DbName = null;
        
        public String getDbName() { return DbName; }
        public RouteCreate setDbName(String value) { this.DbName = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/route/{Name}", Verbs="PUT")
    public static class RouteUpdate extends Route2 implements IReturn<Boolean>
    {
        /**
        * Database name containing the routes
        */
        @ApiMember(Description="Database name containing the routes", ParameterType="query", DataType="string")
        public String DbName = null;
        
        public String getDbName() { return DbName; }
        public RouteUpdate setDbName(String value) { this.DbName = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/database/{DbName}/route/{Name}", Verbs="DELETE")
    public static class RouteDelete implements IReturn<Boolean>
    {
        /**
        * Database name containing the routes
        */
        @ApiMember(Description="Database name containing the routes", ParameterType="query", DataType="string")
        public String DbName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="string")
        public String Name = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="query", DataType="boolean")
        public Boolean DeleteData = null;
        
        public String getDbName() { return DbName; }
        public RouteDelete setDbName(String value) { this.DbName = value; return this; }
        public String getName() { return Name; }
        public RouteDelete setName(String value) { this.Name = value; return this; }
        public Boolean isDeleteData() { return DeleteData; }
        public RouteDelete setDeleteData(Boolean value) { this.DeleteData = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/DataSources/Browse", Verbs="GET")
    // @Route(Path="/DataSources/Browse/{SearchString*}", Verbs="GET")
    public static class BrowseList implements IReturn<ArrayList<DiscoveryBrowseNode>>
    {
        public String SearchString = null;
        
        public String getSearchString() { return SearchString; }
        public BrowseList setSearchString(String value) { this.SearchString = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<DiscoveryBrowseNode>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/DataSources/{ItemName}", Verbs="GET")
    public static class DataSourceGet implements IReturn<DataSourceSettings>
    {
        public String ItemName = null;
        
        public String getItemName() { return ItemName; }
        public DataSourceGet setItemName(String value) { this.ItemName = value; return this; }
        private static Object responseType = DataSourceSettings.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/DataSources/Search", Verbs="GET")
    public static class SearchList implements IReturn<ArrayList<SearchItem>>
    {
        /**
        * Filters to apply to the search.
        */
        @ApiMember(Description="Filters to apply to the search.", ParameterType="body", DataType="string")
        public ArrayList<SearchFilter> Filters = null;

        /**
        * Search case sensitive
        */
        @ApiMember(Description="Search case sensitive", ParameterType="body", DataType="string")
        public Boolean SearchCaseSensitive = null;
        
        public ArrayList<SearchFilter> getFilters() { return Filters; }
        public SearchList setFilters(ArrayList<SearchFilter> value) { this.Filters = value; return this; }
        public Boolean isSearchCaseSensitive() { return SearchCaseSensitive; }
        public SearchList setSearchCaseSensitive(Boolean value) { this.SearchCaseSensitive = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<SearchItem>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/DataSources/Update", Verbs="POST")
    public static class UpdateList implements IReturn<Boolean>
    {
        
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/DataSources/IndexUpdateStatus", Verbs="GET")
    public static class IndexUpdateStatus implements IReturn<IndexUpdateStats>
    {
        
        private static Object responseType = IndexUpdateStats.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/serverconfig/list", Verbs="GET")
    public static class ServerConfigList implements IReturn<ArrayList<ConfiguredServerMongoDb>>
    {
        
        private static Object responseType = new TypeToken<ArrayList<ConfiguredServerMongoDb>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/serverconfig", Verbs="POST")
    public static class ServerConfigCreate implements IReturn<ConfiguredServerMongoDb>
    {
        public ConfiguredServerMongoDb ConfiguredServer = null;
        public String Password = null;
        
        public ConfiguredServerMongoDb getConfiguredServer() { return ConfiguredServer; }
        public ServerConfigCreate setConfiguredServer(ConfiguredServerMongoDb value) { this.ConfiguredServer = value; return this; }
        public String getPassword() { return Password; }
        public ServerConfigCreate setPassword(String value) { this.Password = value; return this; }
        private static Object responseType = ConfiguredServerMongoDb.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/serverconfig", Verbs="PUT")
    public static class ServerConfigUpdate implements IReturn<Boolean>
    {
        public ConfiguredServerMongoDb ConfiguredServer = null;
        
        public ConfiguredServerMongoDb getConfiguredServer() { return ConfiguredServer; }
        public ServerConfigUpdate setConfiguredServer(ConfiguredServerMongoDb value) { this.ConfiguredServer = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/serverconfig", Verbs="DELETE")
    public static class ServerConfigDelete implements IReturn<Boolean>
    {
        public String Id = null;
        
        public String getId() { return Id; }
        public ServerConfigDelete setId(String value) { this.Id = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/user", Verbs="GET")
    public static class UserRead implements IReturn<UserInfo>
    {
        public String Username = null;
        
        public String getUsername() { return Username; }
        public UserRead setUsername(String value) { this.Username = value; return this; }
        private static Object responseType = UserInfo.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/user/list", Verbs="GET")
    public static class UserList implements IReturn<ArrayList<UserInfo>>
    {
        
        private static Object responseType = new TypeToken<ArrayList<UserInfo>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/user", Verbs="POST")
    public static class UserAdd implements IReturn<RegisterResponse>
    {
        public UserInfo UserInfo = null;
        public String Password = null;
        
        public UserInfo getUserInfo() { return UserInfo; }
        public UserAdd setUserInfo(UserInfo value) { this.UserInfo = value; return this; }
        public String getPassword() { return Password; }
        public UserAdd setPassword(String value) { this.Password = value; return this; }
        private static Object responseType = RegisterResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/user", Verbs="PUT")
    public static class UserUpdate implements IReturn<RegisterResponse>
    {
        public UserInfo UserInfo = null;
        public String Password = null;
        
        public UserInfo getUserInfo() { return UserInfo; }
        public UserUpdate setUserInfo(UserInfo value) { this.UserInfo = value; return this; }
        public String getPassword() { return Password; }
        public UserUpdate setPassword(String value) { this.Password = value; return this; }
        private static Object responseType = RegisterResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/user", Verbs="DELETE")
    public static class UserDelete implements IReturn<String>
    {
        public String Username = null;
        
        public String getUsername() { return Username; }
        public UserDelete setUsername(String value) { this.Username = value; return this; }
        private static Object responseType = String.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/role", Verbs="GET")
    public static class RoleRead implements IReturn<RoleSettings>
    {
        public String Username = null;
        
        public String getUsername() { return Username; }
        public RoleRead setUsername(String value) { this.Username = value; return this; }
        private static Object responseType = RoleSettings.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/role/list", Verbs="GET")
    public static class RolesList implements IReturn<ArrayList<String>>
    {
        
        private static Object responseType = new TypeToken<ArrayList<String>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/activedirectory/listgroups", Verbs="GET")
    public static class AdGroupsList implements IReturn<ArrayList<String>>
    {
        
        private static Object responseType = new TypeToken<ArrayList<String>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/Session", Verbs="GET")
    public static class SessionTouch implements IReturn<Boolean>
    {
        public Integer Placeholder = null;
        
        public Integer getPlaceholder() { return Placeholder; }
        public SessionTouch setPlaceholder(Integer value) { this.Placeholder = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/Management/SecuritySettings", Verbs="Get")
    public static class ManagementSecuritySettingsRead implements IReturn<GlobalSecuritySettings>
    {
        
        private static Object responseType = GlobalSecuritySettings.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/Management/SecuritySettings", Verbs="Put")
    public static class ManagementSecuritySettingsUpdate implements IReturnVoid
    {
        public GlobalSecuritySettings SecuritySettings = null;
        public String PlainAdPassword = null;
        
        public GlobalSecuritySettings getSecuritySettings() { return SecuritySettings; }
        public ManagementSecuritySettingsUpdate setSecuritySettings(GlobalSecuritySettings value) { this.SecuritySettings = value; return this; }
        public String getPlainAdPassword() { return PlainAdPassword; }
        public ManagementSecuritySettingsUpdate setPlainAdPassword(String value) { this.PlainAdPassword = value; return this; }
    }

    @Route("/auth")
    // @Route("/auth/{provider}")
    // @Route("/authenticate")
    // @Route("/authenticate/{provider}")
    @DataContract
    public static class Authenticate implements IReturn<AuthenticateResponse>, IPost
    {
        @DataMember(Order=1)
        public String provider = null;

        @DataMember(Order=2)
        public String State = null;

        @DataMember(Order=3)
        public String oauth_token = null;

        @DataMember(Order=4)
        public String oauth_verifier = null;

        @DataMember(Order=5)
        public String UserName = null;

        @DataMember(Order=6)
        public String Password = null;

        @DataMember(Order=7)
        public Boolean RememberMe = null;

        @DataMember(Order=8)
        public String Continue = null;

        @DataMember(Order=9)
        public String nonce = null;

        @DataMember(Order=10)
        public String uri = null;

        @DataMember(Order=11)
        public String response = null;

        @DataMember(Order=12)
        public String qop = null;

        @DataMember(Order=13)
        public String nc = null;

        @DataMember(Order=14)
        public String cnonce = null;

        @DataMember(Order=15)
        public Boolean UseTokenCookie = null;

        @DataMember(Order=16)
        public HashMap<String,String> Meta = null;
        
        public String getProvider() { return provider; }
        public Authenticate setProvider(String value) { this.provider = value; return this; }
        public String getState() { return State; }
        public Authenticate setState(String value) { this.State = value; return this; }
        public String getOauthToken() { return oauth_token; }
        public Authenticate setOauthToken(String value) { this.oauth_token = value; return this; }
        public String getOauthVerifier() { return oauth_verifier; }
        public Authenticate setOauthVerifier(String value) { this.oauth_verifier = value; return this; }
        public String getUserName() { return UserName; }
        public Authenticate setUserName(String value) { this.UserName = value; return this; }
        public String getPassword() { return Password; }
        public Authenticate setPassword(String value) { this.Password = value; return this; }
        public Boolean isRememberMe() { return RememberMe; }
        public Authenticate setRememberMe(Boolean value) { this.RememberMe = value; return this; }
        public String getContinue() { return Continue; }
        public Authenticate setContinue(String value) { this.Continue = value; return this; }
        public String getNonce() { return nonce; }
        public Authenticate setNonce(String value) { this.nonce = value; return this; }
        public String getUri() { return uri; }
        public Authenticate setUri(String value) { this.uri = value; return this; }
        public String getResponse() { return response; }
        public Authenticate setResponse(String value) { this.response = value; return this; }
        public String getQop() { return qop; }
        public Authenticate setQop(String value) { this.qop = value; return this; }
        public String getNc() { return nc; }
        public Authenticate setNc(String value) { this.nc = value; return this; }
        public String getCnonce() { return cnonce; }
        public Authenticate setCnonce(String value) { this.cnonce = value; return this; }
        public Boolean isUseTokenCookie() { return UseTokenCookie; }
        public Authenticate setUseTokenCookie(Boolean value) { this.UseTokenCookie = value; return this; }
        public HashMap<String,String> getMeta() { return Meta; }
        public Authenticate setMeta(HashMap<String,String> value) { this.Meta = value; return this; }
        private static Object responseType = AuthenticateResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route("/assignroles")
    @DataContract
    public static class AssignRoles implements IReturn<AssignRolesResponse>, IPost
    {
        @DataMember(Order=1)
        public String UserName = null;

        @DataMember(Order=2)
        public ArrayList<String> Permissions = null;

        @DataMember(Order=3)
        public ArrayList<String> Roles = null;
        
        public String getUserName() { return UserName; }
        public AssignRoles setUserName(String value) { this.UserName = value; return this; }
        public ArrayList<String> getPermissions() { return Permissions; }
        public AssignRoles setPermissions(ArrayList<String> value) { this.Permissions = value; return this; }
        public ArrayList<String> getRoles() { return Roles; }
        public AssignRoles setRoles(ArrayList<String> value) { this.Roles = value; return this; }
        private static Object responseType = AssignRolesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route("/unassignroles")
    @DataContract
    public static class UnAssignRoles implements IReturn<UnAssignRolesResponse>, IPost
    {
        @DataMember(Order=1)
        public String UserName = null;

        @DataMember(Order=2)
        public ArrayList<String> Permissions = null;

        @DataMember(Order=3)
        public ArrayList<String> Roles = null;
        
        public String getUserName() { return UserName; }
        public UnAssignRoles setUserName(String value) { this.UserName = value; return this; }
        public ArrayList<String> getPermissions() { return Permissions; }
        public UnAssignRoles setPermissions(ArrayList<String> value) { this.Permissions = value; return this; }
        public ArrayList<String> getRoles() { return Roles; }
        public UnAssignRoles setRoles(ArrayList<String> value) { this.Roles = value; return this; }
        private static Object responseType = UnAssignRolesResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route("/apikeys")
    // @Route("/apikeys/{Environment}")
    @DataContract
    public static class GetApiKeys implements IReturn<GetApiKeysResponse>, IGet
    {
        @DataMember(Order=1)
        public String Environment = null;
        
        public String getEnvironment() { return Environment; }
        public GetApiKeys setEnvironment(String value) { this.Environment = value; return this; }
        private static Object responseType = GetApiKeysResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route("/apikeys/regenerate")
    // @Route("/apikeys/regenerate/{Environment}")
    @DataContract
    public static class RegenerateApiKeys implements IReturn<GetApiKeysResponse>, IPost
    {
        @DataMember(Order=1)
        public String Environment = null;
        
        public String getEnvironment() { return Environment; }
        public RegenerateApiKeys setEnvironment(String value) { this.Environment = value; return this; }
        private static Object responseType = GetApiKeysResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route("/session-to-token")
    @DataContract
    public static class ConvertSessionToToken implements IReturn<ConvertSessionToTokenResponse>, IPost
    {
        @DataMember(Order=1)
        public Boolean PreserveSession = null;
        
        public Boolean isPreserveSession() { return PreserveSession; }
        public ConvertSessionToToken setPreserveSession(Boolean value) { this.PreserveSession = value; return this; }
        private static Object responseType = ConvertSessionToTokenResponse.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/TemplateManager/Directory", Verbs="GET")
    // @Route(Path="/TemplateManager/Directory/{Path*}", Verbs="GET")
    public static class DirectoryContentList implements IReturn<dirContents>
    {
        public String Path = null;
        public Integer Versions = null;
        
        public String getPath() { return Path; }
        public DirectoryContentList setPath(String value) { this.Path = value; return this; }
        public Integer getVersions() { return Versions; }
        public DirectoryContentList setVersions(Integer value) { this.Versions = value; return this; }
        private static Object responseType = dirContents.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/TemplateManager/Directory", Verbs="PUT")
    public static class DirectoryRename
    {
        public String OldDirectoryName = null;
        public String NewDirectoryName = null;
        public String Path = null;
        public String AuditComment = null;
        
        public String getOldDirectoryName() { return OldDirectoryName; }
        public DirectoryRename setOldDirectoryName(String value) { this.OldDirectoryName = value; return this; }
        public String getNewDirectoryName() { return NewDirectoryName; }
        public DirectoryRename setNewDirectoryName(String value) { this.NewDirectoryName = value; return this; }
        public String getPath() { return Path; }
        public DirectoryRename setPath(String value) { this.Path = value; return this; }
        public String getAuditComment() { return AuditComment; }
        public DirectoryRename setAuditComment(String value) { this.AuditComment = value; return this; }
    }

    @Route(Path="/TemplateManager/Directory", Verbs="POST")
    public static class DirectoryCreate
    {
        public String DirectoryName = null;
        public String Path = null;
        public String AuditComment = null;
        
        public String getDirectoryName() { return DirectoryName; }
        public DirectoryCreate setDirectoryName(String value) { this.DirectoryName = value; return this; }
        public String getPath() { return Path; }
        public DirectoryCreate setPath(String value) { this.Path = value; return this; }
        public String getAuditComment() { return AuditComment; }
        public DirectoryCreate setAuditComment(String value) { this.AuditComment = value; return this; }
    }

    @Route(Path="/TemplateManager/Directory", Verbs="DELETE")
    public static class DirectoryDelete
    {
        public String DirectoryName = null;
        public String Path = null;
        public String AuditComment = null;
        public Boolean ForceDelete = null;
        
        public String getDirectoryName() { return DirectoryName; }
        public DirectoryDelete setDirectoryName(String value) { this.DirectoryName = value; return this; }
        public String getPath() { return Path; }
        public DirectoryDelete setPath(String value) { this.Path = value; return this; }
        public String getAuditComment() { return AuditComment; }
        public DirectoryDelete setAuditComment(String value) { this.AuditComment = value; return this; }
        public Boolean isForceDelete() { return ForceDelete; }
        public DirectoryDelete setForceDelete(Boolean value) { this.ForceDelete = value; return this; }
    }

    @Route(Path="/TemplateManager/File/{FileLocation*}", Verbs="GET")
    public static class FileRead implements IReturn<FileDetails>
    {
        public String FileLocation = null;
        public String Version = null;
        
        public String getFileLocation() { return FileLocation; }
        public FileRead setFileLocation(String value) { this.FileLocation = value; return this; }
        public String getVersion() { return Version; }
        public FileRead setVersion(String value) { this.Version = value; return this; }
        private static Object responseType = FileDetails.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/TemplateManager/File/{FileLocation*}", Verbs="PUT")
    public static class FileUpdate
    {
        public String FileLocation = null;
        public String NewName = null;
        public byteDataType File = null;
        public String AuditComment = null;
        
        public String getFileLocation() { return FileLocation; }
        public FileUpdate setFileLocation(String value) { this.FileLocation = value; return this; }
        public String getNewName() { return NewName; }
        public FileUpdate setNewName(String value) { this.NewName = value; return this; }
        public byteDataType getFile() { return File; }
        public FileUpdate setFile(byteDataType value) { this.File = value; return this; }
        public String getAuditComment() { return AuditComment; }
        public FileUpdate setAuditComment(String value) { this.AuditComment = value; return this; }
    }

    @Route(Path="/TemplateManager/File/{FileLocation*}", Verbs="POST")
    public static class FileCreate
    {
        public byteDataType File = null;
        public String FileLocation = null;
        public String AuditComment = null;
        
        public byteDataType getFile() { return File; }
        public FileCreate setFile(byteDataType value) { this.File = value; return this; }
        public String getFileLocation() { return FileLocation; }
        public FileCreate setFileLocation(String value) { this.FileLocation = value; return this; }
        public String getAuditComment() { return AuditComment; }
        public FileCreate setAuditComment(String value) { this.AuditComment = value; return this; }
    }

    @Route(Path="/TemplateManager/{FileLocation*}", Verbs="DELETE")
    public static class FileDelete
    {
        public String FileLocation = null;
        public String AuditComment = null;
        public Boolean ForceDelete = null;
        
        public String getFileLocation() { return FileLocation; }
        public FileDelete setFileLocation(String value) { this.FileLocation = value; return this; }
        public String getAuditComment() { return AuditComment; }
        public FileDelete setAuditComment(String value) { this.AuditComment = value; return this; }
        public Boolean isForceDelete() { return ForceDelete; }
        public FileDelete setForceDelete(Boolean value) { this.ForceDelete = value; return this; }
    }

    @Route(Path="/TemplateManager/Template/{TemplateLocation*}", Verbs="GET")
    public static class TemplateRead implements IReturn<ArrayList<Short>>
    {
        public String TemplateLocation = null;
        
        public String getTemplateLocation() { return TemplateLocation; }
        public TemplateRead setTemplateLocation(String value) { this.TemplateLocation = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<Short>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/TemplateManager/Template/{TemplateLocation*}", Verbs="POST")
    public static class TemplateCreate
    {
        public String TemplateLocation = null;
        public String AuditComment = null;
        public ArrayList<Short> Template = null;
        
        public String getTemplateLocation() { return TemplateLocation; }
        public TemplateCreate setTemplateLocation(String value) { this.TemplateLocation = value; return this; }
        public String getAuditComment() { return AuditComment; }
        public TemplateCreate setAuditComment(String value) { this.AuditComment = value; return this; }
        public ArrayList<Short> getTemplate() { return Template; }
        public TemplateCreate setTemplate(ArrayList<Short> value) { this.Template = value; return this; }
    }

    @Route(Path="/TemplateManager/Template/{TemplateLocation*}", Verbs="PUT")
    public static class TemplateUpdate
    {
        public String TemplateLocation = null;
        public String AuditComment = null;
        public ArrayList<Short> Template = null;
        
        public String getTemplateLocation() { return TemplateLocation; }
        public TemplateUpdate setTemplateLocation(String value) { this.TemplateLocation = value; return this; }
        public String getAuditComment() { return AuditComment; }
        public TemplateUpdate setAuditComment(String value) { this.AuditComment = value; return this; }
        public ArrayList<Short> getTemplate() { return Template; }
        public TemplateUpdate setTemplate(ArrayList<Short> value) { this.Template = value; return this; }
    }

    @Route(Path="/Server/LocalName", Verbs="GET")
    public static class ServerLocalNameRead implements IReturn<String>
    {
        
        private static Object responseType = String.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/FileManager/Config", Verbs="POST")
    // @Route(Path="/FileManager/Config", Verbs="PUT")
    public static class FileManagerConfigUpdate implements IReturnVoid
    {
        public FileManagerConfig Config = null;
        
        public FileManagerConfig getConfig() { return Config; }
        public FileManagerConfigUpdate setConfig(FileManagerConfig value) { this.Config = value; return this; }
    }

    @Route(Path="/FileManager/Config", Verbs="GET")
    public static class FileManagerConfigRead implements IReturn<FileManagerConfig>
    {
        
        private static Object responseType = FileManagerConfig.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/Report/{ReportName*}", Verbs="GET")
    public static class Report implements IReturn<String>
    {
        public String ReportName = null;
        public Date ReportTime = null;
        public String OutputFile = null;
        
        public String getReportName() { return ReportName; }
        public Report setReportName(String value) { this.ReportName = value; return this; }
        public Date getReportTime() { return ReportTime; }
        public Report setReportTime(Date value) { this.ReportTime = value; return this; }
        public String getOutputFile() { return OutputFile; }
        public Report setOutputFile(String value) { this.OutputFile = value; return this; }
        private static Object responseType = String.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/Report/Schedule/List", Verbs="GET")
    public static class ScheduleReportList implements IReturn<ArrayList<ReportSchedule>>
    {
        public String Path = null;
        
        public String getPath() { return Path; }
        public ScheduleReportList setPath(String value) { this.Path = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<ReportSchedule>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/Report/Schedule", Verbs="PUT")
    public static class ScheduleReportUpdate implements IReturn<Boolean>
    {
        public ReportSchedule Schedule = null;
        
        public ReportSchedule getSchedule() { return Schedule; }
        public ScheduleReportUpdate setSchedule(ReportSchedule value) { this.Schedule = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/Report/Schedule", Verbs="POST")
    public static class ScheduleReportCreate implements IReturn<Boolean>
    {
        public ReportSchedule Schedule = null;
        
        public ReportSchedule getSchedule() { return Schedule; }
        public ScheduleReportCreate setSchedule(ReportSchedule value) { this.Schedule = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/Report/Schedule", Verbs="DELETE")
    public static class ScheduleReportDelete implements IReturn<Boolean>
    {
        public String Name = null;
        public String Path = null;
        
        public String getName() { return Name; }
        public ScheduleReportDelete setName(String value) { this.Name = value; return this; }
        public String getPath() { return Path; }
        public ScheduleReportDelete setPath(String value) { this.Path = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/DataManager/Config", Verbs="GET")
    public static class DataManagerConfigRead implements IReturn<DataManagerConfig>
    {
        
        private static Object responseType = DataManagerConfig.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/DataManager/Config", Verbs="POST")
    // @Route(Path="/DataManager/Config", Verbs="PUT")
    public static class DataManagerConfigUpdate implements IReturnVoid
    {
        public DataManagerConfig Config = null;
        
        public DataManagerConfig getConfig() { return Config; }
        public DataManagerConfigUpdate setConfig(DataManagerConfig value) { this.Config = value; return this; }
    }

    @Route(Path="/DataManager/AvailableHosts/{Host}", Verbs="GET")
    public static class AvailableHostsGet implements IReturn<ArrayList<dataSourceConnectionType>>
    {
        public String Host = null;
        
        public String getHost() { return Host; }
        public AvailableHostsGet setHost(String value) { this.Host = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<dataSourceConnectionType>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/DataManager/SourcesFromHostByType/{Host}", Verbs="GET")
    public static class AvailableSourcesByTypeGet implements IReturn<ArrayList<dataSourceConnectionType>>
    {
        public String Host = null;
        public dataSourceDefinitionType SourceType = null;
        
        public String getHost() { return Host; }
        public AvailableSourcesByTypeGet setHost(String value) { this.Host = value; return this; }
        public dataSourceDefinitionType getSourceType() { return SourceType; }
        public AvailableSourcesByTypeGet setSourceType(dataSourceDefinitionType value) { this.SourceType = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<dataSourceConnectionType>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/DataManager/BrowsePath", Verbs="GET")
    public static class BrowsePathGet implements IReturn<BrowsePathResults>
    {
        public dataSourceConnectionType Connection = null;
        public BrowsePathResults RootBrowsePath = null;
        
        public dataSourceConnectionType getConnection() { return Connection; }
        public BrowsePathGet setConnection(dataSourceConnectionType value) { this.Connection = value; return this; }
        public BrowsePathResults getRootBrowsePath() { return RootBrowsePath; }
        public BrowsePathGet setRootBrowsePath(BrowsePathResults value) { this.RootBrowsePath = value; return this; }
        private static Object responseType = BrowsePathResults.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/DataManager/RetrieveItemCollection", Verbs="GET")
    public static class ItemCollectionGet implements IReturn<itemCollectionType>
    {
        public dataSourceConnectionType Connection = null;
        public ArrayList<browseEntryType> PathToEntry = null;
        
        public dataSourceConnectionType getConnection() { return Connection; }
        public ItemCollectionGet setConnection(dataSourceConnectionType value) { this.Connection = value; return this; }
        public ArrayList<browseEntryType> getPathToEntry() { return PathToEntry; }
        public ItemCollectionGet setPathToEntry(ArrayList<browseEntryType> value) { this.PathToEntry = value; return this; }
        private static Object responseType = itemCollectionType.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/DataManager/SourceConfigurationOptions", Verbs="GET")
    public static class ConfigurationOptionsGet implements IReturn<ArrayList<optionType>>
    {
        public dataSourceConnectionType Connection = null;
        
        public dataSourceConnectionType getConnection() { return Connection; }
        public ConfigurationOptionsGet setConnection(dataSourceConnectionType value) { this.Connection = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<optionType>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/DataManager/SourceSupportedTypes", Verbs="GET")
    public static class SupportedTypesGet implements IReturn<ArrayList<dataSourceDefinitionType>>
    {
        public dataSourceConnectionType Connection = null;
        
        public dataSourceConnectionType getConnection() { return Connection; }
        public SupportedTypesGet setConnection(dataSourceConnectionType value) { this.Connection = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<dataSourceDefinitionType>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/DataManager/SingleDatumGet", Verbs="GET")
    public static class FetchSingleDatum implements IReturn<FetchDataResults>
    {
        public dataSourceType Source = null;
        public ArrayList<optionType> Config = null;
        
        public dataSourceType getSource() { return Source; }
        public FetchSingleDatum setSource(dataSourceType value) { this.Source = value; return this; }
        public ArrayList<optionType> getConfig() { return Config; }
        public FetchSingleDatum setConfig(ArrayList<optionType> value) { this.Config = value; return this; }
        private static Object responseType = FetchDataResults.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/DataManager/FetchData", Verbs="GET")
    public static class DataGet implements IReturn<FetchDataResults>
    {
        public dataSourceType Source = null;
        public ArrayList<optionType> Config = null;
        public dataSourceSeekerType Seeker = null;
        
        public dataSourceType getSource() { return Source; }
        public DataGet setSource(dataSourceType value) { this.Source = value; return this; }
        public ArrayList<optionType> getConfig() { return Config; }
        public DataGet setConfig(ArrayList<optionType> value) { this.Config = value; return this; }
        public dataSourceSeekerType getSeeker() { return Seeker; }
        public DataGet setSeeker(dataSourceSeekerType value) { this.Seeker = value; return this; }
        private static Object responseType = FetchDataResults.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/DataManager/FetchDataByTime", Verbs="GET")
    public static class DataByTimeGet implements IReturn<FetchDataResults>
    {
        public dataSourceType Source = null;
        public ArrayList<optionType> Config = null;
        public dataSourceSeekerType Seeker = null;
        public Date StartTime = null;
        public Date StopTime = null;
        public String DateItemName = null;
        
        public dataSourceType getSource() { return Source; }
        public DataByTimeGet setSource(dataSourceType value) { this.Source = value; return this; }
        public ArrayList<optionType> getConfig() { return Config; }
        public DataByTimeGet setConfig(ArrayList<optionType> value) { this.Config = value; return this; }
        public dataSourceSeekerType getSeeker() { return Seeker; }
        public DataByTimeGet setSeeker(dataSourceSeekerType value) { this.Seeker = value; return this; }
        public Date getStartTime() { return StartTime; }
        public DataByTimeGet setStartTime(Date value) { this.StartTime = value; return this; }
        public Date getStopTime() { return StopTime; }
        public DataByTimeGet setStopTime(Date value) { this.StopTime = value; return this; }
        public String getDateItemName() { return DateItemName; }
        public DataByTimeGet setDateItemName(String value) { this.DateItemName = value; return this; }
        private static Object responseType = FetchDataResults.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/calculations/{Name}", Verbs="GET")
    public static class GetCalculation implements IReturn<CalculationEx>
    {
        public String Name = null;
        public String Path = null;
        
        public String getName() { return Name; }
        public GetCalculation setName(String value) { this.Name = value; return this; }
        public String getPath() { return Path; }
        public GetCalculation setPath(String value) { this.Path = value; return this; }
        private static Object responseType = CalculationEx.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/calculations", Verbs="POST")
    public static class CreateCalculationEx implements IReturn<Boolean>
    {
        public String Path = null;
        public CalculationEx Calculation = null;
        public ArrayList<Short> Assembly = null;
        public String Source = null;
        
        public String getPath() { return Path; }
        public CreateCalculationEx setPath(String value) { this.Path = value; return this; }
        public CalculationEx getCalculation() { return Calculation; }
        public CreateCalculationEx setCalculation(CalculationEx value) { this.Calculation = value; return this; }
        public ArrayList<Short> getAssembly() { return Assembly; }
        public CreateCalculationEx setAssembly(ArrayList<Short> value) { this.Assembly = value; return this; }
        public String getSource() { return Source; }
        public CreateCalculationEx setSource(String value) { this.Source = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/calculations", Verbs="PUT")
    public static class UpdateCalculationEx implements IReturn<Boolean>
    {
        public String Path = null;
        public CalculationEx Calculation = null;
        
        public String getPath() { return Path; }
        public UpdateCalculationEx setPath(String value) { this.Path = value; return this; }
        public CalculationEx getCalculation() { return Calculation; }
        public UpdateCalculationEx setCalculation(CalculationEx value) { this.Calculation = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/calculations/{Path*}", Verbs="DELETE")
    public static class DeleteCalculationEx implements IReturn<Boolean>
    {
        public String Path = null;
        
        public String getPath() { return Path; }
        public DeleteCalculationEx setPath(String value) { this.Path = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/calculations/getcalculationlist", Verbs="GET")
    public static class GetCalculationList implements IReturn<ArrayList<String>>
    {
        public String Path = null;
        
        public String getPath() { return Path; }
        public GetCalculationList setPath(String value) { this.Path = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<String>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/calculations/run", Verbs="PUT")
    public static class RunCalculation implements IReturn<EvaluationResult>
    {
        public String Path = null;
        public CalculationEx Calculation = null;
        
        public String getPath() { return Path; }
        public RunCalculation setPath(String value) { this.Path = value; return this; }
        public CalculationEx getCalculation() { return Calculation; }
        public RunCalculation setCalculation(CalculationEx value) { this.Calculation = value; return this; }
        private static Object responseType = EvaluationResult.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/calculations/RunWithParameters", Verbs="PUT")
    public static class RunCalculationWithData implements IReturn<EvaluationResult>
    {
        public String Path = null;
        public String Name = null;
        public HashMap<String,Variant> Inputs = null;
        
        public String getPath() { return Path; }
        public RunCalculationWithData setPath(String value) { this.Path = value; return this; }
        public String getName() { return Name; }
        public RunCalculationWithData setName(String value) { this.Name = value; return this; }
        public HashMap<String,Variant> getInputs() { return Inputs; }
        public RunCalculationWithData setInputs(HashMap<String,Variant> value) { this.Inputs = value; return this; }
        private static Object responseType = EvaluationResult.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/calculations/Schedule/Path", Verbs="GET")
    public static class ScheduleCalculationGet implements IReturn<ArrayList<CalculationSchedule>>
    {
        public String Name = null;
        public String Path = null;
        
        public String getName() { return Name; }
        public ScheduleCalculationGet setName(String value) { this.Name = value; return this; }
        public String getPath() { return Path; }
        public ScheduleCalculationGet setPath(String value) { this.Path = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<CalculationSchedule>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/calculations/Schedule/List", Verbs="GET")
    public static class ScheduleCalculationsList implements IReturn<ArrayList<CalculationSchedule>>
    {
        public String Path = null;
        
        public String getPath() { return Path; }
        public ScheduleCalculationsList setPath(String value) { this.Path = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<CalculationSchedule>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/calculations/Schedule", Verbs="PUT")
    public static class ScheduleCalculationUpdate implements IReturn<Boolean>
    {
        public CalculationSchedule Schedule = null;
        
        public CalculationSchedule getSchedule() { return Schedule; }
        public ScheduleCalculationUpdate setSchedule(CalculationSchedule value) { this.Schedule = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/calculations/Schedule", Verbs="POST")
    public static class ScheduleCalculationCreate implements IReturn<Boolean>
    {
        public CalculationSchedule Schedule = null;
        
        public CalculationSchedule getSchedule() { return Schedule; }
        public ScheduleCalculationCreate setSchedule(CalculationSchedule value) { this.Schedule = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/calculations/Schedule", Verbs="DELETE")
    public static class ScheduleCalculationDelete implements IReturn<Boolean>
    {
        public String Name = null;
        public String Path = null;
        
        public String getName() { return Name; }
        public ScheduleCalculationDelete setName(String value) { this.Name = value; return this; }
        public String getPath() { return Path; }
        public ScheduleCalculationDelete setPath(String value) { this.Path = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/calculations/ScheduledJobs", Verbs="GET")
    public static class ScheduledJobsGet implements IReturn<ArrayList<CalculationScheduleInfo>>
    {
        
        private static Object responseType = new TypeToken<ArrayList<CalculationScheduleInfo>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/calculations/ExecutingJobs", Verbs="GET")
    public static class ExecutingJobsGet implements IReturn<ArrayList<String>>
    {
        
        private static Object responseType = new TypeToken<ArrayList<String>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/calculations/CompletedJobs", Verbs="GET")
    public static class CompletedJobsGet implements IReturn<ArrayList<CalculationRunLog>>
    {
        public Date StartTime = null;
        public Date EndTime = null;
        
        public Date getStartTime() { return StartTime; }
        public CompletedJobsGet setStartTime(Date value) { this.StartTime = value; return this; }
        public Date getEndTime() { return EndTime; }
        public CompletedJobsGet setEndTime(Date value) { this.EndTime = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<CalculationRunLog>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/calculations/SkippedJobs", Verbs="GET")
    public static class SkippedJobsGet implements IReturn<HashMap<String,Integer>>
    {
        
        private static Object responseType = new TypeToken<HashMap<String,Integer>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/calculations/Primitives/List", Verbs="GET")
    public static class CalculationPrimitivesList implements IReturn<ArrayList<PrimitiveEx>>
    {
        
        private static Object responseType = new TypeToken<ArrayList<PrimitiveEx>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/InfoModel/List", Verbs="GET")
    public static class InfoModelListElements implements IReturn<ArrayList<InfoModelElementListing>>
    {
        public String Path = null;
        public Boolean Recurse = null;
        public Boolean ReturnLegacyNode = null;
        
        public String getPath() { return Path; }
        public InfoModelListElements setPath(String value) { this.Path = value; return this; }
        public Boolean isRecurse() { return Recurse; }
        public InfoModelListElements setRecurse(Boolean value) { this.Recurse = value; return this; }
        public Boolean isReturnLegacyNode() { return ReturnLegacyNode; }
        public InfoModelListElements setReturnLegacyNode(Boolean value) { this.ReturnLegacyNode = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<InfoModelElementListing>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/InfoModel", Verbs="GET")
    public static class InfoModelRead implements IReturn<InfoModelElement>
    {
        public String Path = null;
        
        public String getPath() { return Path; }
        public InfoModelRead setPath(String value) { this.Path = value; return this; }
        private static Object responseType = InfoModelElement.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/InfoModel", Verbs="POST")
    public static class InfoModelCreate implements IReturn<Boolean>
    {
        public InfoModelElement NewModel = null;
        public Boolean RecreateHierarchy = null;
        public Boolean ExtendInstances = null;
        
        public InfoModelElement getNewModel() { return NewModel; }
        public InfoModelCreate setNewModel(InfoModelElement value) { this.NewModel = value; return this; }
        public Boolean isRecreateHierarchy() { return RecreateHierarchy; }
        public InfoModelCreate setRecreateHierarchy(Boolean value) { this.RecreateHierarchy = value; return this; }
        public Boolean isExtendInstances() { return ExtendInstances; }
        public InfoModelCreate setExtendInstances(Boolean value) { this.ExtendInstances = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/InfoModel", Verbs="PUT")
    public static class InfoModelUpdate implements IReturn<Long>
    {
        public InfoModelUpdateOptions UpdateOptions = null;
        
        public InfoModelUpdateOptions getUpdateOptions() { return UpdateOptions; }
        public InfoModelUpdate setUpdateOptions(InfoModelUpdateOptions value) { this.UpdateOptions = value; return this; }
        private static Object responseType = Long.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/InfoModel", Verbs="DELETE")
    public static class InfoModelDelete implements IReturn<Boolean>
    {
        public ArrayList<String> Paths = null;
        public Boolean Recursive = null;
        
        public ArrayList<String> getPaths() { return Paths; }
        public InfoModelDelete setPaths(ArrayList<String> value) { this.Paths = value; return this; }
        public Boolean isRecursive() { return Recursive; }
        public InfoModelDelete setRecursive(Boolean value) { this.Recursive = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/InfoModel/Copy", Verbs="PUT")
    public static class InfoModelCopy implements IReturn<Boolean>
    {
        public String SourcePath = null;
        public String DestinationPath = null;
        public Boolean Overwrite = null;
        public Boolean Flatten = null;
        public ArrayList<InfoModelResolutionInfo> ResolutionRules = null;
        
        public String getSourcePath() { return SourcePath; }
        public InfoModelCopy setSourcePath(String value) { this.SourcePath = value; return this; }
        public String getDestinationPath() { return DestinationPath; }
        public InfoModelCopy setDestinationPath(String value) { this.DestinationPath = value; return this; }
        public Boolean isOverwrite() { return Overwrite; }
        public InfoModelCopy setOverwrite(Boolean value) { this.Overwrite = value; return this; }
        public Boolean isFlatten() { return Flatten; }
        public InfoModelCopy setFlatten(Boolean value) { this.Flatten = value; return this; }
        public ArrayList<InfoModelResolutionInfo> getResolutionRules() { return ResolutionRules; }
        public InfoModelCopy setResolutionRules(ArrayList<InfoModelResolutionInfo> value) { this.ResolutionRules = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/InfoModel/Move", Verbs="PUT")
    public static class InfoModelMove implements IReturn<Boolean>
    {
        public String SourcePath = null;
        public String DestinationPath = null;
        public Boolean Overwrite = null;
        public Boolean Flatten = null;
        
        public String getSourcePath() { return SourcePath; }
        public InfoModelMove setSourcePath(String value) { this.SourcePath = value; return this; }
        public String getDestinationPath() { return DestinationPath; }
        public InfoModelMove setDestinationPath(String value) { this.DestinationPath = value; return this; }
        public Boolean isOverwrite() { return Overwrite; }
        public InfoModelMove setOverwrite(Boolean value) { this.Overwrite = value; return this; }
        public Boolean isFlatten() { return Flatten; }
        public InfoModelMove setFlatten(Boolean value) { this.Flatten = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/InfoModel/ModelFromInstance", Verbs="PUT")
    public static class InfoModelCreateModelFromInstance implements IReturn<Boolean>
    {
        public String InstancePath = null;
        public String FullModelPath = null;
        public ArrayList<InfoModelResolutionInfo> ResolutionRules = null;
        
        public String getInstancePath() { return InstancePath; }
        public InfoModelCreateModelFromInstance setInstancePath(String value) { this.InstancePath = value; return this; }
        public String getFullModelPath() { return FullModelPath; }
        public InfoModelCreateModelFromInstance setFullModelPath(String value) { this.FullModelPath = value; return this; }
        public ArrayList<InfoModelResolutionInfo> getResolutionRules() { return ResolutionRules; }
        public InfoModelCreateModelFromInstance setResolutionRules(ArrayList<InfoModelResolutionInfo> value) { this.ResolutionRules = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/InfoModel/Link", Verbs="PUT")
    public static class InfoModelLink implements IReturn<Boolean>
    {
        public String SourcePath = null;
        public String DestinationPath = null;
        public Boolean Overwrite = null;
        
        public String getSourcePath() { return SourcePath; }
        public InfoModelLink setSourcePath(String value) { this.SourcePath = value; return this; }
        public String getDestinationPath() { return DestinationPath; }
        public InfoModelLink setDestinationPath(String value) { this.DestinationPath = value; return this; }
        public Boolean isOverwrite() { return Overwrite; }
        public InfoModelLink setOverwrite(Boolean value) { this.Overwrite = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/InfoModel/ResolveInstances", Verbs="GET")
    public static class InfoModelResolveInstances implements IReturn<ArrayList<InfoModelElementListing>>
    {
        public String ModelPath = null;
        
        public String getModelPath() { return ModelPath; }
        public InfoModelResolveInstances setModelPath(String value) { this.ModelPath = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<InfoModelElementListing>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/InfoModel/ResolveReferentialElements", Verbs="GET")
    public static class InfoModelResolveReferentialElements implements IReturn<ArrayList<InfoModelElementListing>>
    {
        public String Path = null;
        
        public String getPath() { return Path; }
        public InfoModelResolveReferentialElements setPath(String value) { this.Path = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<InfoModelElementListing>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/InfoModel/ListParents", Verbs="GET")
    public static class InfoModelListInheritedParents implements IReturn<ArrayList<InfoModelElementListing>>
    {
        public String Path = null;
        
        public String getPath() { return Path; }
        public InfoModelListInheritedParents setPath(String value) { this.Path = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<InfoModelElementListing>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/InfoModel/ElementHierarchy", Verbs="GET")
    public static class InfoModelGetElementHierarchy implements IReturn<ArrayList<InfoModelElement>>
    {
        public String Path = null;
        
        public String getPath() { return Path; }
        public InfoModelGetElementHierarchy setPath(String value) { this.Path = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<InfoModelElement>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/InfoModel/ListAttributes", Verbs="GET")
    public static class InfoModelListAttributes implements IReturn<ArrayList<InfoModelAttribute>>
    {
        public String Path = null;
        public Boolean Recurse = null;
        
        public String getPath() { return Path; }
        public InfoModelListAttributes setPath(String value) { this.Path = value; return this; }
        public Boolean isRecurse() { return Recurse; }
        public InfoModelListAttributes setRecurse(Boolean value) { this.Recurse = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<InfoModelAttribute>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/InfoModel/Search", Verbs="GET")
    public static class InfoModelSearch implements IReturn<ArrayList<InfoModelElementListing>>
    {
        public SearchParams SearchOptions = null;
        public Integer Page = null;
        public Integer PageSize = null;
        public Integer Offset = null;
        
        public SearchParams getSearchOptions() { return SearchOptions; }
        public InfoModelSearch setSearchOptions(SearchParams value) { this.SearchOptions = value; return this; }
        public Integer getPage() { return Page; }
        public InfoModelSearch setPage(Integer value) { this.Page = value; return this; }
        public Integer getPageSize() { return PageSize; }
        public InfoModelSearch setPageSize(Integer value) { this.PageSize = value; return this; }
        public Integer getOffset() { return Offset; }
        public InfoModelSearch setOffset(Integer value) { this.Offset = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<InfoModelElementListing>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/InfoModel/SearchTreeForm", Verbs="GET")
    public static class InfoModelSearchTreeForm implements IReturn<InfoModelElementTree>
    {
        public SearchParams SearchOptions = null;
        
        public SearchParams getSearchOptions() { return SearchOptions; }
        public InfoModelSearchTreeForm setSearchOptions(SearchParams value) { this.SearchOptions = value; return this; }
        private static Object responseType = InfoModelElementTree.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/InfoModel/QueryItem", Verbs="GET")
    public static class InfoModelQueryItem implements IReturn<ArrayList<ProcessDataPoint>>
    {
        public InfoModelHdaSettings HdaSettings = null;
        
        public InfoModelHdaSettings getHdaSettings() { return HdaSettings; }
        public InfoModelQueryItem setHdaSettings(InfoModelHdaSettings value) { this.HdaSettings = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<ProcessDataPoint>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/EngineeringUnit/List", Verbs="GET")
    public static class EngineeringUnitClassList implements IReturn<ArrayList<String>>
    {
        
        private static Object responseType = new TypeToken<ArrayList<String>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/EngineeringUnit/{Class}", Verbs="GET")
    public static class EngineeringUnitClassRead implements IReturn<EngineeringUnitClass>
    {
        public String Class = null;
        
        public String getClass2() { return Class; }
        public EngineeringUnitClassRead setClass(String value) { this.Class = value; return this; }
        private static Object responseType = EngineeringUnitClass.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/EngineeringUnit", Verbs="POST")
    public static class EngineeringUnitClassCreate implements IReturn<Boolean>
    {
        public EngineeringUnitClass NewClass = null;
        
        public EngineeringUnitClass getNewClass() { return NewClass; }
        public EngineeringUnitClassCreate setNewClass(EngineeringUnitClass value) { this.NewClass = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/EngineeringUnit", Verbs="PUT")
    public static class EngineeringUnitClassUpdate implements IReturn<Boolean>
    {
        public EngineeringUnitClass UpdatedClass = null;
        
        public EngineeringUnitClass getUpdatedClass() { return UpdatedClass; }
        public EngineeringUnitClassUpdate setUpdatedClass(EngineeringUnitClass value) { this.UpdatedClass = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/EngineeringUnit", Verbs="DELETE")
    public static class EngineeringUnitClassDelete implements IReturn<Boolean>
    {
        public String Class = null;
        
        public String getClass2() { return Class; }
        public EngineeringUnitClassDelete setClass(String value) { this.Class = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/EngineeringUnit/{Class}/List", Verbs="GET")
    public static class EngineeringUnitList implements IReturn<ArrayList<String>>
    {
        public String Class = null;
        
        public String getClass2() { return Class; }
        public EngineeringUnitList setClass(String value) { this.Class = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<String>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/EngineeringUnit/All", Verbs="GET")
    public static class EngineeringUnitList2 implements IReturn<ArrayList<EngineeringUnit>>
    {
        
        private static Object responseType = new TypeToken<ArrayList<EngineeringUnit>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/EngineeringUnit/{Class}/{Unit}", Verbs="GET")
    public static class EngineeringUnitRead implements IReturn<EngineeringUnit>
    {
        public String Class = null;
        public String Unit = null;
        
        public String getClass2() { return Class; }
        public EngineeringUnitRead setClass(String value) { this.Class = value; return this; }
        public String getUnit() { return Unit; }
        public EngineeringUnitRead setUnit(String value) { this.Unit = value; return this; }
        private static Object responseType = EngineeringUnit.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/EngineeringUnit/{Class}", Verbs="POST")
    public static class EngineeringUnitCreate implements IReturn<Boolean>
    {
        public String Class = null;
        public EngineeringUnit NewUnit = null;
        
        public String getClass2() { return Class; }
        public EngineeringUnitCreate setClass(String value) { this.Class = value; return this; }
        public EngineeringUnit getNewUnit() { return NewUnit; }
        public EngineeringUnitCreate setNewUnit(EngineeringUnit value) { this.NewUnit = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/EngineeringUnit/{Class}", Verbs="PUT")
    public static class EngineeringUnitUpdate implements IReturn<Boolean>
    {
        public String Class = null;
        public EngineeringUnit UpdatedUnit = null;
        
        public String getClass2() { return Class; }
        public EngineeringUnitUpdate setClass(String value) { this.Class = value; return this; }
        public EngineeringUnit getUpdatedUnit() { return UpdatedUnit; }
        public EngineeringUnitUpdate setUpdatedUnit(EngineeringUnit value) { this.UpdatedUnit = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/EngineeringUnit/{Class}", Verbs="DELETE")
    public static class EngineeringUnitDelete implements IReturn<Boolean>
    {
        public String Class = null;
        public String Unit = null;
        
        public String getClass2() { return Class; }
        public EngineeringUnitDelete setClass(String value) { this.Class = value; return this; }
        public String getUnit() { return Unit; }
        public EngineeringUnitDelete setUnit(String value) { this.Unit = value; return this; }
        private static Object responseType = Boolean.class;
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/v1/InfoModel/Image", Verbs="GET")
    public static class InfoModelReadImages implements IReturn<ArrayList<InfoModelImageSettings>>
    {
        public ArrayList<String> ImageIds = null;
        
        public ArrayList<String> getImageIds() { return ImageIds; }
        public InfoModelReadImages setImageIds(ArrayList<String> value) { this.ImageIds = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<InfoModelImageSettings>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/Configuration/BackupInfoModelDb", Verbs="GET")
    public static class InfoModelDbBackup implements IReturn<ArrayList<String>>
    {
        public String BackupName = null;
        
        public String getBackupName() { return BackupName; }
        public InfoModelDbBackup setBackupName(String value) { this.BackupName = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<String>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/Configuration/ListInfoModelDbBackups", Verbs="GET")
    public static class InfoModelDbListBackups implements IReturn<ArrayList<String>>
    {
        
        private static Object responseType = new TypeToken<ArrayList<String>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    @Route(Path="/api/Configuration/RestoreInfoModelDb", Verbs="GET")
    public static class InfoModelDbRestore implements IReturn<ArrayList<String>>
    {
        public String BackupName = null;
        
        public String getBackupName() { return BackupName; }
        public InfoModelDbRestore setBackupName(String value) { this.BackupName = value; return this; }
        private static Object responseType = new TypeToken<ArrayList<String>>(){}.getType();
        public Object getResponseType() { return responseType; }
    }

    public static class BatchData
    {
        /**
        * Batch ID
        */
        @ApiMember(Description="Batch ID", ParameterType="body", DataType="string", IsRequired=true)
        public String BatchID = null;

        /**
        * Batch Phases
        */
        @ApiMember(Description="Batch Phases", ParameterType="body", DataType="string", IsRequired=true)
        public ArrayList<PhaseData> Phases = null;
        
        public String getBatchID() { return BatchID; }
        public BatchData setBatchID(String value) { this.BatchID = value; return this; }
        public ArrayList<PhaseData> getPhases() { return Phases; }
        public BatchData setPhases(ArrayList<PhaseData> value) { this.Phases = value; return this; }
    }

    public static class Database
    {
        /**
        * Name of the database
        */
        @ApiMember(Description="Name of the database", ParameterType="body", DataType="string", IsRequired=true)
        public String Name = null;

        /**
        * The host on which the bootfile for the database resides
        */
        @ApiMember(Description="The host on which the bootfile for the database resides", ParameterType="body", DataType="string")
        public String Host = null;

        /**
        * The path to the bootfile for the database
        */
        @ApiMember(Description="The path to the bootfile for the database", ParameterType="body", DataType="string")
        public String Location = null;

        /**
        * Returns the audit server host field
        */
        @ApiMember(Description="Returns the audit server host field", ParameterType="body", DataType="string")
        public String AuditHost = null;

        /**
        * Returns the database version
        */
        @ApiMember(Description="Returns the database version", ParameterType="body", DataType="string")
        public Integer AuditLevel = null;

        /**
        * Returns the data logger maximum events in cache value
        */
        @ApiMember(Description="Returns the data logger maximum events in cache value", ParameterType="body", DataType="string")
        public String DatabaseVersion = null;

        /**
        * Returns the data logger maximum events in cache value
        */
        @ApiMember(Description="Returns the data logger maximum events in cache value", ParameterType="body", DataType="integer")
        public Integer DataLoggerMaxEventsInCache = null;

        /**
        * Returns the data logger timeout interval value, specified in milliseconds
        */
        @ApiMember(Description="Returns the data logger timeout interval value, specified in milliseconds", ParameterType="body", DataType="integer")
        public Integer DataLoggerTimeoutInterval = null;

        /**
        * Indicates whether permanent deletion is enabled
        */
        @ApiMember(Description="Indicates whether permanent deletion is enabled", ParameterType="body", DataType="integer")
        public Integer DeletionLevel = null;

        /**
        * Returns the database description
        */
        @ApiMember(Description="Returns the database description", ParameterType="body", DataType="string")
        public String Description = null;

        /**
        * Returns the location of the local persistent queue path for the database
        */
        @ApiMember(Description="Returns the location of the local persistent queue path for the database", ParameterType="body", DataType="string")
        public String LocalPersistentQueuePath = null;

        /**
        * Returns the lock retry count value
        */
        @ApiMember(Description="Returns the lock retry count value", ParameterType="body", DataType="integer")
        public Integer LockRetryCount = null;

        /**
        * Returns the database lock timeout interval, specified in milliseconds
        */
        @ApiMember(Description="Returns the database lock timeout interval, specified in milliseconds", ParameterType="body", DataType="integer")
        public Integer LockTimeoutInterval = null;

        /**
        * Returns the default maximum database file rollover size for the database
        */
        @ApiMember(Description="Returns the default maximum database file rollover size for the database", ParameterType="body", DataType="integer")
        public Integer MaxDatabaseFileSize = null;

        /**
        * Indicates whether the record data logger down functionality is enabled
        */
        @ApiMember(Description="Indicates whether the record data logger down functionality is enabled", ParameterType="body", DataType="boolean")
        public Boolean RecordDataLoggerDown = null;

        /**
        * This read-only property returns the replication mode for the database
        */
        @ApiMember(Description="This read-only property returns the replication mode for the database", ParameterType="body", DataType="ReplicationMode_e")
        public ReplicationMode_e ReplicationMode = null;

        /**
        * Indicates whether security is enabled
        */
        @ApiMember(Description="Indicates whether security is enabled", ParameterType="body", DataType="integer")
        public Integer SecurityLevel = null;
        
        public String getName() { return Name; }
        public Database setName(String value) { this.Name = value; return this; }
        public String getHost() { return Host; }
        public Database setHost(String value) { this.Host = value; return this; }
        public String getLocation() { return Location; }
        public Database setLocation(String value) { this.Location = value; return this; }
        public String getAuditHost() { return AuditHost; }
        public Database setAuditHost(String value) { this.AuditHost = value; return this; }
        public Integer getAuditLevel() { return AuditLevel; }
        public Database setAuditLevel(Integer value) { this.AuditLevel = value; return this; }
        public String getDatabaseVersion() { return DatabaseVersion; }
        public Database setDatabaseVersion(String value) { this.DatabaseVersion = value; return this; }
        public Integer getDataLoggerMaxEventsInCache() { return DataLoggerMaxEventsInCache; }
        public Database setDataLoggerMaxEventsInCache(Integer value) { this.DataLoggerMaxEventsInCache = value; return this; }
        public Integer getDataLoggerTimeoutInterval() { return DataLoggerTimeoutInterval; }
        public Database setDataLoggerTimeoutInterval(Integer value) { this.DataLoggerTimeoutInterval = value; return this; }
        public Integer getDeletionLevel() { return DeletionLevel; }
        public Database setDeletionLevel(Integer value) { this.DeletionLevel = value; return this; }
        public String getDescription() { return Description; }
        public Database setDescription(String value) { this.Description = value; return this; }
        public String getLocalPersistentQueuePath() { return LocalPersistentQueuePath; }
        public Database setLocalPersistentQueuePath(String value) { this.LocalPersistentQueuePath = value; return this; }
        public Integer getLockRetryCount() { return LockRetryCount; }
        public Database setLockRetryCount(Integer value) { this.LockRetryCount = value; return this; }
        public Integer getLockTimeoutInterval() { return LockTimeoutInterval; }
        public Database setLockTimeoutInterval(Integer value) { this.LockTimeoutInterval = value; return this; }
        public Integer getMaxDatabaseFileSize() { return MaxDatabaseFileSize; }
        public Database setMaxDatabaseFileSize(Integer value) { this.MaxDatabaseFileSize = value; return this; }
        public Boolean isRecordDataLoggerDown() { return RecordDataLoggerDown; }
        public Database setRecordDataLoggerDown(Boolean value) { this.RecordDataLoggerDown = value; return this; }
        public ReplicationMode_e getReplicationMode() { return ReplicationMode; }
        public Database setReplicationMode(ReplicationMode_e value) { this.ReplicationMode = value; return this; }
        public Integer getSecurityLevel() { return SecurityLevel; }
        public Database setSecurityLevel(Integer value) { this.SecurityLevel = value; return this; }
    }

    public static class Group
    {
        /**
        * The name property defines the name of the group or sub-group
        */
        @ApiMember(Description="The name property defines the name of the group or sub-group", ParameterType="body", DataType="string")
        public String Name = null;

        /**
        * Description of the group
        */
        @ApiMember(Description="Description of the group", ParameterType="body", DataType="string")
        public String Description = null;

        /**
        * List of items associated with the group
        */
        @ApiMember(Description="List of items associated with the group", ParameterType="body", DataType="string[]")
        public ArrayList<String> Items = null;

        /**
        * List of sub-groups associated with the group
        */
        @ApiMember(Description="List of sub-groups associated with the group", ParameterType="body", DataType="string[]")
        public ArrayList<String> SubGroups = null;
        
        public String getName() { return Name; }
        public Group setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public Group setDescription(String value) { this.Description = value; return this; }
        public ArrayList<String> getItems() { return Items; }
        public Group setItems(ArrayList<String> value) { this.Items = value; return this; }
        public ArrayList<String> getSubGroups() { return SubGroups; }
        public Group setSubGroups(ArrayList<String> value) { this.SubGroups = value; return this; }
    }

    public static class Item
    {
        /**
        * The name of the item
        */
        @ApiMember(Description="The name of the item", ParameterType="body", DataType="string")
        public String Name = null;

        /**
        * Defines the type of data associated with the item
        */
        @ApiMember(Description="Defines the type of data associated with the item", ParameterType="body", DataType="ItemType_e")
        public ItemType_e Type = null;

        /**
        * Item description
        */
        @ApiMember(Description="Item description", ParameterType="body", DataType="string")
        public String Description = null;

        /**
        * Specifies additional addressing information for accessing data in some OPC data sources. This value is passed to the OPC Server when the item's node is being connected
        */
        @ApiMember(Description="Specifies additional addressing information for accessing data in some OPC data sources. This value is passed to the OPC Server when the item's node is being connected", ParameterType="body", DataType="string")
        public String AccessPath = null;

        /**
        * Returns the aggregate for the item. Note that this property only is only implemented for child items of OPC-HDA type nodes
        */
        @ApiMember(Description="Returns the aggregate for the item. Note that this property only is only implemented for child items of OPC-HDA type nodes", ParameterType="body", DataType="integer")
        public Integer Aggregate = null;

        /**
        * Specifies an additional name by which the item may be referenced during the query process
        */
        @ApiMember(Description="Specifies an additional name by which the item may be referenced during the query process", ParameterType="body", DataType="string")
        public String Alias = null;

        /**
        * The Catchup property is an internal item level property which indicates the state of the item with respect to the node in terms of HDA data acquisition
        */
        @ApiMember(Description="The Catchup property is an internal item level property which indicates the state of the item with respect to the node in terms of HDA data acquisition", ParameterType="body", DataType="boolean")
        public Boolean Catchup = null;

        /**
        * Determines whether Data Logger fires event to subscribed clients for this item
        */
        @ApiMember(Description="Determines whether Data Logger fires event to subscribed clients for this item", ParameterType="body", DataType="boolean")
        public Boolean DataLoggerEventTrigger = null;

        /**
        * The EngineeringUnitHigh property of an item represents the highest value of the deadband range for the item
        */
        @ApiMember(Description="The EngineeringUnitHigh property of an item represents the highest value of the deadband range for the item", ParameterType="body", DataType="float")
        public Float EngineeringUnitHigh = null;

        /**
        * The EngineeringUnitLow property of an item represents the lowest value of the deadband range for the item
        */
        @ApiMember(Description="The EngineeringUnitLow property of an item represents the lowest value of the deadband range for the item", ParameterType="body", DataType="float")
        public Float EngineeringUnitLow = null;

        /**
        * The EngineeringUnits property specifies the engineering units (in textual format) applicable to the item
        */
        @ApiMember(Description="The EngineeringUnits property specifies the engineering units (in textual format) applicable to the item", ParameterType="body", DataType="string")
        public String EngineeringUnits = null;

        /**
        * Lag property for Item. This is only relevant for items in an OPC-HDA node
        */
        @ApiMember(Description="Lag property for Item. This is only relevant for items in an OPC-HDA node", ParameterType="body", DataType="integer")
        public Integer Lag = null;

        /**
        * Specifies whether the item's data is written to the database when the item's node is connected in the Data Logger
        */
        @ApiMember(Description="Specifies whether the item's data is written to the database when the item's node is connected in the Data Logger", ParameterType="body", DataType="boolean")
        public Boolean Logged = null;

        /**
        * Indicates whether the parent's nodes HDA settings are to be overridden for the item. This is only relevant for items in an OPC-HDA node
        */
        @ApiMember(Description="Indicates whether the parent's nodes HDA settings are to be overridden for the item. This is only relevant for items in an OPC-HDA node", ParameterType="body", DataType="boolean")
        public Boolean OverrideNodeHDASettings = null;

        /**
        * The polling period for the item. This is only relevant for items in an OPC-HDA node
        */
        @ApiMember(Description="The polling period for the item. This is only relevant for items in an OPC-HDA node", ParameterType="body", DataType="integer")
        public Integer PollingPeriod = null;

        /**
        * Indicates whether data is replicated for the item
        */
        @ApiMember(Description="Indicates whether data is replicated for the item", ParameterType="body", DataType="boolean")
        public Boolean Replicate = null;

        /**
        * The resample interval. This is only relevant for items in an OPC-HDA node
        */
        @ApiMember(Description="The resample interval. This is only relevant for items in an OPC-HDA node", ParameterType="body", DataType="integer")
        public Integer ResampleInterval = null;

        /**
        * The StorageDeadbandPercentage property of an item is used to control the deadband calculation
        */
        @ApiMember(Description="The StorageDeadbandPercentage property of an item is used to control the deadband calculation", ParameterType="body", DataType="float")
        public Float StorageDeadbandPercentage = null;

        /**
        * Specifies the list of groups for which this item is linked to
        */
        @ApiMember(Description="Specifies the list of groups for which this item is linked to", ParameterType="body", DataType="string[]")
        public ArrayList<String> Groups = null;
        
        public String getName() { return Name; }
        public Item setName(String value) { this.Name = value; return this; }
        public ItemType_e getType() { return Type; }
        public Item setType(ItemType_e value) { this.Type = value; return this; }
        public String getDescription() { return Description; }
        public Item setDescription(String value) { this.Description = value; return this; }
        public String getAccessPath() { return AccessPath; }
        public Item setAccessPath(String value) { this.AccessPath = value; return this; }
        public Integer getAggregate() { return Aggregate; }
        public Item setAggregate(Integer value) { this.Aggregate = value; return this; }
        public String getAlias() { return Alias; }
        public Item setAlias(String value) { this.Alias = value; return this; }
        public Boolean isCatchup() { return Catchup; }
        public Item setCatchup(Boolean value) { this.Catchup = value; return this; }
        public Boolean isDataLoggerEventTrigger() { return DataLoggerEventTrigger; }
        public Item setDataLoggerEventTrigger(Boolean value) { this.DataLoggerEventTrigger = value; return this; }
        public Float getEngineeringUnitHigh() { return EngineeringUnitHigh; }
        public Item setEngineeringUnitHigh(Float value) { this.EngineeringUnitHigh = value; return this; }
        public Float getEngineeringUnitLow() { return EngineeringUnitLow; }
        public Item setEngineeringUnitLow(Float value) { this.EngineeringUnitLow = value; return this; }
        public String getEngineeringUnits() { return EngineeringUnits; }
        public Item setEngineeringUnits(String value) { this.EngineeringUnits = value; return this; }
        public Integer getLag() { return Lag; }
        public Item setLag(Integer value) { this.Lag = value; return this; }
        public Boolean isLogged() { return Logged; }
        public Item setLogged(Boolean value) { this.Logged = value; return this; }
        public Boolean isOverrideNodeHDASettings() { return OverrideNodeHDASettings; }
        public Item setOverrideNodeHDASettings(Boolean value) { this.OverrideNodeHDASettings = value; return this; }
        public Integer getPollingPeriod() { return PollingPeriod; }
        public Item setPollingPeriod(Integer value) { this.PollingPeriod = value; return this; }
        public Boolean isReplicate() { return Replicate; }
        public Item setReplicate(Boolean value) { this.Replicate = value; return this; }
        public Integer getResampleInterval() { return ResampleInterval; }
        public Item setResampleInterval(Integer value) { this.ResampleInterval = value; return this; }
        public Float getStorageDeadbandPercentage() { return StorageDeadbandPercentage; }
        public Item setStorageDeadbandPercentage(Float value) { this.StorageDeadbandPercentage = value; return this; }
        public ArrayList<String> getGroups() { return Groups; }
        public Item setGroups(ArrayList<String> value) { this.Groups = value; return this; }
    }

    public static class AlarmNode extends Node
    {
        /**
        * Filter Mask.
        */
        @ApiMember(Description="Filter Mask.", ParameterType="query", DataType="int", IsRequired=true)
        public Integer FilterMask = null;

        /**
        * Filter Severity high.
        */
        @ApiMember(Description="Filter Severity high.", ParameterType="query", DataType="int", IsRequired=true)
        public Integer FilterSeverityHigh = null;

        /**
        * Filter Severity low.
        */
        @ApiMember(Description="Filter Severity low.", ParameterType="query", DataType="int", IsRequired=true)
        public Integer FilterSeverityLow = null;

        /**
        * Max size.
        */
        @ApiMember(Description="Max size.", ParameterType="query", DataType="int", IsRequired=true)
        public Integer MaxSize = null;

        /**
        * Filter type.
        */
        @ApiMember(Description="Filter type.", ParameterType="query", DataType="int", IsRequired=true)
        public Integer FilterType = null;
        
        public Integer getFilterMask() { return FilterMask; }
        public AlarmNode setFilterMask(Integer value) { this.FilterMask = value; return this; }
        public Integer getFilterSeverityHigh() { return FilterSeverityHigh; }
        public AlarmNode setFilterSeverityHigh(Integer value) { this.FilterSeverityHigh = value; return this; }
        public Integer getFilterSeverityLow() { return FilterSeverityLow; }
        public AlarmNode setFilterSeverityLow(Integer value) { this.FilterSeverityLow = value; return this; }
        public Integer getMaxSize() { return MaxSize; }
        public AlarmNode setMaxSize(Integer value) { this.MaxSize = value; return this; }
        public Integer getFilterType() { return FilterType; }
        public AlarmNode setFilterType(Integer value) { this.FilterType = value; return this; }
    }

    public static class Node
    {
        /**
        * The Name property is a read-only property that contains the name of the node within the current database. The database may only contain one node with any given name; duplicate names are not permitted.
        */
        @ApiMember(Description="The Name property is a read-only property that contains the name of the node within the current database. The database may only contain one node with any given name; duplicate names are not permitted.", ParameterType="query", DataType="string", IsRequired=true)
        public String Name = null;

        /**
        * The Type property of the node defines the type of data source the node will connect.
        */
        @ApiMember(Description="The Type property of the node defines the type of data source the node will connect.", ParameterType="body", DataType="NodeType_e", IsRequired=true, Name="Type")
        public NodeType_e Type = null;

        /**
        * Description of the node
        */
        @ApiMember(Description="Description of the node", ParameterType="body", DataType="string")
        public String Description = null;

        /**
        * Returns the aggregate, only applied to OPC HDA nodes.
        */
        @ApiMember(Description="Returns the aggregate, only applied to OPC HDA nodes.", ParameterType="body", DataType="integer")
        public Integer Aggregate = null;

        /**
        * This property determines whether the node will be automatically connected in the Data Logger if the ConnectAll command line parameter was specified when starting the Data Logger.
        */
        @ApiMember(Description="This property determines whether the node will be automatically connected in the Data Logger if the ConnectAll command line parameter was specified when starting the Data Logger.", ParameterType="body", DataType="boolean")
        public Boolean AutoConnect = null;

        /**
        * The DataLoggerLastUpdate property is a read only property that returns the time data was last inserted into the database for this node. The value returned is of type Variant; this may be cast to Date/Time for indication of the actual time of the last event
        */
        @ApiMember(Description="The DataLoggerLastUpdate property is a read only property that returns the time data was last inserted into the database for this node. The value returned is of type Variant; this may be cast to Date/Time for indication of the actual time of the last event", ParameterType="body", DataType="Variant", Name="DataLoggerLastUpdate")
        public Variant DataLoggerLastUpdate = null;

        /**
        * Indicates whether the Data Logger will always start with the first connection in the list or the last used one for this node.
        */
        @ApiMember(Description="Indicates whether the Data Logger will always start with the first connection in the list or the last used one for this node.", ParameterType="body", DataType="boolean")
        public Boolean DedicatedPrimary = null;

        /**
        * This property is used by the Data Logger to determine the value written back to the OPC Server, or ultimately to the PLC, for the heartbeat item.
        */
        @ApiMember(Description="This property is used by the Data Logger to determine the value written back to the OPC Server, or ultimately to the PLC, for the heartbeat item.", ParameterType="body", DataType="integer")
        public Integer HeartbeatAlgorithm = null;

        /**
        * This property determines the time that has elapsed between the end of the polling period and the current time. This only applies to OPC HDA nodes.
        */
        @ApiMember(Description="This property determines the time that has elapsed between the end of the polling period and the current time. This only applies to OPC HDA nodes.", ParameterType="body", DataType="integer")
        public Integer Lag = null;

        /**
        * The Machine property is the name of the computer on which the node is located. If the OPC/DDE server is located on the local machine then this property may be blank. This property is not relevant for manual data entry nodes.
        */
        @ApiMember(Description="The Machine property is the name of the computer on which the node is located. If the OPC/DDE server is located on the local machine then this property may be blank. This property is not relevant for manual data entry nodes.", ParameterType="body", DataType="string")
        public String Machine = null;

        /**
        * The MaxEventTimeResolution property is a Boolean property that allows the developer to specify the resolution of the timestamp applied to the events within the node databases.
        */
        @ApiMember(Description="The MaxEventTimeResolution property is a Boolean property that allows the developer to specify the resolution of the timestamp applied to the events within the node databases.", ParameterType="body", DataType="boolean")
        public Boolean MaxEventTimeResolution = null;

        /**
        * This property will be used to decide what level of redundancy is being used. It can be 'cold', 'warm' or 'hot' and will default to 'cold'
        */
        @ApiMember(Description="This property will be used to decide what level of redundancy is being used. It can be 'cold', 'warm' or 'hot' and will default to 'cold'", ParameterType="body", DataType="OperationalMode_e", Name="OperationalMode")
        public OperationalMode_e OperationalMode = null;

        /**
        * The PercentDeadband property is used with OPC type nodes to specify the minimum change in event value for which the OPC server will notify the Data Logger.
        */
        @ApiMember(Description="The PercentDeadband property is used with OPC type nodes to specify the minimum change in event value for which the OPC server will notify the Data Logger.", ParameterType="body", DataType="float")
        public Float PercentDeadband = null;

        /**
        * This property determines the length of the period for which the Data Logger will query the HDA Server for data.
        */
        @ApiMember(Description="This property determines the length of the period for which the Data Logger will query the HDA Server for data.", ParameterType="body", DataType="integer")
        public Integer PollingPeriod = null;

        /**
        * This property determines whether data inserted to items on the node is replicated in a high availability environment, i.e. whether item data is written to the subscriber database.
        */
        @ApiMember(Description="This property determines whether data inserted to items on the node is replicated in a high availability environment, i.e. whether item data is written to the subscriber database.", ParameterType="body", DataType="boolean")
        public Boolean Replicate = null;

        /**
        * This property determines whether the rollover settings defined for the node will be replicated in a high availability environment, i.e. whether the rollover settings on a published node will be replicated to that node on the subscriber database(s).
        */
        @ApiMember(Description="This property determines whether the rollover settings defined for the node will be replicated in a high availability environment, i.e. whether the rollover settings on a published node will be replicated to that node on the subscriber database(s).", ParameterType="body", DataType="boolean")
        public Boolean ReplicateRollover = null;

        /**
        * This property defines the length of sub-periods of the polling period for which each query should be performed. This applies to OPC HDA nodes.
        */
        @ApiMember(Description="This property defines the length of sub-periods of the polling period for which each query should be performed. This applies to OPC HDA nodes.", ParameterType="body", DataType="integer")
        public Integer ResampleInterval = null;

        /**
        * The RevisedUpdateRate property is a read-only property that contains the update rate as advised by the OPC Server.
        */
        @ApiMember(Description="The RevisedUpdateRate property is a read-only property that contains the update rate as advised by the OPC Server.", ParameterType="body", DataType="integer")
        public Integer RevisedUpdateRate = null;

        /**
        * The Server property gets and sets the server of the current connection.
        */
        @ApiMember(Description="The Server property gets and sets the server of the current connection.", ParameterType="body", DataType="string")
        public String Server = null;

        /**
        * The ServerTimeout property is used to define the maximum amount of time the connection can be maintained without receiving any data. This property is set in milliseconds.
        */
        @ApiMember(Description="The ServerTimeout property is used to define the maximum amount of time the connection can be maintained without receiving any data. This property is set in milliseconds.", ParameterType="body", DataType="integer")
        public Integer ServerTimeout = null;

        /**
        * The ServerTimeoutRetryAttempts property is used to specify the number of consecutive re-connection attempts before declaring the node as permanently disconnected.
        */
        @ApiMember(Description="The ServerTimeoutRetryAttempts property is used to specify the number of consecutive re-connection attempts before declaring the node as permanently disconnected.", ParameterType="body", DataType="integer")
        public Integer ServerTimeoutRetryAttempts = null;

        /**
        * The ServerTimeoutRetryPeriod property is used to provide a delay between the detection of a timed-out link and an attempt to re-connect the link. The value of this parameter is the number of second to wait before attempting to re-connect a connection whoâ€™s ServerTimeout parameter has been exceeded.
        */
        @ApiMember(Description="The ServerTimeoutRetryPeriod property is used to provide a delay between the detection of a timed-out link and an attempt to re-connect the link. The value of this parameter is the number of second to wait before attempting to re-connect a connection whoâ€™s ServerTimeout parameter has been exceeded.", ParameterType="body", DataType="integer")
        public Integer ServerTimeoutRetryPeriod = null;

        /**
        * In some cases, node data may have been collected by a device operating in a time zone other than that of the client: this OPC property contains the the difference (in minutes) between the UTC timestamps for node data and the local time in which the data was obtained.
        */
        @ApiMember(Description="In some cases, node data may have been collected by a device operating in a time zone other than that of the client: this OPC property contains the the difference (in minutes) between the UTC timestamps for node data and the local time in which the data was obtained.", ParameterType="body", DataType="integer")
        public Integer TimeBias = null;

        /**
        * Indicates whether a trace file is used.
        */
        @ApiMember(Description="Indicates whether a trace file is used.", ParameterType="body", DataType="integer")
        public Integer Trace = null;

        /**
        * The UpdateRate property allows the developer to request a minimum time interval between the transmission of events being sent from an OPC Server.
        */
        @ApiMember(Description="The UpdateRate property allows the developer to request a minimum time interval between the transmission of events being sent from an OPC Server.", ParameterType="body", DataType="integer")
        public Integer UpdateRate = null;

        /**
        * Indicates whether the proxy server is to be used for the node.
        */
        @ApiMember(Description="Indicates whether the proxy server is to be used for the node.", ParameterType="body", DataType="boolean")
        public Boolean UseProxyServer = null;

        /**
        * Data Adaptor class name.
        */
        @ApiMember(Description="Data Adaptor class name.", ParameterType="body", DataType="string")
        public String AdaptorClass = null;

        /**
        * File name of Node's Data Adaptor DLL.
        */
        @ApiMember(Description="File name of Node's Data Adaptor DLL.", ParameterType="body", DataType="string")
        public String AdaptorFile = null;
        
        public String getName() { return Name; }
        public Node setName(String value) { this.Name = value; return this; }
        public NodeType_e getType() { return Type; }
        public Node setType(NodeType_e value) { this.Type = value; return this; }
        public String getDescription() { return Description; }
        public Node setDescription(String value) { this.Description = value; return this; }
        public Integer getAggregate() { return Aggregate; }
        public Node setAggregate(Integer value) { this.Aggregate = value; return this; }
        public Boolean isAutoConnect() { return AutoConnect; }
        public Node setAutoConnect(Boolean value) { this.AutoConnect = value; return this; }
        public Variant getDataLoggerLastUpdate() { return DataLoggerLastUpdate; }
        public Node setDataLoggerLastUpdate(Variant value) { this.DataLoggerLastUpdate = value; return this; }
        public Boolean isDedicatedPrimary() { return DedicatedPrimary; }
        public Node setDedicatedPrimary(Boolean value) { this.DedicatedPrimary = value; return this; }
        public Integer getHeartbeatAlgorithm() { return HeartbeatAlgorithm; }
        public Node setHeartbeatAlgorithm(Integer value) { this.HeartbeatAlgorithm = value; return this; }
        public Integer getLag() { return Lag; }
        public Node setLag(Integer value) { this.Lag = value; return this; }
        public String getMachine() { return Machine; }
        public Node setMachine(String value) { this.Machine = value; return this; }
        public Boolean isMaxEventTimeResolution() { return MaxEventTimeResolution; }
        public Node setMaxEventTimeResolution(Boolean value) { this.MaxEventTimeResolution = value; return this; }
        public OperationalMode_e getOperationalMode() { return OperationalMode; }
        public Node setOperationalMode(OperationalMode_e value) { this.OperationalMode = value; return this; }
        public Float getPercentDeadband() { return PercentDeadband; }
        public Node setPercentDeadband(Float value) { this.PercentDeadband = value; return this; }
        public Integer getPollingPeriod() { return PollingPeriod; }
        public Node setPollingPeriod(Integer value) { this.PollingPeriod = value; return this; }
        public Boolean isReplicate() { return Replicate; }
        public Node setReplicate(Boolean value) { this.Replicate = value; return this; }
        public Boolean isReplicateRollover() { return ReplicateRollover; }
        public Node setReplicateRollover(Boolean value) { this.ReplicateRollover = value; return this; }
        public Integer getResampleInterval() { return ResampleInterval; }
        public Node setResampleInterval(Integer value) { this.ResampleInterval = value; return this; }
        public Integer getRevisedUpdateRate() { return RevisedUpdateRate; }
        public Node setRevisedUpdateRate(Integer value) { this.RevisedUpdateRate = value; return this; }
        public String getServer() { return Server; }
        public Node setServer(String value) { this.Server = value; return this; }
        public Integer getServerTimeout() { return ServerTimeout; }
        public Node setServerTimeout(Integer value) { this.ServerTimeout = value; return this; }
        public Integer getServerTimeoutRetryAttempts() { return ServerTimeoutRetryAttempts; }
        public Node setServerTimeoutRetryAttempts(Integer value) { this.ServerTimeoutRetryAttempts = value; return this; }
        public Integer getServerTimeoutRetryPeriod() { return ServerTimeoutRetryPeriod; }
        public Node setServerTimeoutRetryPeriod(Integer value) { this.ServerTimeoutRetryPeriod = value; return this; }
        public Integer getTimeBias() { return TimeBias; }
        public Node setTimeBias(Integer value) { this.TimeBias = value; return this; }
        public Integer getTrace() { return Trace; }
        public Node setTrace(Integer value) { this.Trace = value; return this; }
        public Integer getUpdateRate() { return UpdateRate; }
        public Node setUpdateRate(Integer value) { this.UpdateRate = value; return this; }
        public Boolean isUseProxyServer() { return UseProxyServer; }
        public Node setUseProxyServer(Boolean value) { this.UseProxyServer = value; return this; }
        public String getAdaptorClass() { return AdaptorClass; }
        public Node setAdaptorClass(String value) { this.AdaptorClass = value; return this; }
        public String getAdaptorFile() { return AdaptorFile; }
        public Node setAdaptorFile(String value) { this.AdaptorFile = value; return this; }
    }

    public static class PhaseDefinition
    {
        /**
        * Phase definition name
        */
        @ApiMember(Description="Phase definition name", ParameterType="body", DataType="string", IsRequired=true)
        public String Name = null;

        /**
        * Phase definition description
        */
        @ApiMember(Description="Phase definition description", ParameterType="body", DataType="string")
        public String Description = null;

        /**
        * Start item for Phase definition
        */
        @ApiMember(Description="Start item for Phase definition", ParameterType="body", DataType="string")
        public String StartItem = null;

        /**
        * Stop item for Phase definition
        */
        @ApiMember(Description="Stop item for Phase definition", ParameterType="body", DataType="string")
        public String StopItem = null;

        /**
        * Group for Phase definition
        */
        @ApiMember(Description="Group for Phase definition", ParameterType="body", DataType="string")
        public String GroupName = null;
        
        public String getName() { return Name; }
        public PhaseDefinition setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public PhaseDefinition setDescription(String value) { this.Description = value; return this; }
        public String getStartItem() { return StartItem; }
        public PhaseDefinition setStartItem(String value) { this.StartItem = value; return this; }
        public String getStopItem() { return StopItem; }
        public PhaseDefinition setStopItem(String value) { this.StopItem = value; return this; }
        public String getGroupName() { return GroupName; }
        public PhaseDefinition setGroupName(String value) { this.GroupName = value; return this; }
    }

    public static class ProcessDataResult
    {
        public Integer RecordsProcessed = null;
        public Integer SesionId = null;
        
        public Integer getRecordsProcessed() { return RecordsProcessed; }
        public ProcessDataResult setRecordsProcessed(Integer value) { this.RecordsProcessed = value; return this; }
        public Integer getSesionId() { return SesionId; }
        public ProcessDataResult setSesionId(Integer value) { this.SesionId = value; return this; }
    }

    public static class AlarmDataResponse
    {
        /**
        * Database name containing the alarm data
        */
        @ApiMember(Description="Database name containing the alarm data", ParameterType="body", DataType="AlarmDataPoint[]")
        public ArrayList<AlarmDataPoint> AlarmData = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="AlarmDataRequest")
        public AlarmDataRequest NextDataBlock = null;
        
        public ArrayList<AlarmDataPoint> getAlarmData() { return AlarmData; }
        public AlarmDataResponse setAlarmData(ArrayList<AlarmDataPoint> value) { this.AlarmData = value; return this; }
        public AlarmDataRequest getNextDataBlock() { return NextDataBlock; }
        public AlarmDataResponse setNextDataBlock(AlarmDataRequest value) { this.NextDataBlock = value; return this; }
    }

    public static class ProcessDataResponse
    {
        /**
        * Database name containing the process data
        */
        @ApiMember(Description="Database name containing the process data", ParameterType="body", DataType="ProcessDataPoint[]")
        public ArrayList<ProcessDataPoint> ProcessData = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="ProcessDataRequest")
        public ProcessDataRequest NextDataBlock = null;
        
        public ArrayList<ProcessDataPoint> getProcessData() { return ProcessData; }
        public ProcessDataResponse setProcessData(ArrayList<ProcessDataPoint> value) { this.ProcessData = value; return this; }
        public ProcessDataRequest getNextDataBlock() { return NextDataBlock; }
        public ProcessDataResponse setNextDataBlock(ProcessDataRequest value) { this.NextDataBlock = value; return this; }
    }

    public static class Route2
    {
        /**
        * Route name
        */
        @ApiMember(Description="Route name", ParameterType="body", DataType="string", IsRequired=true)
        public String Name = null;

        /**
        * Route description
        */
        @ApiMember(Description="Route description", ParameterType="body", DataType="string")
        public String Description = null;

        /**
        * Batch timeout for route
        */
        @ApiMember(Description="Batch timeout for route", ParameterType="body", DataType="string")
        public Integer BatchTimeOut = null;

        /**
        * Store batch events as process data events
        */
        @ApiMember(Description="Store batch events as process data events", ParameterType="body", DataType="string")
        public Boolean StoreAsEventData = null;

        /**
        * Phase definitions for route
        */
        @ApiMember(Description="Phase definitions for route", ParameterType="body", DataType="string")
        public ArrayList<PhaseDefinition> PhaseDefinitions = null;

        public String getName() { return Name; }
        public Route2 setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public Route2 setDescription(String value) { this.Description = value; return this; }
        public Integer getBatchTimeOut() { return BatchTimeOut; }
        public Route2 setBatchTimeOut(Integer value) { this.BatchTimeOut = value; return this; }
        public Boolean isStoreAsEventData() { return StoreAsEventData; }
        public Route2 setStoreAsEventData(Boolean value) { this.StoreAsEventData = value; return this; }
        public ArrayList<PhaseDefinition> getPhaseDefinitions() { return PhaseDefinitions; }
        public Route2 setPhaseDefinitions(ArrayList<PhaseDefinition> value) { this.PhaseDefinitions = value; return this; }
    }

    public static class DataSourceSettings
    {
        public String DbId = null;
        public String Name = null;
        public String DisplayName = null;
        public String Comment = null;
        public String Alias = null;
        public String Description = null;
        public String EngUnits = null;
        public String Database = null;
        public String Node = null;
        public String Type = null;
        public Boolean IsVirtual = null;
        public ArrayList<ItemAttribute> Attributes = null;
        public ArrayList<ItemMetaInfo> Items = null;
        public DatabaseTypeEnum DatabaseType = null;
        public QuerySettings QuerySettings = null;
        public QueryOptions QueryOptions = null;
        public ArrayList<Object> DataRows = null;
        public HashMap<String,Object> DataBlocks = null;
        public HashMap<String,String> TagReplacements = null;
        public Boolean MoreData = null;
        public Integer Page = null;
        public Integer PageSize = null;
        public Boolean OverrideQueryTimes = null;
        public Date StartTimeOverride = null;
        public Date StopQueryTimeOverride = null;
        public Double StartTime = null;
        public Double StopTime = null;
        
        public String getDbId() { return DbId; }
        public DataSourceSettings setDbId(String value) { this.DbId = value; return this; }
        public String getName() { return Name; }
        public DataSourceSettings setName(String value) { this.Name = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public DataSourceSettings setDisplayName(String value) { this.DisplayName = value; return this; }
        public String getComment() { return Comment; }
        public DataSourceSettings setComment(String value) { this.Comment = value; return this; }
        public String getAlias() { return Alias; }
        public DataSourceSettings setAlias(String value) { this.Alias = value; return this; }
        public String getDescription() { return Description; }
        public DataSourceSettings setDescription(String value) { this.Description = value; return this; }
        public String getEngUnits() { return EngUnits; }
        public DataSourceSettings setEngUnits(String value) { this.EngUnits = value; return this; }
        public String getDatabase() { return Database; }
        public DataSourceSettings setDatabase(String value) { this.Database = value; return this; }
        public String getNode() { return Node; }
        public DataSourceSettings setNode(String value) { this.Node = value; return this; }
        public String getType() { return Type; }
        public DataSourceSettings setType(String value) { this.Type = value; return this; }
        public Boolean getIsVirtual() { return IsVirtual; }
        public DataSourceSettings setIsVirtual(Boolean value) { this.IsVirtual = value; return this; }
        public ArrayList<ItemAttribute> getAttributes() { return Attributes; }
        public DataSourceSettings setAttributes(ArrayList<ItemAttribute> value) { this.Attributes = value; return this; }
        public ArrayList<ItemMetaInfo> getItems() { return Items; }
        public DataSourceSettings setItems(ArrayList<ItemMetaInfo> value) { this.Items = value; return this; }
        public DatabaseTypeEnum getDatabaseType() { return DatabaseType; }
        public DataSourceSettings setDatabaseType(DatabaseTypeEnum value) { this.DatabaseType = value; return this; }
        public QuerySettings getQuerySettings() { return QuerySettings; }
        public DataSourceSettings setQuerySettings(QuerySettings value) { this.QuerySettings = value; return this; }
        public QueryOptions getQueryOptions() { return QueryOptions; }
        public DataSourceSettings setQueryOptions(QueryOptions value) { this.QueryOptions = value; return this; }
        public ArrayList<Object> getDataRows() { return DataRows; }
        public DataSourceSettings setDataRows(ArrayList<Object> value) { this.DataRows = value; return this; }
        public HashMap<String,Object> getDataBlocks() { return DataBlocks; }
        public DataSourceSettings setDataBlocks(HashMap<String,Object> value) { this.DataBlocks = value; return this; }
        public HashMap<String,String> getTagReplacements() { return TagReplacements; }
        public DataSourceSettings setTagReplacements(HashMap<String,String> value) { this.TagReplacements = value; return this; }
        public Boolean isMoreData() { return MoreData; }
        public DataSourceSettings setMoreData(Boolean value) { this.MoreData = value; return this; }
        public Integer getPage() { return Page; }
        public DataSourceSettings setPage(Integer value) { this.Page = value; return this; }
        public Integer getPageSize() { return PageSize; }
        public DataSourceSettings setPageSize(Integer value) { this.PageSize = value; return this; }
        public Boolean isOverrideQueryTimes() { return OverrideQueryTimes; }
        public DataSourceSettings setOverrideQueryTimes(Boolean value) { this.OverrideQueryTimes = value; return this; }
        public Date getStartTimeOverride() { return StartTimeOverride; }
        public DataSourceSettings setStartTimeOverride(Date value) { this.StartTimeOverride = value; return this; }
        public Date getStopQueryTimeOverride() { return StopQueryTimeOverride; }
        public DataSourceSettings setStopQueryTimeOverride(Date value) { this.StopQueryTimeOverride = value; return this; }
        public Double getStartTime() { return StartTime; }
        public DataSourceSettings setStartTime(Double value) { this.StartTime = value; return this; }
        public Double getStopTime() { return StopTime; }
        public DataSourceSettings setStopTime(Double value) { this.StopTime = value; return this; }
    }

    public static class IndexUpdateStats
    {
        public Integer ItemsUpdated = null;
        public Boolean IndexUpdating = null;
        public Date LastUpdateTime = null;
        public ArrayList<String> Errors = null;
        
        public Integer getItemsUpdated() { return ItemsUpdated; }
        public IndexUpdateStats setItemsUpdated(Integer value) { this.ItemsUpdated = value; return this; }
        public Boolean isIndexUpdating() { return IndexUpdating; }
        public IndexUpdateStats setIndexUpdating(Boolean value) { this.IndexUpdating = value; return this; }
        public Date getLastUpdateTime() { return LastUpdateTime; }
        public IndexUpdateStats setLastUpdateTime(Date value) { this.LastUpdateTime = value; return this; }
        public ArrayList<String> getErrors() { return Errors; }
        public IndexUpdateStats setErrors(ArrayList<String> value) { this.Errors = value; return this; }
    }

    public static class ConfiguredServerMongoDb
    {
        public String Id = null;
        public String NamedId = null;
        public String ConnectionUrl = null;
        public String MachineName = null;
        public String Username = null;
        public String ApiKey = null;
        
        public String getId() { return Id; }
        public ConfiguredServerMongoDb setId(String value) { this.Id = value; return this; }
        public String getNamedId() { return NamedId; }
        public ConfiguredServerMongoDb setNamedId(String value) { this.NamedId = value; return this; }
        public String getConnectionUrl() { return ConnectionUrl; }
        public ConfiguredServerMongoDb setConnectionUrl(String value) { this.ConnectionUrl = value; return this; }
        public String getMachineName() { return MachineName; }
        public ConfiguredServerMongoDb setMachineName(String value) { this.MachineName = value; return this; }
        public String getUsername() { return Username; }
        public ConfiguredServerMongoDb setUsername(String value) { this.Username = value; return this; }
        public String getApiKey() { return ApiKey; }
        public ConfiguredServerMongoDb setApiKey(String value) { this.ApiKey = value; return this; }
    }

    public static class UserInfo
    {
        public UserTypes UserType = null;
        public String Username = null;
        public String Email = null;
        public String FirstName = null;
        public String LastName = null;
        public String Role = null;
        public Boolean LoadCustomTemplate = null;
        public String CustomTemplatePath = null;
        public String DefaultServer = null;
        public Date PasswordExpiry = null;
        
        public UserTypes getUserType() { return UserType; }
        public UserInfo setUserType(UserTypes value) { this.UserType = value; return this; }
        public String getUsername() { return Username; }
        public UserInfo setUsername(String value) { this.Username = value; return this; }
        public String getEmail() { return Email; }
        public UserInfo setEmail(String value) { this.Email = value; return this; }
        public String getFirstName() { return FirstName; }
        public UserInfo setFirstName(String value) { this.FirstName = value; return this; }
        public String getLastName() { return LastName; }
        public UserInfo setLastName(String value) { this.LastName = value; return this; }
        public String getRole() { return Role; }
        public UserInfo setRole(String value) { this.Role = value; return this; }
        public Boolean isLoadCustomTemplate() { return LoadCustomTemplate; }
        public UserInfo setLoadCustomTemplate(Boolean value) { this.LoadCustomTemplate = value; return this; }
        public String getCustomTemplatePath() { return CustomTemplatePath; }
        public UserInfo setCustomTemplatePath(String value) { this.CustomTemplatePath = value; return this; }
        public String getDefaultServer() { return DefaultServer; }
        public UserInfo setDefaultServer(String value) { this.DefaultServer = value; return this; }
        public Date getPasswordExpiry() { return PasswordExpiry; }
        public UserInfo setPasswordExpiry(Date value) { this.PasswordExpiry = value; return this; }
    }

    @DataContract
    public static class RegisterResponse
    {
        @DataMember(Order=1)
        public String UserId = null;

        @DataMember(Order=2)
        public String SessionId = null;

        @DataMember(Order=3)
        public String UserName = null;

        @DataMember(Order=4)
        public String ReferrerUrl = null;

        @DataMember(Order=5)
        public ResponseStatus ResponseStatus = null;

        @DataMember(Order=6)
        public HashMap<String,String> Meta = null;
        
        public String getUserId() { return UserId; }
        public RegisterResponse setUserId(String value) { this.UserId = value; return this; }
        public String getSessionId() { return SessionId; }
        public RegisterResponse setSessionId(String value) { this.SessionId = value; return this; }
        public String getUserName() { return UserName; }
        public RegisterResponse setUserName(String value) { this.UserName = value; return this; }
        public String getReferrerUrl() { return ReferrerUrl; }
        public RegisterResponse setReferrerUrl(String value) { this.ReferrerUrl = value; return this; }
        public ResponseStatus getResponseStatus() { return ResponseStatus; }
        public RegisterResponse setResponseStatus(ResponseStatus value) { this.ResponseStatus = value; return this; }
        public HashMap<String,String> getMeta() { return Meta; }
        public RegisterResponse setMeta(HashMap<String,String> value) { this.Meta = value; return this; }
    }

    public static class RoleSettings
    {
        public String DbId = null;
        public String Name = null;
        public LinkSettings DefaultTemplate = null;
        public String AdGroupMapping = null;
        public Boolean EnableAdGroupMapping = null;
        public Boolean UndeletableRole = null;
        
        public String getDbId() { return DbId; }
        public RoleSettings setDbId(String value) { this.DbId = value; return this; }
        public String getName() { return Name; }
        public RoleSettings setName(String value) { this.Name = value; return this; }
        public LinkSettings getDefaultTemplate() { return DefaultTemplate; }
        public RoleSettings setDefaultTemplate(LinkSettings value) { this.DefaultTemplate = value; return this; }
        public String getAdGroupMapping() { return AdGroupMapping; }
        public RoleSettings setAdGroupMapping(String value) { this.AdGroupMapping = value; return this; }
        public Boolean isEnableAdGroupMapping() { return EnableAdGroupMapping; }
        public RoleSettings setEnableAdGroupMapping(Boolean value) { this.EnableAdGroupMapping = value; return this; }
        public Boolean isUndeletableRole() { return UndeletableRole; }
        public RoleSettings setUndeletableRole(Boolean value) { this.UndeletableRole = value; return this; }
    }

    public static class GlobalSecuritySettings
    {
        public String Id = null;
        public PasswordRequirements PasswordRequirements = null;
        public ArrayList<RoleSettings> RoleSettings = null;
        public Boolean EnableAd = null;
        public AdDomainSettings AdDomainSettings = null;
        
        public String getId() { return Id; }
        public GlobalSecuritySettings setId(String value) { this.Id = value; return this; }
        public PasswordRequirements getPasswordRequirements() { return PasswordRequirements; }
        public GlobalSecuritySettings setPasswordRequirements(PasswordRequirements value) { this.PasswordRequirements = value; return this; }
        public ArrayList<RoleSettings> getRoleSettings() { return RoleSettings; }
        public GlobalSecuritySettings setRoleSettings(ArrayList<RoleSettings> value) { this.RoleSettings = value; return this; }
        public Boolean isEnableAd() { return EnableAd; }
        public GlobalSecuritySettings setEnableAd(Boolean value) { this.EnableAd = value; return this; }
        public AdDomainSettings getAdDomainSettings() { return AdDomainSettings; }
        public GlobalSecuritySettings setAdDomainSettings(AdDomainSettings value) { this.AdDomainSettings = value; return this; }
    }

    @DataContract
    public static class AuthenticateResponse
    {
        @DataMember(Order=1)
        public String UserId = null;

        @DataMember(Order=2)
        public String SessionId = null;

        @DataMember(Order=3)
        public String UserName = null;

        @DataMember(Order=4)
        public String DisplayName = null;

        @DataMember(Order=5)
        public String ReferrerUrl = null;

        @DataMember(Order=6)
        public String BearerToken = null;

        @DataMember(Order=7)
        public ResponseStatus ResponseStatus = null;

        @DataMember(Order=8)
        public HashMap<String,String> Meta = null;
        
        public String getUserId() { return UserId; }
        public AuthenticateResponse setUserId(String value) { this.UserId = value; return this; }
        public String getSessionId() { return SessionId; }
        public AuthenticateResponse setSessionId(String value) { this.SessionId = value; return this; }
        public String getUserName() { return UserName; }
        public AuthenticateResponse setUserName(String value) { this.UserName = value; return this; }
        public String getDisplayName() { return DisplayName; }
        public AuthenticateResponse setDisplayName(String value) { this.DisplayName = value; return this; }
        public String getReferrerUrl() { return ReferrerUrl; }
        public AuthenticateResponse setReferrerUrl(String value) { this.ReferrerUrl = value; return this; }
        public String getBearerToken() { return BearerToken; }
        public AuthenticateResponse setBearerToken(String value) { this.BearerToken = value; return this; }
        public ResponseStatus getResponseStatus() { return ResponseStatus; }
        public AuthenticateResponse setResponseStatus(ResponseStatus value) { this.ResponseStatus = value; return this; }
        public HashMap<String,String> getMeta() { return Meta; }
        public AuthenticateResponse setMeta(HashMap<String,String> value) { this.Meta = value; return this; }
    }

    @DataContract
    public static class AssignRolesResponse
    {
        @DataMember(Order=1)
        public ArrayList<String> AllRoles = null;

        @DataMember(Order=2)
        public ArrayList<String> AllPermissions = null;

        @DataMember(Order=3)
        public ResponseStatus ResponseStatus = null;
        
        public ArrayList<String> getAllRoles() { return AllRoles; }
        public AssignRolesResponse setAllRoles(ArrayList<String> value) { this.AllRoles = value; return this; }
        public ArrayList<String> getAllPermissions() { return AllPermissions; }
        public AssignRolesResponse setAllPermissions(ArrayList<String> value) { this.AllPermissions = value; return this; }
        public ResponseStatus getResponseStatus() { return ResponseStatus; }
        public AssignRolesResponse setResponseStatus(ResponseStatus value) { this.ResponseStatus = value; return this; }
    }

    @DataContract
    public static class UnAssignRolesResponse
    {
        @DataMember(Order=1)
        public ArrayList<String> AllRoles = null;

        @DataMember(Order=2)
        public ArrayList<String> AllPermissions = null;

        @DataMember(Order=3)
        public ResponseStatus ResponseStatus = null;
        
        public ArrayList<String> getAllRoles() { return AllRoles; }
        public UnAssignRolesResponse setAllRoles(ArrayList<String> value) { this.AllRoles = value; return this; }
        public ArrayList<String> getAllPermissions() { return AllPermissions; }
        public UnAssignRolesResponse setAllPermissions(ArrayList<String> value) { this.AllPermissions = value; return this; }
        public ResponseStatus getResponseStatus() { return ResponseStatus; }
        public UnAssignRolesResponse setResponseStatus(ResponseStatus value) { this.ResponseStatus = value; return this; }
    }

    @DataContract
    public static class GetApiKeysResponse
    {
        @DataMember(Order=1)
        public ArrayList<UserApiKey> Results = null;

        @DataMember(Order=2)
        public ResponseStatus ResponseStatus = null;
        
        public ArrayList<UserApiKey> getResults() { return Results; }
        public GetApiKeysResponse setResults(ArrayList<UserApiKey> value) { this.Results = value; return this; }
        public ResponseStatus getResponseStatus() { return ResponseStatus; }
        public GetApiKeysResponse setResponseStatus(ResponseStatus value) { this.ResponseStatus = value; return this; }
    }

    @DataContract
    public static class ConvertSessionToTokenResponse
    {
        @DataMember(Order=1)
        public HashMap<String,String> Meta = null;

        @DataMember(Order=2)
        public ResponseStatus ResponseStatus = null;
        
        public HashMap<String,String> getMeta() { return Meta; }
        public ConvertSessionToTokenResponse setMeta(HashMap<String,String> value) { this.Meta = value; return this; }
        public ResponseStatus getResponseStatus() { return ResponseStatus; }
        public ConvertSessionToTokenResponse setResponseStatus(ResponseStatus value) { this.ResponseStatus = value; return this; }
    }

    public static class dirContents
    {
        public String filePath = null;
        public ArrayList<fileHistoryInfoType> file = null;
        
        public String getFilePath() { return filePath; }
        public dirContents setFilePath(String value) { this.filePath = value; return this; }
        public ArrayList<fileHistoryInfoType> getFile() { return file; }
        public dirContents setFile(ArrayList<fileHistoryInfoType> value) { this.file = value; return this; }
    }

    public static class FileDetails
    {
        public ArrayList<Short> Data = null;
        public fileHistoryInfoType Attributes = null;
        
        public ArrayList<Short> getData() { return Data; }
        public FileDetails setData(ArrayList<Short> value) { this.Data = value; return this; }
        public fileHistoryInfoType getAttributes() { return Attributes; }
        public FileDetails setAttributes(fileHistoryInfoType value) { this.Attributes = value; return this; }
    }

    public static class FileManagerConfig
    {
        public FileManagerFileSystemEnum FileSystem = null;
        public String RootIdentifier = null;
        public String RepositoryIdentifier = null;
        public Boolean VersioningSupport = null;
        
        public FileManagerFileSystemEnum getFileSystem() { return FileSystem; }
        public FileManagerConfig setFileSystem(FileManagerFileSystemEnum value) { this.FileSystem = value; return this; }
        public String getRootIdentifier() { return RootIdentifier; }
        public FileManagerConfig setRootIdentifier(String value) { this.RootIdentifier = value; return this; }
        public String getRepositoryIdentifier() { return RepositoryIdentifier; }
        public FileManagerConfig setRepositoryIdentifier(String value) { this.RepositoryIdentifier = value; return this; }
        public Boolean isVersioningSupport() { return VersioningSupport; }
        public FileManagerConfig setVersioningSupport(Boolean value) { this.VersioningSupport = value; return this; }
    }

    public static class DataManagerConfig
    {
        public ArrayList<String> ReachableHosts = null;
        public ArrayList<SourceConfiguration> Sources = null;
        public ReflectionConfig ReflectionSources = null;
        
        public ArrayList<String> getReachableHosts() { return ReachableHosts; }
        public DataManagerConfig setReachableHosts(ArrayList<String> value) { this.ReachableHosts = value; return this; }
        public ArrayList<SourceConfiguration> getSources() { return Sources; }
        public DataManagerConfig setSources(ArrayList<SourceConfiguration> value) { this.Sources = value; return this; }
        public ReflectionConfig getReflectionSources() { return ReflectionSources; }
        public DataManagerConfig setReflectionSources(ReflectionConfig value) { this.ReflectionSources = value; return this; }
    }

    public static class BrowsePathResults
    {
        public ArrayList<browseEntryType> Entries = null;
        public dataSourceSeekerType Seeker = null;
        
        public ArrayList<browseEntryType> getEntries() { return Entries; }
        public BrowsePathResults setEntries(ArrayList<browseEntryType> value) { this.Entries = value; return this; }
        public dataSourceSeekerType getSeeker() { return Seeker; }
        public BrowsePathResults setSeeker(dataSourceSeekerType value) { this.Seeker = value; return this; }
    }

    public static class itemCollectionType
    {
        public String path = null;
        public String name = null;
        public String alias = null;
        public Boolean overrideTS = null;
        public freeformTimeType queryTs = null;
        public Boolean overrideTE = null;
        public freeformTimeType queryTe = null;
        public ArrayList<itemType> item = null;
        public ArrayList<attributeType> attributes = null;
        public itemInfoType itemInfo = null;
        public Boolean isVirtual = null;
        
        public String getPath() { return path; }
        public itemCollectionType setPath(String value) { this.path = value; return this; }
        public String getName() { return name; }
        public itemCollectionType setName(String value) { this.name = value; return this; }
        public String getAlias() { return alias; }
        public itemCollectionType setAlias(String value) { this.alias = value; return this; }
        public Boolean isOverrideTS() { return overrideTS; }
        public itemCollectionType setOverrideTS(Boolean value) { this.overrideTS = value; return this; }
        public freeformTimeType getQueryTs() { return queryTs; }
        public itemCollectionType setQueryTs(freeformTimeType value) { this.queryTs = value; return this; }
        public Boolean isOverrideTE() { return overrideTE; }
        public itemCollectionType setOverrideTE(Boolean value) { this.overrideTE = value; return this; }
        public freeformTimeType getQueryTe() { return queryTe; }
        public itemCollectionType setQueryTe(freeformTimeType value) { this.queryTe = value; return this; }
        public ArrayList<itemType> getItem() { return item; }
        public itemCollectionType setItem(ArrayList<itemType> value) { this.item = value; return this; }
        public ArrayList<attributeType> getAttributes() { return attributes; }
        public itemCollectionType setAttributes(ArrayList<attributeType> value) { this.attributes = value; return this; }
        public itemInfoType getItemInfo() { return itemInfo; }
        public itemCollectionType setItemInfo(itemInfoType value) { this.itemInfo = value; return this; }
        public Boolean getIsVirtual() { return isVirtual; }
        public itemCollectionType setIsVirtual(Boolean value) { this.isVirtual = value; return this; }
    }

    public static class FetchDataResults
    {
        public ArrayList<DataManagerItemTypeEnum> MetaData = null;
        public ArrayList<DataManagerAttribute> Attributes = null;
        public DataSeeker Seeker = null;
        public ArrayList<FetchedDataRow> Data = null;
        
        public ArrayList<DataManagerItemTypeEnum> getMetaData() { return MetaData; }
        public FetchDataResults setMetaData(ArrayList<DataManagerItemTypeEnum> value) { this.MetaData = value; return this; }
        public ArrayList<DataManagerAttribute> getAttributes() { return Attributes; }
        public FetchDataResults setAttributes(ArrayList<DataManagerAttribute> value) { this.Attributes = value; return this; }
        public DataSeeker getSeeker() { return Seeker; }
        public FetchDataResults setSeeker(DataSeeker value) { this.Seeker = value; return this; }
        public ArrayList<FetchedDataRow> getData() { return Data; }
        public FetchDataResults setData(ArrayList<FetchedDataRow> value) { this.Data = value; return this; }
    }

    public static class CalculationEx extends GuiCalcBase
    {
        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public ArrayList<CalculationEx> Calculations = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body")
        public ArrayList<PrimitiveEx> Primitives = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public Integer Version = null;

        public ArrayList<CalculationSchedule> Schedules = null;
        
        public ArrayList<CalculationEx> getCalculations() { return Calculations; }
        public CalculationEx setCalculations(ArrayList<CalculationEx> value) { this.Calculations = value; return this; }
        public ArrayList<PrimitiveEx> getPrimitives() { return Primitives; }
        public CalculationEx setPrimitives(ArrayList<PrimitiveEx> value) { this.Primitives = value; return this; }
        public Integer getVersion() { return Version; }
        public CalculationEx setVersion(Integer value) { this.Version = value; return this; }
        public ArrayList<CalculationSchedule> getSchedules() { return Schedules; }
        public CalculationEx setSchedules(ArrayList<CalculationSchedule> value) { this.Schedules = value; return this; }
    }

    public static class EvaluationResult
    {
        public ArrayList<String> InfoLogs = null;
        public ArrayList<String> AuditLogs = null;
        public Boolean Succeeded = null;
        public String ErrorMessage = null;
        public HashMap<String,VariantType> NodeTypes = null;
        public HashMap<String,String> NodeValues = null;
        
        public ArrayList<String> getInfoLogs() { return InfoLogs; }
        public EvaluationResult setInfoLogs(ArrayList<String> value) { this.InfoLogs = value; return this; }
        public ArrayList<String> getAuditLogs() { return AuditLogs; }
        public EvaluationResult setAuditLogs(ArrayList<String> value) { this.AuditLogs = value; return this; }
        public Boolean isSucceeded() { return Succeeded; }
        public EvaluationResult setSucceeded(Boolean value) { this.Succeeded = value; return this; }
        public String getErrorMessage() { return ErrorMessage; }
        public EvaluationResult setErrorMessage(String value) { this.ErrorMessage = value; return this; }
        public HashMap<String,VariantType> getNodeTypes() { return NodeTypes; }
        public EvaluationResult setNodeTypes(HashMap<String,VariantType> value) { this.NodeTypes = value; return this; }
        public HashMap<String,String> getNodeValues() { return NodeValues; }
        public EvaluationResult setNodeValues(HashMap<String,String> value) { this.NodeValues = value; return this; }
    }

    public static class InfoModelElement
    {
        /**
        * Name of the element. Not stored in database. Populated on reads. Inferred from Path.
        */
        @ApiMember(Description="Name of the element. Not stored in database. Populated on reads. Inferred from Path.", ParameterType="body", DataType="string", IsRequired=true)
        public String Name = null;

        /**
        * Type of the element
        */
        @ApiMember(Description="Type of the element", ParameterType="body", DataType="string", IsRequired=true)
        public InfoModelTypeEnum Type = null;

        /**
        * Path within the hierarchy for this element
        */
        @ApiMember(Description="Path within the hierarchy for this element", ParameterType="body", DataType="string", IsRequired=true)
        public String Path = null;

        /**
        * Path to the model from which this element inherits
        */
        @ApiMember(Description="Path to the model from which this element inherits", ParameterType="body", DataType="string", IsRequired=true)
        public String ModelPath = null;

        /**
        * Indicates if the element inherits the attributes from its parent
        */
        @ApiMember(Description="Indicates if the element inherits the attributes from its parent", ParameterType="body", DataType="string", IsRequired=true)
        public Boolean InheritAttributes = null;

        /**
        * If the element is linked to another, then the symbolic link will give the canonical representation
        */
        @ApiMember(Description="If the element is linked to another, then the symbolic link will give the canonical representation", ParameterType="body", DataType="string", IsRequired=true)
        public String SymbolicLink = null;

        /**
        * Description of the element
        */
        @ApiMember(Description="Description of the element", ParameterType="body", DataType="string", IsRequired=true)
        public String Description = null;

        /**
        * List of the paths to the children of this element
        */
        @ApiMember(Description="List of the paths to the children of this element", ParameterType="body", DataType="string", IsRequired=true)
        public ArrayList<String> Children = null;

        /**
        * The list of attributes associated with this element, stored by attribute group
        */
        @ApiMember(Description="The list of attributes associated with this element, stored by attribute group", ParameterType="body", DataType="string", IsRequired=true)
        public ArrayList<InfoModelAttributeGroup> AttributeGroups = null;

        /**
        * Last updated timestamp. Used for synchronising updates.
        */
        @ApiMember(Description="Last updated timestamp. Used for synchronising updates.", ParameterType="body", DataType="long", IsRequired=true)
        public Long Timestamp = null;

        /**
        * Text resolution rules for generation of Instances for Model.
        */
        @ApiMember(Description="Text resolution rules for generation of Instances for Model.", ParameterType="body", DataType="long", IsRequired=true)
        public ArrayList<InfoModelResolutionInfo> ResolutionInfo = null;
        
        public String getName() { return Name; }
        public InfoModelElement setName(String value) { this.Name = value; return this; }
        public InfoModelTypeEnum getType() { return Type; }
        public InfoModelElement setType(InfoModelTypeEnum value) { this.Type = value; return this; }
        public String getPath() { return Path; }
        public InfoModelElement setPath(String value) { this.Path = value; return this; }
        public String getModelPath() { return ModelPath; }
        public InfoModelElement setModelPath(String value) { this.ModelPath = value; return this; }
        public Boolean isInheritAttributes() { return InheritAttributes; }
        public InfoModelElement setInheritAttributes(Boolean value) { this.InheritAttributes = value; return this; }
        public String getSymbolicLink() { return SymbolicLink; }
        public InfoModelElement setSymbolicLink(String value) { this.SymbolicLink = value; return this; }
        public String getDescription() { return Description; }
        public InfoModelElement setDescription(String value) { this.Description = value; return this; }
        public ArrayList<String> getChildren() { return Children; }
        public InfoModelElement setChildren(ArrayList<String> value) { this.Children = value; return this; }
        public ArrayList<InfoModelAttributeGroup> getAttributeGroups() { return AttributeGroups; }
        public InfoModelElement setAttributeGroups(ArrayList<InfoModelAttributeGroup> value) { this.AttributeGroups = value; return this; }
        public Long getTimestamp() { return Timestamp; }
        public InfoModelElement setTimestamp(Long value) { this.Timestamp = value; return this; }
        public ArrayList<InfoModelResolutionInfo> getResolutionInfo() { return ResolutionInfo; }
        public InfoModelElement setResolutionInfo(ArrayList<InfoModelResolutionInfo> value) { this.ResolutionInfo = value; return this; }
    }

    public static class InfoModelElementTree
    {
        public ArrayList<InfoModelElementNode> RootNodes = null;
        
        public ArrayList<InfoModelElementNode> getRootNodes() { return RootNodes; }
        public InfoModelElementTree setRootNodes(ArrayList<InfoModelElementNode> value) { this.RootNodes = value; return this; }
    }

    public static class EngineeringUnitClass
    {
        /**
        * Name of the class
        */
        @ApiMember(Description="Name of the class", ParameterType="body", DataType="string", IsRequired=true)
        public String Name = null;

        /**
        * Description of the class
        */
        @ApiMember(Description="Description of the class", ParameterType="body", DataType="string", IsRequired=true)
        public String Description = null;

        /**
        * List of engineering units for this class
        */
        @ApiMember(Description="List of engineering units for this class", ParameterType="body", DataType="string", IsRequired=true)
        public ArrayList<String> Units = null;

        /**
        * Path to the canonical engineering unit for this class
        */
        @ApiMember(Description="Path to the canonical engineering unit for this class", ParameterType="body", DataType="string", IsRequired=true)
        public String CanonicalUnit = null;
        
        public String getName() { return Name; }
        public EngineeringUnitClass setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public EngineeringUnitClass setDescription(String value) { this.Description = value; return this; }
        public ArrayList<String> getUnits() { return Units; }
        public EngineeringUnitClass setUnits(ArrayList<String> value) { this.Units = value; return this; }
        public String getCanonicalUnit() { return CanonicalUnit; }
        public EngineeringUnitClass setCanonicalUnit(String value) { this.CanonicalUnit = value; return this; }
    }

    public static class EngineeringUnit
    {
        /**
        * Name of the engineering unit
        */
        @ApiMember(Description="Name of the engineering unit", ParameterType="body", DataType="string", IsRequired=true)
        public String Name = null;

        /**
        * Class of the engineering unit
        */
        @ApiMember(Description="Class of the engineering unit", ParameterType="body", DataType="string", IsRequired=true)
        public String Class = null;

        /**
        * Description of the engineering unit
        */
        @ApiMember(Description="Description of the engineering unit", ParameterType="body", DataType="string", IsRequired=true)
        public String Description = null;

        /**
        * Abbreviation for the engineering unit
        */
        @ApiMember(Description="Abbreviation for the engineering unit", ParameterType="body", DataType="string", IsRequired=true)
        public String Abbreviation = null;

        /**
        * Formula to convert to the canonical engineering unit
        */
        @ApiMember(Description="Formula to convert to the canonical engineering unit", ParameterType="body", DataType="string", IsRequired=true)
        public String Formula = null;

        /**
        * Factor to convert to the canonical engineering unit
        */
        @ApiMember(Description="Factor to convert to the canonical engineering unit", ParameterType="body", DataType="double", IsRequired=true)
        public Double Factor = null;

        /**
        * Offset to convert to the canonical engineering unit
        */
        @ApiMember(Description="Offset to convert to the canonical engineering unit", ParameterType="body", DataType="double", IsRequired=true)
        public Double Offset = null;
        
        public String getName() { return Name; }
        public EngineeringUnit setName(String value) { this.Name = value; return this; }
        public String getClass2() { return Class; }
        public EngineeringUnit setClass(String value) { this.Class = value; return this; }
        public String getDescription() { return Description; }
        public EngineeringUnit setDescription(String value) { this.Description = value; return this; }
        public String getAbbreviation() { return Abbreviation; }
        public EngineeringUnit setAbbreviation(String value) { this.Abbreviation = value; return this; }
        public String getFormula() { return Formula; }
        public EngineeringUnit setFormula(String value) { this.Formula = value; return this; }
        public Double getFactor() { return Factor; }
        public EngineeringUnit setFactor(Double value) { this.Factor = value; return this; }
        public Double getOffset() { return Offset; }
        public EngineeringUnit setOffset(Double value) { this.Offset = value; return this; }
    }

    public static class AlarmArea
    {
        /**
        * The name of the alarm area
        */
        @ApiMember(Description="The name of the alarm area", ParameterType="body", DataType="string")
        public String Name = null;

        /**
        * Alarm area description
        */
        @ApiMember(Description="Alarm area description", ParameterType="body", DataType="string")
        public String Description = null;

        /**
        * Alarm area alias
        */
        @ApiMember(Description="Alarm area alias", ParameterType="body", DataType="string")
        public String Alias = null;

        /**
        * Specifies whether the item's data is written to the database when the item's node is connected in the Data Logger
        */
        @ApiMember(Description="Specifies whether the item's data is written to the database when the item's node is connected in the Data Logger", ParameterType="body", DataType="boolean")
        public Boolean Logged = null;

        /**
        * Specifies the list of groups to which this alarm area is linked
        */
        @ApiMember(Description="Specifies the list of groups to which this alarm area is linked", ParameterType="body", DataType="string[]")
        public ArrayList<String> Groups = null;

        /**
        * Specifies the list of alarm sources in this alarm area
        */
        @ApiMember(Description="Specifies the list of alarm sources in this alarm area", ParameterType="body", DataType="string[]")
        public ArrayList<String> AlarmSources = null;
        
        public String getName() { return Name; }
        public AlarmArea setName(String value) { this.Name = value; return this; }
        public String getDescription() { return Description; }
        public AlarmArea setDescription(String value) { this.Description = value; return this; }
        public String getAlias() { return Alias; }
        public AlarmArea setAlias(String value) { this.Alias = value; return this; }
        public Boolean isLogged() { return Logged; }
        public AlarmArea setLogged(Boolean value) { this.Logged = value; return this; }
        public ArrayList<String> getGroups() { return Groups; }
        public AlarmArea setGroups(ArrayList<String> value) { this.Groups = value; return this; }
        public ArrayList<String> getAlarmSources() { return AlarmSources; }
        public AlarmArea setAlarmSources(ArrayList<String> value) { this.AlarmSources = value; return this; }
    }

    public static class Attribute
    {
        /**
        * The key for the attribute entry
        */
        @ApiMember(Description="The key for the attribute entry", ParameterType="body", DataType="string", Name="Key")
        public String Key = null;

        /**
        * The value for the attribute entry
        */
        @ApiMember(Description="The value for the attribute entry", ParameterType="body", DataType="string", Name="Value")
        public String Value = null;
        
        public String getKey() { return Key; }
        public Attribute setKey(String value) { this.Key = value; return this; }
        public String getValue() { return Value; }
        public Attribute setValue(String value) { this.Value = value; return this; }
    }

    public static class PhaseData
    {
        /**
        * Phase start time
        */
        @ApiMember(Description="Phase start time", ParameterType="body", DataType="string", IsRequired=true)
        public String PhaseStart = null;

        /**
        * Phase stop time
        */
        @ApiMember(Description="Phase stop time", ParameterType="body", DataType="string", IsRequired=true)
        public String PhaseStop = null;

        /**
        * Phase name
        */
        @ApiMember(Description="Phase name", ParameterType="body", DataType="string", IsRequired=true)
        public String PhaseName = null;
        
        public String getPhaseStart() { return PhaseStart; }
        public PhaseData setPhaseStart(String value) { this.PhaseStart = value; return this; }
        public String getPhaseStop() { return PhaseStop; }
        public PhaseData setPhaseStop(String value) { this.PhaseStop = value; return this; }
        public String getPhaseName() { return PhaseName; }
        public PhaseData setPhaseName(String value) { this.PhaseName = value; return this; }
    }

    public static enum ReplicationMode_e
    {
        Standalone,
        Publication,
        Subscription,
        Both;
    }

    public static enum ItemType_e
    {
        NotSet(0),
        Int16(2),
        Int32(3),
        Float32(4),
        Double64(5),
        Currency(6),
        Date(7),
        String(8),
        Bool(11),
        Decimal(14),
        Int8(16),
        UInt8(17),
        UInt16(18),
        UInt32(19),
        Int64(20),
        UInt64(21),
        Int(22),
        UInt(23);

        private final int value;
        ItemType_e(final int intValue) { value = intValue; }
        public int getValue() { return value; }
    }

    public static enum NodeType_e
    {
        Opc,
        Dde,
        DataEntry,
        NotSet,
        OpcAe,
        ManualAe,
        OpcHda;
    }

    public static class Variant
    {
        public String SerialisedValue = null;
        public VariantType DataType = null;
        public Boolean IsNull = null;
        
        public String getSerialisedValue() { return SerialisedValue; }
        public Variant setSerialisedValue(String value) { this.SerialisedValue = value; return this; }
        public VariantType getDataType() { return DataType; }
        public Variant setDataType(VariantType value) { this.DataType = value; return this; }
        public Boolean getIsNull() { return IsNull; }
        public Variant setIsNull(Boolean value) { this.IsNull = value; return this; }
    }

    public static enum OperationalMode_e
    {
        Cold,
        Warm,
        Hot;
    }

    public static class ProcessDataContainer
    {
        /**
        * The item name for which the process data is to be stored
        */
        @ApiMember(Description="The item name for which the process data is to be stored", ParameterType="body", DataType="string")
        public String ItemName = null;

        /**
        * The list of process datums
        */
        @ApiMember(Description="The list of process datums", ParameterType="body", DataType="ProcessDataPoint[]")
        public ArrayList<ProcessDataPoint> ProcessData = null;
        
        public String getItemName() { return ItemName; }
        public ProcessDataContainer setItemName(String value) { this.ItemName = value; return this; }
        public ArrayList<ProcessDataPoint> getProcessData() { return ProcessData; }
        public ProcessDataContainer setProcessData(ArrayList<ProcessDataPoint> value) { this.ProcessData = value; return this; }
    }

    public static class AlarmDataPoint
    {
        /**
        * The timestamp at which the event occurred
        */
        @ApiMember(Description="The timestamp at which the event occurred", ParameterType="body", DataType="datetime")
        public Date EventTime = null;

        /**
        * Alarm Source
        */
        @ApiMember(Description="Alarm Source", ParameterType="body", DataType="string")
        public String Source = null;

        /**
        * Message
        */
        @ApiMember(Description="Message", ParameterType="body", DataType="string")
        public String Message = null;

        /**
        * EventType
        */
        @ApiMember(Description="EventType", ParameterType="body", DataType="integer")
        public Integer EventType = null;

        /**
        * EventCategory
        */
        @ApiMember(Description="EventCategory", ParameterType="body", DataType="integer")
        public Integer EventCategory = null;

        /**
        * Severity
        */
        @ApiMember(Description="Severity", ParameterType="body", DataType="integer")
        public Integer Severity = null;

        /**
        * ActorID
        */
        @ApiMember(Description="ActorID", ParameterType="body", DataType="string")
        public String ActorID = null;

        /**
        * DAItem
        */
        @ApiMember(Description="DAItem", ParameterType="body", DataType="string")
        public String DAItem = null;

        /**
        * ConditionName
        */
        @ApiMember(Description="ConditionName", ParameterType="body", DataType="string")
        public String ConditionName = null;

        /**
        * SubConditionName
        */
        @ApiMember(Description="SubConditionName", ParameterType="body", DataType="string")
        public String SubConditionName = null;

        /**
        * Mask
        */
        @ApiMember(Description="Mask", ParameterType="body", DataType="short")
        public Short Mask = null;

        /**
        * State
        */
        @ApiMember(Description="State", ParameterType="body", DataType="short")
        public Short State = null;

        /**
        * Quality
        */
        @ApiMember(Description="Quality", ParameterType="body", DataType="short")
        public Short Quality = null;

        /**
        * ActiveTime
        */
        @ApiMember(Description="ActiveTime", ParameterType="body", DataType="datetime")
        public Date ActiveTime = null;

        /**
        * AckRequired
        */
        @ApiMember(Description="AckRequired", ParameterType="body", DataType="boolean")
        public Boolean AckRequired = null;

        /**
        * VendorDefinedAttributeIDs
        */
        @ApiMember(Description="VendorDefinedAttributeIDs", ParameterType="body", DataType="int")
        public ArrayList<Integer> VendorDefinedAttributeIDs = null;

        /**
        * VendorDefinedAttributeValues
        */
        @ApiMember(Description="VendorDefinedAttributeValues", ParameterType="body", DataType="string")
        public ArrayList<String> VendorDefinedAttributeValues = null;
        
        public Date getEventTime() { return EventTime; }
        public AlarmDataPoint setEventTime(Date value) { this.EventTime = value; return this; }
        public String getSource() { return Source; }
        public AlarmDataPoint setSource(String value) { this.Source = value; return this; }
        public String getMessage() { return Message; }
        public AlarmDataPoint setMessage(String value) { this.Message = value; return this; }
        public Integer getEventType() { return EventType; }
        public AlarmDataPoint setEventType(Integer value) { this.EventType = value; return this; }
        public Integer getEventCategory() { return EventCategory; }
        public AlarmDataPoint setEventCategory(Integer value) { this.EventCategory = value; return this; }
        public Integer getSeverity() { return Severity; }
        public AlarmDataPoint setSeverity(Integer value) { this.Severity = value; return this; }
        public String getActorID() { return ActorID; }
        public AlarmDataPoint setActorID(String value) { this.ActorID = value; return this; }
        public String getDaItem() { return DAItem; }
        public AlarmDataPoint setDaItem(String value) { this.DAItem = value; return this; }
        public String getConditionName() { return ConditionName; }
        public AlarmDataPoint setConditionName(String value) { this.ConditionName = value; return this; }
        public String getSubConditionName() { return SubConditionName; }
        public AlarmDataPoint setSubConditionName(String value) { this.SubConditionName = value; return this; }
        public Short getMask() { return Mask; }
        public AlarmDataPoint setMask(Short value) { this.Mask = value; return this; }
        public Short getState() { return State; }
        public AlarmDataPoint setState(Short value) { this.State = value; return this; }
        public Short getQuality() { return Quality; }
        public AlarmDataPoint setQuality(Short value) { this.Quality = value; return this; }
        public Date getActiveTime() { return ActiveTime; }
        public AlarmDataPoint setActiveTime(Date value) { this.ActiveTime = value; return this; }
        public Boolean isAckRequired() { return AckRequired; }
        public AlarmDataPoint setAckRequired(Boolean value) { this.AckRequired = value; return this; }
        public ArrayList<Integer> getVendorDefinedAttributeIDs() { return VendorDefinedAttributeIDs; }
        public AlarmDataPoint setVendorDefinedAttributeIDs(ArrayList<Integer> value) { this.VendorDefinedAttributeIDs = value; return this; }
        public ArrayList<String> getVendorDefinedAttributeValues() { return VendorDefinedAttributeValues; }
        public AlarmDataPoint setVendorDefinedAttributeValues(ArrayList<String> value) { this.VendorDefinedAttributeValues = value; return this; }
    }

    public static enum AlarmFieldFilter_e
    {
        Source,
        Message,
        EventType,
        EventCategory,
        Severity,
        ActorID,
        DaItem,
        ConditionName,
        SubConditionName,
        Mask,
        State,
        Quality,
        ActiveTime,
        AckRequired,
        VendorAttributeID;
    }

    public static class FilterFieldValue
    {
        public ArrayList<Variant> Values = null;
        
        public ArrayList<Variant> getValues() { return Values; }
        public FilterFieldValue setValues(ArrayList<Variant> value) { this.Values = value; return this; }
    }

    public static class ProcessDataPoint
    {
        /**
        * The timestamp at which the event occurred
        */
        @ApiMember(Description="The timestamp at which the event occurred", ParameterType="body", DataType="datetime")
        public Date EventTime = null;

        /**
        * The value for the data point
        */
        @ApiMember(Description="The value for the data point", ParameterType="body", DataType="variant")
        public Variant EventValue = null;

        /**
        * The OPC event quality
        */
        @ApiMember(Description="The OPC event quality", ParameterType="body", DataType="integer")
        public Integer Quality = null;
        
        public Date getEventTime() { return EventTime; }
        public ProcessDataPoint setEventTime(Date value) { this.EventTime = value; return this; }
        public Variant getEventValue() { return EventValue; }
        public ProcessDataPoint setEventValue(Variant value) { this.EventValue = value; return this; }
        public Integer getQuality() { return Quality; }
        public ProcessDataPoint setQuality(Integer value) { this.Quality = value; return this; }
    }

    public static enum Aggregate_e
    {
        NoAggregate(0),
        Interpolative(1),
        Total(2),
        Average(3),
        TimeAverage(4),
        Count(5),
        Stdev(6),
        Stddev(7),
        MinimumActualTime(8),
        Minimum(9),
        MaximumActualTime(10),
        Maximum(11),
        Start(12),
        End(13),
        Delta(14),
        RegSlope(15),
        RegConst(16),
        RegDev(17),
        Variance(18),
        Range(19),
        DurationGood(20),
        DurationBad(21),
        PercentGood(22),
        PercentBad(23),
        WorstQuality(24),
        Annotations(25),
        TimeAtMin(100),
        AggTimeAtMax(101),
        AggIgnoreNegatives(102),
        MinimumBatch(103),
        MaximumBatch(104),
        MinimumActualTimebatch(105),
        MaximumActualTimebatch(106),
        DeltaBatch(107),
        RangeBatch(108),
        AggTimeAtMinBatch(109),
        AggTimeAtMaxBatch(110),
        AggSumOfPositiveDeltas(111),
        LinearInterpolative(112),
        LinearTotal(113),
        LinearTimeAverage(114),
        PlotValues(120),
        Direct(-2),
        NotSet(-1);

        private final int value;
        Aggregate_e(final int intValue) { value = intValue; }
        public int getValue() { return value; }
    }

    public static class ProcessDataRequest
    {
        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public String ItemName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="datetime")
        public Date StartTime = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="datetime")
        public Date EndTime = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="Aggregate_e")
        public Aggregate_e Aggregate = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="boolean")
        public Boolean Bounding = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="integer")
        public Integer ResampleCount = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="integer")
        public Integer ResampleInterval = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="boolean")
        public Boolean StartAtOnlineData = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="integer")
        public Integer Session = null;

        /**
        * If Aggregate is set to 0, this specifies the last number of required values from the current time
        */
        @ApiMember(Description="If Aggregate is set to 0, this specifies the last number of required values from the current time", ParameterType="body", DataType="integer")
        public Integer LastNValues = null;
        
        public String getItemName() { return ItemName; }
        public ProcessDataRequest setItemName(String value) { this.ItemName = value; return this; }
        public Date getStartTime() { return StartTime; }
        public ProcessDataRequest setStartTime(Date value) { this.StartTime = value; return this; }
        public Date getEndTime() { return EndTime; }
        public ProcessDataRequest setEndTime(Date value) { this.EndTime = value; return this; }
        public Aggregate_e getAggregate() { return Aggregate; }
        public ProcessDataRequest setAggregate(Aggregate_e value) { this.Aggregate = value; return this; }
        public Boolean isBounding() { return Bounding; }
        public ProcessDataRequest setBounding(Boolean value) { this.Bounding = value; return this; }
        public Integer getResampleCount() { return ResampleCount; }
        public ProcessDataRequest setResampleCount(Integer value) { this.ResampleCount = value; return this; }
        public Integer getResampleInterval() { return ResampleInterval; }
        public ProcessDataRequest setResampleInterval(Integer value) { this.ResampleInterval = value; return this; }
        public Boolean isStartAtOnlineData() { return StartAtOnlineData; }
        public ProcessDataRequest setStartAtOnlineData(Boolean value) { this.StartAtOnlineData = value; return this; }
        public Integer getSession() { return Session; }
        public ProcessDataRequest setSession(Integer value) { this.Session = value; return this; }
        public Integer getLastNValues() { return LastNValues; }
        public ProcessDataRequest setLastNValues(Integer value) { this.LastNValues = value; return this; }
    }

    public static class DataSources
    {
        
    }

    public static class DiscoveryBrowseNode
    {
        public String DbId = null;
        public String Name = null;
        public String FullyQualifiedName = null;
        public String Alias = null;
        public String Description = null;
        public ItemTypeEnum2 Type = null;
        public ServerTypeEnum ServerType = null;
        public DiscoveryBrowseNodeTypeEnum NodeType = null;
        public ArrayList<DiscoveryBrowseNode> Children = null;
        
        public String getDbId() { return DbId; }
        public DiscoveryBrowseNode setDbId(String value) { this.DbId = value; return this; }
        public String getName() { return Name; }
        public DiscoveryBrowseNode setName(String value) { this.Name = value; return this; }
        public String getFullyQualifiedName() { return FullyQualifiedName; }
        public DiscoveryBrowseNode setFullyQualifiedName(String value) { this.FullyQualifiedName = value; return this; }
        public String getAlias() { return Alias; }
        public DiscoveryBrowseNode setAlias(String value) { this.Alias = value; return this; }
        public String getDescription() { return Description; }
        public DiscoveryBrowseNode setDescription(String value) { this.Description = value; return this; }
        public ItemTypeEnum2 getType() { return Type; }
        public DiscoveryBrowseNode setType(ItemTypeEnum2 value) { this.Type = value; return this; }
        public ServerTypeEnum getServerType() { return ServerType; }
        public DiscoveryBrowseNode setServerType(ServerTypeEnum value) { this.ServerType = value; return this; }
        public DiscoveryBrowseNodeTypeEnum getNodeType() { return NodeType; }
        public DiscoveryBrowseNode setNodeType(DiscoveryBrowseNodeTypeEnum value) { this.NodeType = value; return this; }
        public ArrayList<DiscoveryBrowseNode> getChildren() { return Children; }
        public DiscoveryBrowseNode setChildren(ArrayList<DiscoveryBrowseNode> value) { this.Children = value; return this; }
    }

    public static class ItemAttribute
    {
        public String DbId = null;
        public String Name = null;
        public String Value = null;
        
        public String getDbId() { return DbId; }
        public ItemAttribute setDbId(String value) { this.DbId = value; return this; }
        public String getName() { return Name; }
        public ItemAttribute setName(String value) { this.Name = value; return this; }
        public String getValue() { return Value; }
        public ItemAttribute setValue(String value) { this.Value = value; return this; }
    }

    public static class ItemMetaInfo
    {
        public String DbId = null;
        public String Name = null;
        public String Type = null;
        
        public String getDbId() { return DbId; }
        public ItemMetaInfo setDbId(String value) { this.DbId = value; return this; }
        public String getName() { return Name; }
        public ItemMetaInfo setName(String value) { this.Name = value; return this; }
        public String getType() { return Type; }
        public ItemMetaInfo setType(String value) { this.Type = value; return this; }
    }

    public static enum DatabaseTypeEnum
    {
        AutomsoftHda;
    }

    public static class QuerySettings
    {
        public String DbId = null;
        public String Identifier = null;
        public ArrayList<String> DiscoveryStack = null;
        public String Location = null;
        
        public String getDbId() { return DbId; }
        public QuerySettings setDbId(String value) { this.DbId = value; return this; }
        public String getIdentifier() { return Identifier; }
        public QuerySettings setIdentifier(String value) { this.Identifier = value; return this; }
        public ArrayList<String> getDiscoveryStack() { return DiscoveryStack; }
        public QuerySettings setDiscoveryStack(ArrayList<String> value) { this.DiscoveryStack = value; return this; }
        public String getLocation() { return Location; }
        public QuerySettings setLocation(String value) { this.Location = value; return this; }
    }

    public static class QueryOptions
    {
        public String DbId = null;
        public ArrayList<Integer> ItemMapping = null;
        public ArrayList<ServerOption> ServerOptions = null;
        
        public String getDbId() { return DbId; }
        public QueryOptions setDbId(String value) { this.DbId = value; return this; }
        public ArrayList<Integer> getItemMapping() { return ItemMapping; }
        public QueryOptions setItemMapping(ArrayList<Integer> value) { this.ItemMapping = value; return this; }
        public ArrayList<ServerOption> getServerOptions() { return ServerOptions; }
        public QueryOptions setServerOptions(ArrayList<ServerOption> value) { this.ServerOptions = value; return this; }
    }

    public static class SearchFilter
    {
        public SearchTypeEnum Type = null;
        public SearchScopeEnum Scope = null;
        public String Filter = null;
        
        public SearchTypeEnum getType() { return Type; }
        public SearchFilter setType(SearchTypeEnum value) { this.Type = value; return this; }
        public SearchScopeEnum getScope() { return Scope; }
        public SearchFilter setScope(SearchScopeEnum value) { this.Scope = value; return this; }
        public String getFilter() { return Filter; }
        public SearchFilter setFilter(String value) { this.Filter = value; return this; }
    }

    public static class SearchItem
    {
        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public String SearchString = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public String id = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public String name = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public String displayName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public String comment = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public String alias = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public String engineeringUnit = null;

        public String type = null;
        
        public String getSearchString() { return SearchString; }
        public SearchItem setSearchString(String value) { this.SearchString = value; return this; }
        public String getId() { return id; }
        public SearchItem setId(String value) { this.id = value; return this; }
        public String getName() { return name; }
        public SearchItem setName(String value) { this.name = value; return this; }
        public String getDisplayName() { return displayName; }
        public SearchItem setDisplayName(String value) { this.displayName = value; return this; }
        public String getComment() { return comment; }
        public SearchItem setComment(String value) { this.comment = value; return this; }
        public String getAlias() { return alias; }
        public SearchItem setAlias(String value) { this.alias = value; return this; }
        public String getEngineeringUnit() { return engineeringUnit; }
        public SearchItem setEngineeringUnit(String value) { this.engineeringUnit = value; return this; }
        public String getType() { return type; }
        public SearchItem setType(String value) { this.type = value; return this; }
    }

    public static enum UserTypes
    {
        ActiveDirectoryUser,
        LocalUser;
    }

    public static class LinkSettings
    {
        public LinkTypes LinkType = null;
        public String LinkPath = null;
        public String LinkServer = null;
        public HashMap<String,String> InitialInstances = null;
        public Boolean SetInstancesOnOpen = null;
        
        public LinkTypes getLinkType() { return LinkType; }
        public LinkSettings setLinkType(LinkTypes value) { this.LinkType = value; return this; }
        public String getLinkPath() { return LinkPath; }
        public LinkSettings setLinkPath(String value) { this.LinkPath = value; return this; }
        public String getLinkServer() { return LinkServer; }
        public LinkSettings setLinkServer(String value) { this.LinkServer = value; return this; }
        public HashMap<String,String> getInitialInstances() { return InitialInstances; }
        public LinkSettings setInitialInstances(HashMap<String,String> value) { this.InitialInstances = value; return this; }
        public Boolean isSetInstancesOnOpen() { return SetInstancesOnOpen; }
        public LinkSettings setSetInstancesOnOpen(Boolean value) { this.SetInstancesOnOpen = value; return this; }
    }

    public static class AutomsoftSession
    {
        
    }

    public static class PasswordRequirements
    {
        public String DbId = null;
        public Integer minChar = null;
        public Integer renewal = null;
        public Integer previousPasswords = null;
        public Integer sessionExpire = null;
        public PasswordComplexity password = null;
        
        public String getDbId() { return DbId; }
        public PasswordRequirements setDbId(String value) { this.DbId = value; return this; }
        public Integer getMinChar() { return minChar; }
        public PasswordRequirements setMinChar(Integer value) { this.minChar = value; return this; }
        public Integer getRenewal() { return renewal; }
        public PasswordRequirements setRenewal(Integer value) { this.renewal = value; return this; }
        public Integer getPreviousPasswords() { return previousPasswords; }
        public PasswordRequirements setPreviousPasswords(Integer value) { this.previousPasswords = value; return this; }
        public Integer getSessionExpire() { return sessionExpire; }
        public PasswordRequirements setSessionExpire(Integer value) { this.sessionExpire = value; return this; }
        public PasswordComplexity getPassword() { return password; }
        public PasswordRequirements setPassword(PasswordComplexity value) { this.password = value; return this; }
    }

    public static class AdDomainSettings
    {
        public String Domain = null;
        public String User = null;
        public String OrganisationalUnit = null;
        public String SaltedPassword = null;
        
        public String getDomain() { return Domain; }
        public AdDomainSettings setDomain(String value) { this.Domain = value; return this; }
        public String getUser() { return User; }
        public AdDomainSettings setUser(String value) { this.User = value; return this; }
        public String getOrganisationalUnit() { return OrganisationalUnit; }
        public AdDomainSettings setOrganisationalUnit(String value) { this.OrganisationalUnit = value; return this; }
        public String getSaltedPassword() { return SaltedPassword; }
        public AdDomainSettings setSaltedPassword(String value) { this.SaltedPassword = value; return this; }
    }

    @DataContract
    public static class UserApiKey
    {
        @DataMember(Order=1)
        public String Key = null;

        @DataMember(Order=2)
        public String KeyType = null;

        @DataMember(Order=3)
        public Date ExpiryDate = null;
        
        public String getKey() { return Key; }
        public UserApiKey setKey(String value) { this.Key = value; return this; }
        public String getKeyType() { return KeyType; }
        public UserApiKey setKeyType(String value) { this.KeyType = value; return this; }
        public Date getExpiryDate() { return ExpiryDate; }
        public UserApiKey setExpiryDate(Date value) { this.ExpiryDate = value; return this; }
    }

    public static class Directory
    {
        
    }

    public static class fileHistoryInfoType
    {
        public String fileName = null;
        public String serverURL = null;
        public fileType fileType = null;
        public ArrayList<versionInfoType> versionInfo = null;
        public String creationDate = null;
        public String modDate = null;
        public Long fileSize = null;
        public Boolean hidden = null;
        public Integer versioningStrategy = null;
        
        public String getFileName() { return fileName; }
        public fileHistoryInfoType setFileName(String value) { this.fileName = value; return this; }
        public String getServerURL() { return serverURL; }
        public fileHistoryInfoType setServerURL(String value) { this.serverURL = value; return this; }
        public fileType getFileType() { return fileType; }
        public fileHistoryInfoType setFileType(fileType value) { this.fileType = value; return this; }
        public ArrayList<versionInfoType> getVersionInfo() { return versionInfo; }
        public fileHistoryInfoType setVersionInfo(ArrayList<versionInfoType> value) { this.versionInfo = value; return this; }
        public String getCreationDate() { return creationDate; }
        public fileHistoryInfoType setCreationDate(String value) { this.creationDate = value; return this; }
        public String getModDate() { return modDate; }
        public fileHistoryInfoType setModDate(String value) { this.modDate = value; return this; }
        public Long getFileSize() { return fileSize; }
        public fileHistoryInfoType setFileSize(Long value) { this.fileSize = value; return this; }
        public Boolean isHidden() { return hidden; }
        public fileHistoryInfoType setHidden(Boolean value) { this.hidden = value; return this; }
        public Integer getVersioningStrategy() { return versioningStrategy; }
        public fileHistoryInfoType setVersioningStrategy(Integer value) { this.versioningStrategy = value; return this; }
    }

    public static class File
    {
        
    }

    public static class byteDataType
    {
        public ArrayList<Short> storedData = null;
        public dataType dataType = null;
        
        public ArrayList<Short> getStoredData() { return storedData; }
        public byteDataType setStoredData(ArrayList<Short> value) { this.storedData = value; return this; }
        public dataType getDataType() { return dataType; }
        public byteDataType setDataType(dataType value) { this.dataType = value; return this; }
    }

    public static class Template
    {
        
    }

    public static class Server
    {
        
    }

    public static enum FileManagerFileSystemEnum
    {
        Local,
        Husbo,
        Svn;
    }

    public static class Reporting
    {
        
    }

    public static class ReportSchedule
    {
        public String TaskName = null;
        public String ReportName = null;
        public String Arguments = null;
        public String OutputFile = null;
        public String Schedule = null;
        
        public String getTaskName() { return TaskName; }
        public ReportSchedule setTaskName(String value) { this.TaskName = value; return this; }
        public String getReportName() { return ReportName; }
        public ReportSchedule setReportName(String value) { this.ReportName = value; return this; }
        public String getArguments() { return Arguments; }
        public ReportSchedule setArguments(String value) { this.Arguments = value; return this; }
        public String getOutputFile() { return OutputFile; }
        public ReportSchedule setOutputFile(String value) { this.OutputFile = value; return this; }
        public String getSchedule() { return Schedule; }
        public ReportSchedule setSchedule(String value) { this.Schedule = value; return this; }
    }

    public static class SourceConfiguration
    {
        public Boolean Enabled = null;
        public Boolean AutoDiscovery = null;
        public Boolean DataInUtc = null;
        public NameSourceEnum NameSource = null;
        public ArrayList<ConnectionOptions> Options = null;
        public dataSourceDefinitionType SourceSettings = null;
        public String RemoteOpcHost = null;
        public String PathDelimiter = null;
        
        public Boolean isEnabled() { return Enabled; }
        public SourceConfiguration setEnabled(Boolean value) { this.Enabled = value; return this; }
        public Boolean isAutoDiscovery() { return AutoDiscovery; }
        public SourceConfiguration setAutoDiscovery(Boolean value) { this.AutoDiscovery = value; return this; }
        public Boolean isDataInUtc() { return DataInUtc; }
        public SourceConfiguration setDataInUtc(Boolean value) { this.DataInUtc = value; return this; }
        public NameSourceEnum getNameSource() { return NameSource; }
        public SourceConfiguration setNameSource(NameSourceEnum value) { this.NameSource = value; return this; }
        public ArrayList<ConnectionOptions> getOptions() { return Options; }
        public SourceConfiguration setOptions(ArrayList<ConnectionOptions> value) { this.Options = value; return this; }
        public dataSourceDefinitionType getSourceSettings() { return SourceSettings; }
        public SourceConfiguration setSourceSettings(dataSourceDefinitionType value) { this.SourceSettings = value; return this; }
        public String getRemoteOpcHost() { return RemoteOpcHost; }
        public SourceConfiguration setRemoteOpcHost(String value) { this.RemoteOpcHost = value; return this; }
        public String getPathDelimiter() { return PathDelimiter; }
        public SourceConfiguration setPathDelimiter(String value) { this.PathDelimiter = value; return this; }
    }

    public static class ReflectionConfig
    {
        public Boolean Enabled = null;
        
        public Boolean isEnabled() { return Enabled; }
        public ReflectionConfig setEnabled(Boolean value) { this.Enabled = value; return this; }
    }

    public static class dataSourceConnectionType
    {
        public ArrayList<String> discoveryStack = null;
        public String location = null;
        public String identifier = null;
        public dataSourceDefinitionType dataSourceType = null;
        
        public ArrayList<String> getDiscoveryStack() { return discoveryStack; }
        public dataSourceConnectionType setDiscoveryStack(ArrayList<String> value) { this.discoveryStack = value; return this; }
        public String getLocation() { return location; }
        public dataSourceConnectionType setLocation(String value) { this.location = value; return this; }
        public String getIdentifier() { return identifier; }
        public dataSourceConnectionType setIdentifier(String value) { this.identifier = value; return this; }
        public dataSourceDefinitionType getDataSourceType() { return dataSourceType; }
        public dataSourceConnectionType setDataSourceType(dataSourceDefinitionType value) { this.dataSourceType = value; return this; }
    }

    public static class dataSourceDefinitionType
    {
        public dataSourceTypeEnum type = null;
        public String typeNameOnOther = null;
        
        public dataSourceTypeEnum getType() { return type; }
        public dataSourceDefinitionType setType(dataSourceTypeEnum value) { this.type = value; return this; }
        public String getTypeNameOnOther() { return typeNameOnOther; }
        public dataSourceDefinitionType setTypeNameOnOther(String value) { this.typeNameOnOther = value; return this; }
    }

    public static class browseEntryType
    {
        public browseEntryTypeEnum type = null;
        public itemInfoType item = null;
        public ArrayList<itemInfoType> elements = null;
        public ArrayList<browseEntryType> subPaths = null;
        
        public browseEntryTypeEnum getType() { return type; }
        public browseEntryType setType(browseEntryTypeEnum value) { this.type = value; return this; }
        public itemInfoType getItem() { return item; }
        public browseEntryType setItem(itemInfoType value) { this.item = value; return this; }
        public ArrayList<itemInfoType> getElements() { return elements; }
        public browseEntryType setElements(ArrayList<itemInfoType> value) { this.elements = value; return this; }
        public ArrayList<browseEntryType> getSubPaths() { return subPaths; }
        public browseEntryType setSubPaths(ArrayList<browseEntryType> value) { this.subPaths = value; return this; }
    }

    public static class dataSourceSeekerType
    {
        public Integer blockSize = null;
        public Integer seekPos = null;
        public Boolean complete = null;
        
        public Integer getBlockSize() { return blockSize; }
        public dataSourceSeekerType setBlockSize(Integer value) { this.blockSize = value; return this; }
        public Integer getSeekPos() { return seekPos; }
        public dataSourceSeekerType setSeekPos(Integer value) { this.seekPos = value; return this; }
        public Boolean isComplete() { return complete; }
        public dataSourceSeekerType setComplete(Boolean value) { this.complete = value; return this; }
    }

    public static class freeformTimeType
    {
        public String time = null;
        public String freeform = null;
        public Date UserTime = null;
        public Date UTCTime = null;
        
        public String getTime() { return time; }
        public freeformTimeType setTime(String value) { this.time = value; return this; }
        public String getFreeform() { return freeform; }
        public freeformTimeType setFreeform(String value) { this.freeform = value; return this; }
        public Date getUserTime() { return UserTime; }
        public freeformTimeType setUserTime(Date value) { this.UserTime = value; return this; }
        public Date getUtcTime() { return UTCTime; }
        public freeformTimeType setUtcTime(Date value) { this.UTCTime = value; return this; }
    }

    public static class itemType
    {
        public String name = null;
        public itemTypeEnum type = null;
        
        public String getName() { return name; }
        public itemType setName(String value) { this.name = value; return this; }
        public itemTypeEnum getType() { return type; }
        public itemType setType(itemTypeEnum value) { this.type = value; return this; }
    }

    public static class attributeType
    {
        public String name = null;
        public String value = null;
        
        public String getName() { return name; }
        public attributeType setName(String value) { this.name = value; return this; }
        public String getValue() { return value; }
        public attributeType setValue(String value) { this.value = value; return this; }
    }

    public static class itemInfoType
    {
        public String name = null;
        public String displayName = null;
        public String alias = null;
        public String comment = null;
        public String engineeringUnit = null;
        
        public String getName() { return name; }
        public itemInfoType setName(String value) { this.name = value; return this; }
        public String getDisplayName() { return displayName; }
        public itemInfoType setDisplayName(String value) { this.displayName = value; return this; }
        public String getAlias() { return alias; }
        public itemInfoType setAlias(String value) { this.alias = value; return this; }
        public String getComment() { return comment; }
        public itemInfoType setComment(String value) { this.comment = value; return this; }
        public String getEngineeringUnit() { return engineeringUnit; }
        public itemInfoType setEngineeringUnit(String value) { this.engineeringUnit = value; return this; }
    }

    public static class optionType
    {
        public String name = null;
        public String value = null;
        public String description = null;
        
        public String getName() { return name; }
        public optionType setName(String value) { this.name = value; return this; }
        public String getValue() { return value; }
        public optionType setValue(String value) { this.value = value; return this; }
        public String getDescription() { return description; }
        public optionType setDescription(String value) { this.description = value; return this; }
    }

    public static class dataSourceType
    {
        public dataSourceConnectionType dataSourceConnection = null;
        public outputDataSourceType outputDataSource = null;
        public itemCollectionType itemCollection = null;
        public unsortedFetchEnum unsortedFetch = null;
        public ArrayList<Integer> itemMapping = null;
        public IDataSourceManager sourceManager = null;
        
        public dataSourceConnectionType getDataSourceConnection() { return dataSourceConnection; }
        public dataSourceType setDataSourceConnection(dataSourceConnectionType value) { this.dataSourceConnection = value; return this; }
        public outputDataSourceType getOutputDataSource() { return outputDataSource; }
        public dataSourceType setOutputDataSource(outputDataSourceType value) { this.outputDataSource = value; return this; }
        public itemCollectionType getItemCollection() { return itemCollection; }
        public dataSourceType setItemCollection(itemCollectionType value) { this.itemCollection = value; return this; }
        public unsortedFetchEnum getUnsortedFetch() { return unsortedFetch; }
        public dataSourceType setUnsortedFetch(unsortedFetchEnum value) { this.unsortedFetch = value; return this; }
        public ArrayList<Integer> getItemMapping() { return itemMapping; }
        public dataSourceType setItemMapping(ArrayList<Integer> value) { this.itemMapping = value; return this; }
        public IDataSourceManager getSourceManager() { return sourceManager; }
        public dataSourceType setSourceManager(IDataSourceManager value) { this.sourceManager = value; return this; }
    }

    public static enum DataManagerItemTypeEnum
    {
        Color,
        Integer,
        Float,
        DateTime,
        TimeSpan,
        String,
        Boolean,
        Unknown,
        State;
    }

    public static class DataManagerAttribute
    {
        public String Name = null;
        public String Value = null;
        
        public String getName() { return Name; }
        public DataManagerAttribute setName(String value) { this.Name = value; return this; }
        public String getValue() { return Value; }
        public DataManagerAttribute setValue(String value) { this.Value = value; return this; }
    }

    public static class DataSeeker
    {
        public Integer BlockSize = null;
        public Integer SeekPos = null;
        public Boolean Complete = null;
        
        public Integer getBlockSize() { return BlockSize; }
        public DataSeeker setBlockSize(Integer value) { this.BlockSize = value; return this; }
        public Integer getSeekPos() { return SeekPos; }
        public DataSeeker setSeekPos(Integer value) { this.SeekPos = value; return this; }
        public Boolean isComplete() { return Complete; }
        public DataSeeker setComplete(Boolean value) { this.Complete = value; return this; }
    }

    public static class FetchedDataRow
    {
        public ArrayList<Variant> Columns = null;
        
        public ArrayList<Variant> getColumns() { return Columns; }
        public FetchedDataRow setColumns(ArrayList<Variant> value) { this.Columns = value; return this; }
    }

    public static class PrimitiveEx extends GuiCalcBase
    {
        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public CalcBlockType CalculationType = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public CalcNodeEx Expression = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public String Category = null;

        public Boolean Placeholder = null;
        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public String InitialName = null;
        
        public CalcBlockType getCalculationType() { return CalculationType; }
        public PrimitiveEx setCalculationType(CalcBlockType value) { this.CalculationType = value; return this; }
        public CalcNodeEx getExpression() { return Expression; }
        public PrimitiveEx setExpression(CalcNodeEx value) { this.Expression = value; return this; }
        public String getCategory() { return Category; }
        public PrimitiveEx setCategory(String value) { this.Category = value; return this; }
        public Boolean isPlaceholder() { return Placeholder; }
        public PrimitiveEx setPlaceholder(Boolean value) { this.Placeholder = value; return this; }
        public String getInitialName() { return InitialName; }
        public PrimitiveEx setInitialName(String value) { this.InitialName = value; return this; }
    }

    public static class CalcNodeEx
    {
        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public String Name = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public String UUID = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public String ParentUUID = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public ArrayList<String> InputUuids = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public ArrayList<String> OutputUuids = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public CalcNodeType Type = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public String DataType = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public CalcExpressionType Expressiontype = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public String Expression = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public Variant Value = null;

        public CodeSettings Codesettings = null;
        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public Boolean AppendNode = null;
        
        public String getName() { return Name; }
        public CalcNodeEx setName(String value) { this.Name = value; return this; }
        public String getUuid() { return UUID; }
        public CalcNodeEx setUuid(String value) { this.UUID = value; return this; }
        public String getParentUUID() { return ParentUUID; }
        public CalcNodeEx setParentUUID(String value) { this.ParentUUID = value; return this; }
        public ArrayList<String> getInputUuids() { return InputUuids; }
        public CalcNodeEx setInputUuids(ArrayList<String> value) { this.InputUuids = value; return this; }
        public ArrayList<String> getOutputUuids() { return OutputUuids; }
        public CalcNodeEx setOutputUuids(ArrayList<String> value) { this.OutputUuids = value; return this; }
        public CalcNodeType getType() { return Type; }
        public CalcNodeEx setType(CalcNodeType value) { this.Type = value; return this; }
        public String getDataType() { return DataType; }
        public CalcNodeEx setDataType(String value) { this.DataType = value; return this; }
        public CalcExpressionType getExpressiontype() { return Expressiontype; }
        public CalcNodeEx setExpressiontype(CalcExpressionType value) { this.Expressiontype = value; return this; }
        public String getExpression() { return Expression; }
        public CalcNodeEx setExpression(String value) { this.Expression = value; return this; }
        public Variant getValue() { return Value; }
        public CalcNodeEx setValue(Variant value) { this.Value = value; return this; }
        public CodeSettings getCodesettings() { return Codesettings; }
        public CalcNodeEx setCodesettings(CodeSettings value) { this.Codesettings = value; return this; }
        public Boolean isAppendNode() { return AppendNode; }
        public CalcNodeEx setAppendNode(Boolean value) { this.AppendNode = value; return this; }
    }

    public static class GuiCalcBase extends CalcBase
    {
        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public String Description = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public Integer PositionX = null;

        public Integer PositionY = null;
        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public Integer BaseColor = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public Integer TextColor = null;
        
        public String getDescription() { return Description; }
        public GuiCalcBase setDescription(String value) { this.Description = value; return this; }
        public Integer getPositionX() { return PositionX; }
        public GuiCalcBase setPositionX(Integer value) { this.PositionX = value; return this; }
        public Integer getPositionY() { return PositionY; }
        public GuiCalcBase setPositionY(Integer value) { this.PositionY = value; return this; }
        public Integer getBaseColor() { return BaseColor; }
        public GuiCalcBase setBaseColor(Integer value) { this.BaseColor = value; return this; }
        public Integer getTextColor() { return TextColor; }
        public GuiCalcBase setTextColor(Integer value) { this.TextColor = value; return this; }
    }

    public static enum VariantType
    {
        NotSet(0),
        Int16(2),
        Int32(3),
        Float32(4),
        Double64(5),
        Currency(6),
        Date(7),
        String(8),
        Bool(11),
        Decimal(14),
        Int8(16),
        UInt8(17),
        UInt16(18),
        UInt32(19),
        Int64(20),
        UInt64(21),
        HdaEvent(22);

        private final int value;
        VariantType(final int intValue) { value = intValue; }
        public int getValue() { return value; }
    }

    public static class CalculationSchedule
    {
        public String TaskName = null;
        public String CalculationPath = null;
        public ArrayList<String> PlaceholderNames = null;
        public ArrayList<ItemDataType> PlaceholderValues = null;
        public String Schedule = null;
        public Boolean Enabled = null;
        
        public String getTaskName() { return TaskName; }
        public CalculationSchedule setTaskName(String value) { this.TaskName = value; return this; }
        public String getCalculationPath() { return CalculationPath; }
        public CalculationSchedule setCalculationPath(String value) { this.CalculationPath = value; return this; }
        public ArrayList<String> getPlaceholderNames() { return PlaceholderNames; }
        public CalculationSchedule setPlaceholderNames(ArrayList<String> value) { this.PlaceholderNames = value; return this; }
        public ArrayList<ItemDataType> getPlaceholderValues() { return PlaceholderValues; }
        public CalculationSchedule setPlaceholderValues(ArrayList<ItemDataType> value) { this.PlaceholderValues = value; return this; }
        public String getSchedule() { return Schedule; }
        public CalculationSchedule setSchedule(String value) { this.Schedule = value; return this; }
        public Boolean isEnabled() { return Enabled; }
        public CalculationSchedule setEnabled(Boolean value) { this.Enabled = value; return this; }
    }

    public static class CalculationScheduleInfo
    {
        public Boolean Enabled = null;
        public String Name = null;
        public String CalculationName = null;
        public Date PreviousRunTime = null;
        public Date NextRunTime = null;
        public String TriggerState = null;
        public CalculationRunLog LastRunLog = null;
        
        public Boolean isEnabled() { return Enabled; }
        public CalculationScheduleInfo setEnabled(Boolean value) { this.Enabled = value; return this; }
        public String getName() { return Name; }
        public CalculationScheduleInfo setName(String value) { this.Name = value; return this; }
        public String getCalculationName() { return CalculationName; }
        public CalculationScheduleInfo setCalculationName(String value) { this.CalculationName = value; return this; }
        public Date getPreviousRunTime() { return PreviousRunTime; }
        public CalculationScheduleInfo setPreviousRunTime(Date value) { this.PreviousRunTime = value; return this; }
        public Date getNextRunTime() { return NextRunTime; }
        public CalculationScheduleInfo setNextRunTime(Date value) { this.NextRunTime = value; return this; }
        public String getTriggerState() { return TriggerState; }
        public CalculationScheduleInfo setTriggerState(String value) { this.TriggerState = value; return this; }
        public CalculationRunLog getLastRunLog() { return LastRunLog; }
        public CalculationScheduleInfo setLastRunLog(CalculationRunLog value) { this.LastRunLog = value; return this; }
    }

    public static class CalculationRunLog
    {
        public String Name = null;
        public Date RunTime = null;
        public TimeSpan Duration = null;
        public EvaluationResult Log = null;
        
        public String getName() { return Name; }
        public CalculationRunLog setName(String value) { this.Name = value; return this; }
        public Date getRunTime() { return RunTime; }
        public CalculationRunLog setRunTime(Date value) { this.RunTime = value; return this; }
        public TimeSpan getDuration() { return Duration; }
        public CalculationRunLog setDuration(TimeSpan value) { this.Duration = value; return this; }
        public EvaluationResult getLog() { return Log; }
        public CalculationRunLog setLog(EvaluationResult value) { this.Log = value; return this; }
    }

    public static class InfoModelElementListing
    {
        public String Path = null;
        public Boolean HasChildren = null;
        public Boolean IsSymbolicLink = null;
        
        public String getPath() { return Path; }
        public InfoModelElementListing setPath(String value) { this.Path = value; return this; }
        public Boolean isHasChildren() { return HasChildren; }
        public InfoModelElementListing setHasChildren(Boolean value) { this.HasChildren = value; return this; }
        public Boolean getIsSymbolicLink() { return IsSymbolicLink; }
        public InfoModelElementListing setIsSymbolicLink(Boolean value) { this.IsSymbolicLink = value; return this; }
    }

    public static enum InfoModelTypeEnum
    {
        Model,
        Instance;
    }

    public static class InfoModelAttributeGroup
    {
        public String Name = null;
        public ArrayList<InfoModelAttribute> Attributes = null;
        
        public String getName() { return Name; }
        public InfoModelAttributeGroup setName(String value) { this.Name = value; return this; }
        public ArrayList<InfoModelAttribute> getAttributes() { return Attributes; }
        public InfoModelAttributeGroup setAttributes(ArrayList<InfoModelAttribute> value) { this.Attributes = value; return this; }
    }

    public static class InfoModelResolutionInfo
    {
        /**
        * Model placeholder text (i.e. {1})
        */
        @ApiMember(Description="Model placeholder text (i.e. {1})", ParameterType="body", DataType="string", IsRequired=true)
        public String ModelText = null;

        /**
        * Instance value to be replaced (placeholder)
        */
        @ApiMember(Description="Instance value to be replaced (placeholder)", ParameterType="body", DataType="string", IsRequired=true)
        public String InstanceText = null;

        /**
        * 
        */
        @ApiMember(Description="", ParameterType="body", DataType="string", IsRequired=true)
        public String Expresssion = null;
        
        public String getModelText() { return ModelText; }
        public InfoModelResolutionInfo setModelText(String value) { this.ModelText = value; return this; }
        public String getInstanceText() { return InstanceText; }
        public InfoModelResolutionInfo setInstanceText(String value) { this.InstanceText = value; return this; }
        public String getExpresssion() { return Expresssion; }
        public InfoModelResolutionInfo setExpresssion(String value) { this.Expresssion = value; return this; }
    }

    public static class InfoModelUpdateOptions
    {
        /**
        * The specifications to perform on the element
        */
        @ApiMember(Description="The specifications to perform on the element", ParameterType="body", DataType="array")
        public UpdateBundle UpdateBundle = null;

        /**
        * The path of the element to update
        */
        @ApiMember(Description="The path of the element to update", ParameterType="body", DataType="string", IsRequired=true)
        public String Path = null;

        /**
        * The current timestamp of the element to update
        */
        @ApiMember(Description="The current timestamp of the element to update", ParameterType="body", DataType="long", IsRequired=true)
        public Long Timestamp = null;

        /**
        * Force overwrite. Deletes existing element if paths clash. Timestamp will also be ignored.
        */
        @ApiMember(Description="Force overwrite. Deletes existing element if paths clash. Timestamp will also be ignored.", ParameterType="body", DataType="bool")
        public Boolean Overwrite = null;
        
        public UpdateBundle getUpdateBundle() { return UpdateBundle; }
        public InfoModelUpdateOptions setUpdateBundle(UpdateBundle value) { this.UpdateBundle = value; return this; }
        public String getPath() { return Path; }
        public InfoModelUpdateOptions setPath(String value) { this.Path = value; return this; }
        public Long getTimestamp() { return Timestamp; }
        public InfoModelUpdateOptions setTimestamp(Long value) { this.Timestamp = value; return this; }
        public Boolean isOverwrite() { return Overwrite; }
        public InfoModelUpdateOptions setOverwrite(Boolean value) { this.Overwrite = value; return this; }
    }

    public static class InfoModelAttribute
    {
        /**
        * The name of the attribute
        */
        @ApiMember(Description="The name of the attribute", ParameterType="body", DataType="string", IsRequired=true)
        public String Name = null;

        /**
        * The fully qualified path of the attribute. Not stored in database. Populated on reads.
        */
        @ApiMember(Description="The fully qualified path of the attribute. Not stored in database. Populated on reads.", ParameterType="body", DataType="string", IsRequired=true)
        public String FullyQualifiedPath = null;

        /**
        * Specifies whether model inherits or owns the attribute. Not stored in database.
        */
        @ApiMember(Description="Specifies whether model inherits or owns the attribute. Not stored in database.", ParameterType="body", DataType="bool", IsRequired=true)
        public Boolean IsInherited = null;

        /**
        * Specifies whether the inherited attribute is overriden.
        */
        @ApiMember(Description="Specifies whether the inherited attribute is overriden.", ParameterType="body", DataType="bool", IsRequired=true)
        public Boolean IsOverridden = null;

        /**
        * The Description of the attribute.
        */
        @ApiMember(Description="The Description of the attribute.", ParameterType="body", DataType="string", IsRequired=true)
        public String Description = null;

        /**
        * Engingeering class and unit of the attribute
        */
        @ApiMember(Description="Engingeering class and unit of the attribute", ParameterType="body", DataType="string", IsRequired=true)
        public String EngineeringUnit = null;

        public AttributeValue Value = null;
        /**
        * Indicate whether the attributes should be displayed by default
        */
        @ApiMember(Description="Indicate whether the attributes should be displayed by default", ParameterType="body", DataType="bool", IsRequired=true)
        public Boolean Enabled = null;
        
        public String getName() { return Name; }
        public InfoModelAttribute setName(String value) { this.Name = value; return this; }
        public String getFullyQualifiedPath() { return FullyQualifiedPath; }
        public InfoModelAttribute setFullyQualifiedPath(String value) { this.FullyQualifiedPath = value; return this; }
        public Boolean getIsInherited() { return IsInherited; }
        public InfoModelAttribute setIsInherited(Boolean value) { this.IsInherited = value; return this; }
        public Boolean getIsOverridden() { return IsOverridden; }
        public InfoModelAttribute setIsOverridden(Boolean value) { this.IsOverridden = value; return this; }
        public String getDescription() { return Description; }
        public InfoModelAttribute setDescription(String value) { this.Description = value; return this; }
        public String getEngineeringUnit() { return EngineeringUnit; }
        public InfoModelAttribute setEngineeringUnit(String value) { this.EngineeringUnit = value; return this; }
        public AttributeValue getValue() { return Value; }
        public InfoModelAttribute setValue(AttributeValue value) { this.Value = value; return this; }
        public Boolean isEnabled() { return Enabled; }
        public InfoModelAttribute setEnabled(Boolean value) { this.Enabled = value; return this; }
    }

    public static class SearchParams
    {
        /**
        * The root path from where to begin searching.
        */
        @ApiMember(Description="The root path from where to begin searching.", ParameterType="body", DataType="string", IsRequired=true)
        public ArrayList<String> SearchPath = null;

        /**
        * The model/instance name to search. Regex supported
        */
        @ApiMember(Description="The model/instance name to search. Regex supported", ParameterType="body", DataType="string", IsRequired=true)
        public ArrayList<String> ElementName = null;

        /**
        * The instances which inherit the model name. Regex supported
        */
        @ApiMember(Description="The instances which inherit the model name. Regex supported", ParameterType="body", DataType="string", IsRequired=true)
        public ArrayList<String> ModelName = null;

        /**
        * The instances which inherit the model path. Regex supported
        */
        @ApiMember(Description="The instances which inherit the model path. Regex supported", ParameterType="body", DataType="string", IsRequired=true)
        public ArrayList<String> ModelPath = null;

        /**
        * The elements which are symbolic links. Regex supported
        */
        @ApiMember(Description="The elements which are symbolic links. Regex supported", ParameterType="body", DataType="string", IsRequired=true)
        public ArrayList<String> SymbolicLink = null;

        /**
        * The attribute name to search. Regex supported
        */
        @ApiMember(Description="The attribute name to search. Regex supported", ParameterType="body", DataType="string", IsRequired=true)
        public ArrayList<String> AttributeName = null;

        /**
        * The attribute fully qualified path to search. Regex supported
        */
        @ApiMember(Description="The attribute fully qualified path to search. Regex supported", ParameterType="body", DataType="string", IsRequired=true)
        public ArrayList<String> AttributeFullyQualifiedPath = null;

        /**
        * The Description to search. Regex supported
        */
        @ApiMember(Description="The Description to search. Regex supported", ParameterType="body", DataType="string", IsRequired=true)
        public ArrayList<String> Description = null;

        /**
        * Whether to skip resolving the last part of the input paths.
        */
        @ApiMember(Description="Whether to skip resolving the last part of the input paths.", ParameterType="body", DataType="bool", IsRequired=true)
        public Boolean PreserveNamePart = null;

        /**
        * Instead of treating the search arrays as being ANDED, they are fully ORed
        */
        @ApiMember(Description="Instead of treating the search arrays as being ANDED, they are fully ORed", ParameterType="body", DataType="bool", IsRequired=true)
        public Boolean FullUnion = null;
        
        public ArrayList<String> getSearchPath() { return SearchPath; }
        public SearchParams setSearchPath(ArrayList<String> value) { this.SearchPath = value; return this; }
        public ArrayList<String> getElementName() { return ElementName; }
        public SearchParams setElementName(ArrayList<String> value) { this.ElementName = value; return this; }
        public ArrayList<String> getModelName() { return ModelName; }
        public SearchParams setModelName(ArrayList<String> value) { this.ModelName = value; return this; }
        public ArrayList<String> getModelPath() { return ModelPath; }
        public SearchParams setModelPath(ArrayList<String> value) { this.ModelPath = value; return this; }
        public ArrayList<String> getSymbolicLink() { return SymbolicLink; }
        public SearchParams setSymbolicLink(ArrayList<String> value) { this.SymbolicLink = value; return this; }
        public ArrayList<String> getAttributeName() { return AttributeName; }
        public SearchParams setAttributeName(ArrayList<String> value) { this.AttributeName = value; return this; }
        public ArrayList<String> getAttributeFullyQualifiedPath() { return AttributeFullyQualifiedPath; }
        public SearchParams setAttributeFullyQualifiedPath(ArrayList<String> value) { this.AttributeFullyQualifiedPath = value; return this; }
        public ArrayList<String> getDescription() { return Description; }
        public SearchParams setDescription(ArrayList<String> value) { this.Description = value; return this; }
        public Boolean isPreserveNamePart() { return PreserveNamePart; }
        public SearchParams setPreserveNamePart(Boolean value) { this.PreserveNamePart = value; return this; }
        public Boolean isFullUnion() { return FullUnion; }
        public SearchParams setFullUnion(Boolean value) { this.FullUnion = value; return this; }
    }

    public static class InfoModelElementNode
    {
        public InfoModelElementListing Element = null;
        public ArrayList<InfoModelElementNode> ChildNodes = null;
        public Boolean Matched = null;
        
        public InfoModelElementListing getElement() { return Element; }
        public InfoModelElementNode setElement(InfoModelElementListing value) { this.Element = value; return this; }
        public ArrayList<InfoModelElementNode> getChildNodes() { return ChildNodes; }
        public InfoModelElementNode setChildNodes(ArrayList<InfoModelElementNode> value) { this.ChildNodes = value; return this; }
        public Boolean isMatched() { return Matched; }
        public InfoModelElementNode setMatched(Boolean value) { this.Matched = value; return this; }
    }

    public static class InfoModelHdaSettings
    {
        public String ServerToken = null;
        public String FullyQualifiedName = null;
        public AggregateEnum Aggregate = null;
        public ResampleAlgorithmEnum ResampleAlgorithm = null;
        public ResampleIntervalEnum ResampleUnits = null;
        public Long ResampleInterval = null;
        public Boolean RawBounds = null;
        public AutomsoftTime StartTime = null;
        public AutomsoftTime EndTime = null;
        
        public String getServerToken() { return ServerToken; }
        public InfoModelHdaSettings setServerToken(String value) { this.ServerToken = value; return this; }
        public String getFullyQualifiedName() { return FullyQualifiedName; }
        public InfoModelHdaSettings setFullyQualifiedName(String value) { this.FullyQualifiedName = value; return this; }
        public AggregateEnum getAggregate() { return Aggregate; }
        public InfoModelHdaSettings setAggregate(AggregateEnum value) { this.Aggregate = value; return this; }
        public ResampleAlgorithmEnum getResampleAlgorithm() { return ResampleAlgorithm; }
        public InfoModelHdaSettings setResampleAlgorithm(ResampleAlgorithmEnum value) { this.ResampleAlgorithm = value; return this; }
        public ResampleIntervalEnum getResampleUnits() { return ResampleUnits; }
        public InfoModelHdaSettings setResampleUnits(ResampleIntervalEnum value) { this.ResampleUnits = value; return this; }
        public Long getResampleInterval() { return ResampleInterval; }
        public InfoModelHdaSettings setResampleInterval(Long value) { this.ResampleInterval = value; return this; }
        public Boolean isRawBounds() { return RawBounds; }
        public InfoModelHdaSettings setRawBounds(Boolean value) { this.RawBounds = value; return this; }
        public AutomsoftTime getStartTime() { return StartTime; }
        public InfoModelHdaSettings setStartTime(AutomsoftTime value) { this.StartTime = value; return this; }
        public AutomsoftTime getEndTime() { return EndTime; }
        public InfoModelHdaSettings setEndTime(AutomsoftTime value) { this.EndTime = value; return this; }
    }

    public static class InfoModelImageSettings
    {
        public String Id = null;
        public String Base64 = null;
        public String FileExtension = null;
        
        public String getId() { return Id; }
        public InfoModelImageSettings setId(String value) { this.Id = value; return this; }
        public String getBase64() { return Base64; }
        public InfoModelImageSettings setBase64(String value) { this.Base64 = value; return this; }
        public String getFileExtension() { return FileExtension; }
        public InfoModelImageSettings setFileExtension(String value) { this.FileExtension = value; return this; }
    }

    public static enum ItemTypeEnum2
    {
        Color,
        Integer,
        Float,
        DateTime,
        TimeSpan,
        String,
        Boolean,
        Unknown;
    }

    public static enum ServerTypeEnum
    {
        AutomsoftHda,
        Hda,
        Da,
        Ae,
        Sql;
    }

    public static enum DiscoveryBrowseNodeTypeEnum
    {
        Server,
        Node,
        Item;
    }

    public static class ServerOption
    {
        public String DbId = null;
        public String Description = null;
        public String Value = null;
        public String Name = null;
        
        public String getDbId() { return DbId; }
        public ServerOption setDbId(String value) { this.DbId = value; return this; }
        public String getDescription() { return Description; }
        public ServerOption setDescription(String value) { this.Description = value; return this; }
        public String getValue() { return Value; }
        public ServerOption setValue(String value) { this.Value = value; return this; }
        public String getName() { return Name; }
        public ServerOption setName(String value) { this.Name = value; return this; }
    }

    public static enum SearchTypeEnum
    {
        Name,
        Comment,
        Alias,
        Unit;
    }

    public static enum SearchScopeEnum
    {
        Is,
        IsNot,
        Contains,
        StartsWith,
        EndsWith,
        Excludes;
    }

    public static enum LinkTypes
    {
        Template,
        Url;
    }

    public static class PasswordComplexity
    {
        public Boolean upper = null;
        public Boolean lower = null;
        public Boolean numeric = null;
        public Boolean special = null;
        
        public Boolean isUpper() { return upper; }
        public PasswordComplexity setUpper(Boolean value) { this.upper = value; return this; }
        public Boolean isLower() { return lower; }
        public PasswordComplexity setLower(Boolean value) { this.lower = value; return this; }
        public Boolean isNumeric() { return numeric; }
        public PasswordComplexity setNumeric(Boolean value) { this.numeric = value; return this; }
        public Boolean isSpecial() { return special; }
        public PasswordComplexity setSpecial(Boolean value) { this.special = value; return this; }
    }

    public static enum fileType
    {
        File,
        Folder;
    }

    public static class versionInfoType
    {
        public String revision = null;
        public String comment = null;
        public String label = null;
        public String username = null;
        public String creationDate = null;
        
        public String getRevision() { return revision; }
        public versionInfoType setRevision(String value) { this.revision = value; return this; }
        public String getComment() { return comment; }
        public versionInfoType setComment(String value) { this.comment = value; return this; }
        public String getLabel() { return label; }
        public versionInfoType setLabel(String value) { this.label = value; return this; }
        public String getUsername() { return username; }
        public versionInfoType setUsername(String value) { this.username = value; return this; }
        public String getCreationDate() { return creationDate; }
        public versionInfoType setCreationDate(String value) { this.creationDate = value; return this; }
    }

    public static enum dataType
    {
        Gif,
        Pdf,
        PostScript,
        Template,
        Report,
        Png,
        Emf,
        X509Certificate,
        RsaPrivateKey,
        NotSet;
    }

    public static enum NameSourceEnum
    {
        Name,
        Alias,
        Comment;
    }

    public static class ConnectionOptions
    {
        public String ConnectionIdentifier = null;
        public String Location = null;
        public String ConnectionString = null;
        public String NameStartDelimiter = null;
        public String NameEndDelimiter = null;
        
        public String getConnectionIdentifier() { return ConnectionIdentifier; }
        public ConnectionOptions setConnectionIdentifier(String value) { this.ConnectionIdentifier = value; return this; }
        public String getLocation() { return Location; }
        public ConnectionOptions setLocation(String value) { this.Location = value; return this; }
        public String getConnectionString() { return ConnectionString; }
        public ConnectionOptions setConnectionString(String value) { this.ConnectionString = value; return this; }
        public String getNameStartDelimiter() { return NameStartDelimiter; }
        public ConnectionOptions setNameStartDelimiter(String value) { this.NameStartDelimiter = value; return this; }
        public String getNameEndDelimiter() { return NameEndDelimiter; }
        public ConnectionOptions setNameEndDelimiter(String value) { this.NameEndDelimiter = value; return this; }
    }

    public static enum dataSourceTypeEnum
    {
        Opcae,
        OpcdA2,
        OpcdA3,
        OpchdA1,
        Hdaae,
        Mssql,
        Oracle,
        Odbc,
        Oledb,
        Renderer,
        InfoModelAttribute,
        Other;
    }

    public static enum browseEntryTypeEnum
    {
        ItemCollection,
        Path,
        PathPart;
    }

    public static enum itemTypeEnum
    {
        Color,
        Integer,
        Float,
        DateTime,
        TimeSpan,
        String,
        Boolean,
        Unknown,
        State;
    }

    public static class outputDataSourceType
    {
        public dataSourceConnectionType dataSourceConnection = null;
        public itemCollectionType itemCollection = null;
        public ArrayList<Integer> itemMapping = null;
        
        public dataSourceConnectionType getDataSourceConnection() { return dataSourceConnection; }
        public outputDataSourceType setDataSourceConnection(dataSourceConnectionType value) { this.dataSourceConnection = value; return this; }
        public itemCollectionType getItemCollection() { return itemCollection; }
        public outputDataSourceType setItemCollection(itemCollectionType value) { this.itemCollection = value; return this; }
        public ArrayList<Integer> getItemMapping() { return itemMapping; }
        public outputDataSourceType setItemMapping(ArrayList<Integer> value) { this.itemMapping = value; return this; }
    }

    public static enum unsortedFetchEnum
    {
        FetchOneRow,
        FetchAllRows;
    }

    public static interface IDataSourceManager
    {
    }

    public static enum CalcBlockType
    {
        Default,
        Query,
        Insertion,
        Outputvariable,
        Inputvariable,
        Demultiplexer,
        Multiplexer,
        Code,
        InputParameter,
        Calcrunnercalc,
        FleeExpression,
        Conditionalstop,
        OutputParameter;
    }

    public static enum CalcNodeType
    {
        Input,
        Expression,
        Output;
    }

    public static enum CalcExpressionType
    {
        Flee,
        Variable,
        Query,
        Insertion,
        Switch,
        Code,
        Append,
        OutParm,
        Calcrunnercalc,
        InParm;
    }

    public static class CodeSettings
    {
        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public String FunctionName = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public String GeneratedClass = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public ArrayList<Short> AssemblyData = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public String CodeText = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public CodeLanguage Language = null;
        
        public String getFunctionName() { return FunctionName; }
        public CodeSettings setFunctionName(String value) { this.FunctionName = value; return this; }
        public String getGeneratedClass() { return GeneratedClass; }
        public CodeSettings setGeneratedClass(String value) { this.GeneratedClass = value; return this; }
        public ArrayList<Short> getAssemblyData() { return AssemblyData; }
        public CodeSettings setAssemblyData(ArrayList<Short> value) { this.AssemblyData = value; return this; }
        public String getCodeText() { return CodeText; }
        public CodeSettings setCodeText(String value) { this.CodeText = value; return this; }
        public CodeLanguage getLanguage() { return Language; }
        public CodeSettings setLanguage(CodeLanguage value) { this.Language = value; return this; }
    }

    public static class CalcBase
    {
        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public String Name = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public String UUID = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public String ParentUUID = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public ArrayList<CalcNodeEx> Inputs = null;

        /**
        * TODO
        */
        @ApiMember(Description="TODO", ParameterType="body", DataType="string")
        public ArrayList<CalcNodeEx> Outputs = null;
        
        public String getName() { return Name; }
        public CalcBase setName(String value) { this.Name = value; return this; }
        public String getUuid() { return UUID; }
        public CalcBase setUuid(String value) { this.UUID = value; return this; }
        public String getParentUUID() { return ParentUUID; }
        public CalcBase setParentUUID(String value) { this.ParentUUID = value; return this; }
        public ArrayList<CalcNodeEx> getInputs() { return Inputs; }
        public CalcBase setInputs(ArrayList<CalcNodeEx> value) { this.Inputs = value; return this; }
        public ArrayList<CalcNodeEx> getOutputs() { return Outputs; }
        public CalcBase setOutputs(ArrayList<CalcNodeEx> value) { this.Outputs = value; return this; }
    }

    public static class ItemDataType
    {
        public String ParameterName = null;
        public String StartTime = null;
        public String StopTime = null;
        public InputType_e Type = null;
        public HDASettings HDASettings = null;
        public DALSettings DALSettings = null;
        public SQLSettings SQLSettings = null;
        public ConstSettings ConstSettings = null;
        
        public String getParameterName() { return ParameterName; }
        public ItemDataType setParameterName(String value) { this.ParameterName = value; return this; }
        public String getStartTime() { return StartTime; }
        public ItemDataType setStartTime(String value) { this.StartTime = value; return this; }
        public String getStopTime() { return StopTime; }
        public ItemDataType setStopTime(String value) { this.StopTime = value; return this; }
        public InputType_e getType() { return Type; }
        public ItemDataType setType(InputType_e value) { this.Type = value; return this; }
        public HDASettings getHdaSettings() { return HDASettings; }
        public ItemDataType setHdaSettings(HDASettings value) { this.HDASettings = value; return this; }
        public DALSettings getDalSettings() { return DALSettings; }
        public ItemDataType setDalSettings(DALSettings value) { this.DALSettings = value; return this; }
        public SQLSettings getSqlSettings() { return SQLSettings; }
        public ItemDataType setSqlSettings(SQLSettings value) { this.SQLSettings = value; return this; }
        public ConstSettings getConstSettings() { return ConstSettings; }
        public ItemDataType setConstSettings(ConstSettings value) { this.ConstSettings = value; return this; }
    }

    public static class UpdateBundle
    {
        /**
        * The new path of the element
        */
        @ApiMember(Description="The new path of the element", ParameterType="body", DataType="string")
        public String ElementPath = null;

        /**
        * The model path of the element
        */
        @ApiMember(Description="The model path of the element", ParameterType="body", DataType="string")
        public String ModelPath = null;

        /**
        * Whether the element inherits the parent's attributes
        */
        @ApiMember(Description="Whether the element inherits the parent's attributes", ParameterType="body", DataType="bool")
        public Boolean InheritAttributes = null;

        /**
        * The description of the element
        */
        @ApiMember(Description="The description of the element", ParameterType="body", DataType="string")
        public String Description = null;

        /**
        * Resolution Info
        */
        @ApiMember(Description="Resolution Info", ParameterType="body", DataType="string")
        public ArrayList<InfoModelResolutionInfo> ResolutionInfo = null;

        /**
        * Update Resolution Info if NULL
        */
        @ApiMember(Description="Update Resolution Info if NULL", ParameterType="body", DataType="string")
        public Boolean UpdateResolutionInfoIfNULL = null;

        /**
        * Replaces the existing attributes of the element with the specified attributes 
        */
        @ApiMember(Description="Replaces the existing attributes of the element with the specified attributes ", ParameterType="body", DataType="array")
        public ArrayList<AttributeUpdateOptions> ReplaceAttributeOptions = null;

        /**
        * Update Attributes if NULL
        */
        @ApiMember(Description="Update Attributes if NULL", ParameterType="body", DataType="string")
        public Boolean UpdateAttributesIfNULL = null;
        
        public String getElementPath() { return ElementPath; }
        public UpdateBundle setElementPath(String value) { this.ElementPath = value; return this; }
        public String getModelPath() { return ModelPath; }
        public UpdateBundle setModelPath(String value) { this.ModelPath = value; return this; }
        public Boolean isInheritAttributes() { return InheritAttributes; }
        public UpdateBundle setInheritAttributes(Boolean value) { this.InheritAttributes = value; return this; }
        public String getDescription() { return Description; }
        public UpdateBundle setDescription(String value) { this.Description = value; return this; }
        public ArrayList<InfoModelResolutionInfo> getResolutionInfo() { return ResolutionInfo; }
        public UpdateBundle setResolutionInfo(ArrayList<InfoModelResolutionInfo> value) { this.ResolutionInfo = value; return this; }
        public Boolean isUpdateResolutionInfoIfNULL() { return UpdateResolutionInfoIfNULL; }
        public UpdateBundle setUpdateResolutionInfoIfNULL(Boolean value) { this.UpdateResolutionInfoIfNULL = value; return this; }
        public ArrayList<AttributeUpdateOptions> getReplaceAttributeOptions() { return ReplaceAttributeOptions; }
        public UpdateBundle setReplaceAttributeOptions(ArrayList<AttributeUpdateOptions> value) { this.ReplaceAttributeOptions = value; return this; }
        public Boolean isUpdateAttributesIfNULL() { return UpdateAttributesIfNULL; }
        public UpdateBundle setUpdateAttributesIfNULL(Boolean value) { this.UpdateAttributesIfNULL = value; return this; }
    }

    public static class AttributeValue
    {
        /**
        * The Type of the attribute
        */
        @ApiMember(Description="The Type of the attribute", ParameterType="body", DataType="string", IsRequired=true)
        public InfoModelAttributeType Type = null;

        /**
        * The tag settings for an attribute
        */
        @ApiMember(Description="The tag settings for an attribute", ParameterType="body", DataType="string", IsRequired=true)
        public InfoModelHdaSettings HdaSettings = null;

        /**
        * The constant value settings for an attribute
        */
        @ApiMember(Description="The constant value settings for an attribute", ParameterType="body", DataType="string", IsRequired=true)
        public InfoModelConstantSettings ConstantSettings = null;

        /**
        * The image settings for an attribute
        */
        @ApiMember(Description="The image settings for an attribute", ParameterType="body", DataType="string", IsRequired=true)
        public InfoModelImageSettings ImageSettings = null;

        /**
        * The calculation settings for an attribute
        */
        @ApiMember(Description="The calculation settings for an attribute", ParameterType="body", DataType="string", IsRequired=true)
        public InfoModelCalculationSettings CalculationSettings = null;
        
        public InfoModelAttributeType getType() { return Type; }
        public AttributeValue setType(InfoModelAttributeType value) { this.Type = value; return this; }
        public InfoModelHdaSettings getHdaSettings() { return HdaSettings; }
        public AttributeValue setHdaSettings(InfoModelHdaSettings value) { this.HdaSettings = value; return this; }
        public InfoModelConstantSettings getConstantSettings() { return ConstantSettings; }
        public AttributeValue setConstantSettings(InfoModelConstantSettings value) { this.ConstantSettings = value; return this; }
        public InfoModelImageSettings getImageSettings() { return ImageSettings; }
        public AttributeValue setImageSettings(InfoModelImageSettings value) { this.ImageSettings = value; return this; }
        public InfoModelCalculationSettings getCalculationSettings() { return CalculationSettings; }
        public AttributeValue setCalculationSettings(InfoModelCalculationSettings value) { this.CalculationSettings = value; return this; }
    }

    public static enum AggregateEnum
    {
        OpchdaNoaggregate(0),
        OpchdaInterpolative(1),
        OpchdaTotal(2),
        OpchdaAverage(3),
        OpchdaTimeaverage(4),
        OpchdaCount(5),
        OpchdaStdev(6),
        OpchdaMinimumactualtime(7),
        OpchdaMinimum(8),
        OpchdaMaximumactualtime(9),
        OpchdaMaximum(10),
        OpchdaStart(11),
        OpchdaEnd(12),
        OpchdaDelta(13),
        OpchdaRegslope(14),
        OpchdaRegconst(15),
        OpchdaVariance(17),
        OpchdaRange(18),
        OpchdaDurationgood(19),
        OpchdaDurationbad(20),
        OpchdaPercentgood(21),
        OpchdaPercentbad(22),
        OpchdaWorstquality(23),
        RhhdaAggTimeAtMin(100),
        RhhdaAggTimeAtMax(101),
        RhhdaAggIgnoreNegatives(102),
        RhhdaMinimumbatch(103),
        RhhdaMaximumbatch(104),
        RhhdaMinimumactualtimebatch(105),
        RhhdaMaximumactualtimebatch(106),
        RhhdaDeltabatch(107),
        RhhdaRangebatch(108),
        RhhdaAggTimeAtMinbatch(109),
        RhhdaAggTimeAtMaxbatch(110),
        RhhdaAggSumOfPositiveDeltas(111),
        RhhdaLinearinterpolative(112),
        RhhdaLineartotal(113),
        RhhdaLineartimeaverage(114),
        RhhdaTimeaveragewithquality(115),
        RhhdaSumOfAllValues(116),
        RhhdaPlotvalues(120);

        private final int value;
        AggregateEnum(final int intValue) { value = intValue; }
        public int getValue() { return value; }
    }

    public static enum ResampleAlgorithmEnum
    {
        NumberOfPointsToShow,
        ResampleInterval;
    }

    public static enum ResampleIntervalEnum
    {
        Milliseconds,
        Seconds,
        Minutes,
        Hours,
        Days,
        Months,
        Years;
    }

    public static class AutomsoftTime
    {
        public TimeFormatEnum Format = null;
        public String Value = null;
        
        public TimeFormatEnum getFormat() { return Format; }
        public AutomsoftTime setFormat(TimeFormatEnum value) { this.Format = value; return this; }
        public String getValue() { return Value; }
        public AutomsoftTime setValue(String value) { this.Value = value; return this; }
    }

    public static enum CodeLanguage
    {
        Csharp,
        Vbnet;
    }

    public static enum InputType_e
    {
        Hda,
        Sql,
        Dal,
        Constant;
    }

    public static class HDASettings
    {
        public String ProgID = null;
        public String FullyQualifiedName = null;
        public String Type = null;
        public Integer Aggregate = null;
        public TimeInterval ResampleInterval = null;
        
        public String getProgID() { return ProgID; }
        public HDASettings setProgID(String value) { this.ProgID = value; return this; }
        public String getFullyQualifiedName() { return FullyQualifiedName; }
        public HDASettings setFullyQualifiedName(String value) { this.FullyQualifiedName = value; return this; }
        public String getType() { return Type; }
        public HDASettings setType(String value) { this.Type = value; return this; }
        public Integer getAggregate() { return Aggregate; }
        public HDASettings setAggregate(Integer value) { this.Aggregate = value; return this; }
        public TimeInterval getResampleInterval() { return ResampleInterval; }
        public HDASettings setResampleInterval(TimeInterval value) { this.ResampleInterval = value; return this; }
    }

    public static class DALSettings
    {
        public String Bootfile = null;
        
        public String getBootfile() { return Bootfile; }
        public DALSettings setBootfile(String value) { this.Bootfile = value; return this; }
    }

    public static class SQLSettings
    {
        public String ConnectionString = null;
        public String Query = null;
        
        public String getConnectionString() { return ConnectionString; }
        public SQLSettings setConnectionString(String value) { this.ConnectionString = value; return this; }
        public String getQuery() { return Query; }
        public SQLSettings setQuery(String value) { this.Query = value; return this; }
    }

    public static class ConstSettings
    {
        public ConstType_e ConstType = null;
        public ArrayList<String> Values = null;
        
        public ConstType_e getConstType() { return ConstType; }
        public ConstSettings setConstType(ConstType_e value) { this.ConstType = value; return this; }
        public ArrayList<String> getValues() { return Values; }
        public ConstSettings setValues(ArrayList<String> value) { this.Values = value; return this; }
    }

    public static class AttributeUpdateOptions
    {
        /**
        * The old/current fully qualified path of the attribute
        */
        @ApiMember(Description="The old/current fully qualified path of the attribute", ParameterType="body", DataType="string", IsRequired=true)
        public String FullyQualifiedPath = null;

        /**
        * The updated attribute
        */
        @ApiMember(Description="The updated attribute", ParameterType="body", DataType="string", IsRequired=true)
        public InfoModelAttribute InfoModelAttribute = null;
        
        public String getFullyQualifiedPath() { return FullyQualifiedPath; }
        public AttributeUpdateOptions setFullyQualifiedPath(String value) { this.FullyQualifiedPath = value; return this; }
        public InfoModelAttribute getInfoModelAttribute() { return InfoModelAttribute; }
        public AttributeUpdateOptions setInfoModelAttribute(InfoModelAttribute value) { this.InfoModelAttribute = value; return this; }
    }

    public static enum InfoModelAttributeType
    {
        Constant,
        Tag,
        Image,
        Calculation;
    }

    public static class InfoModelConstantSettings
    {
        public Variant Value = null;
        
        public Variant getValue() { return Value; }
        public InfoModelConstantSettings setValue(Variant value) { this.Value = value; return this; }
    }

    public static class InfoModelCalculationSettings
    {
        public String Id = null;
        public String ConnectionId = null;
        public String Name = null;
        public String Path = null;
        public ArrayList<CalculationParameter> InputParameters = null;
        public CalculationParameter OutputParameter = null;
        
        public String getId() { return Id; }
        public InfoModelCalculationSettings setId(String value) { this.Id = value; return this; }
        public String getConnectionId() { return ConnectionId; }
        public InfoModelCalculationSettings setConnectionId(String value) { this.ConnectionId = value; return this; }
        public String getName() { return Name; }
        public InfoModelCalculationSettings setName(String value) { this.Name = value; return this; }
        public String getPath() { return Path; }
        public InfoModelCalculationSettings setPath(String value) { this.Path = value; return this; }
        public ArrayList<CalculationParameter> getInputParameters() { return InputParameters; }
        public InfoModelCalculationSettings setInputParameters(ArrayList<CalculationParameter> value) { this.InputParameters = value; return this; }
        public CalculationParameter getOutputParameter() { return OutputParameter; }
        public InfoModelCalculationSettings setOutputParameter(CalculationParameter value) { this.OutputParameter = value; return this; }
    }

    public static enum TimeFormatEnum
    {
        Iso8601,
        HdaRelative,
        HdaFreeform;
    }

    public static class TimeInterval
    {
        public String FirstRunTime = null;
        public Integer Period = null;
        public Integer NumIntervals = null;
        public Interval_e Interval = null;
        public TimeIntervalType_e ResampleOrNumberOfIntervals = null;
        
        public String getFirstRunTime() { return FirstRunTime; }
        public TimeInterval setFirstRunTime(String value) { this.FirstRunTime = value; return this; }
        public Integer getPeriod() { return Period; }
        public TimeInterval setPeriod(Integer value) { this.Period = value; return this; }
        public Integer getNumIntervals() { return NumIntervals; }
        public TimeInterval setNumIntervals(Integer value) { this.NumIntervals = value; return this; }
        public Interval_e getInterval() { return Interval; }
        public TimeInterval setInterval(Interval_e value) { this.Interval = value; return this; }
        public TimeIntervalType_e getResampleOrNumberOfIntervals() { return ResampleOrNumberOfIntervals; }
        public TimeInterval setResampleOrNumberOfIntervals(TimeIntervalType_e value) { this.ResampleOrNumberOfIntervals = value; return this; }
    }

    public static enum ConstType_e
    {
        Boolean,
        String,
        Int,
        Float,
        DateTime,
        HdaEvent,
        Object;
    }

    public static class CalculationParameter
    {
        public String Name = null;
        public VariantType Type = null;
        public String AssignedAttribute = null;
        
        public String getName() { return Name; }
        public CalculationParameter setName(String value) { this.Name = value; return this; }
        public VariantType getType() { return Type; }
        public CalculationParameter setType(VariantType value) { this.Type = value; return this; }
        public String getAssignedAttribute() { return AssignedAttribute; }
        public CalculationParameter setAssignedAttribute(String value) { this.AssignedAttribute = value; return this; }
    }

    public static enum Interval_e
    {
        Milliseconds,
        Seconds,
        Minutes,
        Hours,
        Days;
    }

    public static enum TimeIntervalType_e
    {
        Resample,
        NumberOfIntervals;
    }

}
