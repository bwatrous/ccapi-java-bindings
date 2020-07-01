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
public class NodeCreationResultSet extends AbstractModelObject {

    @Deprecated
    @JsonIgnore
    public Integer added;

    @Deprecated
    @JsonIgnore
    public String message;

    public NodeCreationResultSet() {
    }

    public NodeCreationResultSet(boolean instantiateProperties) {
        if (instantiateProperties) {
        }
    }

    public static NodeCreationResultSet jsonDecode(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
            return mapper.readValue(json, NodeCreationResultSet.class);
        } catch(IOException exc) {
            throw new RuntimeException(exc);
        }
    }

    @Deprecated
    public static NodeCreationResultSet json_decode(String json) {
        return jsonDecode(json);
    }

    @Deprecated
    public static NodeCreationResultSet fromDict(Map<String, Object> dict) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(dict);
        return jsonDecode(json);
    }

    @Deprecated
    public static NodeCreationResultSet from_dict(Map<String, Object> dict) throws IOException {
        return fromDict(dict);
    }

    @Deprecated
    public NodeCreationResultSet __deepcopy__(Object self) throws IOException {
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

        NodeCreationResultSet other = (NodeCreationResultSet) obj;

        if (added != other.added)
            return false;
        if (message == null) {
            if (other.message != null)
                return false;
        } else if (!message.equals(other.message))
            return false;
        return true;
    }

    /**
    * How many nodes were started in this set
    */
    @JsonProperty("added")
    public Integer getAdded() {
        return this.added;
    }

    /**
    * How many nodes were started in this set
    */
    @JsonProperty("added")
    public void setAdded(Integer added) {
        this.added = added;
    }

    /**
    * Indicates why not all requested nodes could be added, if present
    */
    @JsonProperty("message")
    public String getMessage() {
        return this.message;
    }

    /**
    * Indicates why not all requested nodes could be added, if present
    */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

}