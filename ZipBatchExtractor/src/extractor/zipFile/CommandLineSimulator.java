package extractor.zipFile;

public class CommandLineSimulator
{	
	public static void main(String[] args)
	{
		CommandLineSimulator commandLineSimulator = new CommandLineSimulator();
		String zipFile = null;
		String extractionFolder = null;
		ZipFileProcessor zipFileProcessor = new ZipFileProcessor();
		zipFileProcessor.extractZipFile(zipFile, extractionFolder);
	}

}
