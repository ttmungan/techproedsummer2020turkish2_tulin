package day06ifstatementdt;

import java.util.Scanner;

public class IfElseStatement02 {
	
	// get number from user the number between 10 and 100 two digit

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number please:");
		int number= scan.nextInt();
		if (number>10||number<100) {
			System.out.println("two digits");}
			else {
				System.out.println("not two digits");}
		scan.close();
		
	
	
			

	}

}
