package day09nestedternary;

import java.util.Scanner;

public class Nestedternary_hm04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number please:");
		int num = scan.nextInt();
		int result= (num>0) ? num:(num*-1);
		System.out.println(result);
		scan.close();

	}

}
