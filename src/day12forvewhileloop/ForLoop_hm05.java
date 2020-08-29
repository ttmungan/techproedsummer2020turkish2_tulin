package day12forvewhileloop;

import java.util.Scanner;

public class ForLoop_hm05 {

	public static void main(String[] args) {

		// to uppercase all chars form beginning to finish. 
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a the first char please?:");
		char ch1= scan.next().charAt(0);
		System.out.println("Enter a the last char please?:");
		char ch2= scan.next().charAt(0);
		char ch3= Character.toUpperCase(ch1);
		char ch4= Character.toUpperCase(ch2);
	
		for (char i=ch3; i<=ch4; i++) {
			System.out.println("The uppercase version is"+" "+i);
		}
		scan.close();
	}

}
