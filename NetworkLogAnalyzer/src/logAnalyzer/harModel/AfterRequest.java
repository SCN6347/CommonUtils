
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
@JsonPropertyOrder({ "expires", "lastFetched", "eTag", "fetchCount", "_dataSize", "_lastModified", "_device" })
public class AfterRequest
{

	@JsonProperty("expires")
	private Boolean expires;
	@JsonProperty("lastFetched")
	private Boolean lastFetched;
	@JsonProperty("eTag")
	private Boolean eTag;
	@JsonProperty("fetchCount")
	private Boolean fetchCount;
	@JsonProperty("_dataSize")
	private Boolean dataSize;
	@JsonProperty("_lastModified")
	private Boolean lastModified;
	@JsonProperty("_device")
	private Boolean device;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("expires")
	public Boolean getExpires()
	{
		return expires;
	}

	@JsonProperty("expires")
	public void setExpires(Boolean expires)
	{
		this.expires = expires;
	}

	public AfterRequest withExpires(Boolean expires)
	{
		this.expires = expires;
		return this;
	}

	@JsonProperty("lastFetched")
	public Boolean getLastFetched()
	{
		return lastFetched;
	}

	@JsonProperty("lastFetched")
	public void setLastFetched(Boolean lastFetched)
	{
		this.lastFetched = lastFetched;
	}

	public AfterRequest withLastFetched(Boolean lastFetched)
	{
		this.lastFetched = lastFetched;
		return this;
	}

	@JsonProperty("eTag")
	public Boolean getETag()
	{
		return eTag;
	}

	@JsonProperty("eTag")
	public void setETag(Boolean eTag)
	{
		this.eTag = eTag;
	}

	public AfterRequest withETag(Boolean eTag)
	{
		this.eTag = eTag;
		return this;
	}

	@JsonProperty("fetchCount")
	public Boolean getFetchCount()
	{
		return fetchCount;
	}

	@JsonProperty("fetchCount")
	public void setFetchCount(Boolean fetchCount)
	{
		this.fetchCount = fetchCount;
	}

	public AfterRequest withFetchCount(Boolean fetchCount)
	{
		this.fetchCount = fetchCount;
		return this;
	}

	@JsonProperty("_dataSize")
	public Boolean getDataSize()
	{
		return dataSize;
	}

	@JsonProperty("_dataSize")
	public void setDataSize(Boolean dataSize)
	{
		this.dataSize = dataSize;
	}

	public AfterRequest withDataSize(Boolean dataSize)
	{
		this.dataSize = dataSize;
		return this;
	}

	@JsonProperty("_lastModified")
	public Boolean getLastModified()
	{
		return lastModified;
	}

	@JsonProperty("_lastModified")
	public void setLastModified(Boolean lastModified)
	{
		this.lastModified = lastModified;
	}

	public AfterRequest withLastModified(Boolean lastModified)
	{
		this.lastModified = lastModified;
		return this;
	}

	@JsonProperty("_device")
	public Boolean getDevice()
	{
		return device;
	}

	@JsonProperty("_device")
	public void setDevice(Boolean device)
	{
		this.device = device;
	}

	public AfterRequest withDevice(Boolean device)
	{
		this.device = device;
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

	public AfterRequest withAdditionalProperty(String name, Object value)
	{
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("AfterRequest [expires=").append(expires).append(", lastFetched=").append(lastFetched).append(", eTag=").append(eTag).append(", fetchCount=").append(fetchCount).append(", dataSize=").append(dataSize).append(", lastModified=").append(lastModified).append(", device=").append(device).append(", additionalProperties=").append(additionalProperties).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalProperties == null) ? 0 : additionalProperties.hashCode());
		result = prime * result + ((dataSize == null) ? 0 : dataSize.hashCode());
		result = prime * result + ((device == null) ? 0 : device.hashCode());
		result = prime * result + ((eTag == null) ? 0 : eTag.hashCode());
		result = prime * result + ((expires == null) ? 0 : expires.hashCode());
		result = prime * result + ((fetchCount == null) ? 0 : fetchCount.hashCode());
		result = prime * result + ((lastFetched == null) ? 0 : lastFetched.hashCode());
		result = prime * result + ((lastModified == null) ? 0 : lastModified.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		AfterRequest other = (AfterRequest) obj;
		if (additionalProperties == null)
		{
			if (other.additionalProperties != null) return false;
		}
		else if (!additionalProperties.equals(other.additionalProperties)) return false;
		if (dataSize == null)
		{
			if (other.dataSize != null) return false;
		}
		else if (!dataSize.equals(other.dataSize)) return false;
		if (device == null)
		{
			if (other.device != null) return false;
		}
		else if (!device.equals(other.device)) return false;
		if (eTag == null)
		{
			if (other.eTag != null) return false;
		}
		else if (!eTag.equals(other.eTag)) return false;
		if (expires == null)
		{
			if (other.expires != null) return false;
		}
		else if (!expires.equals(other.expires)) return false;
		if (fetchCount == null)
		{
			if (other.fetchCount != null) return false;
		}
		else if (!fetchCount.equals(other.fetchCount)) return false;
		if (lastFetched == null)
		{
			if (other.lastFetched != null) return false;
		}
		else if (!lastFetched.equals(other.lastFetched)) return false;
		if (lastModified == null)
		{
			if (other.lastModified != null) return false;
		}
		else if (!lastModified.equals(other.lastModified)) return false;
		return true;
	}
}
