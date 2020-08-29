package day14methodcreation;

public class Test01 {

	public static void main(String[] args) {
		
			
			
			System.out.println(m1(true, false, true));
		}
		
		public static int m1(boolean b1, boolean... b2) {
			return b2.length;
		}

	}


