package day13dowhileloop;

import java.util.Scanner;

public class DoWhileLoop_hm05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String str= "x";

		
		do {
			System.out.println("Bir metin giriniz");
			str=scan.nextLine();
			
			}while (!(str.charAt(0)==(str.charAt(str.length()-1))));	
			System.out.println("Simetrik");
			
			scan.close();

	}

}
