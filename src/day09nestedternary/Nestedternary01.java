package day09nestedternary;

import java.util.Scanner;

public class Nestedternary01 {

	public static void main(String[] args) {
		// Get a number from the user. If it is positive check if it is bigger than 9.
		// If>9 number or digit
		// If <0 check if==0 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number please:");
		int num=scan.nextInt();
		String result= (num>0) ? ((num>9) ? ("sayi"):("rakam")) : ((num==0))?("Rakam"):("Negatif Sayi");
		System.out.println();
		

	}

}
