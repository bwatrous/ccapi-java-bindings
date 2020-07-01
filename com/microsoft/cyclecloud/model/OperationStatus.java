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
* The status of this node operation
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class OperationStatus extends AbstractModelObject {

    @Deprecated
    @JsonIgnore
    public String action;

    @Deprecated
    @JsonIgnore
    public String start_time;

    public OperationStatus() {
    }

    public OperationStatus(boolean instantiateProperties) {
        if (instantiateProperties) {
        }
    }

    public static OperationStatus jsonDecode(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
            return mapper.readValue(json, OperationStatus.class);
        } catch(IOException exc) {
            throw new RuntimeException(exc);
        }
    }

    @Deprecated
    public static OperationStatus json_decode(String json) {
        return jsonDecode(json);
    }

    @Deprecated
    public static OperationStatus fromDict(Map<String, Object> dict) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(dict);
        return jsonDecode(json);
    }

    @Deprecated
    public static OperationStatus from_dict(Map<String, Object> dict) throws IOException {
        return fromDict(dict);
    }

    @Deprecated
    public OperationStatus __deepcopy__(Object self) throws IOException {
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

        OperationStatus other = (OperationStatus) obj;

        if (action == null) {
            if (other.action != null)
                return false;
        } else if (!action.equals(other.action))
            return false;
        if (start_time == null) {
            if (other.start_time != null)
                return false;
        } else if (!start_time.equals(other.start_time))
            return false;
        return true;
    }

    /**
    * 
    */
    @JsonProperty("action")
    public String getAction() {
        return this.action;
    }

    /**
    * 
    */
    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    /**
    * When this operation was submitted
    */
    @JsonProperty("startTime")
    public String getStartTime() {
        return this.start_time;
    }

    /**
    * When this operation was submitted
    */
    @JsonProperty("startTime")
    public void setStartTime(String startTime) {
        this.start_time = startTime;
    }

}