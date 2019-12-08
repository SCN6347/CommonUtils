package modules.extract;

import java.io.File;

/**
 * 
 * @author scn6347
 *
 */
public interface FileProcessor
{
	public void processFileFolder(String fileFolder, String extractionFolder);
	public void processFile(File fileObj, String extractionFolder);
	
	default void processFile(String filePath, String extractionFolder)
	{
		processFile(new File(filePath), extractionFolder);
	}
	
	default boolean verifyFileExistence(String zipFileFolder)
	{
		return new File(zipFileFolder).exists();
	}
}
