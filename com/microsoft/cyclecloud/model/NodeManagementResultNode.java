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
public class NodeManagementResultNode extends AbstractModelObject {

    @Deprecated
    @JsonIgnore
    public String error;

    @Deprecated
    @JsonIgnore
    public String id;

    @Deprecated
    @JsonIgnore
    public String name;

    @Deprecated
    @JsonIgnore
    public String status;

    public NodeManagementResultNode() {
    }

    public NodeManagementResultNode(boolean instantiateProperties) {
        if (instantiateProperties) {
        }
    }

    public static NodeManagementResultNode jsonDecode(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
            return mapper.readValue(json, NodeManagementResultNode.class);
        } catch(IOException exc) {
            throw new RuntimeException(exc);
        }
    }

    @Deprecated
    public static NodeManagementResultNode json_decode(String json) {
        return jsonDecode(json);
    }

    @Deprecated
    public static NodeManagementResultNode fromDict(Map<String, Object> dict) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(dict);
        return jsonDecode(json);
    }

    @Deprecated
    public static NodeManagementResultNode from_dict(Map<String, Object> dict) throws IOException {
        return fromDict(dict);
    }

    @Deprecated
    public NodeManagementResultNode __deepcopy__(Object self) throws IOException {
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

        NodeManagementResultNode other = (NodeManagementResultNode) obj;

        if (error == null) {
            if (other.error != null)
                return false;
        } else if (!error.equals(other.error))
            return false;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        return true;
    }

    /**
    * If the status is Error, this contains the error message
    */
    @JsonProperty("error")
    public String getError() {
        return this.error;
    }

    /**
    * If the status is Error, this contains the error message
    */
    @JsonProperty("error")
    public void setError(String error) {
        this.error = error;
    }

    /**
    * The id of the node
    */
    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    /**
    * The id of the node
    */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
    * The name of the node
    */
    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    /**
    * The name of the node
    */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
    * One of OK or Error
    */
    @JsonProperty("status")
    public String getStatus() {
        return this.status;
    }

    /**
    * One of OK or Error
    */
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

}