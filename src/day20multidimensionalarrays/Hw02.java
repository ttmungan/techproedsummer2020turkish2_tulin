package day20multidimensionalarrays;

public class Hw02 {

	public static void main(String[] args) {
		int multi=1;
		int arr[][]= { {1,2,3},{4,5},{6}};
		for (int i=0; i<arr.length;i++) {
			int j= arr[i].length;
				multi*=arr[i][j-1];
				}
		
		System.out.println("�� arraylerdeki son elemanlar�n �arp�m�"+ " "+ multi);
	
	}

}

