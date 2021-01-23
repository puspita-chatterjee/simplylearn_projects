package Assessment1;

import java.util.Scanner;

public class MenuOption {
	
	/**
	 * This is Main Method
	 * of this application.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("     Welcome to LockedMe.com    ");
		System.out.println("Created by Puspita Chatterjee, Trainee, Simplilearn (01/22/2021)");
		System.out.println();
		System.out.println();
		ReadFile viewFile = new ReadFile();
		Scanner userInputScanner = new Scanner(System.in);
		MenuOption menuOption = new MenuOption();
		SubMenuOptions subMenuOptions  = new SubMenuOptions();
		int choice;
		while (true) {
			choice = menuOption.showMenu(userInputScanner);
			switch (choice) {
			case 1 :
				viewFile.readFiles();
				break;
			case 2 :
				subMenuOptions.subMenuList(userInputScanner);
				break;
			case 3 :
				System.out.println("Thanks for using my application. Bye !!");
				userInputScanner.close();
				System.exit(0);
				break;
			default :
				System.out.println("Thanks for using my application. Bye !!");
				userInputScanner.close();
				System.exit(0);
				break;
			}
		}
	}

	/**
	 * This method displays the
	 * main menu.
	 * 
	 * @param userInputScanner
	 * @return
	 */
	public int showMenu(Scanner userInputScanner) {
		System.out.println("**************************************************");
		System.out.println("**********    APPLICATION MAIN MENU    ***********");
		System.out.println("**************************************************");
		System.out.println("Press 1 - to View list of Files");
		System.out.println("Press 2 - to Modify Files [Create/Delete/Search]");
		System.out.println("Press 3 - to Exit the App");
		System.out.println("");
		System.out.println("Enter your choice here : ");
		
		int choice = userInputScanner.nextInt();
		return choice;
	}

}