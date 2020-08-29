package day09nestedternary;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character please:");
		char chr= scan.next().charAt(0);
		
		/*if (chr=='a'||chr=='A') {
			System.out.println("First letter");
		} else if (chr=='b'|| chr=='B') {
			System.out.println("Second Letter");
		} else if (chr=='c'|| chr=='C') {
			System.out.println("Third Letter");
		}
		else {
			System.out.println("Undefined");
		}*/
		
		switch(chr) {
		case 'a':
		case 'A':
			System.out.println("first letter");
			break;
		case 'b':
		case 'B':
			System.out.println("second letter");
			break;
		case 'c':
		case 'C':
			System.out.println("third letter");
			break;
		default:
			System.out.println("Undefined");
		}
		
		scan.close();
	}

}
