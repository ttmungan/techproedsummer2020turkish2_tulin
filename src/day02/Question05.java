package day02;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age please:");
		int a=scan.nextInt();
		System.out.println("Enter your weight please:");
		int w= scan.nextInt();
		
		String result= a>18 && w>50 ?  "Able to donate blood" : "Unabled to donate blood";
			System.out.println(result);
			scan.close();
			
		

	}

}
