package day12forvewhileloop;

import java.util.Scanner;

public class ForLoop_hm04 {
	// The multiply of all values 

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a the first value please?:");
		int n1 = scan.nextInt();
		System.out.println("Enter the final value please?: ");
		int n2= scan.nextInt();
		int product=1;
		for (int i=n1; i<=n2; i++) {
			product*=i;
		}
		System.out.println("the product is"+" "+ product);
		scan.close();
		
	}

}
