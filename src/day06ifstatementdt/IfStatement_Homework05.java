package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement_Homework05 {

	public static void main(String[] args) {
		
	// Get a character from the user. 
	// If the character is a letter print it is a letter or print it isn't a letter.
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character please:");
		char chr = scan.next().charAt(0);
		
		
  
		if (chr>='a'&& chr<='z'|| chr>='A'&& chr<='Z') {
			System.out.println("It is a letter");}
		else
			System.out.println("It isn't a letter");
		scan.close();
	}

}
