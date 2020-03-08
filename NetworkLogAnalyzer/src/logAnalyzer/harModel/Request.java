
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
@JsonPropertyOrder({ "bodySize", "method", "url", "httpVersion", "headers", "cookies", "queryString", "headersSize", "postData" })
public class Request
{

	@JsonProperty("bodySize")
	private Integer bodySize;
	@JsonProperty("method")
	private String method;
	@JsonProperty("url")
	private String url;
	@JsonProperty("httpVersion")
	private String httpVersion;
	@JsonProperty("headers")
	private List<Header> headers = new ArrayList<Header>();
	@JsonProperty("cookies")
	private List<Cooky> cookies = new ArrayList<Cooky>();
	@JsonProperty("queryString")
	private List<QueryString> queryString = new ArrayList<QueryString>();
	@JsonProperty("headersSize")
	private Integer headersSize;
	@JsonProperty("postData")
	private PostData postData;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

	public Request withBodySize(Integer bodySize)
	{
		this.bodySize = bodySize;
		return this;
	}

	@JsonProperty("method")
	public String getMethod()
	{
		return method;
	}

	@JsonProperty("method")
	public void setMethod(String method)
	{
		this.method = method;
	}

	public Request withMethod(String method)
	{
		this.method = method;
		return this;
	}

	@JsonProperty("url")
	public String getUrl()
	{
		return url;
	}

	@JsonProperty("url")
	public void setUrl(String url)
	{
		this.url = url;
	}

	public Request withUrl(String url)
	{
		this.url = url;
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

	public Request withHttpVersion(String httpVersion)
	{
		this.httpVersion = httpVersion;
		return this;
	}

	@JsonProperty("headers")
	public List<Header> getHeaders()
	{
		return headers;
	}

	@JsonProperty("headers")
	public void setHeaders(List<Header> headers)
	{
		this.headers = headers;
	}

	public Request withHeaders(List<Header> headers)
	{
		this.headers = headers;
		return this;
	}

	@JsonProperty("cookies")
	public List<Cooky> getCookies()
	{
		return cookies;
	}

	@JsonProperty("cookies")
	public void setCookies(List<Cooky> cookies)
	{
		this.cookies = cookies;
	}

	public Request withCookies(List<Cooky> cookies)
	{
		this.cookies = cookies;
		return this;
	}

	@JsonProperty("queryString")
	public List<QueryString> getQueryString()
	{
		return queryString;
	}

	@JsonProperty("queryString")
	public void setQueryString(List<QueryString> queryString)
	{
		this.queryString = queryString;
	}

	public Request withQueryString(List<QueryString> queryString)
	{
		this.queryString = queryString;
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

	public Request withHeadersSize(Integer headersSize)
	{
		this.headersSize = headersSize;
		return this;
	}

	@JsonProperty("postData")
	public PostData getPostData()
	{
		return postData;
	}

	@JsonProperty("postData")
	public void setPostData(PostData postData)
	{
		this.postData = postData;
	}

	public Request withPostData(PostData postData)
	{
		this.postData = postData;
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

	public Request withAdditionalProperty(String name, Object value)
	{
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Request [bodySize=").append(bodySize).append(", method=").append(method).append(", url=").append(url).append(", httpVersion=").append(httpVersion).append(", headers=").append(headers).append(", cookies=").append(cookies).append(", queryString=").append(queryString).append(", headersSize=").append(headersSize).append(", postData=").append(postData).append(", additionalProperties=").append(additionalProperties).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalProperties == null) ? 0 : additionalProperties.hashCode());
		result = prime * result + ((bodySize == null) ? 0 : bodySize.hashCode());
		result = prime * result + ((cookies == null) ? 0 : cookies.hashCode());
		result = prime * result + ((headers == null) ? 0 : headers.hashCode());
		result = prime * result + ((headersSize == null) ? 0 : headersSize.hashCode());
		result = prime * result + ((httpVersion == null) ? 0 : httpVersion.hashCode());
		result = prime * result + ((method == null) ? 0 : method.hashCode());
		result = prime * result + ((postData == null) ? 0 : postData.hashCode());
		result = prime * result + ((queryString == null) ? 0 : queryString.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Request other = (Request) obj;
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
		if (method == null)
		{
			if (other.method != null) return false;
		}
		else if (!method.equals(other.method)) return false;
		if (postData == null)
		{
			if (other.postData != null) return false;
		}
		else if (!postData.equals(other.postData)) return false;
		if (queryString == null)
		{
			if (other.queryString != null) return false;
		}
		else if (!queryString.equals(other.queryString)) return false;
		if (url == null)
		{
			if (other.url != null) return false;
		}
		else if (!url.equals(other.url)) return false;
		return true;
	}
}
