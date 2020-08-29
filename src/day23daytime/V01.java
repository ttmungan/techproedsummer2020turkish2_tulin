package day23daytime;

public class V01 {

	public static void main(String[] args) {
		
		// Varargs: (Variable Arguments) Varargs normalde bir arraydir. Ama uzunlu�u kullan�c�n�n girdi�i 
		// de�er say�s�na g�re b�y�r. 
		// Varargs'tan sonra ba�ka parametre kullan�lamaz. Varargs method parantezi i�erisinde en sonda olmal�d�r.
		// Varargs sonda olduktan sonra Varars'�n �ncesinde Varargs olmayan parametreler kullan�labilir. 
		add(3,5,6);
		add(3,5,7,9,3,5,6);
		product (1,3,5);

	}

	public static void add (int s1, int s2, int s3){
		System.out.println(s1+s2+s3);
	}
	
	public static void add(int ...x) {
		int sum=0;
		for (int w:x) {
			sum=sum+w;
		}
		System.out.println(sum);
	}
	public static void product(int ...y) {
		int multi=1;
		for (int w:y) {
			multi=(multi*w);
		}
		System.out.println(multi);
	}
	
}

// Get the word's letters and concat them according to the input line. 
	

	

