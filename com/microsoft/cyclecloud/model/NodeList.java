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
* Results of a node search
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class NodeList extends AbstractModelObject {

    @Deprecated
    @JsonIgnore
    public List<Map<String, Object>> nodes;

    @Deprecated
    @JsonIgnore
    public OperationStatus operation;

    public NodeList() {
    }

    public NodeList(boolean instantiateProperties) {
        if (instantiateProperties) {
            operation = new OperationStatus(true);
        }
    }

    public static NodeList jsonDecode(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
            return mapper.readValue(json, NodeList.class);
        } catch(IOException exc) {
            throw new RuntimeException(exc);
        }
    }

    @Deprecated
    public static NodeList json_decode(String json) {
        return jsonDecode(json);
    }

    @Deprecated
    public static NodeList fromDict(Map<String, Object> dict) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(dict);
        return jsonDecode(json);
    }

    @Deprecated
    public static NodeList from_dict(Map<String, Object> dict) throws IOException {
        return fromDict(dict);
    }

    @Deprecated
    public NodeList __deepcopy__(Object self) throws IOException {
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

        NodeList other = (NodeList) obj;

        if (nodes == null) {
            if (other.nodes != null)
                return false;
        } else if (!nodes.equals(other.nodes))
            return false;
        if (operation == null) {
            if (other.operation != null)
                return false;
        } else if (!operation.equals(other.operation))
            return false;
        return true;
    }

    /**
    * The nodes returned
    */
    @JsonProperty("nodes")
    public List<Map<String, Object>> getNodes() {
        return this.nodes;
    }

    /**
    * The nodes returned
    */
    @JsonProperty("nodes")
    public void setNodes(List<Map<String, Object>> nodes) {
        this.nodes = nodes;
    }

    /**
    * The status of this node operation
    */
    @JsonProperty("operation")
    public OperationStatus getOperation() {
        return this.operation;
    }

    /**
    * The status of this node operation
    */
    @JsonProperty("operation")
    public void setOperation(OperationStatus operation) {
        this.operation = operation;
    }

}