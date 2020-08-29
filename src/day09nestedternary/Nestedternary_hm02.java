package day09nestedternary;

import java.util.Scanner;

public class Nestedternary_hm02 {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter first number please?:");
		int num1 = scan.nextInt();
		System.out.println("Enter second number please?:");
		int num2 = scan.nextInt();
		
		int result= (num1>num2)? num1:num2;
		System.out.println(result);
		scan.close();
	}

}
