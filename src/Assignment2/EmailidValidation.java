package Assignment2;

import java.util.Scanner;

public class EmailidValidation {
	
	/**
	 * Main method to start
	 * the program execution.
	 * 
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		EmailidValidation emailidValidation = new EmailidValidation();
		String emailids[] = {"john@outlook.com", "alex@gmail.com", "rose@hotmail.com", 
								"lilly@yahoo.com", "emily@simplylearn.com"};
		System.out.println("Search Email id \n");
			
		//take input from users
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			 System.out.println("Enter a Email Id : \n");
			 String input = scanner.next();
			 if(input.equals("E"))
				 System.exit(0);
			 emailidValidation.searchEmailids(emailids, input);
		}
	}
	
	/**
	 * This method performs the search
	 * operation.
	 * 
	 * @param emailids
	 * @param input
	 */
	private void searchEmailids(String[] emailids, String input) {
		boolean isFound = false;
		for(String emailid : emailids) {
			if(emailid.equals(input)) {
				isFound = true;
				break;
			}
		}
		if (isFound) {
			System.out.println("Found \n");
		} else {
			System.out.println("Not Found \n");
		}
	}
}