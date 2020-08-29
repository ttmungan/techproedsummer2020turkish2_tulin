package day08nestedif;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first side of a triangler please:");
		int side1=scan.nextInt();
		System.out.println("Enter second side of a triangler please:");
		int side2=scan.nextInt();
		System.out.println("Enter third side of a triangler please:");
		int side3=scan.nextInt();
		String Result= (side1==side2) && (side2!=side3) ? "isosceles triangler" :"not isosceles triangler";
		System.out.println(Result);
		scan.close();
		
	}

}
