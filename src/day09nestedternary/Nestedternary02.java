package day09nestedternary;

import java.util.Scanner;

public class Nestedternary02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three sides of a triangler please");
		int side1 = scan.nextInt();
		int side2 = scan.nextInt();
		int side3 = scan.nextInt();
		int peri= (side1+side2+side3);
		
		
		String result= side1==side2 && side2==side3 ? peri>30 ? "how big u are":"normal" : peri<20? "How small u are":"Normal";
        System.out.println(result);
        scan.close();

	}

}
