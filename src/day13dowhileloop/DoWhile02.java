package day13dowhileloop;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = 12;		
		do {
			if (s%2!=0) {
				System.out.println("kaybettiniz");
				}
			
			System.out.println("Bir sayi giriniz");
			s = scan.nextInt();	

			}while(s%2!=0);	
			System.out.println("Kazandýnýz");
	
	
			scan.close();
		

	}

}
