package ifelseIfstatementdt;

import java.util.Scanner;

public class Ifelseif03 {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("What is your age?:");
		int age= scan.nextInt();
		if (age<0) {
			System.out.println("Age can't be negative");
			} else if (age<13) {
			System.out.println("It can't work");
		}
		else if (age<65) {
			System.out.println("It can work");
		}
		else if (age>65) {
			System.out.println("Retired");
		}

		scan.close();
	}

}
