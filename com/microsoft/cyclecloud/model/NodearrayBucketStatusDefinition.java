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
* The properties of this bucket, used to create nodes from this bucket. The create-nodes API takes this definition in its `bucket` property.

*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class NodearrayBucketStatusDefinition extends AbstractModelObject {

    @Deprecated
    @JsonIgnore
    public String machine_type;

    public NodearrayBucketStatusDefinition() {
    }

    public NodearrayBucketStatusDefinition(boolean instantiateProperties) {
        if (instantiateProperties) {
        }
    }

    public static NodearrayBucketStatusDefinition jsonDecode(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
            return mapper.readValue(json, NodearrayBucketStatusDefinition.class);
        } catch(IOException exc) {
            throw new RuntimeException(exc);
        }
    }

    @Deprecated
    public static NodearrayBucketStatusDefinition json_decode(String json) {
        return jsonDecode(json);
    }

    @Deprecated
    public static NodearrayBucketStatusDefinition fromDict(Map<String, Object> dict) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(dict);
        return jsonDecode(json);
    }

    @Deprecated
    public static NodearrayBucketStatusDefinition from_dict(Map<String, Object> dict) throws IOException {
        return fromDict(dict);
    }

    @Deprecated
    public NodearrayBucketStatusDefinition __deepcopy__(Object self) throws IOException {
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

        NodearrayBucketStatusDefinition other = (NodearrayBucketStatusDefinition) obj;

        if (machine_type == null) {
            if (other.machine_type != null)
                return false;
        } else if (!machine_type.equals(other.machine_type))
            return false;
        return true;
    }

    /**
    * The VM size of the virtual machine
    */
    @JsonProperty("machineType")
    public String getMachineType() {
        return this.machine_type;
    }

    /**
    * The VM size of the virtual machine
    */
    @JsonProperty("machineType")
    public void setMachineType(String machineType) {
        this.machine_type = machineType;
    }

}