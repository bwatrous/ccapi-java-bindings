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
* Specifies how to add nodes to a cluster
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class NodeCreationRequest extends AbstractModelObject {

    @Deprecated
    @JsonIgnore
    public String request_id;

    @Deprecated
    @JsonIgnore
    public List<NodeCreationRequestSet> sets;

    public NodeCreationRequest() {
    }

    public NodeCreationRequest(boolean instantiateProperties) {
        if (instantiateProperties) {
        }
    }

    public static NodeCreationRequest jsonDecode(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
            return mapper.readValue(json, NodeCreationRequest.class);
        } catch(IOException exc) {
            throw new RuntimeException(exc);
        }
    }

    @Deprecated
    public static NodeCreationRequest json_decode(String json) {
        return jsonDecode(json);
    }

    @Deprecated
    public static NodeCreationRequest fromDict(Map<String, Object> dict) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(dict);
        return jsonDecode(json);
    }

    @Deprecated
    public static NodeCreationRequest from_dict(Map<String, Object> dict) throws IOException {
        return fromDict(dict);
    }

    @Deprecated
    public NodeCreationRequest __deepcopy__(Object self) throws IOException {
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

        NodeCreationRequest other = (NodeCreationRequest) obj;

        if (request_id == null) {
            if (other.request_id != null)
                return false;
        } else if (!request_id.equals(other.request_id))
            return false;
        if (sets == null) {
            if (other.sets != null)
                return false;
        } else if (!sets.equals(other.sets))
            return false;
        return true;
    }

    /**
    * Optional user-supplied unique token to prevent duplicate operations

    */
    @JsonProperty("requestId")
    public String getRequestId() {
        return this.request_id;
    }

    /**
    * Optional user-supplied unique token to prevent duplicate operations

    */
    @JsonProperty("requestId")
    public void setRequestId(String requestId) {
        this.request_id = requestId;
    }

    /**
    * A list of node definitions to create. The request must contain at least one set. Each set can specify a different set of properties.

    */
    @JsonProperty("sets")
    public List<NodeCreationRequestSet> getSets() {
        return this.sets;
    }

    /**
    * A list of node definitions to create. The request must contain at least one set. Each set can specify a different set of properties.

    */
    @JsonProperty("sets")
    public void setSets(List<NodeCreationRequestSet> sets) {
        this.sets = sets;
    }

}