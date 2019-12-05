package extractor.zipFile;

public class CommandLineSimulator
{	
	public static void main(String[] args)
	{
		String zipFileFolder = null;
		String extractionFolder = null;
		ZipFileProcessor zipFileProcessor = new ZipFileProcessor();
		zipFileProcessor.handleZipFilesFolder(zipFileFolder, extractionFolder);
	}

}
