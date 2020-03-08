
package logAnalyzer.harModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "mimeType", "params", "text" })
public class PostData
{

	@JsonProperty("mimeType")
	private String mimeType;
	@JsonProperty("params")
	private List<Param> params = new ArrayList<Param>();
	@JsonProperty("text")
	private String text;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("mimeType")
	public String getMimeType()
	{
		return mimeType;
	}

	@JsonProperty("mimeType")
	public void setMimeType(String mimeType)
	{
		this.mimeType = mimeType;
	}

	public PostData withMimeType(String mimeType)
	{
		this.mimeType = mimeType;
		return this;
	}

	@JsonProperty("params")
	public List<Param> getParams()
	{
		return params;
	}

	@JsonProperty("params")
	public void setParams(List<Param> params)
	{
		this.params = params;
	}

	public PostData withParams(List<Param> params)
	{
		this.params = params;
		return this;
	}

	@JsonProperty("text")
	public String getText()
	{
		return text;
	}

	@JsonProperty("text")
	public void setText(String text)
	{
		this.text = text;
	}

	public PostData withText(String text)
	{
		this.text = text;
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

	public PostData withAdditionalProperty(String name, Object value)
	{
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("PostData [mimeType=").append(mimeType).append(", params=").append(params).append(", text=").append(text).append(", additionalProperties=").append(additionalProperties).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalProperties == null) ? 0 : additionalProperties.hashCode());
		result = prime * result + ((mimeType == null) ? 0 : mimeType.hashCode());
		result = prime * result + ((params == null) ? 0 : params.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		PostData other = (PostData) obj;
		if (additionalProperties == null)
		{
			if (other.additionalProperties != null) return false;
		}
		else if (!additionalProperties.equals(other.additionalProperties)) return false;
		if (mimeType == null)
		{
			if (other.mimeType != null) return false;
		}
		else if (!mimeType.equals(other.mimeType)) return false;
		if (params == null)
		{
			if (other.params != null) return false;
		}
		else if (!params.equals(other.params)) return false;
		if (text == null)
		{
			if (other.text != null) return false;
		}
		else if (!text.equals(other.text)) return false;
		return true;
	}

}
