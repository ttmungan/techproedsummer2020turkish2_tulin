package day20multidimensionalarrays;

import java.util.Arrays;

public class Mda02 {

	public static void main(String[] args) {
		
		int arr [][]= { {1,2},{3},{4,5,6} };
//		System.out.println(Arrays.deepToString(arr));
//		System.out.println(arr[0][0]+arr[0][1]+arr[1][0]+arr[2][0]+arr[2][1]+arr[2][2] );
		int sum=0;
		for (int i=0; i<arr.length;i++) {
			for (int j=0; j<arr[i].length; j++) {
				sum= sum+ arr[i][j];
				
			}
			System.out.println(sum);
			
		}
		
	}

}
