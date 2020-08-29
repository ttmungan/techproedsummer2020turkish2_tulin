package day09nestedternary;

import java.util.Scanner;

public class Switch04 {

	public static void main(String[] args) {
		
		System.out.println("Enter a number please:");
	    Scanner in = new Scanner(System.in);
	    int day = in.nextInt();
	    switch(day) {
			case 1:
				System.out.println("Pazartesi");
				break;
			case 2:
				System.out.println("Sali");
				break;
			case 3:
				System.out.println("Carsamba");
				break;
			case 4:
				System.out.println("Persembe");
				break;
			case 5:
				System.out.println("Cuma");
				break;
			case 6:
				System.out.println("Cumartesi");
				break;
			case 7:
				System.out.println("Pazar");
				break;}

	
	    in.close();

	}

}
