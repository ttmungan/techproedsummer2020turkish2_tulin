package day09nestedternary;

import java.util.Scanner;

public class Nestedternary_hm06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a year please:");
		int year = scan.nextInt();
		
		String result = (year%4==0 && year%100==0) && (year%400 ==0)?  year%4000!=0 ? "Art�k y�l": "Art�k y�l de�il ":
			year%4==0 ? "Art�k y�l" : "Art�k y�l de�il";
		System.out.println(result);
		scan.close();
	}

}
