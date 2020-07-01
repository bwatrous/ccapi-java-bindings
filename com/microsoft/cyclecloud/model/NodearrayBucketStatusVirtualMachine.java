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
* The properties of the virtual machines launched from this bucket
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class NodearrayBucketStatusVirtualMachine extends AbstractModelObject {

    @Deprecated
    @JsonIgnore
    public Boolean infiniband;

    @Deprecated
    @JsonIgnore
    public Double memory;

    @Deprecated
    @JsonIgnore
    public Integer vcpu_count;

    public NodearrayBucketStatusVirtualMachine() {
    }

    public NodearrayBucketStatusVirtualMachine(boolean instantiateProperties) {
        if (instantiateProperties) {
        }
    }

    public static NodearrayBucketStatusVirtualMachine jsonDecode(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
            return mapper.readValue(json, NodearrayBucketStatusVirtualMachine.class);
        } catch(IOException exc) {
            throw new RuntimeException(exc);
        }
    }

    @Deprecated
    public static NodearrayBucketStatusVirtualMachine json_decode(String json) {
        return jsonDecode(json);
    }

    @Deprecated
    public static NodearrayBucketStatusVirtualMachine fromDict(Map<String, Object> dict) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(dict);
        return jsonDecode(json);
    }

    @Deprecated
    public static NodearrayBucketStatusVirtualMachine from_dict(Map<String, Object> dict) throws IOException {
        return fromDict(dict);
    }

    @Deprecated
    public NodearrayBucketStatusVirtualMachine __deepcopy__(Object self) throws IOException {
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

        NodearrayBucketStatusVirtualMachine other = (NodearrayBucketStatusVirtualMachine) obj;

        if (infiniband != other.infiniband)
            return false;
        if (Double.doubleToLongBits(memory) != Double.doubleToLongBits(other.memory))
            return false;
        if (vcpu_count != other.vcpu_count)
            return false;
        return true;
    }

    /**
    * If this virtual machine supports InfiniBand connectivity
    */
    @JsonProperty("infiniband")
    public Boolean getInfiniband() {
        return this.infiniband;
    }

    /**
    * If this virtual machine supports InfiniBand connectivity
    */
    @JsonProperty("infiniband")
    public void setInfiniband(Boolean infiniband) {
        this.infiniband = infiniband;
    }

    /**
    * The RAM in this virtual machine, in GB
    */
    @JsonProperty("memory")
    public Double getMemory() {
        return this.memory;
    }

    /**
    * The RAM in this virtual machine, in GB
    */
    @JsonProperty("memory")
    public void setMemory(Double memory) {
        this.memory = memory;
    }

    /**
    * The number of virtual CPUs this machine type has
    */
    @JsonProperty("vcpuCount")
    public Integer getVcpuCount() {
        return this.vcpu_count;
    }

    /**
    * The number of virtual CPUs this machine type has
    */
    @JsonProperty("vcpuCount")
    public void setVcpuCount(Integer vcpuCount) {
        this.vcpu_count = vcpuCount;
    }

}