package day18arrays;

public class A03 {

	public static void main(String[] args) {
		String s1[]= {"Ali","Veli","Zeki","t�l"};
		String s2[]= {"Ali","Veli","Zeki","t�l"};
		
		int count=0;
		for (int i=0; i<s1.length;i++) {
			if (s1[i]==s2[i]) {
				count ++;
			}
			}
			if (count==s1.length) {
				System.out.println("Ayn�");
			}
			else {
				System.out.println("Farkl�");
			}
			

	}

}
