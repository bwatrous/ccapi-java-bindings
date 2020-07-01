/**
* Generated Code - Do Not Edit
*/

package com.microsoft.cyclecloud.api;

import java.io.IOException;
import java.lang.IllegalArgumentException;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.cyclecloud.BodyResponseParser;
import com.microsoft.cyclecloud.PageResponseParser;
import com.microsoft.cyclecloud.RequestDetails;
import com.microsoft.cyclecloud.Result;
import com.microsoft.cyclecloud.NoValue;
import com.microsoft.cyclecloud.Session;
import com.microsoft.cyclecloud.model.ClusterStatus;
import com.microsoft.cyclecloud.model.NodeCreationRequest;
import com.microsoft.cyclecloud.model.NodeCreationResult;
import com.microsoft.cyclecloud.model.NodeList;
import com.microsoft.cyclecloud.model.NodeManagementRequest;
import com.microsoft.cyclecloud.model.NodeManagementResult;

@SuppressWarnings("unused")
public class ClustersModule {

    public static final String TAG = "Clusters";

    /**
     * No description available
     *
     * @param  cluster  The cluster to query - Required
     * @param  operation  If given, returns only the nodes for this operation id, and includes the operation attribute on the body 
 - Optional
     * @param  requestId  If given, returns only the nodes for the operation identified by this request id,
 and includes the operation attribute on the body 
 - Optional
     * @return OK
     */
    public static Result<NodeList> getNodes(Session session, String cluster, String operation, String requestId) {
        if (cluster == null) {
            throw new IllegalArgumentException("cluster is required.");
        }

        String _path = "/clusters/{0}/nodes";
        _path = MessageFormat.format(_path, cluster);
        String _host = "None";

        Map<String, String> _query = new HashMap<>();
        if (operation != null) {
            _query.put("operation", operation);
        }
        if (requestId != null) {
            _query.put("request_id", requestId);
        }

        Map<String, String> _headers = new HashMap<>();

        String _body = null;

        String _verb = "GET";

        TypeReference<NodeList> _typeRef = new TypeReference<NodeList>() {};
        BodyResponseParser<NodeList> _responseParser = new BodyResponseParser<>(_typeRef);
        RequestDetails _requestDetails = new RequestDetails(_host, _path, _verb, _query, _headers, _body);
        List<Object> _argsList = Arrays.asList(cluster, operation, requestId);
        return session.<NodeList> execute(TAG, "getNodes", _argsList, _requestDetails, _responseParser);
    }

    /**
     * This operation adds new nodes from a nodearray to a cluster. It accepts multiple node definitions in a single call. It returns the URL to the operation that can be used to track the status of the operation.

     *
     * @param  cluster  The cluster to add nodes to - Required
     * @param  nodes  Sets of nodes to be created - Required
     * @return Accepted
     */
    public static Result<NodeCreationResult> createNodes(Session session, String cluster, NodeCreationRequest nodes) {
        if (cluster == null) {
            throw new IllegalArgumentException("cluster is required.");
        }
        if (nodes == null) {
            throw new IllegalArgumentException("nodes is required.");
        }

        String _path = "/clusters/{0}/nodes/create";
        _path = MessageFormat.format(_path, cluster);
        String _host = "None";

        Map<String, String> _query = new HashMap<>();

        Map<String, String> _headers = new HashMap<>();

        String _body = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            _body = objectMapper.writeValueAsString(nodes);
        } catch (IOException exc) {
            throw new RuntimeException(exc);
        }

        String _verb = "POST";

