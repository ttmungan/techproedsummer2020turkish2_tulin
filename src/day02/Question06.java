package day02;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a character please:");
		char ch = scan.next().charAt(0);
		
        String result = ch>='a'&& ch<='z'? "küçük harf" : ch>='A'&&ch<='Z'? "büyük harf":"hatalý giriþ";
        System.out.println(result);
        scan.close();
			
			
		

	}

}
