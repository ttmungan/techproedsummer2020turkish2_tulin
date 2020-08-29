package day12forvewhileloop;

import java.util.Scanner;

public class WhileLoop_hm02 {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter  the first value please?:");
		int n1 = scan.nextInt();
		System.out.println("Enter the final value please?: ");
		int n2= scan.nextInt();

		while (n1<=n2) {
			System.out.println(n1);
			n1++;
		}
		
		scan.close();
	}

}
