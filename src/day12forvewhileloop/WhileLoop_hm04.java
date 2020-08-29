package day12forvewhileloop;

import java.util.Scanner;

public class WhileLoop_hm04 {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a the first value please?:");
		int n1 = scan.nextInt();
		System.out.println("Enter the final value please?: ");
		int n2= scan.nextInt();
		int sum=0;
		
		while(n1<=n2) {
		
			sum+=n1;
			n1++;
		}
		System.out.println("The sum is"+" "+sum);
		scan.close();
	}

}
