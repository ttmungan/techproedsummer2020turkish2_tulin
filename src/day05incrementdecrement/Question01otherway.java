package day05incrementdecrement;

import java.util.Scanner;

public class Question01otherway {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter first number please: ");
		int a= scan.nextInt();
		System.out.println("Enter second number please:");
		int b= scan.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a+" "+b);
		
		

	}

}
