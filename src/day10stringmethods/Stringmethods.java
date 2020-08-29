package day10stringmethods;

public class Stringmethods {

	public static void main(String[] args) {

		
		
		/*String s = "Java ah java!" ;
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(8)); */
		
		/*String t= "Hayat ah hayat";
		System.out.println(t.contains("y"));
		*/
		
		/*String v= "i love u baby";
		System.out.println(v.length()); */
		
		/*String y= "Maske takýnýz";
		System.out.println(y.toUpperCase()); */
		
		/*String z= "Evde kal!";
		System.out.println(z.toLowerCase()); */
		
		/*String a= "Bir þeyler oldu!";
		System.out.println(a.replace("Bir", "Çok")); */
		
		String b= "Java 1257 ?!@$_";
		
		
		//System.out.println(b.replaceAll("\\d","*"));
		
		System.out.println(b.replaceAll("\\S", "*"));
	
		
		
	}

}
