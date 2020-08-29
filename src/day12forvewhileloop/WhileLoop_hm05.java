package day12forvewhileloop;

import java.util.Scanner;

public class WhileLoop_hm05 {

	public static void main(String[] args) {
		//The multiplying of all values via while loop
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a the first value please?:");
		int n1 = scan.nextInt();
		System.out.println("Enter the final value please?: ");
		int n2= scan.nextInt();
		int product=1;
		while (n1<=n2) {
			product*=n1;
			n1++;
		}
		System.out.println("the result is"+" "+ product);
		scan.close();
		
		

	}

}
