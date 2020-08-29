package day08nestedif;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many products have you bought?:");
		int product=scan.nextInt();
		System.out.println("What is the price?:");
		double price=scan.nextDouble();
		double discount= 0.1;
		double totalCharge1= product*price;
		double totalCharge2= (product*price)-(product*price*0.1);
		
		
		
		double result= product>1000 ? totalCharge2:totalCharge1;
		System.out.println("Total charge is" + result );
		

			
		}

}
