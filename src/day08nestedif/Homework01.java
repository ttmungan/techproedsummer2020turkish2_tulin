package day08nestedif;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayý giriniz:");
		int num=scan.nextInt();
		
		if(num%5==0) {
			if(num%10==0) {
				System.out.println("5'e bölünebilen çift sayý");
			}
			else {
				System.out.println("5'e bölünebilen tek sayý");
			}
		}
	
	else {
		System.out.println("Tekrar deneyin.");}
		scan.close();
	
	}

}
