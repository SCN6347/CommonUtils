package modules.extract;

public class CommandLineTrigger
{

	public static void main(String[] args)
	{
		String zipFileFolder = null;
		String extractionFolder = null;
		FileProcessor fileProcessor = new FileProcessorFactory().getArchiveFileProcessor(ArchiveType.ZIP);
		fileProcessor.processFileFolder(zipFileFolder, extractionFolder);
	}

}
