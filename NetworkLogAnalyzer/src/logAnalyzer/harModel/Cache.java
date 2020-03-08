
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
@JsonPropertyOrder({ "afterRequest" })
public class Cache
{

	@JsonProperty("afterRequest")
	private AfterRequest afterRequest;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("afterRequest")
	public AfterRequest getAfterRequest()
	{
		return afterRequest;
	}

	@JsonProperty("afterRequest")
	public void setAfterRequest(AfterRequest afterRequest)
	{
		this.afterRequest = afterRequest;
	}

	public Cache withAfterRequest(AfterRequest afterRequest)
	{
		this.afterRequest = afterRequest;
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

	public Cache withAdditionalProperty(String name, Object value)
	{
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Cache [afterRequest=").append(afterRequest).append(", additionalProperties=").append(additionalProperties).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalProperties == null) ? 0 : additionalProperties.hashCode());
		result = prime * result + ((afterRequest == null) ? 0 : afterRequest.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Cache other = (Cache) obj;
		if (additionalProperties == null)
		{
			if (other.additionalProperties != null) return false;
		}
		else if (!additionalProperties.equals(other.additionalProperties)) return false;
		if (afterRequest == null)
		{
			if (other.afterRequest != null) return false;
		}
		else if (!afterRequest.equals(other.afterRequest)) return false;
		return true;
	}

}
