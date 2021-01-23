package Assessment1;

import java.util.Scanner;


public class SubMenuOptions {
	
	/**
	 * This method performs operation
	 * on Sub-Menu based on user input.
	 * 
	 * @param userInputScanner
	 */
	public void subMenuList(Scanner userInputScanner) {
		System.out.println("Select an option to perform modification.");
		MenuOption homePage = new MenuOption();
		CreateFile createFile = new CreateFile();
		SearchFile searchFile = new SearchFile();
		DeleteFile deleteFile = new DeleteFile();
		int choice;
		while (true) {
			choice = showSubMenu(userInputScanner);
			switch (choice) {
			case 1 :
				//Method calling to create file here
				System.out.println("Enter file name to create:");
				String inputCreateFileName = userInputScanner.next();
				createFile.createFileClass(inputCreateFileName);
				break;
			case 2 :
				//Method calling to search file here
				System.out.println("Enter file name to begin search: ");
				String inputSearchFileName = userInputScanner.next();
				searchFile.searchFile(inputSearchFileName);
				break;
			case 3 :
				//Method calling to delete file here
				System.out.println("Enter file name to delete : ");
				String inputDeleteFilename = userInputScanner.next();
				deleteFile.delete(inputDeleteFilename);
				break;
			case 4 :
				//Method calling to go back to main menu here
				homePage.showMenu(userInputScanner);
				break;
			default :
				homePage.showMenu(userInputScanner);
			}		
		}
	}
    
	/**
	 * This method displays sub menu.
	 * 
	 * @param userInputScanner
	 * @return
	 */
	public int showSubMenu(Scanner userInputScanner) {
    	System.out.println();
		System.out.println("**********************************");
		System.out.println("****  APPLICATION SUB MENU    ****");
		System.out.println("**********************************");
    	System.out.println("Press 1 - to Create Files");
		System.out.println("Press 2 - to Search Files");
		System.out.println("Press 3 - to Delete Files");
		System.out.println("Press 4 - to Back to Main Menu.");
		System.out.println("");
		System.out.println("Enter your choice here : ");
		
		int choice = userInputScanner.nextInt();
		return choice;
    }
	
	/**
	 * This method is to
	 * unit test.
	 * 
	 * @param a
	 */
	public static void main(String a[]) {
		SubMenuOptions _SubMenuOptions = new SubMenuOptions();
		Scanner testScanner = new Scanner(System.in);
		_SubMenuOptions.subMenuList(testScanner);
	}
}