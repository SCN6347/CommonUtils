package fileInfoExtractor;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class FolderAnalyzerModule
{

	/**
	 * 
	 * Analyzes the sub-folders of a given folder and prints a report in which the subfolders are sorted by the last updated time.
	 * 
	 * @param folder
	 * 	Name of the folder whose sub-folders needs to be analyzed.
	 */
	private void analyzeFolders(String folder)
	{
		List<FolderInformation> folderInformationList = new ArrayList<FolderInformation>();
		File folderList[] = new File(folder).listFiles();
		Arrays.stream(folderList).filter(file-> file.isDirectory()).forEach(folderObject -> {
			FolderInformation folderInformation = new FolderInformation();
			folderInformation.setFolderName(folderObject.getName());
			folderInformation.setFolderPath(folderObject.getPath());
			analyzeFolder(folderObject, folderInformation);
			folderInformationList.add(folderInformation);
		});
		
		Collections.sort(folderInformationList, new Comparator<FolderInformation>() {

			@Override
			public int compare(FolderInformation arg1, FolderInformation arg2) {
				
				String lastModifiedTimeArg1 = arg1.getLatestFileInfo().getLastModifiedTime();
				int pos = lastModifiedTimeArg1.indexOf('.');
				lastModifiedTimeArg1 = pos < 0 ? lastModifiedTimeArg1 : lastModifiedTimeArg1.substring(0, pos);
				
				String lastModifiedTimeArg2 = arg2.getLatestFileInfo().getLastModifiedTime();
				pos = lastModifiedTimeArg2.indexOf('.');
				lastModifiedTimeArg2 = pos < 0 ? lastModifiedTimeArg2 : lastModifiedTimeArg2.substring(0, pos);
				
				return lastModifiedTimeArg1.compareTo(lastModifiedTimeArg2);
			}
		});
		
		folderInformationList.forEach(folderInfo -> {
			System.out.print("Folder Name: " + folderInfo.getFolderName() + "      ");
			System.out.println(folderInfo.getLatestFileInfo().getLastModifiedTime());
		});
	}
	
	private void analyzeFolder(File folderObject, FolderInformation folderInformation)
	{
		try
		{
			Stream<Path> fileStream = Files.walk(folderObject.toPath(), FileVisitOption.FOLLOW_LINKS);
			fileStream.filter(filePath -> filePath.toFile().isFile()).forEach(pathObj -> analyzeFile(pathObj, folderInformation));

			fileStream.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}

	private void analyzeFile(Path filePathObject, FolderInformation folderInformation)
	{
		try
		{
			File fileObj = filePathObject.toFile();
			FileInfo fileInfo = new FileInfo(fileObj.getName(), fileObj.getPath());
			BasicFileAttributes fileAttributes = Files.readAttributes(filePathObject, BasicFileAttributes.class);
			fileInfo.buildWithFieldCreatedTime(fileAttributes.creationTime().toString())
				.buildWithFieldLastAccessedTime(fileAttributes.lastAccessTime().toString())
				.buildWithFieldLastModifiedTime(fileAttributes.lastModifiedTime().toString());
			FileInfo oldInfo = folderInformation.getLatestFileInfo();
			if(fileInfo.compareTo(oldInfo) > 0) folderInformation.setLatestFileInfo(fileInfo);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		String folder = "<Specify Folder Name to Analyze>";
		new FolderAnalyzerModule().analyzeFolders(folder);
	}
}
