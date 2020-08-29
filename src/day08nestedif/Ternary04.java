package day08nestedif;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a number please?:");
		int num = scan.nextInt();
		String Result= (num%2==0) ? "num/2" :"num*num";
		System.out.println(Result);
		
		scan.close();
	}

}
