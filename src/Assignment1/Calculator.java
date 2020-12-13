package Assignment1;

import java.util.Scanner;

public class Calculator {
	public static void main(String [] args) {		
		
		System.out.println("Input Sample - 'number1 opeartor number2.'");
		//Take input numbers and operators from users
		Scanner sc = new Scanner (System.in);		
		
		double number1 = sc.nextDouble();
		char operator = sc.next().charAt(0);
		double number2 = sc.nextDouble ();
		
		//take result variable and initialize to 0
		double result = 0.0;
		
		//switch based on operator
		switch (operator) {
		case '+' :
			result = number1 + number2;
			System.out.println(result);
			break;
		case '-' :
			result = number1 - number2;
			System.out.println(result);
			break;
		case '*' :
			result = number1 * number2;
			System.out.println(result);
			break;
		case '/' :
			result = number1 / number2;
			System.out.println(result);
			break;
		default:
			System.out.println("Invalid input. Try Again !!");
			break;
		}
	}
}