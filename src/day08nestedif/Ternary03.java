package day08nestedif;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a character please?:");
		char chr= scan.next().charAt(0);
		String Result= (chr>='a'&& chr<='z')|| (chr>='A' && chr<='Z') ? "letter" :"not letter";
		System.out.println(Result);
		scan.close();

	}

}
