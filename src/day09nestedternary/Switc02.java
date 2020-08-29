package day09nestedternary;

import java.util.Scanner;

public class Switc02 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day number please:");
		String day= scan.nextLine();
		switch(day) {
		case "Sunday":
			System.out.println("first day");
			break;
		case "Monday":
			System.out.println("second day");
			break;
		case "Thursday":
			System.out.println("third day");
			break;
		case "Tuesday":
			System.out.println("forth day");
			break;
		case "wednesday":
			System.out.println("fifth day");
			break;
		case "Friday":
			System.out.println("sixthday");
			break;
		case "Saturday":
			System.out.println("7th day");
			break;
		default:
		scan.close();
		}

	}

}
