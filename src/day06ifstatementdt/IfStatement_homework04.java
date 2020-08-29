package day06ifstatementdt;

import java.util.Scanner;

class IfStatement_homework04 {

	public static void main(String[] args) {
		// Get the amount and price of the product from the user. 
		// If the amount is bigger than 1000, discount %10 and print the total cash,
		// Otherwise print the total cash without any discount. 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How many products have you bought?:");
		int amount= scan.nextInt();
		System.out.println("What is the price of the product ?:");
		double price=scan.nextDouble();
		double discount= 0.1;
		
		if (amount>1000) {
			double totalCash1= ((amount*price)-(amount*price*discount));
					System.out.println("Your total charge is :"+" "+totalCash1);
		}
		
		else {
			 double totalCash2= (amount*price);
			 System.out.println("Your total charge is :"+" "+totalCash2);
		} 
		
		scan.close();

	}

}
