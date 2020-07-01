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
public class NodeCreationResult extends AbstractModelObject {

    @Deprecated
    @JsonIgnore
    public String operation_id;

    @Deprecated
    @JsonIgnore
    public List<NodeCreationResultSet> sets;

    public NodeCreationResult() {
    }

    public NodeCreationResult(boolean instantiateProperties) {
        if (instantiateProperties) {
        }
    }

    public static NodeCreationResult jsonDecode(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
            return mapper.readValue(json, NodeCreationResult.class);
        } catch(IOException exc) {
            throw new RuntimeException(exc);
        }
    }

    @Deprecated
    public static NodeCreationResult json_decode(String json) {
        return jsonDecode(json);
    }

    @Deprecated
    public static NodeCreationResult fromDict(Map<String, Object> dict) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(dict);
        return jsonDecode(json);
    }

    @Deprecated
    public static NodeCreationResult from_dict(Map<String, Object> dict) throws IOException {
        return fromDict(dict);
    }

    @Deprecated
    public NodeCreationResult __deepcopy__(Object self) throws IOException {
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

        NodeCreationResult other = (NodeCreationResult) obj;

        if (operation_id == null) {
            if (other.operation_id != null)
                return false;
        } else if (!operation_id.equals(other.operation_id))
            return false;
        if (sets == null) {
            if (other.sets != null)
                return false;
        } else if (!sets.equals(other.sets))
            return false;
        return true;
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

    /**
    * An array of sets, in the same order as in the request
    */
    @JsonProperty("sets")
    public List<NodeCreationResultSet> getSets() {
        return this.sets;
    }

    /**
    * An array of sets, in the same order as in the request
    */
    @JsonProperty("sets")
    public void setSets(List<NodeCreationResultSet> sets) {
        this.sets = sets;
    }

}