package day18arrays;

public class A03 {

	public static void main(String[] args) {
		String s1[]= {"Ali","Veli","Zeki","tül"};
		String s2[]= {"Ali","Veli","Zeki","tül"};
		
		int count=0;
		for (int i=0; i<s1.length;i++) {
			if (s1[i]==s2[i]) {
				count ++;
			}
			}
			if (count==s1.length) {
				System.out.println("Ayný");
			}
			else {
				System.out.println("Farklý");
			}
			

	}

}
