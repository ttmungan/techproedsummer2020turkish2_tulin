package day09nestedternary;

import java.util.Scanner;

public class Switchcase_hm03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number please:");
		int num = scan.nextInt();
		
		switch(num) {
		case 9 :
			System.out.println("BÝr basamaklý en büyük sayý");
		break;
		case 99:
			System.out.println("Ýki basamaklý en büyük sayý");
		break;
		case 999:
			System.out.println("Üç basamaklý en büyük sayý");
		break;

		 default:
			 System.out.println("yorum yok");
		}
		scan.close();

	}

}
