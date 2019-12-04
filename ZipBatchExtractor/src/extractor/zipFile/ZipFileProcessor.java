package extractor.zipFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipFileProcessor
{
	public void handleZipFilesFolder(String zipFileFolder, String extractionFolder)
	{
		if(!verifyFileExistence(zipFileFolder)) return;
		new File(extractionFolder).mkdirs();
		try
		{
			Files.list(Paths.get(zipFileFolder)).map(Path::toFile).filter(fileObj -> fileObj.getName().endsWith(".zip")).forEach(fileObj-> {
				
			});
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	private boolean verifyFileExistence(String zipFileFolder)
	{
		return new File(zipFileFolder).exists();
	}

	public void extractZipFile(String zipFile, String extractionFolder)
	{
		
	}
}
