
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
@JsonPropertyOrder({ "mimeType", "size", "text", "encoding" })
public class Content
{

	@JsonProperty("mimeType")
	private String mimeType;
	@JsonProperty("size")
	private Integer size;
	@JsonProperty("text")
	private String text;
	@JsonProperty("encoding")
	private String encoding;
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

	public Content withMimeType(String mimeType)
	{
		this.mimeType = mimeType;
		return this;
	}

	@JsonProperty("size")
	public Integer getSize()
	{
		return size;
	}

	@JsonProperty("size")
	public void setSize(Integer size)
	{
		this.size = size;
	}

	public Content withSize(Integer size)
	{
		this.size = size;
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

	public Content withText(String text)
	{
		this.text = text;
		return this;
	}

	@JsonProperty("encoding")
	public String getEncoding()
	{
		return encoding;
	}

	@JsonProperty("encoding")
	public void setEncoding(String encoding)
	{
		this.encoding = encoding;
	}

	public Content withEncoding(String encoding)
	{
		this.encoding = encoding;
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

	public Content withAdditionalProperty(String name, Object value)
	{
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Content [mimeType=").append(mimeType).append(", size=").append(size).append(", text=").append(text).append(", encoding=").append(encoding).append(", additionalProperties=").append(additionalProperties).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalProperties == null) ? 0 : additionalProperties.hashCode());
		result = prime * result + ((encoding == null) ? 0 : encoding.hashCode());
		result = prime * result + ((mimeType == null) ? 0 : mimeType.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Content other = (Content) obj;
		if (additionalProperties == null)
		{
			if (other.additionalProperties != null) return false;
		}
		else if (!additionalProperties.equals(other.additionalProperties)) return false;
		if (encoding == null)
		{
			if (other.encoding != null) return false;
		}
		else if (!encoding.equals(other.encoding)) return false;
		if (mimeType == null)
		{
			if (other.mimeType != null) return false;
		}
		else if (!mimeType.equals(other.mimeType)) return false;
		if (size == null)
		{
			if (other.size != null) return false;
		}
		else if (!size.equals(other.size)) return false;
		if (text == null)
		{
			if (other.text != null) return false;
		}
		else if (!text.equals(other.text)) return false;
		return true;
	}

}
