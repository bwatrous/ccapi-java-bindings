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
public class NodeCreationRequestSet extends AbstractModelObject {

    @Deprecated
    @JsonIgnore
    public Integer count;

    @Deprecated
    @JsonIgnore
    public NodeCreationRequestSetDefinition definition;

    @Deprecated
    @JsonIgnore
    public String name_format;

    @Deprecated
    @JsonIgnore
    public Integer name_offset;

    @Deprecated
    @JsonIgnore
    public Map<String, Object> node_attributes;

    @Deprecated
    @JsonIgnore
    public String nodearray;

    @Deprecated
    @JsonIgnore
    public String placement_group_id;

    public NodeCreationRequestSet() {
    }

    public NodeCreationRequestSet(boolean instantiateProperties) {
        if (instantiateProperties) {
            definition = new NodeCreationRequestSetDefinition(true);
        }
    }

    public static NodeCreationRequestSet jsonDecode(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
            return mapper.readValue(json, NodeCreationRequestSet.class);
        } catch(IOException exc) {
            throw new RuntimeException(exc);
        }
    }

    @Deprecated
    public static NodeCreationRequestSet json_decode(String json) {
        return jsonDecode(json);
    }

    @Deprecated
    public static NodeCreationRequestSet fromDict(Map<String, Object> dict) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(dict);
        return jsonDecode(json);
    }

    @Deprecated
    public static NodeCreationRequestSet from_dict(Map<String, Object> dict) throws IOException {
        return fromDict(dict);
    }

    @Deprecated
    public NodeCreationRequestSet __deepcopy__(Object self) throws IOException {
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

        NodeCreationRequestSet other = (NodeCreationRequestSet) obj;

        if (count != other.count)
            return false;
        if (definition == null) {
            if (other.definition != null)
                return false;
        } else if (!definition.equals(other.definition))
            return false;
        if (name_format == null) {
            if (other.name_format != null)
                return false;
        } else if (!name_format.equals(other.name_format))
            return false;
        if (name_offset != other.name_offset)
            return false;
        if (node_attributes == null) {
            if (other.node_attributes != null)
                return false;
        } else if (!node_attributes.equals(other.node_attributes))
            return false;
        if (nodearray == null) {
            if (other.nodearray != null)
                return false;
        } else if (!nodearray.equals(other.nodearray))
            return false;
        if (placement_group_id == null) {
            if (other.placement_group_id != null)
                return false;
        } else if (!placement_group_id.equals(other.placement_group_id))
            return false;
        return true;
    }

    /**
    * The number of nodes to create
    */
    @JsonProperty("count")
    public Integer getCount() {
        return this.count;
    }

    /**
    * The number of nodes to create
    */
    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
    * The definition of the bucket to use. This is provided by the cluster status API call.  If some of the items given in the status call are missing, or the entire bucket property is missing, the first bucket that matches the given items is used.

    */
    @JsonProperty("definition")
    public NodeCreationRequestSetDefinition getDefinition() {
        return this.definition;
    }

    /**
    * The definition of the bucket to use. This is provided by the cluster status API call.  If some of the items given in the status call are missing, or the entire bucket property is missing, the first bucket that matches the given items is used.

    */
    @JsonProperty("definition")
    public void setDefinition(NodeCreationRequestSetDefinition definition) {
        this.definition = definition;
    }

    /**
    * If given, nodes will use this naming convention instead of the standard "nodearray-%d" format

    */
    @JsonProperty("nameFormat")
    public String getNameFormat() {
        return this.name_format;
    }

    /**
    * If given, nodes will use this naming convention instead of the standard "nodearray-%d" format

    */
    @JsonProperty("nameFormat")
    public void setNameFormat(String nameFormat) {
        this.name_format = nameFormat;
    }

    /**
    * If given, along with nameFormat, offsets nodeindex for new nodes.

    */
    @JsonProperty("nameOffset")
    public Integer getNameOffset() {
        return this.name_offset;
    }

    /**
    * If given, along with nameFormat, offsets nodeindex for new nodes.

    */
    @JsonProperty("nameOffset")
    public void setNameOffset(Integer nameOffset) {
        this.name_offset = nameOffset;
    }

    /**
    * A node record
    */
    @JsonProperty("nodeAttributes")
    public Map<String, Object> getNodeAttributes() {
        return this.node_attributes;
    }

    /**
    * A node record
    */
    @JsonProperty("nodeAttributes")
    public void setNodeAttributes(Map<String, Object> nodeAttributes) {
        this.node_attributes = nodeAttributes;
    }

    /**
    * The name of the nodearray to start nodes from
    */
    @JsonProperty("nodearray")
    public String getNodearray() {
        return this.nodearray;
    }

    /**
    * The name of the nodearray to start nodes from
    */
    @JsonProperty("nodearray")
    public void setNodearray(String nodearray) {
        this.nodearray = nodearray;
    }

    /**
    * If given, nodes with the same value for groupId will all be started in the same placement group.

    */
    @JsonProperty("placementGroupId")
    public String getPlacementGroupId() {
        return this.placement_group_id;
    }

    /**
    * If given, nodes with the same value for groupId will all be started in the same placement group.

    */
    @JsonProperty("placementGroupId")
    public void setPlacementGroupId(String placementGroupId) {
        this.placement_group_id = placementGroupId;
    }

}