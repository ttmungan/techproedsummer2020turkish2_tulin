package day18arrays;

public class Homework01 {

	public static void main(String[] args) {
		char arr1[]= {'n','l','t'};
		int arr2[]= {'t','b','n'};
		int count=0;
		for (int i=0; i<arr1.length;i++) {
			for (int j=0; j<arr2.length; j++) {
				
				if (arr1[i]==arr2[j]) {
					count ++;
				}
			}
		}
			if (count!=0) {
				System.out.println(count+ " "+ "tane eleman aynýdýr.");
			}
			else {
				System.out.println("elemanlarýn hepsi farklýdýr");
			}
	}
}
