package day11stringmethodsforloopdt;

public class StringMethods01 {

	public static void main(String[] args) {
		// stratswith
		String a = "Hadi gidelim bu diyardan!";
		System.out.println(a.startsWith("H"));
		
		System.out.println(a.startsWith("g",5));
		
		System.out.println(a.indexOf("i"));
		
		System.out.println(a.indexOf('d'));
		
		String c= "Karakartal";
		
		System.out.println(c.substring(4));
		
		System.out.println(c.substring(1));
		
		System.out.println(c.substring(5,3));
		
		
		
	}

}
