package day08nestedif;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
		// Ternary, if else's smaller version. 
		
		String result= 5>4? "Elma":"Armut";
		System.out.println(result);
		
		/* Get a number from the user. If it is between 0 and 9 print digit 
		 * or print number
		 */
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a number please:");
		int number = scan.nextInt();
		String Result= number<=9 && number>= 0 ? "digit" :"number";
		System.out.println(Result);
	}
 
}