        TypeReference<NodeCreationResult> _typeRef = new TypeReference<NodeCreationResult>() {};
        BodyResponseParser<NodeCreationResult> _responseParser = new BodyResponseParser<>(_typeRef);
        RequestDetails _requestDetails = new RequestDetails(_host, _path, _verb, _query, _headers, _body);
        List<Object> _argsList = Arrays.asList(cluster, nodes);
        return session.<NodeCreationResult> execute(TAG, "createNodes", _argsList, _requestDetails, _responseParser);
    }

    /**
     * This operation deallocates nodes in a cluster. The nodes can be identified in several ways,  including node name, node id, or by filter.

     *
     * @param  cluster  The cluster to deallocate nodes in - Required
     * @param  action  Description of which nodes to deallocate - Required
     * @return Accepted
     */
    public static Result<NodeManagementResult> deallocateNodes(Session session, String cluster, NodeManagementRequest action) {
        if (cluster == null) {
            throw new IllegalArgumentException("cluster is required.");
        }
        if (action == null) {
            throw new IllegalArgumentException("action is required.");
        }

        String _path = "/clusters/{0}/nodes/deallocate";
        _path = MessageFormat.format(_path, cluster);
        String _host = "None";

        Map<String, String> _query = new HashMap<>();

        Map<String, String> _headers = new HashMap<>();

        String _body = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            _body = objectMapper.writeValueAsString(action);
        } catch (IOException exc) {
            throw new RuntimeException(exc);
        }

        String _verb = "POST";

        TypeReference<NodeManagementResult> _typeRef = new TypeReference<NodeManagementResult>() {};
        BodyResponseParser<NodeManagementResult> _responseParser = new BodyResponseParser<>(_typeRef);
        RequestDetails _requestDetails = new RequestDetails(_host, _path, _verb, _query, _headers, _body);
        List<Object> _argsList = Arrays.asList(cluster, action);
        return session.<NodeManagementResult> execute(TAG, "deallocateNodes", _argsList, _requestDetails, _responseParser);
    }

    /**
     * This operation removes nodes in a cluster. The nodes can be identified in several ways,  including node name, node id, or by filter. Note that by default nodes are removed when terminated (unless the node has Fixed set to true), in which case this call is no different than terminate.

     *
     * @param  cluster  The cluster to remove nodes in - Required
     * @param  action  Description of which nodes to remove - Required
     * @return Accepted
     */
    public static Result<NodeManagementResult> removeNodes(Session session, String cluster, NodeManagementRequest action) {
        if (cluster == null) {
            throw new IllegalArgumentException("cluster is required.");
        }
        if (action == null) {
            throw new IllegalArgumentException("action is required.");
        }

        String _path = "/clusters/{0}/nodes/remove";
        _path = MessageFormat.format(_path, cluster);
        String _host = "None";

        Map<String, String> _query = new HashMap<>();

        Map<String, String> _headers = new HashMap<>();

        String _body = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            _body = objectMapper.writeValueAsString(action);
        } catch (IOException exc) {
            throw new RuntimeException(exc);
        }

        String _verb = "POST";

        TypeReference<NodeManagementResult> _typeRef = new TypeReference<NodeManagementResult>() {};
        BodyResponseParser<NodeManagementResult> _responseParser = new BodyResponseParser<>(_typeRef);
        RequestDetails _requestDetails = new RequestDetails(_host, _path, _verb, _query, _headers, _body);
        List<Object> _argsList = Arrays.asList(cluster, action);
        return session.<NodeManagementResult> execute(TAG, "removeNodes", _argsList, _requestDetails, _responseParser);
    }

    /**
     * This operation terminates or deallocates nodes in a cluster, depending on whether the ShutdownPolicy attribute on each node is Terminate (the default) or Deallocate, respectively. 

     *
     * @param  cluster  The cluster to shutdown nodes in - Required
     * @param  action  Description of which nodes to shutdown - Required
     * @return Accepted
     */
    public static Result<NodeManagementResult> shutdownNodes(Session session, String cluster, NodeManagementRequest action) {
        if (cluster == null) {
            throw new IllegalArgumentException("cluster is required.");
        }
        if (action == null) {
            throw new IllegalArgumentException("action is required.");
        }

        String _path = "/clusters/{0}/nodes/shutdown";
        _path = MessageFormat.format(_path, cluster);
        String _host = "None";

        Map<String, String> _query = new HashMap<>();

        Map<String, String> _headers = new HashMap<>();

        String _body = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            _body = objectMapper.writeValueAsString(action);
        } catch (IOException exc) {
            throw new RuntimeException(exc);
        }

        String _verb = "POST";

        TypeReference<NodeManagementResult> _typeRef = new TypeReference<NodeManagementResult>() {};
        BodyResponseParser<NodeManagementResult> _responseParser = new BodyResponseParser<>(_typeRef);
        RequestDetails _requestDetails = new RequestDetails(_host, _path, _verb, _query, _headers, _body);
        List<Object> _argsList = Arrays.asList(cluster, action);
        return session.<NodeManagementResult> execute(TAG, "shutdownNodes", _argsList, _requestDetails, _responseParser);
    }

    /**
     * This operation starts nodes in a cluster. The nodes can be identified in several ways,  including node name, node id, or by filter.

     *
     * @param  cluster  The cluster to start nodes in - Required
     * @param  action  Description of which nodes to start - Required
     * @return Accepted
     */
    public static Result<NodeManagementResult> startNodes(Session session, String cluster, NodeManagementRequest action) {
        if (cluster == null) {
            throw new IllegalArgumentException("cluster is required.");
        }
        if (action == null) {
            throw new IllegalArgumentException("action is required.");
        }

        String _path = "/clusters/{0}/nodes/start";
        _path = MessageFormat.format(_path, cluster);
        String _host = "None";

        Map<String, String> _query = new HashMap<>();

        Map<String, String> _headers = new HashMap<>();

        String _body = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            _body = objectMapper.writeValueAsString(action);
        } catch (IOException exc) {
            throw new RuntimeException(exc);
        }

        String _verb = "POST";

        TypeReference<NodeManagementResult> _typeRef = new TypeReference<NodeManagementResult>() {};
        BodyResponseParser<NodeManagementResult> _responseParser = new BodyResponseParser<>(_typeRef);
        RequestDetails _requestDetails = new RequestDetails(_host, _path, _verb, _query, _headers, _body);
        List<Object> _argsList = Arrays.asList(cluster, action);
        return session.<NodeManagementResult> execute(TAG, "startNodes", _argsList, _requestDetails, _responseParser);
    }

    /**
     * This operation terminates nodes in a cluster. The nodes can be identified in several ways,  including node name, node id, or by filter.

     *
     * @param  cluster  The cluster to terminate nodes in - Required
     * @param  action  Description of which nodes to terminate - Required
     * @return Accepted
     */
    public static Result<NodeManagementResult> terminateNodes(Session session, String cluster, NodeManagementRequest action) {
        if (cluster == null) {
            throw new IllegalArgumentException("cluster is required.");
        }
        if (action == null) {
            throw new IllegalArgumentException("action is required.");
        }

        String _path = "/clusters/{0}/nodes/terminate";
        _path = MessageFormat.format(_path, cluster);
        String _host = "None";

        Map<String, String> _query = new HashMap<>();

        Map<String, String> _headers = new HashMap<>();

        String _body = null;
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            _body = objectMapper.writeValueAsString(action);
        } catch (IOException exc) {
            throw new RuntimeException(exc);
        }

        String _verb = "POST";

        TypeReference<NodeManagementResult> _typeRef = new TypeReference<NodeManagementResult>() {};
        BodyResponseParser<NodeManagementResult> _responseParser = new BodyResponseParser<>(_typeRef);
        RequestDetails _requestDetails = new RequestDetails(_host, _path, _verb, _query, _headers, _body);
        List<Object> _argsList = Arrays.asList(cluster, action);
        return session.<NodeManagementResult> execute(TAG, "terminateNodes", _argsList, _requestDetails, _responseParser);
    }

    /**
     * This operation adds nodes as needed to a nodearray to hit a total count. The request is processed one time, and does not re-add nodes later to maintain the given number. This scales by either total cores or total nodes, but not both. It returns the URL to the operation that can be used to track the status of the operation.

     *
     * @param  cluster  The cluster to add nodes to - Required
     * @param  nodearray  The nodearray to add nodes to - Required
     * @param  totalCoreCount  The total number of cores to have in this nodearray, including nodes already created
 - Optional
     * @param  totalNodeCount  The total number of machines to have in this nodearray, including nodes already created
 - Optional
     * @return Accepted
     */
    public static Result<NodeCreationResult> scale(Session session, String cluster, String nodearray, Integer totalCoreCount, Integer totalNodeCount) {
        if (cluster == null) {
            throw new IllegalArgumentException("cluster is required.");
        }
        if (nodearray == null) {
            throw new IllegalArgumentException("nodearray is required.");
        }

        String _path = "/clusters/{0}/scale/{1}";
        _path = MessageFormat.format(_path, cluster, nodearray);
        String _host = "None";

        Map<String, String> _query = new HashMap<>();
        if (totalCoreCount != null) {
            _query.put("totalCoreCount", String.valueOf(totalCoreCount).toLowerCase());
        }
        if (totalNodeCount != null) {
            _query.put("totalNodeCount", String.valueOf(totalNodeCount).toLowerCase());
        }

        Map<String, String> _headers = new HashMap<>();

        String _body = null;

        String _verb = "POST";

        TypeReference<NodeCreationResult> _typeRef = new TypeReference<NodeCreationResult>() {};
        BodyResponseParser<NodeCreationResult> _responseParser = new BodyResponseParser<>(_typeRef);
        RequestDetails _requestDetails = new RequestDetails(_host, _path, _verb, _query, _headers, _body);
        List<Object> _argsList = Arrays.asList(cluster, nodearray, totalCoreCount, totalNodeCount);
        return session.<NodeCreationResult> execute(TAG, "scale", _argsList, _requestDetails, _responseParser);
    }

    /**
     * This operation contains information for the nodes and nodearrays in a given cluster. For each nodearray, it returns the status of each "bucket" of allocation that can be used, such as how many  nodes are in the bucket, how many more can be added, etc. Each bucket is a set of possible VMs of a given hardware profile, that can be created in a given location, under a given  customer account, etc. The valid buckets for a nodearray are determined by the user's cluster definition, but the limits are determined in part by the cloud provider.

     *
     * @param  cluster  The cluster to query - Required
     * @param  nodes  If true, nodes and node references are returned in the response - Optional
     * @return OK
     */
    public static Result<ClusterStatus> getClusterStatus(Session session, String cluster, Boolean nodes) {
        if (cluster == null) {
            throw new IllegalArgumentException("cluster is required.");
        }

        String _path = "/clusters/{0}/status";
        _path = MessageFormat.format(_path, cluster);
        String _host = "None";

        Map<String, String> _query = new HashMap<>();
        if (nodes != null) {
            _query.put("nodes", String.valueOf(nodes).toLowerCase());
        }

        Map<String, String> _headers = new HashMap<>();

        String _body = null;

        String _verb = "GET";

        TypeReference<ClusterStatus> _typeRef = new TypeReference<ClusterStatus>() {};
        BodyResponseParser<ClusterStatus> _responseParser = new BodyResponseParser<>(_typeRef);
        RequestDetails _requestDetails = new RequestDetails(_host, _path, _verb, _query, _headers, _body);
        List<Object> _argsList = Arrays.asList(cluster, nodes);
        return session.<ClusterStatus> execute(TAG, "getClusterStatus", _argsList, _requestDetails, _responseParser);
    }

}