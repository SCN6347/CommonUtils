
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
@JsonPropertyOrder({ "startedDateTime", "id", "pageTimings" })
public class Page
{

	@JsonProperty("startedDateTime")
	private String startedDateTime;
	@JsonProperty("id")
	private String id;
	@JsonProperty("pageTimings")
	private PageTimings pageTimings;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

	public Page withStartedDateTime(String startedDateTime)
	{
		this.startedDateTime = startedDateTime;
		return this;
	}

	@JsonProperty("id")
	public String getId()
	{
		return id;
	}

	@JsonProperty("id")
	public void setId(String id)
	{
		this.id = id;
	}

	public Page withId(String id)
	{
		this.id = id;
		return this;
	}

	@JsonProperty("pageTimings")
	public PageTimings getPageTimings()
	{
		return pageTimings;
	}

	@JsonProperty("pageTimings")
	public void setPageTimings(PageTimings pageTimings)
	{
		this.pageTimings = pageTimings;
	}

	public Page withPageTimings(PageTimings pageTimings)
	{
		this.pageTimings = pageTimings;
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

	public Page withAdditionalProperty(String name, Object value)
	{
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Page [startedDateTime=").append(startedDateTime).append(", id=").append(id).append(", pageTimings=").append(pageTimings).append(", additionalProperties=").append(additionalProperties).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalProperties == null) ? 0 : additionalProperties.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((pageTimings == null) ? 0 : pageTimings.hashCode());
		result = prime * result + ((startedDateTime == null) ? 0 : startedDateTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Page other = (Page) obj;
		if (additionalProperties == null)
		{
			if (other.additionalProperties != null) return false;
		}
		else if (!additionalProperties.equals(other.additionalProperties)) return false;
		if (id == null)
		{
			if (other.id != null) return false;
		}
		else if (!id.equals(other.id)) return false;
		if (pageTimings == null)
		{
			if (other.pageTimings != null) return false;
		}
		else if (!pageTimings.equals(other.pageTimings)) return false;
		if (startedDateTime == null)
		{
			if (other.startedDateTime != null) return false;
		}
		else if (!startedDateTime.equals(other.startedDateTime)) return false;
		return true;
	}

}
