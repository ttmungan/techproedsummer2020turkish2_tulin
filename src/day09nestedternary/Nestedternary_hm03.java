package day09nestedternary;

import java.util.Scanner;

public class Nestedternary_hm03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter width please:");
		int s1 = scan.nextInt();
		System.out.println("Enter length please:");
		int s2 = scan.nextInt();

		String result = (s1==s2) ? "Square" :"Rectangler";
		System.out.println(result);
		scan.close();
		

	}

}
