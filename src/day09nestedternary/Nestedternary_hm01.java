package day09nestedternary;

import java.util.Scanner;

public class Nestedternary_hm01 {

	public static void main(String[] args) {
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a number please?:");
		int num = scan.nextInt();
		
		String result= num%2==0 ? "even":"odd";
		System.out.println(result);
		scan.close();

	}

}
