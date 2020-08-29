package day09nestedternary;

import java.util.Scanner;

public class Nestedternary_hm05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number please:");
		int s1 = scan.nextInt();
		
		String result = s1<1000 && s1>99 ? "Three digit number" : s1%2==0 ? "Non-three digit even number": "Non-three digit odd number";
		System.out.println(result);
		scan.close();

	}

}
