package day09nestedternary;

import java.util.Scanner;

public class Switchcase_hm02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character please:");
		char ch= scan.next().charAt(0);
		
		
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("sesli harf");
		break;
		case 'b':
		case 'c':
		case 'd':
		case 'f':
			System.out.println("sessiz harf");
		break;
		 default:
			 System.out.println("karaktersiz");
		}
		
		scan.close();

	

	}

}
