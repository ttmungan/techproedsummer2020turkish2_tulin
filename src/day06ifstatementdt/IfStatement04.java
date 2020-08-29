package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement04 {

	public static void main(String[] args) {
		// Get a number from the user if it is lower than 9 print numeric if it is bigger than 9 print digit
		// If it is bigger than 9 %% lower than 100 print two digit number 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number please:");
		int num = scan.nextInt();
	
		if (num>=0 && num<=9) {
			System.out.println("It is a one digit number ");
			
		}
		 if (num>9 && num<100) {
			 System.out.println("It is a two digit number");
			 
		 }
		 
		
			 scan.close();

	}

}
