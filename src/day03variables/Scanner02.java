package day03variables;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("enter your whole name :");
		String wholeName = scan.nextLine();
		System.out.println(wholeName);
		
		System.out.println("enter your age :");
		int age= scan.nextInt();
		System.out.println(age);
		
		System.out.println("enter your name's first letter: ");
		char firstLetter = scan.next().charAt(0);
		System.out.println(firstLetter);
		
		System.out.println("enter your children number: ");
		byte childrenNumber = scan.nextByte();
		System.out.println(childrenNumber);
		
		scan.close();
		

	}

}
