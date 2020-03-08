
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
@JsonPropertyOrder({ "status", "statusText", "httpVersion", "headers", "cookies", "content", "redirectURL", "headersSize", "bodySize" })
public class Response
{

	@JsonProperty("status")
	private Integer status;
	@JsonProperty("statusText")
	private String statusText;
	@JsonProperty("httpVersion")
	private String httpVersion;
	@JsonProperty("headers")
	private List<Header_> headers = new ArrayList<Header_>();
	@JsonProperty("cookies")
	private List<Object> cookies = new ArrayList<Object>();
	@JsonProperty("content")
	private Content content;
	@JsonProperty("redirectURL")
	private String redirectURL;
	@JsonProperty("headersSize")
	private Integer headersSize;
	@JsonProperty("bodySize")
	private Integer bodySize;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("status")
	public Integer getStatus()
	{
		return status;
	}

	@JsonProperty("status")
	public void setStatus(Integer status)
	{
		this.status = status;
	}

	public Response withStatus(Integer status)
	{
		this.status = status;
		return this;
	}

	@JsonProperty("statusText")
	public String getStatusText()
	{
		return statusText;
	}

	@JsonProperty("statusText")
	public void setStatusText(String statusText)
	{
		this.statusText = statusText;
	}

	public Response withStatusText(String statusText)
	{
		this.statusText = statusText;
		return this;
	}

	@JsonProperty("httpVersion")
	public String getHttpVersion()
	{
		return httpVersion;
	}

	@JsonProperty("httpVersion")
	public void setHttpVersion(String httpVersion)
	{
		this.httpVersion = httpVersion;
	}

	public Response withHttpVersion(String httpVersion)
	{
		this.httpVersion = httpVersion;
		return this;
	}

	@JsonProperty("headers")
	public List<Header_> getHeaders()
	{
		return headers;
	}

	@JsonProperty("headers")
	public void setHeaders(List<Header_> headers)
	{
		this.headers = headers;
	}

	public Response withHeaders(List<Header_> headers)
	{
		this.headers = headers;
		return this;
	}

	@JsonProperty("cookies")
	public List<Object> getCookies()
	{
		return cookies;
	}

	@JsonProperty("cookies")
	public void setCookies(List<Object> cookies)
	{
		this.cookies = cookies;
	}

	public Response withCookies(List<Object> cookies)
	{
		this.cookies = cookies;
		return this;
	}

	@JsonProperty("content")
	public Content getContent()
	{
		return content;
	}

	@JsonProperty("content")
	public void setContent(Content content)
	{
		this.content = content;
	}

	public Response withContent(Content content)
	{
		this.content = content;
		return this;
	}

	@JsonProperty("redirectURL")
	public String getRedirectURL()
	{
		return redirectURL;
	}

	@JsonProperty("redirectURL")
	public void setRedirectURL(String redirectURL)
	{
		this.redirectURL = redirectURL;
	}

	public Response withRedirectURL(String redirectURL)
	{
		this.redirectURL = redirectURL;
		return this;
	}

	@JsonProperty("headersSize")
	public Integer getHeadersSize()
	{
		return headersSize;
	}

	@JsonProperty("headersSize")
	public void setHeadersSize(Integer headersSize)
	{
		this.headersSize = headersSize;
	}

	public Response withHeadersSize(Integer headersSize)
	{
		this.headersSize = headersSize;
		return this;
	}

	@JsonProperty("bodySize")
	public Integer getBodySize()
	{
		return bodySize;
	}

	@JsonProperty("bodySize")
	public void setBodySize(Integer bodySize)
	{
		this.bodySize = bodySize;
	}

	public Response withBodySize(Integer bodySize)
	{
		this.bodySize = bodySize;
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

	public Response withAdditionalProperty(String name, Object value)
	{
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Response [status=").append(status).append(", statusText=").append(statusText).append(", httpVersion=").append(httpVersion).append(", headers=").append(headers).append(", cookies=").append(cookies).append(", content=").append(content).append(", redirectURL=").append(redirectURL).append(", headersSize=").append(headersSize).append(", bodySize=").append(bodySize).append(", additionalProperties=").append(additionalProperties).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalProperties == null) ? 0 : additionalProperties.hashCode());
		result = prime * result + ((bodySize == null) ? 0 : bodySize.hashCode());
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((cookies == null) ? 0 : cookies.hashCode());
		result = prime * result + ((headers == null) ? 0 : headers.hashCode());
		result = prime * result + ((headersSize == null) ? 0 : headersSize.hashCode());
		result = prime * result + ((httpVersion == null) ? 0 : httpVersion.hashCode());
		result = prime * result + ((redirectURL == null) ? 0 : redirectURL.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((statusText == null) ? 0 : statusText.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Response other = (Response) obj;
		if (additionalProperties == null)
		{
			if (other.additionalProperties != null) return false;
		}
		else if (!additionalProperties.equals(other.additionalProperties)) return false;
		if (bodySize == null)
		{
			if (other.bodySize != null) return false;
		}
		else if (!bodySize.equals(other.bodySize)) return false;
		if (content == null)
		{
			if (other.content != null) return false;
		}
		else if (!content.equals(other.content)) return false;
		if (cookies == null)
		{
			if (other.cookies != null) return false;
		}
		else if (!cookies.equals(other.cookies)) return false;
		if (headers == null)
		{
			if (other.headers != null) return false;
		}
		else if (!headers.equals(other.headers)) return false;
		if (headersSize == null)
		{
			if (other.headersSize != null) return false;
		}
		else if (!headersSize.equals(other.headersSize)) return false;
		if (httpVersion == null)
		{
			if (other.httpVersion != null) return false;
		}
		else if (!httpVersion.equals(other.httpVersion)) return false;
		if (redirectURL == null)
		{
			if (other.redirectURL != null) return false;
		}
		else if (!redirectURL.equals(other.redirectURL)) return false;
		if (status == null)
		{
			if (other.status != null) return false;
		}
		else if (!status.equals(other.status)) return false;
		if (statusText == null)
		{
			if (other.statusText != null) return false;
		}
		else if (!statusText.equals(other.statusText)) return false;
		return true;
	}

}
