package ifelseIfstatementdt;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {
		/* get a letter from the user.  ýf the letter is  'a' print the first letter.
		 * if it is a 'b' print second letter 
		 * if it is a 'c' print third letter
		 * otherwise print 'dont know the line
		 */

		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a letter please:");
		char chr= scan.next().charAt(0);
		if (chr=='a'|| chr=='A') {
			System.out.println("the first letter");
			
		} else if (chr=='b'||chr=='B') {
			System.out.println("the second letter");
		}
		else if (chr=='c'||chr=='C') {
			System.out.println("the third letter");
		}
		else {
			System.out.println("I don't know the line");}
		
		scan.close();
		}
	}


