package day08nestedif;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		// 
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter three edge length please?:");
		int edge1 = scan.nextInt();
		int edge2 = scan.nextInt();
		int edge3 = scan.nextInt();
		String Result= edge1==edge2 && edge2==edge3 ? "eþkenar" :"eþkenar deðil";
		System.out.println(Result);
		scan.close();

	}

}
