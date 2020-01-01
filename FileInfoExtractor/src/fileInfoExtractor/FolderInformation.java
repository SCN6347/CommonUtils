package fileInfoExtractor;

public class FolderInformation
{
	private FileInfo latestFileInfo;
	private String folderName;
	private String folderPath;
	
	public FolderInformation() { }

	public FolderInformation(String folderName, String folderPath)
	{
		this.folderName = folderName;
		this.folderPath = folderPath;
	}

	public FileInfo getLatestFileInfo()
	{
		return latestFileInfo;
	}

	public void setLatestFileInfo(FileInfo latestFileInfo)
	{
		this.latestFileInfo = latestFileInfo;
	}

	public String getFolderName()
	{
		return folderName;
	}

	public void setFolderName(String folderName)
	{
		this.folderName = folderName;
	}

	public String getFolderPath()
	{
		return folderPath;
	}

	public void setFolderPath(String folderPath)
	{
		this.folderPath = folderPath;
	}
	
}
