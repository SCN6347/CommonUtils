package modules.extract;

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

public class ZipFileProcessor implements FileProcessor
{

	@Override
	public void processFileFolder(String fileFolder, String extractionFolder)
	{
		if(!verifyFileExistence(fileFolder)) return;
		new File(extractionFolder).mkdirs();
		try
		{
			String formatter = extractionFolder.concat("%s");
			Files.list(Paths.get(fileFolder)).map(Path::toFile).filter(fileObj -> fileObj.getName().endsWith(".zip")).forEach(fileObj-> {
			
				String destinationFolderPath = String.format(formatter, fileObj.getName().replace(".zip", ""));
				processFile(fileObj, destinationFolderPath);
			});
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public void processFile(File fileObj, String extractionFolder)
	{
		new File(extractionFolder).mkdirs();
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
					String uncompressedFileName = extractionFolder.concat(File.separator).concat(entry.getName());
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

}
