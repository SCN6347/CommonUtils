
package logAnalyzer.harModel;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "pageref", "startedDateTime", "request", "response", "cache", "timings", "time", "_securityState", "serverIPAddress", "connection" })
public class Entry
{

	@JsonProperty("pageref")
	private String pageref;
	@JsonProperty("startedDateTime")
	private String startedDateTime;
	@JsonProperty("request")
	private Request request;
	@JsonProperty("response")
	private Response response;
	@JsonProperty("cache")
	private Cache cache;
	@JsonProperty("timings")
	private Timings timings;
	@JsonProperty("time")
	private Integer time;
	@JsonProperty("_securityState")
	private String securityState;
	@JsonProperty("serverIPAddress")
	private String serverIPAddress;
	@JsonProperty("connection")
	private String connection;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("pageref")
	public String getPageref()
	{
		return pageref;
	}

	@JsonProperty("pageref")
	public void setPageref(String pageref)
	{
		this.pageref = pageref;
	}

	public Entry withPageref(String pageref)
	{
		this.pageref = pageref;
		return this;
	}

	@JsonProperty("startedDateTime")
	public String getStartedDateTime()
	{
		return startedDateTime;
	}

	@JsonProperty("startedDateTime")
	public void setStartedDateTime(String startedDateTime)
	{
		this.startedDateTime = startedDateTime;
	}

	public Entry withStartedDateTime(String startedDateTime)
	{
		this.startedDateTime = startedDateTime;
		return this;
	}

	@JsonProperty("request")
	public Request getRequest()
	{
		return request;
	}

	@JsonProperty("request")
	public void setRequest(Request request)
	{
		this.request = request;
	}

	public Entry withRequest(Request request)
	{
		this.request = request;
		return this;
	}

	@JsonProperty("response")
	public Response getResponse()
	{
		return response;
	}

	@JsonProperty("response")
	public void setResponse(Response response)
	{
		this.response = response;
	}

	public Entry withResponse(Response response)
	{
		this.response = response;
		return this;
	}

	@JsonProperty("cache")
	public Cache getCache()
	{
		return cache;
	}

	@JsonProperty("cache")
	public void setCache(Cache cache)
	{
		this.cache = cache;
	}

	public Entry withCache(Cache cache)
	{
		this.cache = cache;
		return this;
	}

	@JsonProperty("timings")
	public Timings getTimings()
	{
		return timings;
	}

	@JsonProperty("timings")
	public void setTimings(Timings timings)
	{
		this.timings = timings;
	}

	public Entry withTimings(Timings timings)
	{
		this.timings = timings;
		return this;
	}

	@JsonProperty("time")
	public Integer getTime()
	{
		return time;
	}

	@JsonProperty("time")
	public void setTime(Integer time)
	{
		this.time = time;
	}

	public Entry withTime(Integer time)
	{
		this.time = time;
		return this;
	}

	@JsonProperty("_securityState")
	public String getSecurityState()
	{
		return securityState;
	}

	@JsonProperty("_securityState")
	public void setSecurityState(String securityState)
	{
		this.securityState = securityState;
	}

	public Entry withSecurityState(String securityState)
	{
		this.securityState = securityState;
		return this;
	}

	@JsonProperty("serverIPAddress")
	public String getServerIPAddress()
	{
		return serverIPAddress;
	}

	@JsonProperty("serverIPAddress")
	public void setServerIPAddress(String serverIPAddress)
	{
		this.serverIPAddress = serverIPAddress;
	}

	public Entry withServerIPAddress(String serverIPAddress)
	{
		this.serverIPAddress = serverIPAddress;
		return this;
	}

	@JsonProperty("connection")
	public String getConnection()
	{
		return connection;
	}

	@JsonProperty("connection")
	public void setConnection(String connection)
	{
		this.connection = connection;
	}

	public Entry withConnection(String connection)
	{
		this.connection = connection;
		return this;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties()
	{
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value)
	{
		this.additionalProperties.put(name, value);
	}

	public Entry withAdditionalProperty(String name, Object value)
	{
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Entry [pageref=").append(pageref).append(", startedDateTime=").append(startedDateTime).append(", request=").append(request).append(", response=").append(response).append(", cache=").append(cache).append(", timings=").append(timings).append(", time=").append(time).append(", securityState=").append(securityState).append(", serverIPAddress=").append(serverIPAddress).append(", connection=").append(connection).append(", additionalProperties=")
				.append(additionalProperties).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalProperties == null) ? 0 : additionalProperties.hashCode());
		result = prime * result + ((cache == null) ? 0 : cache.hashCode());
		result = prime * result + ((connection == null) ? 0 : connection.hashCode());
		result = prime * result + ((pageref == null) ? 0 : pageref.hashCode());
		result = prime * result + ((request == null) ? 0 : request.hashCode());
		result = prime * result + ((response == null) ? 0 : response.hashCode());
		result = prime * result + ((securityState == null) ? 0 : securityState.hashCode());
		result = prime * result + ((serverIPAddress == null) ? 0 : serverIPAddress.hashCode());
		result = prime * result + ((startedDateTime == null) ? 0 : startedDateTime.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		result = prime * result + ((timings == null) ? 0 : timings.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Entry other = (Entry) obj;
		if (additionalProperties == null)
		{
			if (other.additionalProperties != null) return false;
		}
		else if (!additionalProperties.equals(other.additionalProperties)) return false;
		if (cache == null)
		{
			if (other.cache != null) return false;
		}
		else if (!cache.equals(other.cache)) return false;
		if (connection == null)
		{
			if (other.connection != null) return false;
		}
		else if (!connection.equals(other.connection)) return false;
		if (pageref == null)
		{
			if (other.pageref != null) return false;
		}
		else if (!pageref.equals(other.pageref)) return false;
		if (request == null)
		{
			if (other.request != null) return false;
		}
		else if (!request.equals(other.request)) return false;
		if (response == null)
		{
			if (other.response != null) return false;
		}
		else if (!response.equals(other.response)) return false;
		if (securityState == null)
		{
			if (other.securityState != null) return false;
		}
		else if (!securityState.equals(other.securityState)) return false;
		if (serverIPAddress == null)
		{
			if (other.serverIPAddress != null) return false;
		}
		else if (!serverIPAddress.equals(other.serverIPAddress)) return false;
		if (startedDateTime == null)
		{
			if (other.startedDateTime != null) return false;
		}
		else if (!startedDateTime.equals(other.startedDateTime)) return false;
		if (time == null)
		{
			if (other.time != null) return false;
		}
		else if (!time.equals(other.time)) return false;
		if (timings == null)
		{
			if (other.timings != null) return false;
		}
		else if (!timings.equals(other.timings)) return false;
		return true;
	}

}
