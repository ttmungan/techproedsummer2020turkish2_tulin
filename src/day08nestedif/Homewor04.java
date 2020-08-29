package day08nestedif;

import java.util.Scanner;

public class Homewor04 {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a character please?:");
		char chr= scan.next().charAt(0);
		String Result= (chr>='A' && chr<='Z') ? "capital" :"not capital";
		System.out.println(Result);
		scan.close();

	}

}
