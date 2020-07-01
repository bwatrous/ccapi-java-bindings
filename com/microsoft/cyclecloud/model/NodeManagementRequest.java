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
* Specifies how to perform actions on nodes in a cluster. There are multiple ways to specify nodes, and if more than one way is included, it is treated as a union.

*/
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class NodeManagementRequest extends AbstractModelObject {

    @Deprecated
    @JsonIgnore
    public String filter;

    @Deprecated
    @JsonIgnore
    public List<String> hostnames;

    @Deprecated
    @JsonIgnore
    public List<String> ids;

    @Deprecated
    @JsonIgnore
    public List<String> ip_addresses;

    @Deprecated
    @JsonIgnore
    public List<String> names;

    @Deprecated
    @JsonIgnore
    public String request_id;

    public NodeManagementRequest() {
    }

    public NodeManagementRequest(boolean instantiateProperties) {
        if (instantiateProperties) {
        }
    }

    public static NodeManagementRequest jsonDecode(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
            return mapper.readValue(json, NodeManagementRequest.class);
        } catch(IOException exc) {
            throw new RuntimeException(exc);
        }
    }

    @Deprecated
    public static NodeManagementRequest json_decode(String json) {
        return jsonDecode(json);
    }

    @Deprecated
    public static NodeManagementRequest fromDict(Map<String, Object> dict) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(dict);
        return jsonDecode(json);
    }

    @Deprecated
    public static NodeManagementRequest from_dict(Map<String, Object> dict) throws IOException {
        return fromDict(dict);
    }

    @Deprecated
    public NodeManagementRequest __deepcopy__(Object self) throws IOException {
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

        NodeManagementRequest other = (NodeManagementRequest) obj;

        if (filter == null) {
            if (other.filter != null)
                return false;
        } else if (!filter.equals(other.filter))
            return false;
        if (hostnames == null) {
            if (other.hostnames != null)
                return false;
        } else if (!hostnames.equals(other.hostnames))
            return false;
        if (ids == null) {
            if (other.ids != null)
                return false;
        } else if (!ids.equals(other.ids))
            return false;
        if (ip_addresses == null) {
            if (other.ip_addresses != null)
                return false;
        } else if (!ip_addresses.equals(other.ip_addresses))
            return false;
        if (names == null) {
            if (other.names != null)
                return false;
        } else if (!names.equals(other.names))
            return false;
        if (request_id == null) {
            if (other.request_id != null)
                return false;
        } else if (!request_id.equals(other.request_id))
            return false;
        return true;
    }

    /**
    * A filter expression that matches nodes. Note that strings in the expression must be quoted properly.
    */
    @JsonProperty("filter")
    public String getFilter() {
        return this.filter;
    }

    /**
    * A filter expression that matches nodes. Note that strings in the expression must be quoted properly.
    */
    @JsonProperty("filter")
    public void setFilter(String filter) {
        this.filter = filter;
    }

    /**
    * A list of short hostnames (with no domain) to manage
    */
    @JsonProperty("hostnames")
    public List<String> getHostnames() {
        return this.hostnames;
    }

    /**
    * A list of short hostnames (with no domain) to manage
    */
    @JsonProperty("hostnames")
    public void setHostnames(List<String> hostnames) {
        this.hostnames = hostnames;
    }

    /**
    * A list of node ids to manage
    */
    @JsonProperty("ids")
    public List<String> getIds() {
        return this.ids;
    }

    /**
    * A list of node ids to manage
    */
    @JsonProperty("ids")
    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    /**
    * A list of IP addresses to manage
    */
    @JsonProperty("ip_addresses")
    public List<String> getIpAddresses() {
        return this.ip_addresses;
    }

    /**
    * A list of IP addresses to manage
    */
    @JsonProperty("ip_addresses")
    public void setIpAddresses(List<String> ipAddresses) {
        this.ip_addresses = ipAddresses;
    }

    /**
    * A list of node names to manage
    */
    @JsonProperty("names")
    public List<String> getNames() {
        return this.names;
    }

    /**
    * A list of node names to manage
    */
    @JsonProperty("names")
    public void setNames(List<String> names) {
        this.names = names;
    }

    /**
    * Optional user-supplied unique token to prevent duplicate operations

    */
    @JsonProperty("requestId")
    public String getRequestId() {
        return this.request_id;
    }

    /**
    * Optional user-supplied unique token to prevent duplicate operations

    */
    @JsonProperty("requestId")
    public void setRequestId(String requestId) {
        this.request_id = requestId;
    }

}