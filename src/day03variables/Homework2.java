package day03variables;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your favourite symbol please :"); // Making a triangle with a symbol//
		char favouriteSymbol = scan.next().charAt(0);
		System.out.println(" "+" "+favouriteSymbol+" "+" ");
		System.out.println(" "+favouriteSymbol+" "+favouriteSymbol+" ");
		System.out.println(favouriteSymbol+" "+favouriteSymbol+" "+favouriteSymbol);
	

	}

}
