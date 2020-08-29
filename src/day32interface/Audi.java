package day32interface;

public class Audi implements Car,Klima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void motor() {
		System.out.println("2.8T Turbo Benzinli");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Gercek deri");
		
	}

	@Override
	public void teker() {
		System.out.println("Michellin 24 inch");
		
	}

	@Override
	public void isitma() {
		System.out.println("Akýllý ýsýtma");
		
	}

	@Override
	public void antiBakteri() {
		System.out.println("Full protection");
		
	}
	
	public void fiyat() {
	}

}
