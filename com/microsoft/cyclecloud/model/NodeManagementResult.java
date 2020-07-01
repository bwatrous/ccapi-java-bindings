/**
* Generated Code - Do Not Edit
*/

package com.microsoft.cyclecloud.model;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.cyclecloud.model.AbstractModelObject;

@SuppressWarnings("unused")
/**
* 
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class NodeManagementResult extends AbstractModelObject {

    @Deprecated
    @JsonIgnore
    public List<NodeManagementResultNode> nodes;

    @Deprecated
    @JsonIgnore
    public String operation_id;

    public NodeManagementResult() {
    }

    public NodeManagementResult(boolean instantiateProperties) {
        if (instantiateProperties) {
        }
    }

    public static NodeManagementResult jsonDecode(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
            return mapper.readValue(json, NodeManagementResult.class);
        } catch(IOException exc) {
            throw new RuntimeException(exc);
        }
    }

    @Deprecated
    public static NodeManagementResult json_decode(String json) {
        return jsonDecode(json);
    }

    @Deprecated
    public static NodeManagementResult fromDict(Map<String, Object> dict) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(dict);
        return jsonDecode(json);
    }

    @Deprecated
    public static NodeManagementResult from_dict(Map<String, Object> dict) throws IOException {
        return fromDict(dict);
    }

    @Deprecated
    public NodeManagementResult __deepcopy__(Object self) throws IOException {
        return jsonDecode(jsonEncode());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        NodeManagementResult other = (NodeManagementResult) obj;

        if (nodes == null) {
            if (other.nodes != null)
                return false;
        } else if (!nodes.equals(other.nodes))
            return false;
        if (operation_id == null) {
            if (other.operation_id != null)
                return false;
        } else if (!operation_id.equals(other.operation_id))
            return false;
        return true;
    }

    /**
    * An array of information about each node that matched the filter in the management request. Each node's status indicates if it was affected by the request.

    */
    @JsonProperty("nodes")
    public List<NodeManagementResultNode> getNodes() {
        return this.nodes;
    }

    /**
    * An array of information about each node that matched the filter in the management request. Each node's status indicates if it was affected by the request.

    */
    @JsonProperty("nodes")
    public void setNodes(List<NodeManagementResultNode> nodes) {
        this.nodes = nodes;
    }

    /**
    * The id of this operation
    */
    @JsonProperty("operationId")
    public String getOperationId() {
        return this.operation_id;
    }

    /**
    * The id of this operation
    */
    @JsonProperty("operationId")
    public void setOperationId(String operationId) {
        this.operation_id = operationId;
    }

}