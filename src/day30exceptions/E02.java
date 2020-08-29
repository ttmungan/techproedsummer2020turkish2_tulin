package day30exceptions;

public class E02 {
	/* throw ile throws aras�ndaki fark ?
	 * a) throw method body'si icerisinde kullan�l�r. throws ise method parantesi ile curly brace aras�nda 
	 * kullan�l�r. 
	 * b)throw method body i�erisinde istedi�imiz yerde istedi�imiz kadar kullanabiliriz. Throws ise
	 * method parantesi ile curly brace aras�nda sadece bir kere kullan�l�r. 
	 * c) 1 throw sadece 1 tane exception �retir, 1 throws ile birden �ok exception kullanilabilir. 
	 * d)throws tan sonra new e gerek yok throw dan sonra new ve cons kullan�l�r. 
	
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


