package day09nestedternary;

import java.util.Scanner;

public class Switchcase_hm03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number please:");
		int num = scan.nextInt();
		
		switch(num) {
		case 9 :
			System.out.println("B�r basamakl� en b�y�k say�");
		break;
		case 99:
			System.out.println("�ki basamakl� en b�y�k say�");
		break;
		case 999:
			System.out.println("�� basamakl� en b�y�k say�");
		break;

		 default:
			 System.out.println("yorum yok");
		}
		scan.close();

	}

}
