package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement_homework02 {

	public static void main(String[] args) {
    // Get two numbers from the user and check the sings. 
	// If they are same print same singed numbers or print different signed numbers.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number please:");
		int number1= scan.nextInt();
		System.out.println("Enter second number please:");
		int number2=scan.nextInt();
		
		if (number1>0 && number2>0 || number1<0 && number2<0) {
			System.out.println("They are same signed numbers ");}
		else {
			System.out.println("They are different signed numbers");
		}
		
		scan.close();

	}

}
