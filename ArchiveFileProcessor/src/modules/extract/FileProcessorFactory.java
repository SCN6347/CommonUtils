package modules.extract;

public class FileProcessorFactory
{
	public FileProcessor getArchiveFileProcessor(ArchiveType archiveType)
	{
		switch(archiveType)
		{
			case JAR:
				return new JarFileProcessor();
			case ZIP:
				return new ZipFileProcessor();
		}
		return null;
	}
}
