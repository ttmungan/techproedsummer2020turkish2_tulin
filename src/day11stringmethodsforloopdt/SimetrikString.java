package day11stringmethodsforloopdt;

import java.util.Scanner;

public class SimetrikString {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("String giriniz");
		String str= scan.nextLine();
		
		char ch= str.charAt(0);
		char ch1= str.charAt(str.length()-1);
		if (ch==ch1) {
			System.out.println("String simetriktir");
		}
		else {
			System.out.println("String simetrik deðildir.");
		}
		
		scan.close();

	}

}
