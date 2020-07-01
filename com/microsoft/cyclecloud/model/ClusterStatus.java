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
* Status of the cluster
*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class ClusterStatus extends AbstractModelObject {

    @Deprecated
    @JsonIgnore
    public Integer max_core_count;

    @Deprecated
    @JsonIgnore
    public Integer max_count;

    @Deprecated
    @JsonIgnore
    public List<ClusterNodearrayStatus> nodearrays;

    @Deprecated
    @JsonIgnore
    public List<Map<String, Object>> nodes;

    @Deprecated
    @JsonIgnore
    public String state;

    @Deprecated
    @JsonIgnore
    public String target_state;

    public ClusterStatus() {
    }

    public ClusterStatus(boolean instantiateProperties) {
        if (instantiateProperties) {
        }
    }

    public static ClusterStatus jsonDecode(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
            return mapper.readValue(json, ClusterStatus.class);
        } catch(IOException exc) {
            throw new RuntimeException(exc);
        }
    }

    @Deprecated
    public static ClusterStatus json_decode(String json) {
        return jsonDecode(json);
    }

    @Deprecated
    public static ClusterStatus fromDict(Map<String, Object> dict) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(dict);
        return jsonDecode(json);
    }

    @Deprecated
    public static ClusterStatus from_dict(Map<String, Object> dict) throws IOException {
        return fromDict(dict);
    }

    @Deprecated
    public ClusterStatus __deepcopy__(Object self) throws IOException {
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

        ClusterStatus other = (ClusterStatus) obj;

        if (max_core_count != other.max_core_count)
            return false;
        if (max_count != other.max_count)
            return false;
        if (nodearrays == null) {
            if (other.nodearrays != null)
                return false;
        } else if (!nodearrays.equals(other.nodearrays))
            return false;
        if (nodes == null) {
            if (other.nodes != null)
                return false;
        } else if (!nodes.equals(other.nodes))
            return false;
        if (state == null) {
            if (other.state != null)
                return false;
        } else if (!state.equals(other.state))
            return false;
        if (target_state == null) {
            if (other.target_state != null)
                return false;
        } else if (!target_state.equals(other.target_state))
            return false;
        return true;
    }

    /**
    * The maximum number of cores that may be added to this cluster
    */
    @JsonProperty("maxCoreCount")
    public Integer getMaxCoreCount() {
        return this.max_core_count;
    }

    /**
    * The maximum number of cores that may be added to this cluster
    */
    @JsonProperty("maxCoreCount")
    public void setMaxCoreCount(Integer maxCoreCount) {
        this.max_core_count = maxCoreCount;
    }

    /**
    * The maximum number of nodes that may be added to this cluster
    */
    @JsonProperty("maxCount")
    public Integer getMaxCount() {
        return this.max_count;
    }

    /**
    * The maximum number of nodes that may be added to this cluster
    */
    @JsonProperty("maxCount")
    public void setMaxCount(Integer maxCount) {
        this.max_count = maxCount;
    }

    /**
    * 
    */
    @JsonProperty("nodearrays")
    public List<ClusterNodearrayStatus> getNodearrays() {
        return this.nodearrays;
    }

    /**
    * 
    */
    @JsonProperty("nodearrays")
    public void setNodearrays(List<ClusterNodearrayStatus> nodearrays) {
        this.nodearrays = nodearrays;
    }

    /**
    * An optional list of nodes in this cluster, only included if nodes=true is in the query
    */
    @JsonProperty("nodes")
    public List<Map<String, Object>> getNodes() {
        return this.nodes;
    }

    /**
    * An optional list of nodes in this cluster, only included if nodes=true is in the query
    */
    @JsonProperty("nodes")
    public void setNodes(List<Map<String, Object>> nodes) {
        this.nodes = nodes;
    }

    /**
    * The current state of the cluster, if it has been started at least once
    */
    @JsonProperty("state")
    public String getState() {
        return this.state;
    }

    /**
    * The current state of the cluster, if it has been started at least once
    */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
    * The desired state of the cluster (eg Started or Terminated)
    */
    @JsonProperty("targetState")
    public String getTargetState() {
        return this.target_state;
    }

    /**
    * The desired state of the cluster (eg Started or Terminated)
    */
    @JsonProperty("targetState")
    public void setTargetState(String targetState) {
        this.target_state = targetState;
    }

}