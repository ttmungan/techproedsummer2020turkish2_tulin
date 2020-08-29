package day30exceptions;

public class E04 {

	public static void main(String[] args) {
		

			try {

				çalýþ();

			} catch (Exception e) {

				System.out.println(e.getMessage());

			}

	}

	private static void çalýþ() {

		throw new RuntimeException("Çoook çalýþ");


		

	}

}
