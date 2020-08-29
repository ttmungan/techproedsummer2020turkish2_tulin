package day08nestedif;

import java.util.Scanner;

public class Nestedif02 {

	public static void main(String[] args) {
		/* Get a number from the user. If it is positive control it if bigger than 10.
		 * If it is bigger than 10 "woooow" smaller than "hmmmmm".
		 * If it is 0 or negative 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=scan.nextInt();
		if (num>0) {
			if (num>10) {
				System.out.println("woooow");
			} else {
				System.out.println("hmmmmm");}
		}
			if (num<=0) {
			if(num<-10) {
				System.out.println("Disaster");}
			else  {
				System.out.println("So what");}
		}
	
scan.close();
	}

}
