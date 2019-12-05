package modules.extract;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class JarFileProcessor implements FileProcessor
{

	@Override
	public void processFileFolder(String fileFolder, String extractionFolder)
	{
		if(!verifyFileExistence(fileFolder)) return;
		new File(extractionFolder).mkdirs();
		try
		{
			String formatter = extractionFolder.concat("%s");
			Files.list(Paths.get(fileFolder)).map(Path::toFile).filter(fileObj -> fileObj.getName().endsWith(".jar")).forEach(fileObj-> {
			
				String destinationFolderPath = String.format(formatter, fileObj.getName().replace(".jar", ""));
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
		try
		{
			JarFile jarFile = new JarFile(fileObj);
			Enumeration<JarEntry> enumEntries = jarFile.entries();
			String destFileNameFormatter = extractionFolder.concat(File.separator.concat("%s"));
			while (enumEntries.hasMoreElements())
			{
				JarEntry jarEntry  = (JarEntry) enumEntries.nextElement();
				File extractedFile = new File(String.format(destFileNameFormatter, jarEntry.getName()));
				if(extractedFile.isDirectory()) 
				{
					extractedFile.mkdirs();
					continue;
				}
				InputStream inputStream = jarFile.getInputStream(jarEntry);
				FileOutputStream outputStream = new FileOutputStream(extractedFile);
				inputStream.transferTo(outputStream);
				inputStream.close();
				outputStream.close();
			}
			jarFile.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}	
}
