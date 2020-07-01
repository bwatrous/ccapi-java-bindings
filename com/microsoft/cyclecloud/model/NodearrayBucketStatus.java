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
public class NodearrayBucketStatus extends AbstractModelObject {

    @Deprecated
    @JsonIgnore
    public Integer active_core_count;

    @Deprecated
    @JsonIgnore
    public Integer active_count;

    @Deprecated
    @JsonIgnore
    public List<String> active_nodes;

    @Deprecated
    @JsonIgnore
    public Integer available_core_count;

    @Deprecated
    @JsonIgnore
    public Integer available_count;

    @Deprecated
    @JsonIgnore
    public String bucket_id;

    @Deprecated
    @JsonIgnore
    public Integer consumed_core_count;

    @Deprecated
    @JsonIgnore
    public NodearrayBucketStatusDefinition definition;

    @Deprecated
    @JsonIgnore
    public Integer max_core_count;

    @Deprecated
    @JsonIgnore
    public Integer max_count;

    @Deprecated
    @JsonIgnore
    public Integer max_placement_group_core_size;

    @Deprecated
    @JsonIgnore
    public Integer max_placement_group_size;

    @Deprecated
    @JsonIgnore
    public List<PlacementGroupStatus> placement_groups;

    @Deprecated
    @JsonIgnore
    public Integer quota_core_count;

    @Deprecated
    @JsonIgnore
    public Integer quota_count;

    @Deprecated
    @JsonIgnore
    public Boolean valid;

    @Deprecated
    @JsonIgnore
    public NodearrayBucketStatusVirtualMachine virtual_machine;

    public NodearrayBucketStatus() {
    }

    public NodearrayBucketStatus(boolean instantiateProperties) {
        if (instantiateProperties) {
            definition = new NodearrayBucketStatusDefinition(true);
            virtual_machine = new NodearrayBucketStatusVirtualMachine(true);
        }
    }

