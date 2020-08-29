package day20multidimensionalarrays;

public class Hw01 {

	public static void main(String[] args) {
		int multi=1;
		int arr[][]= { {1,2,3}, {4,5,6} };
		for (int i=0; i<arr.length;i++) {
			for (int j=0; j<arr[i].length;j++) {
				multi*=arr[i][j];
				}
		}
			System.out.println("Çarpým sonucu"+ multi);
	}

}
