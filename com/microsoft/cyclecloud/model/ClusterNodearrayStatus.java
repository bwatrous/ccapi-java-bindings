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
public class ClusterNodearrayStatus extends AbstractModelObject {

    @Deprecated
    @JsonIgnore
    public List<NodearrayBucketStatus> buckets;

    @Deprecated
    @JsonIgnore
    public Integer max_core_count;

    @Deprecated
    @JsonIgnore
    public Integer max_count;

    @Deprecated
    @JsonIgnore
    public String name;

    @Deprecated
    @JsonIgnore
    public Map<String, Object> nodearray;

    public ClusterNodearrayStatus() {
    }

    public ClusterNodearrayStatus(boolean instantiateProperties) {
        if (instantiateProperties) {
        }
    }

    public static ClusterNodearrayStatus jsonDecode(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
            return mapper.readValue(json, ClusterNodearrayStatus.class);
        } catch(IOException exc) {
            throw new RuntimeException(exc);
        }
    }

    @Deprecated
    public static ClusterNodearrayStatus json_decode(String json) {
        return jsonDecode(json);
    }

    @Deprecated
    public static ClusterNodearrayStatus fromDict(Map<String, Object> dict) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(dict);
        return jsonDecode(json);
    }

    @Deprecated
    public static ClusterNodearrayStatus from_dict(Map<String, Object> dict) throws IOException {
        return fromDict(dict);
    }

    @Deprecated
    public ClusterNodearrayStatus __deepcopy__(Object self) throws IOException {
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

        ClusterNodearrayStatus other = (ClusterNodearrayStatus) obj;

        if (buckets == null) {
            if (other.buckets != null)
                return false;
        } else if (!buckets.equals(other.buckets))
            return false;
        if (max_core_count != other.max_core_count)
            return false;
        if (max_count != other.max_count)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (nodearray == null) {
            if (other.nodearray != null)
                return false;
        } else if (!nodearray.equals(other.nodearray))
            return false;
        return true;
    }

    /**
    * Each bucket of allocation for this nodearray. The "core count" settings are always a multiple of the core count for this bucket.

    */
    @JsonProperty("buckets")
    public List<NodearrayBucketStatus> getBuckets() {
        return this.buckets;
    }

    /**
    * Each bucket of allocation for this nodearray. The "core count" settings are always a multiple of the core count for this bucket.

    */
    @JsonProperty("buckets")
    public void setBuckets(List<NodearrayBucketStatus> buckets) {
        this.buckets = buckets;
    }

    /**
    * The maximum number of cores that may be in this nodearray
    */
    @JsonProperty("maxCoreCount")
    public Integer getMaxCoreCount() {
        return this.max_core_count;
    }

    /**
    * The maximum number of cores that may be in this nodearray
    */
    @JsonProperty("maxCoreCount")
    public void setMaxCoreCount(Integer maxCoreCount) {
        this.max_core_count = maxCoreCount;
    }

    /**
    * The maximum number of nodes that may be in this nodearray
    */
    @JsonProperty("maxCount")
    public Integer getMaxCount() {
        return this.max_count;
    }

    /**
    * The maximum number of nodes that may be in this nodearray
    */
    @JsonProperty("maxCount")
    public void setMaxCount(Integer maxCount) {
        this.max_count = maxCount;
    }

    /**
    * The nodearray this is describing
    */
    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    /**
    * The nodearray this is describing
    */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
    * A node record
    */
    @JsonProperty("nodearray")
    public Map<String, Object> getNodearray() {
        return this.nodearray;
    }

    /**
    * A node record
    */
    @JsonProperty("nodearray")
    public void setNodearray(Map<String, Object> nodearray) {
        this.nodearray = nodearray;
    }

}