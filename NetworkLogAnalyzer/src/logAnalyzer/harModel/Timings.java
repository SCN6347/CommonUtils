
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
@JsonPropertyOrder({ "blocked", "dns", "connect", "ssl", "send", "wait", "receive" })
public class Timings
{

	@JsonProperty("blocked")
	private Integer blocked;
	@JsonProperty("dns")
	private Integer dns;
	@JsonProperty("connect")
	private Integer connect;
	@JsonProperty("ssl")
	private Integer ssl;
	@JsonProperty("send")
	private Integer send;
	@JsonProperty("wait")
	private Integer wait;
	@JsonProperty("receive")
	private Integer receive;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("blocked")
	public Integer getBlocked()
	{
		return blocked;
	}

	@JsonProperty("blocked")
	public void setBlocked(Integer blocked)
	{
		this.blocked = blocked;
	}

	public Timings withBlocked(Integer blocked)
	{
		this.blocked = blocked;
		return this;
	}

	@JsonProperty("dns")
	public Integer getDns()
	{
		return dns;
	}

	@JsonProperty("dns")
	public void setDns(Integer dns)
	{
		this.dns = dns;
	}

	public Timings withDns(Integer dns)
	{
		this.dns = dns;
		return this;
	}

	@JsonProperty("connect")
	public Integer getConnect()
	{
		return connect;
	}

	@JsonProperty("connect")
	public void setConnect(Integer connect)
	{
		this.connect = connect;
	}

	public Timings withConnect(Integer connect)
	{
		this.connect = connect;
		return this;
	}

	@JsonProperty("ssl")
	public Integer getSsl()
	{
		return ssl;
	}

	@JsonProperty("ssl")
	public void setSsl(Integer ssl)
	{
		this.ssl = ssl;
	}

	public Timings withSsl(Integer ssl)
	{
		this.ssl = ssl;
		return this;
	}

	@JsonProperty("send")
	public Integer getSend()
	{
		return send;
	}

	@JsonProperty("send")
	public void setSend(Integer send)
	{
		this.send = send;
	}

	public Timings withSend(Integer send)
	{
		this.send = send;
		return this;
	}

	@JsonProperty("wait")
	public Integer getWait()
	{
		return wait;
	}

	@JsonProperty("wait")
	public void setWait(Integer wait)
	{
		this.wait = wait;
	}

	public Timings withWait(Integer wait)
	{
		this.wait = wait;
		return this;
	}

	@JsonProperty("receive")
	public Integer getReceive()
	{
		return receive;
	}

	@JsonProperty("receive")
	public void setReceive(Integer receive)
	{
		this.receive = receive;
	}

	public Timings withReceive(Integer receive)
	{
		this.receive = receive;
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

	public Timings withAdditionalProperty(String name, Object value)
	{
		this.additionalProperties.put(name, value);
		return this;
	}

	@Override
	public String toString()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("Timings [blocked=").append(blocked).append(", dns=").append(dns).append(", connect=").append(connect).append(", ssl=").append(ssl).append(", send=").append(send).append(", wait=").append(wait).append(", receive=").append(receive).append(", additionalProperties=").append(additionalProperties).append("]");
		return builder.toString();
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalProperties == null) ? 0 : additionalProperties.hashCode());
		result = prime * result + ((blocked == null) ? 0 : blocked.hashCode());
		result = prime * result + ((connect == null) ? 0 : connect.hashCode());
		result = prime * result + ((dns == null) ? 0 : dns.hashCode());
		result = prime * result + ((receive == null) ? 0 : receive.hashCode());
		result = prime * result + ((send == null) ? 0 : send.hashCode());
		result = prime * result + ((ssl == null) ? 0 : ssl.hashCode());
		result = prime * result + ((wait == null) ? 0 : wait.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Timings other = (Timings) obj;
		if (additionalProperties == null)
		{
			if (other.additionalProperties != null) return false;
		}
		else if (!additionalProperties.equals(other.additionalProperties)) return false;
		if (blocked == null)
		{
			if (other.blocked != null) return false;
		}
		else if (!blocked.equals(other.blocked)) return false;
		if (connect == null)
		{
			if (other.connect != null) return false;
		}
		else if (!connect.equals(other.connect)) return false;
		if (dns == null)
		{
			if (other.dns != null) return false;
		}
		else if (!dns.equals(other.dns)) return false;
		if (receive == null)
		{
			if (other.receive != null) return false;
		}
		else if (!receive.equals(other.receive)) return false;
		if (send == null)
		{
			if (other.send != null) return false;
		}
		else if (!send.equals(other.send)) return false;
		if (ssl == null)
		{
			if (other.ssl != null) return false;
		}
		else if (!ssl.equals(other.ssl)) return false;
		if (wait == null)
		{
			if (other.wait != null) return false;
		}
		else if (!wait.equals(other.wait)) return false;
		return true;
	}

}
