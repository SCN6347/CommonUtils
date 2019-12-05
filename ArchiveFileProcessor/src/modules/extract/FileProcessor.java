package modules.extract;

import java.io.File;

public interface FileProcessor
{
	public void processFileFolder(String fileFolder, String extractionFolder);
	public void processFile(File fileObj, String extractionFolder);
	default void processFile(String filePath, String extractionFolder)
	{
		processFile(new File(filePath), extractionFolder);
	}
}
