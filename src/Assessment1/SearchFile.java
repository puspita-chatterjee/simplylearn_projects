package Assessment1;


import java.io.File;

public class SearchFile {
	
	/**
	 * This method performs the search
	 * operation.
	 * 
	 * @param inputSearchFileName
	 */
	public void searchFile (String inputSearchFileName) {
		SearchFile searchObj = new SearchFile();
		String [] fileNames = searchObj.getListOfFileNames();
		boolean isFound = false;
		for(String fileName : fileNames ) {
			if(null != fileName && fileName.equals(inputSearchFileName)) {
				isFound = true;
			}
		}
		if (isFound) {
			System.out.println("File has been found in working directory !!\n");
		} else {
			System.out.println("File has not been found in working directory !!\n");
		}
	}
	
	/**
	 * This method fetches the list of
	 * files from the directory.
	 * 
	 * @return
	 */
	public String[] getListOfFileNames() {
		String [] fileNames = new String [40];
		
		File file = new File("/Users/a-p_macbook/Documents/PUSPITA'S STUDY/JAVA_WORKSPACE/Simplilearn_Projects/src/MainDir");
		File[] files = file.listFiles();
		int counter = 0;
		for(File eachFile : files) {
			fileNames[counter] = eachFile.getName();
			counter++;
		}
		return fileNames;
	}
	
	/**
	 * This method is to
	 * unit test.
	 * 
	 * @param a
	 */
	public static void main(String a[]) {
		SearchFile _SearchFile = new SearchFile();
		_SearchFile.searchFile("File01.txt");
	}
}