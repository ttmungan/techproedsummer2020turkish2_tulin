package day08nestedif;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen bir say� giriniz:");
		int num=scan.nextInt();
		
		if(num%5==0) {
			if(num%10==0) {
				System.out.println("5'e b�l�nebilen �ift say�");
			}
			else {
				System.out.println("5'e b�l�nebilen tek say�");
			}
		}
	
	else {
		System.out.println("Tekrar deneyin.");}
		scan.close();
	
	}

}
