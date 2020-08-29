package day06ifstatementdt;

import java.util.Scanner;

public class IfStatament02 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day please:");
		String day= scan.nextLine();
	
		if (day.equals("friday")) {
			System.out.println("It is mubaraq for Muslims");
			
		}
		 if (day.equals("thursday")) {
			 System.out.println("It is mubaraq for Jewish");
			 
		 }
		 
		 if (day.equals("sunday")) {
			 System.out.println("It is mubaraq for christians");
			 scan.close();
		 }
		 


	}

}
