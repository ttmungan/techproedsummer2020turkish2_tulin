package day02;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number please:");
		 int num = scan.nextInt();
		 
		 String result= num>0 ? "positive" : num<0 ?  "negative" :"notr";
		 System.out.println(result);
		 scan.close();

	}

}
