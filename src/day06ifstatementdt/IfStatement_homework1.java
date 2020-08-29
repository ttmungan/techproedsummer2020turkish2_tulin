package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement_homework1 {

	public static void main(String[] args) {
		// Get a character from the user and it is one from "a,e,i,o,u" print "sonant" if is is one from "b,c,d,f," print "consonant".

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character please:");
		char letter = scan.next().charAt(0);
		if (letter=='a' || letter=='e'|| letter=='i'|| letter=='o'||letter=='u') {
			System.out.println("It is a sonant");}
		if (letter=='b'|| letter=='c'|| letter=='d'||letter=='f') {
				System.out.println("It is a consonant");}
				scan.close();
		
		
		
	}

	
}
