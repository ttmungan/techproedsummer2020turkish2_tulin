package ifelseIfstatementdt;

import java.util.Scanner;

public class Ifelseif04 {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("What is your first mark?:");
		double mark1= scan.nextDouble();
		System.out.println("What is your second mark?:");
		double mark2= scan.nextDouble();
		double avarage=(mark1+mark2)/2;
		if (mark1<0 || mark1>100 || mark2<0 || mark2>100) {
			System.out.println("mark can't be this");
			} else if (avarage<50) {
			System.out.println("See u the next year");
		}
		else if (avarage<70) {
			System.out.println("Passed with C");
		}
		else if (avarage<85) {
			System.out.println("Passed with B");}
			else {
				System.out.println("Passed with A");
			}
				
		scan.close();

	}

}
