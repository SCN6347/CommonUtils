package extractor.zipFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

public class ZipFileProcessor
{
	public void handleZipFilesFolder(String zipFileFolder, String extractionFolder)
	{
		if(!verifyFileExistence(zipFileFolder)) return;
		new File(extractionFolder).mkdirs();
		try
		{
			String formatter = extractionFolder.concat("%s");
			Files.list(Paths.get(zipFileFolder)).map(Path::toFile).filter(fileObj -> fileObj.getName().endsWith(".zip")).forEach(fileObj-> {
			
				String destinationFolderPath = String.format(formatter, fileObj.getName().replace(".zip", ""));
				performZipFileExtraction(destinationFolderPath, fileObj);
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

	
	private void performZipFileExtraction(String destinationFolderPath, File fileObj)
	{
		new File(destinationFolderPath).mkdirs();
		try
		{
			ZipFile file = new ZipFile(fileObj);
			Enumeration<? extends ZipEntry> entries = file.entries();
			while (entries.hasMoreElements())
			{
				ZipEntry entry = entries.nextElement();
				if (!entry.isDirectory())
				{
					InputStream inStream = file.getInputStream(entry);
					String uncompressedFileName = destinationFolderPath.concat(File.separator).concat(entry.getName());
					FileOutputStream fileOutput = new FileOutputStream(uncompressedFileName );
					inStream.transferTo(fileOutput);
					inStream.close();
					fileOutput.close();
				}
			}
			file.close();
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (ZipException e)
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void extractZipFile(String zipFile, String extractionFolder)
	{
		
	}
}
