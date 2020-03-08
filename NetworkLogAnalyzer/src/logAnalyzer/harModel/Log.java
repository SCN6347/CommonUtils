
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
@JsonPropertyOrder({ "version", "creator", "browser", "pages", "entries" })
public class Log
{

	@JsonProperty("version")
	private String version;
	@JsonProperty("creator")
	private Creator creator;
	@JsonProperty("browser")
	private Browser browser;
	@JsonProperty("pages")
	private List<Page> pages = new ArrayList<Page>();
	@JsonProperty("entries")
	private List<Entry> entries = new ArrayList<Entry>();
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("version")
	public String getVersion()
	{
		return version;
	}

	@JsonProperty("version")
	public void setVersion(String version)
	{
		this.version = version;
	}

	public Log withVersion(String version)
	{
		this.version = version;
		return this;
	}

	@JsonProperty("creator")
	public Creator getCreator()
	{
		return creator;
	}

	@JsonProperty("creator")
	public void setCreator(Creator creator)
	{
		this.creator = creator;
	}

	public Log withCreator(Creator creator)
	{
		this.creator = creator;
		return this;
	}

	@JsonProperty("browser")
	public Browser getBrowser()
	{
		return browser;
	}

	@JsonProperty("browser")
	public void setBrowser(Browser browser)
	{
		this.browser = browser;
	}

	public Log withBrowser(Browser browser)
	{
		this.browser = browser;
		return this;
	}

	@JsonProperty("pages")
	public List<Page> getPages()
	{
		return pages;
	}

	@JsonProperty("pages")
	public void setPages(List<Page> pages)
	{
		this.pages = pages;
	}

	public Log withPages(List<Page> pages)
	{
		this.pages = pages;
		return this;
	}

	@JsonProperty("entries")
	public List<Entry> getEntries()
	{
		return entries;
	}

	@JsonProperty("entries")
	public void setEntries(List<Entry> entries)
	{
		this.entries = entries;
	}

	public Log withEntries(List<Entry> entries)
	{
		this.entries = entries;
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

	public Log withAdditionalProperty(String name, Object value)
	{
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Log [version=").append(version).append(", creator=").append(creator).append(", browser=").append(browser).append(", pages=").append(pages).append(", entries=").append(entries).append(", additionalProperties=").append(additionalProperties).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalProperties == null) ? 0 : additionalProperties.hashCode());
		result = prime * result + ((browser == null) ? 0 : browser.hashCode());
		result = prime * result + ((creator == null) ? 0 : creator.hashCode());
		result = prime * result + ((entries == null) ? 0 : entries.hashCode());
		result = prime * result + ((pages == null) ? 0 : pages.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Log other = (Log) obj;
		if (additionalProperties == null)
		{
			if (other.additionalProperties != null) return false;
		}
		else if (!additionalProperties.equals(other.additionalProperties)) return false;
		if (browser == null)
		{
			if (other.browser != null) return false;
		}
		else if (!browser.equals(other.browser)) return false;
		if (creator == null)
		{
			if (other.creator != null) return false;
		}
		else if (!creator.equals(other.creator)) return false;
		if (entries == null)
		{
			if (other.entries != null) return false;
		}
		else if (!entries.equals(other.entries)) return false;
		if (pages == null)
		{
			if (other.pages != null) return false;
		}
		else if (!pages.equals(other.pages)) return false;
		if (version == null)
		{
			if (other.version != null) return false;
		}
		else if (!version.equals(other.version)) return false;
		return true;
	}

}
