package day09nestedternary;

import java.util.Scanner;

public class Switchcase_hm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day name please:");
		String day= scan.nextLine();
		switch(day) {
		case "Sunday":
			System.out.println("blessed day of Christians");
			break;
		case "Friday":
			System.out.println("blessed day of Muslims");
			break;
		case "Saturday":
			System.out.println("blessed day of Jewish");
			break;
			default:
			System.out.println("unblessed day");
		}
			
			scan.close();

	}

}

	
	