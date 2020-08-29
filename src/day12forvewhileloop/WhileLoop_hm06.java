package day12forvewhileloop;

import java.util.Scanner;

public class WhileLoop_hm06 {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter a the  value please?:");
		int n1 = scan.nextInt();
		int carpma=1;
		
		for (int i=1; i<=10; i++) {
			carpma= i*n1;
			
		System.out.println(i +"x"+n1+"="+carpma);
		
		
		}
		
			
		scan.close();

	}

}
