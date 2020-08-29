package day03variables;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("input your total name:");
		String totalName = scan.nextLine();
		
		System.out.println(totalName);
		scan.close();
		
		

	}

}
