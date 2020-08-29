package day05incrementdecrement;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		// declare two integer value  
		// than swap these two values
		Scanner scan = new Scanner (System.in);
		System.out.println("enter two numbers please:");
		int s1=scan.nextInt();
		System.out.println("enter two numbers please:");
		int s2=scan.nextInt();
		
		int bos= 0;
		bos=s1;
		s1=s2;
		s2=bos;
 
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(bos);
		
		
		

	}

}
