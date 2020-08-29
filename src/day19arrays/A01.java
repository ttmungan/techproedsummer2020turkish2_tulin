package day19arrays;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {
		
		int arr []= {3,7,1,18};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		System.out.println(arr[0]);
		
		String srr []= {"Ali", "Veli", "Tül", "Nus"};
		Arrays.sort(srr);
		System.out.println("Baþtan ikinci eleman:"+ srr[1]);
		System.out.println("Sondan ikinci eleman:"+ srr[srr.length-2]);
		
		int nrr[]= {2,1,7,3,5};
		
		Arrays.sort(nrr);
		System.out.println(Arrays.binarySearch(nrr, 7));
		System.out.println(Arrays.binarySearch(nrr, 6));
		
		int mrr[]= {3,8,3,11};
		Arrays.sort(mrr);
		System.out.println(Arrays.binarySearch(mrr, 3));
		
		
		
		
		
	}

}
