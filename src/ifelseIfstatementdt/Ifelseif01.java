package ifelseIfstatementdt;

import java.util.Scanner;

public class Ifelseif01 {

	public static void main(String[] args) {
		/*Get number from the user. If it is bigger than 0 print "positive" if equal to 0
		 * print "notr" if smaller than 0 "negative.
		 */

		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a number please:");
		double s= scan.nextDouble();
		if (s>0) {
			System.out.println("positive");
			
		} else if (s==0) {
			System.out.println("notr");
		}
		else if (s<0) {
			System.out.println("negative");
		}
		else {
			System.out.println("I told you to enter just numbers!");
		}
		scan.close();
	}

}
