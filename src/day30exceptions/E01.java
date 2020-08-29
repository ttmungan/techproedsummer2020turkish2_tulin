package day30exceptions;

public class E01 {
	
	

	public static void main(String[] args) {
		int a=12;
		int b=3;
		String s1= "";
		String s2=null;
		try {
			System.out.println(a/b);
		}catch (ArithmeticException e) {
			System.out.println("Bir sayýyý sifira bölemezsiniz");
		}

		System.out.println(s1.length());
		System.out.println(s2.length());
	}

}
