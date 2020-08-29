package day30exceptions;

public class E02 {
	/* throw ile throws arasýndaki fark ?
	 * a) throw method body'si icerisinde kullanýlýr. throws ise method parantesi ile curly brace arasýnda 
	 * kullanýlýr. 
	 * b)throw method body içerisinde istediðimiz yerde istediðimiz kadar kullanabiliriz. Throws ise
	 * method parantesi ile curly brace arasýnda sadece bir kere kullanýlýr. 
	 * c) 1 throw sadece 1 tane exception üretir, 1 throws ile birden çok exception kullanilabilir. 
	 * d)throws tan sonra new e gerek yok throw dan sonra new ve cons kullanýlýr. 
	
	 */

	public static void main(String[] args) {
		division (15,3);
		countEgg(-8);
	}
	
	public static void countEgg(int numOfEgg) {
		try {
		if (numOfEgg<0) {
			throw new IllegalArgumentException();
		}
		
		else {
			System.out.println(numOfEgg);
		}
		}catch(IllegalArgumentException e) {
			System.out.println("So what?");
			
			
		}
	}
		
		public static void division(int a, int b) {
		try {
			if (b%2!=0) {
				throw new ArithmeticException();
			}
			else {
				System.out.println(a/b);
			}
		}catch(ArithmeticException e) {
			System.out.println("Tek sayiya bolme");
		}
			
			
			
		}
	}


