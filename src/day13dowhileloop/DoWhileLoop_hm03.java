package day13dowhileloop;

import java.util.Scanner;

public class DoWhileLoop_hm03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num=10;
		int sum=0;
		
		do {
		
		System.out.println("Bir say�y� giriniz?:");
		num=scan.nextInt();	
			
		sum+=num;	
		}while (num!=0);
		
		System.out.println("�imdiye kadarki say�lar�n toplam�"+" "+sum);
		scan.close();

	}

}
