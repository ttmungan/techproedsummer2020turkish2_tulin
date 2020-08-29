package day32interface;

public interface Klima {
	int i=20;
	void isitma();
	void antiBakteri();
	void fiyat();
	
	public default void sogutma () {
		System.out.println("Iyi sogutur");
		
	}
	
	public static void freshWeather() {
		System.out.println("Tazeler");
		
	}
}
