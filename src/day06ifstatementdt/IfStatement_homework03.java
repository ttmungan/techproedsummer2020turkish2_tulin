package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement_homework03 {

	public static void main(String[] args) {
		// Get a triangler's three edge's lengths 
		// if all are equal with each other print it is an equilateral triangle otherwise print it is not an equilateral triangle. 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first edge length please:");
		double edge1= scan.nextInt();
		System.out.println("Enter the second length please:");
		double edge2=scan.nextInt();
		System.out.println("Enter the third length please:");
		double edge3=scan.nextInt();
		
		if(edge1==edge2 && edge2==edge3) {
			System.out.println("It is an equilateral triangle");}
		else {
			System.out.println("It isn't an equilateral triangle");
		}
		
		scan.close();
		
		

	}

}
