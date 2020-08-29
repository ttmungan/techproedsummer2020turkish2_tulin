package day14methodcreation;

public class Mc01 {

	public static void main(String[] args) {


		carpma(3,2);
		carpma(7,8);
		
		toplama(3,5);
		
	
	}

	public static void carpma (int n1, int n2) {
		
		System.out.println("The result is" +" "+ (n1*n2));
	}
	
	public static void toplama (int n1,int n2) {
		System.out.println("The result is"+" "+ (n1+n2));
		
	}
	
	public static void carpma(int n1) {
		System.out.println("The second multiply method:");
		
	}
}



