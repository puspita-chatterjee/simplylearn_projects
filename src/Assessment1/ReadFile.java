package Assessment1;

import java.io.File;
import java.util.Arrays;

public class ReadFile {
	
	/**
	 * This method Lists
	 * all files in a given
	 * directory.
	 * 
	 */
	public void readFiles() {
		System.out.println("Displaying Lists of sorted Files (in Ascendig order) : ");
		File dir = new File("/Users/a-p_macbook/Documents/PUSPITA'S STUDY/JAVA_WORKSPACE/Simplilearn_Projects/src/MainDir");
		File[] files = dir.listFiles();

	      Arrays.sort(files, (f1, f2) -> f1.compareTo(f2));

	      for (File file : files) {
	         if (!file.isHidden()) {
	            if (file.isDirectory()) {
	               System.out.println("DIR " + file.getName());
	            } else {
	               System.out.println("" + file.getName());
	            }
	         }
	      }	
	}
	
	/**
	 * This method is to
	 * unit test.
	 * 
	 * @param a
	 */
	public static void main(String[] args) {
		ReadFile _ReadFile = new ReadFile();
		_ReadFile.readFiles();
	}
}