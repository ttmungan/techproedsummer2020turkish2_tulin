package day04variables;

import java.util.Scanner;

public class Day04_homework {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name please:");
		String userName = scan.nextLine();
		System.out.println(userName);
		System.out.println("Enter your surname please:");
		String userSurname = scan.nextLine();
		System.out.println(userSurname);
		System.out.println("your whole name is" + " " + userName + userSurname);
		scan.close();
		
		
		
		
		
		

	}

}
