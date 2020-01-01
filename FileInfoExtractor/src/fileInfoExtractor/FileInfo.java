package fileInfoExtractor;

public class FileInfo implements Comparable<FileInfo>
{
	private String fileName;
	private String filePath;
	private String createdTime;
	private String lastModifiedTime;
	private String lastAccessedTime;
	
	public FileInfo() { }

	public FileInfo(String fileName, String filePath)
	{
		this.fileName = fileName;
		this.filePath = filePath;
	}

	public String getFileName()
	{
		return fileName;
	}

	public void setFileName(String fileName)
	{
		this.fileName = fileName;
	}

	public String getFilePath()
	{
		return filePath;
	}

	public void setFilePath(String filePath)
	{
		this.filePath = filePath;
	}

	public String getCreatedTime()
	{
		return createdTime;
	}

	public void setCreatedTime(String createdTime)
	{
		this.createdTime = createdTime;
	}

	public String getLastModifiedTime()
	{
		return lastModifiedTime;
	}

	public void setLastModifiedTime(String lastModifiedTime)
	{
		this.lastModifiedTime = lastModifiedTime;
	}

	public String getLastAccessedTime()
	{
		return lastAccessedTime;
	}

	public void setLastAccessedTime(String lastAccessedTime)
	{
		this.lastAccessedTime = lastAccessedTime;
	}

	public FileInfo buildWithFieldFileName(String fileName)
	{
		this.fileName = fileName;
		return this;
	}
	
	public FileInfo buildWithFieldFilePath(String filePath)
	{
		this.filePath = filePath;
		return this;
	}
	
	public FileInfo buildWithFieldCreatedTime(String createdTime)
	{
		this.createdTime = createdTime;
		return this;
	}
	
	public FileInfo buildWithFieldLastModifiedTime(String lastModifiedTime)
	{
		this.lastModifiedTime = lastModifiedTime;
		return this;
	}
	
	public FileInfo buildWithFieldLastAccessedTime(String lastAccessedTime)
	{
		this.lastAccessedTime = lastAccessedTime;
		return this;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdTime == null) ? 0 : createdTime.hashCode());
		result = prime * result + ((fileName == null) ? 0 : fileName.hashCode());
		result = prime * result + ((filePath == null) ? 0 : filePath.hashCode());
		result = prime * result + ((lastAccessedTime == null) ? 0 : lastAccessedTime.hashCode());
		result = prime * result + ((lastModifiedTime == null) ? 0 : lastModifiedTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		FileInfo other = (FileInfo) obj;
		if (createdTime == null)
		{
			if (other.createdTime != null) return false;
		}
		else if (!createdTime.equals(other.createdTime)) return false;
		if (fileName == null)
		{
			if (other.fileName != null) return false;
		}
		else if (!fileName.equals(other.fileName)) return false;
		if (filePath == null)
		{
			if (other.filePath != null) return false;
		}
		else if (!filePath.equals(other.filePath)) return false;
		if (lastAccessedTime == null)
		{
			if (other.lastAccessedTime != null) return false;
		}
		else if (!lastAccessedTime.equals(other.lastAccessedTime)) return false;
		if (lastModifiedTime == null)
		{
			if (other.lastModifiedTime != null) return false;
		}
		else if (!lastModifiedTime.equals(other.lastModifiedTime)) return false;
		return true;
	}

	@Override
	public int compareTo(FileInfo fileInfo)
	{
		if(fileInfo == null) return 1;
		if(this.lastModifiedTime != null && fileInfo.lastModifiedTime !=null) 
		{
			if(!this.lastModifiedTime.isEmpty() && ! fileInfo.lastModifiedTime.isEmpty())
			return this.lastModifiedTime.compareTo(fileInfo.lastModifiedTime); 
//			else
//			{
//				if(this.lastModifiedTime.isEmpty()) return -1;
//				
//			}
		}
		return -1;
	}
	
}
