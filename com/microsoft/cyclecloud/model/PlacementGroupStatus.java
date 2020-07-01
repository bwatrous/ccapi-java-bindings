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
* Information about each placement group

*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class PlacementGroupStatus extends AbstractModelObject {

    @Deprecated
    @JsonIgnore
    public Integer active_core_count;

    @Deprecated
    @JsonIgnore
    public Integer active_count;

    @Deprecated
    @JsonIgnore
    public String name;

    public PlacementGroupStatus() {
    }

    public PlacementGroupStatus(boolean instantiateProperties) {
        if (instantiateProperties) {
        }
    }

    public static PlacementGroupStatus jsonDecode(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
            return mapper.readValue(json, PlacementGroupStatus.class);
        } catch(IOException exc) {
            throw new RuntimeException(exc);
        }
    }

    @Deprecated
    public static PlacementGroupStatus json_decode(String json) {
        return jsonDecode(json);
    }

    @Deprecated
    public static PlacementGroupStatus fromDict(Map<String, Object> dict) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(dict);
        return jsonDecode(json);
    }

    @Deprecated
    public static PlacementGroupStatus from_dict(Map<String, Object> dict) throws IOException {
        return fromDict(dict);
    }

    @Deprecated
    public PlacementGroupStatus __deepcopy__(Object self) throws IOException {
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

        PlacementGroupStatus other = (PlacementGroupStatus) obj;

        if (active_core_count != other.active_core_count)
            return false;
        if (active_count != other.active_count)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    /**
    * How many cores are in this scaleset
    */
    @JsonProperty("activeCoreCount")
    public Integer getActiveCoreCount() {
        return this.active_core_count;
    }

    /**
    * How many cores are in this scaleset
    */
    @JsonProperty("activeCoreCount")
    public void setActiveCoreCount(Integer activeCoreCount) {
        this.active_core_count = activeCoreCount;
    }

    /**
    * How many nodes are in this scaleset
    */
    @JsonProperty("activeCount")
    public Integer getActiveCount() {
        return this.active_count;
    }

    /**
    * How many nodes are in this scaleset
    */
    @JsonProperty("activeCount")
    public void setActiveCount(Integer activeCount) {
        this.active_count = activeCount;
    }

    /**
    * The unique identifier of this placement group
    */
    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    /**
    * The unique identifier of this placement group
    */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

}