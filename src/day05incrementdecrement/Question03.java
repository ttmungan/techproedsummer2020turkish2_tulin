package day05incrementdecrement;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		// get a three level number from user and find the sum of each number than print it
	
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter a three level number please:");
    int num= scan.nextInt();
    
    int lastNumber= num%10;
    int temp1= num/10;
    int secondNumber = temp1%10;
    int firstNumber= num/100;
    
    int total= lastNumber + secondNumber + firstNumber ;
     System.out.println(total);
    
	
	
	}
	


}
