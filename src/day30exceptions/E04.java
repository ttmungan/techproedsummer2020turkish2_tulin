package day30exceptions;

public class E04 {

	public static void main(String[] args) {
		

			try {

				�al��();

			} catch (Exception e) {

				System.out.println(e.getMessage());

			}

	}

	private static void �al��() {

		throw new RuntimeException("�oook �al��");


		

	}

}
