package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		
		// Get a number from the user. If it is between 0 and 9 print digit.
		// If it is >9 or <0 print number
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a digit please:");
		int num = scan.nextInt();
	
		if (num>9 || num<0) {
			System.out.println("It is a one digit number ");
			
		}
		 if (num>=0 && num<=9) {
			 System.out.println("It is a  number");
			 
		 }
		 
		
			 scan.close();

	}

}
