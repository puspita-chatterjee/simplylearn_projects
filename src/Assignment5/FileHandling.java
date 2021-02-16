package Assignment5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

	/**
	 * This class performs
	 * 3 file I/O operations.
	 * - Write/Create File
	 * - Read File
	 * - Append contents to an existing file.
	 * 
	 * @author Puspita
	 *
	 */

    public class FileHandling {
    	
    	/**
    	 * This method is to 
    	 * create file.
    	 */
    	private static void writeFile() {
    		String rootDirectory = "/Users/a-p_macbook/Documents/PUSPITA'S STUDY/JAVA_WORKSPACE/Simplilearn_Projects/src/MainDir";
    		//Create file instance
    		File file = new File(rootDirectory, "File19.txt");
    		FileWriter fileWriter = null;
    		try {
    			if(file.createNewFile()) 
    				System.out.println("File created!");
    			else
    				System.out.println("File already exists!");
    			fileWriter = new FileWriter(file);
    			fileWriter.write("Contents of File19..!!");
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			System.out.println("Incorrect file path!");
    			e.printStackTrace();
    		} finally {
    			try {
    				fileWriter.close();
    			} catch (IOException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    		}
    	}
    	
    	/**
    	 * This method appends
    	 * contents on an existing file.
    	 */
    	private static void appendToaFile () throws IOException {
    		String textToAppend = "\r\n Happy Learning !!";
    	    Path path = Paths.get("/Users/a-p_macbook/Documents/PUSPITA'S STUDY/JAVA_WORKSPACE/Simplilearn_Projects/src/MainDir/File19.txt");
    	    Files.write(path, textToAppend.getBytes(), StandardOpenOption.APPEND);
    		
    	}
    	
    	/**
    	 * This method reads
    	 * contents of an existing file
    	 * and prints in console.
    	 */
    	private static void readFiles() throws IOException {
    		File file = new File("/Users/a-p_macbook/Documents/PUSPITA'S STUDY/JAVA_WORKSPACE/Simplilearn_Projects/src/MainDir/File19.txt");
    		BufferedReader br = new BufferedReader(new FileReader(file)); 
    		  
    		  String st; 
    		  while ((st = br.readLine()) != null) 
    		    System.out.println(st);
		}
    	
    	/**
    	 * This is main method.
    	 * to call other methods in
    	 * sequence.
    	 */
		public static void main(String[] args) throws IOException {
			System.out.println("Creating File..");
			//writeFile();
			System.out.println("\n Reading Files..");
			readFiles();
			System.out.println("\n After Appending to the File..");
			appendToaFile();
			readFiles();
		}
    }