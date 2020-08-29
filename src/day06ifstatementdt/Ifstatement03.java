package day06ifstatementdt;

import java.util.Scanner;

public class Ifstatement03 {

	public static void main(String[] args) {

			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter a number please:");
			int num = scan.nextInt();
		
			if (num<0) {
				System.out.println("It is a negative number");
				
			}
			 if (num>0) {
				 System.out.println("It is a positive number");
				 
			 }
			 
			 if (num==0) {
				 System.out.println("It is notr");
				 scan.close();}

	}

}
