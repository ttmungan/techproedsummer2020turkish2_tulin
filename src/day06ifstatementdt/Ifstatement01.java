package day06ifstatementdt;

import java.util.Scanner;

public class Ifstatement01 {

	public static void main(String[] args) {
		// get a number from  user to divide with 3
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number please:");
		int num= scan.nextInt();
		if (num%3==0) {
			System.out.println("It is able to be divided by 3");
		}

		if(num%3!=0) {
			System.out.println("It isn't able to be divided by 3 ");
		}
	}

}
