
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
@JsonPropertyOrder({ "onContentLoad", "onLoad" })
public class PageTimings
{

	@JsonProperty("onContentLoad")
	private Integer onContentLoad;
	@JsonProperty("onLoad")
	private Integer onLoad;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("onContentLoad")
	public Integer getOnContentLoad()
	{
		return onContentLoad;
	}

	@JsonProperty("onContentLoad")
	public void setOnContentLoad(Integer onContentLoad)
	{
		this.onContentLoad = onContentLoad;
	}

	public PageTimings withOnContentLoad(Integer onContentLoad)
	{
		this.onContentLoad = onContentLoad;
		return this;
	}

	@JsonProperty("onLoad")
	public Integer getOnLoad()
	{
		return onLoad;
	}

	@JsonProperty("onLoad")
	public void setOnLoad(Integer onLoad)
	{
		this.onLoad = onLoad;
	}

	public PageTimings withOnLoad(Integer onLoad)
	{
		this.onLoad = onLoad;
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

	public PageTimings withAdditionalProperty(String name, Object value)
	{
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("PageTimings [onContentLoad=").append(onContentLoad).append(", onLoad=").append(onLoad).append(", additionalProperties=").append(additionalProperties).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalProperties == null) ? 0 : additionalProperties.hashCode());
		result = prime * result + ((onContentLoad == null) ? 0 : onContentLoad.hashCode());
		result = prime * result + ((onLoad == null) ? 0 : onLoad.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		PageTimings other = (PageTimings) obj;
		if (additionalProperties == null)
		{
			if (other.additionalProperties != null) return false;
		}
		else if (!additionalProperties.equals(other.additionalProperties)) return false;
		if (onContentLoad == null)
		{
			if (other.onContentLoad != null) return false;
		}
		else if (!onContentLoad.equals(other.onContentLoad)) return false;
		if (onLoad == null)
		{
			if (other.onLoad != null) return false;
		}
		else if (!onLoad.equals(other.onLoad)) return false;
		return true;
	}

}
