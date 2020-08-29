package day13dowhileloop;

import java.util.Scanner;

public class DoWhileLoop_hm02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s1 =0;
		int s2= 1;
		System.out.println("Ýlk sayýyý giriniz?:");
		s1=scan.nextInt();
		System.out.println("Ýkinci sayýyý giriniz?;");
		s2=scan.nextInt();

		do {

		if (s1%4==0 && s1%6==0) {
				System.out.print(s1+" ");
			}
		
			s1++;
			
			}while(s2>s1);	
		scan.close();

	}

}
