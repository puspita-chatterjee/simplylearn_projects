package Assessment1;

import java.io.File;

public class DeleteFile {
	
	/**
	 * This method performs
	 * file delete operation.
	 * 
	 * @param filePath
	 */
	public void delete(String filePath) {
		String _fileLocation = "/Users/a-p_macbook/Documents/PUSPITA'S STUDY/JAVA_WORKSPACE/Simplilearn_Projects/src/MainDir/";
		
		File _fileToDelete = new File(_fileLocation+filePath+".txt");
		if(_fileToDelete.exists()) {
			try {
				_fileToDelete.delete();
				System.out.println("File named "+filePath+".txt deleted successfully !!");
			} catch (Exception exce) {
				exce.printStackTrace();
			}
		}else {
			System.out.println("File doesn't exist !!");
		}
	}
	
	/**
	 * This method is to
	 * unit test.
	 * 
	 * @param a
	 */
	public static void main(String [] args) {
		DeleteFile _DeleteFile = new DeleteFile();
		_DeleteFile.delete("New File");
	}
	
}