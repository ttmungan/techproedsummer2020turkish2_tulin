package day12forvewhileloop;

import java.util.Scanner;

public class ForLoop_hm03 {

	public static void main(String[] args) {
		// print the sum of all values from first value to the last one
		
		
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a the first value please?:");
		int n1 = scan.nextInt();
		System.out.println("Enter the final value please?: ");
		int n2= scan.nextInt();
		int sum= 0;
		for (int i=n1; i<=n2; i++) {
			sum+=i;
			}
		System.out.println("sum is"+ " " +sum);
		scan.close();
	}

}
