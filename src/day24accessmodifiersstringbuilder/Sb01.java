package day24accessmodifiersstringbuilder;

public class Sb01 {

	public static void main(String[] args) {
	
//		StringBuilder stb1= new StringBuilder();
//		System.out.println(stb1);
//		
//		stb1.append("Java");
//		System.out.println(stb1);
//		stb1.append(" Kolaydir");
//		System.out.println(stb1);
//		
//		StringBuilder stb2= new StringBuilder(5);
//		stb2.append("Ali");
//		System.out.println(stb2);
//		
//		StringBuilder stb3= new StringBuilder("Java");
//		System.out.println(stb3);
//		
//		StringBuilder stb4= new StringBuilder("Yalan Dunya!");
//		stb4.append("ahh");
//		System.out.println(stb4.substring(6));
		
		StringBuilder stb5= new StringBuilder();
		stb5.append("Tulin").append(" Nushet").append(" Nusret");
		String s="";
		
		
		
		for (int y=stb5.length()-1;y>=0; y--) {
			s= s+ stb5.charAt(y);
		}
		
		System.out.println(s);
		
		
		stb5.reverse();
		System.out.println(stb5);
		
		stb5.setCharAt(6, 'X');
		System.out.println(stb5);
		
		StringBuilder stb7= new StringBuilder(11);
		stb7.append("tulinoooo");
		System.out.println(stb7.capacity());
		System.out.println(stb7.length());
		
		stb7.substring(8);
		System.out.println(stb7);
	}

}
