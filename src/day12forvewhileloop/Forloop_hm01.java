package day12forvewhileloop;

import java.util.Scanner;

public class Forloop_hm01 {

	public static void main(String[] args) {
		// print all values from first value to the last one.

		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a the first value please?:");
		int n1 = scan.nextInt();
		System.out.println("Enter the final value please?: ");
		int n2= scan.nextInt();
		for (int i=n1; i<=n2; i++ ) {
			 System.out.println(i);
			 
			}
		scan.close();
		
	}

}
