package day12forvewhileloop;

import java.util.Scanner;

public class WhileLoop_hm03 {

	public static void main(String[] args) {
		//all even numbers from first value to the last one via while loop.
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a the first value please?:");
		int n1 = scan.nextInt();
		System.out.println("Enter the final value please?: ");
		int n2= scan.nextInt();
		
		while (n1<=n2) {
			if (n1%2==0)
				System.out.println(n1);
			n1++;
		}
		scan.close();
	}

}
