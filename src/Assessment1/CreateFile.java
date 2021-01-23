package Assessment1;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class CreateFile {
	
	
	/**
	 * This method
	 * creates files.
	 * 
	 * @param inputCreateFileName
	 */
	public void createFileClass(String inputCreateFileName) {
		String path = "/Users/a-p_macbook/Documents/PUSPITA'S STUDY/JAVA_WORKSPACE/Simplilearn_Projects/src/Maindir/"+inputCreateFileName+".txt";
		File file = new File(path);
		FileWriter fileWriter = null;
		try {
			if(file.createNewFile()) 
				System.out.println("File created named - "+inputCreateFileName+".txt !!");
			else
				System.out.println("File already exists - not able to create.");
			fileWriter = new FileWriter(file);
			fileWriter.write("Text is yet to be written in "+inputCreateFileName+".txt");
		} catch (IOException e) {
			System.out.println("Incorrect file path");
		    e.printStackTrace();
		} finally {
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
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
		CreateFile _creCreateFile = new CreateFile();
		_creCreateFile.createFileClass("FileName3");
	}
}