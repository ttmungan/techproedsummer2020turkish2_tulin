package day02;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two numbers please:");
		 int num1 = scan.nextInt();
		 int num2 = scan.nextInt();
		 
		 if (num1==num2) {
			 System.out.println(num1+ " = "+num2);}
		 if (num1!=num2) {
			 System.out.println(num1+"!="+num2);
		 }if (num1<=num2) {
			 System.out.println(num1+"<="+num2);
		 }if (num1>=num2) {
			 System.out.println(num1+">="+num2);
		 
		 }if (num1<num2) {
		 System.out.println(num1+"<"+num2);
	     }	 
		 
		 
		 else {
			 System.out.println("b�yle bi�e yok");
		 }
		 
		 
		 scan.close();
		 
		 }

}