    public static NodearrayBucketStatus jsonDecode(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
            return mapper.readValue(json, NodearrayBucketStatus.class);
        } catch(IOException exc) {
            throw new RuntimeException(exc);
        }
    }

    @Deprecated
    public static NodearrayBucketStatus json_decode(String json) {
        return jsonDecode(json);
    }

    @Deprecated
    public static NodearrayBucketStatus fromDict(Map<String, Object> dict) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(dict);
        return jsonDecode(json);
    }

    @Deprecated
    public static NodearrayBucketStatus from_dict(Map<String, Object> dict) throws IOException {
        return fromDict(dict);
    }

    @Deprecated
    public NodearrayBucketStatus __deepcopy__(Object self) throws IOException {
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

        NodearrayBucketStatus other = (NodearrayBucketStatus) obj;

        if (active_core_count != other.active_core_count)
            return false;
        if (active_count != other.active_count)
            return false;
        if (active_nodes == null) {
            if (other.active_nodes != null)
                return false;
        } else if (!active_nodes.equals(other.active_nodes))
            return false;
        if (available_core_count != other.available_core_count)
            return false;
        if (available_count != other.available_count)
            return false;
        if (bucket_id == null) {
            if (other.bucket_id != null)
                return false;
        } else if (!bucket_id.equals(other.bucket_id))
            return false;
        if (consumed_core_count != other.consumed_core_count)
            return false;
        if (definition == null) {
            if (other.definition != null)
                return false;
        } else if (!definition.equals(other.definition))
            return false;
        if (max_core_count != other.max_core_count)
            return false;
        if (max_count != other.max_count)
            return false;
        if (max_placement_group_core_size != other.max_placement_group_core_size)
            return false;
        if (max_placement_group_size != other.max_placement_group_size)
            return false;
        if (placement_groups == null) {
            if (other.placement_groups != null)
                return false;
        } else if (!placement_groups.equals(other.placement_groups))
            return false;
        if (quota_core_count != other.quota_core_count)
            return false;
        if (quota_count != other.quota_count)
            return false;
        if (valid != other.valid)
            return false;
        if (virtual_machine == null) {
            if (other.virtual_machine != null)
                return false;
        } else if (!virtual_machine.equals(other.virtual_machine))
            return false;
        return true;
    }

    /**
    * The number of cores in use for this bucket, in this nodearray
    */
    @JsonProperty("activeCoreCount")
    public Integer getActiveCoreCount() {
        return this.active_core_count;
    }

    /**
    * The number of cores in use for this bucket, in this nodearray
    */
    @JsonProperty("activeCoreCount")
    public void setActiveCoreCount(Integer activeCoreCount) {
        this.active_core_count = activeCoreCount;
    }

    /**
    * The number of nodes in use for this bucket, in this nodearray. This includes nodes which are still acquiring a VM.

    */
    @JsonProperty("activeCount")
    public Integer getActiveCount() {
        return this.active_count;
    }

    /**
    * The number of nodes in use for this bucket, in this nodearray. This includes nodes which are still acquiring a VM.

    */
    @JsonProperty("activeCount")
    public void setActiveCount(Integer activeCount) {
        this.active_count = activeCount;
    }

    /**
    * The node names in use for this bucket, in this nodearray. This includes nodes which are still acquiring a VM. This is only included if nodes=true is in the query.

    */
    @JsonProperty("activeNodes")
    public List<String> getActiveNodes() {
        return this.active_nodes;
    }

    /**
    * The node names in use for this bucket, in this nodearray. This includes nodes which are still acquiring a VM. This is only included if nodes=true is in the query.

    */
    @JsonProperty("activeNodes")
    public void setActiveNodes(List<String> activeNodes) {
        this.active_nodes = activeNodes;
    }

    /**
    * How many extra cores may be created in this bucket, in this nodearray. Always a multiple of availableCount.

    */
    @JsonProperty("availableCoreCount")
    public Integer getAvailableCoreCount() {
        return this.available_core_count;
    }

    /**
    * How many extra cores may be created in this bucket, in this nodearray. Always a multiple of availableCount.

    */
    @JsonProperty("availableCoreCount")
    public void setAvailableCoreCount(Integer availableCoreCount) {
        this.available_core_count = availableCoreCount;
    }

    /**
    * How many extra nodes may be created in this bucket, in this nodearray. Note this may be less than implied by maxCount and usedCount, since maxCount may be limited globally.
  

    */
    @JsonProperty("availableCount")
    public Integer getAvailableCount() {
        return this.available_count;
    }

    /**
    * How many extra nodes may be created in this bucket, in this nodearray. Note this may be less than implied by maxCount and usedCount, since maxCount may be limited globally.
  

    */
    @JsonProperty("availableCount")
    public void setAvailableCount(Integer availableCount) {
        this.available_count = availableCount;
    }

    /**
    * The identifier for this bucket. This will always have the same value  for a given bucket in a nodearray, as long as the cluster is not deleted. 

    */
    @JsonProperty("bucketId")
    public String getBucketId() {
        return this.bucket_id;
    }

    /**
    * The identifier for this bucket. This will always have the same value  for a given bucket in a nodearray, as long as the cluster is not deleted. 

    */
    @JsonProperty("bucketId")
    public void setBucketId(String bucketId) {
        this.bucket_id = bucketId;
    }

    /**
    * The number of cores for this family that are already in use

    */
    @JsonProperty("consumedCoreCount")
    public Integer getConsumedCoreCount() {
        return this.consumed_core_count;
    }

    /**
    * The number of cores for this family that are already in use

    */
    @JsonProperty("consumedCoreCount")
    public void setConsumedCoreCount(Integer consumedCoreCount) {
        this.consumed_core_count = consumedCoreCount;
    }

    /**
    * The properties of this bucket, used to create nodes from this bucket. The create-nodes API takes this definition in its `bucket` property.

    */
    @JsonProperty("definition")
    public NodearrayBucketStatusDefinition getDefinition() {
        return this.definition;
    }

    /**
    * The properties of this bucket, used to create nodes from this bucket. The create-nodes API takes this definition in its `bucket` property.

    */
    @JsonProperty("definition")
    public void setDefinition(NodearrayBucketStatusDefinition definition) {
        this.definition = definition;
    }

    /**
    * The maximum number of cores that may be in this bucket, including global and nodearray limits.  Always a multiple of maxCount.

    */
    @JsonProperty("maxCoreCount")
    public Integer getMaxCoreCount() {
        return this.max_core_count;
    }

    /**
    * The maximum number of cores that may be in this bucket, including global and nodearray limits.  Always a multiple of maxCount.

    */
    @JsonProperty("maxCoreCount")
    public void setMaxCoreCount(Integer maxCoreCount) {
        this.max_core_count = maxCoreCount;
    }

    /**
    * The maximum number of nodes that may be in this bucket, including global and nodearray limits
    */
    @JsonProperty("maxCount")
    public Integer getMaxCount() {
        return this.max_count;
    }

    /**
    * The maximum number of nodes that may be in this bucket, including global and nodearray limits
    */
    @JsonProperty("maxCount")
    public void setMaxCount(Integer maxCount) {
        this.max_count = maxCount;
    }

    /**
    * The maximum total number of cores that can be in a placement group in this bucket. Always a multiple of maxPlacementGroupSize.

    */
    @JsonProperty("maxPlacementGroupCoreSize")
    public Integer getMaxPlacementGroupCoreSize() {
        return this.max_placement_group_core_size;
    }

    /**
    * The maximum total number of cores that can be in a placement group in this bucket. Always a multiple of maxPlacementGroupSize.

    */
    @JsonProperty("maxPlacementGroupCoreSize")
    public void setMaxPlacementGroupCoreSize(Integer maxPlacementGroupCoreSize) {
        this.max_placement_group_core_size = maxPlacementGroupCoreSize;
    }

    /**
    * The maximum total number of instances that can be in a placement group in this bucket
    */
    @JsonProperty("maxPlacementGroupSize")
    public Integer getMaxPlacementGroupSize() {
        return this.max_placement_group_size;
    }

    /**
    * The maximum total number of instances that can be in a placement group in this bucket
    */
    @JsonProperty("maxPlacementGroupSize")
    public void setMaxPlacementGroupSize(Integer maxPlacementGroupSize) {
        this.max_placement_group_size = maxPlacementGroupSize;
    }

    /**
    * The placement groups in use for this nodearray, if any.

    */
    @JsonProperty("placementGroups")
    public List<PlacementGroupStatus> getPlacementGroups() {
        return this.placement_groups;
    }

    /**
    * The placement groups in use for this nodearray, if any.

    */
    @JsonProperty("placementGroups")
    public void setPlacementGroups(List<PlacementGroupStatus> placementGroups) {
        this.placement_groups = placementGroups;
    }

    /**
    * The number of total cores that can be started for this family. This might not be an integer multiple of quotaCount.

    */
    @JsonProperty("quotaCoreCount")
    public Integer getQuotaCoreCount() {
        return this.quota_core_count;
    }

    /**
    * The number of total cores that can be started for this family. This might not be an integer multiple of quotaCount.

    */
    @JsonProperty("quotaCoreCount")
    public void setQuotaCoreCount(Integer quotaCoreCount) {
        this.quota_core_count = quotaCoreCount;
    }

    /**
    * The number of total instances that can be started (given quotaCoreCount)
    */
    @JsonProperty("quotaCount")
    public Integer getQuotaCount() {
        return this.quota_count;
    }

    /**
    * The number of total instances that can be started (given quotaCoreCount)
    */
    @JsonProperty("quotaCount")
    public void setQuotaCount(Integer quotaCount) {
        this.quota_count = quotaCount;
    }

    /**
    * If true, this bucket represents a currently valid bucket to use for new nodes. If false, this bucket represents existing nodes only.
    */
    @JsonProperty("valid")
    public Boolean getValid() {
        return this.valid;
    }

    /**
    * If true, this bucket represents a currently valid bucket to use for new nodes. If false, this bucket represents existing nodes only.
    */
    @JsonProperty("valid")
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    /**
    * The properties of the virtual machines launched from this bucket
    */
    @JsonProperty("virtualMachine")
    public NodearrayBucketStatusVirtualMachine getVirtualMachine() {
        return this.virtual_machine;
    }

    /**
    * The properties of the virtual machines launched from this bucket
    */
    @JsonProperty("virtualMachine")
    public void setVirtualMachine(NodearrayBucketStatusVirtualMachine virtualMachine) {
        this.virtual_machine = virtualMachine;
    }

}