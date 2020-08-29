package day19arrays;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class A05 {

	public static void main(String[] args) {
	
//		Scanner input = new Scanner (System.in);
//		System.out.println("Aranacak rakami giriniz");
//		int rakam= input.nextInt();			
//		int nrr[]= {2,1,7,3,5};
//		int count =0;
//		for (int i = 0; i < nrr.length; i++) {
//			
//			if (nrr[i]==rakam) {
//				count ++;}
//		}
//		if (count!=0) {
//			System.out.println("Dizide  "+rakam+" "+ count +"tane vardir.");
//		}
//		else {
//			System.out.println("Dizide"+" "+rakam+" "+"yoktur.");
//
//	}
//		
//		input.close();
		
//		Arrays.sort(nrr);
//		System.out.println(Arrays.binarySearch(nrr,2));
//
//		String str= "Ipek topu at, at ipek at";
//		String strArray[]= str.split(",");
//		System.out.println(Arrays.toString(strArray));
//		String strArr[]= str.split("");
//		System.out.println(Arrays.toString(strArr));
		
//		char arr[][]= {{'a','b','c'},{'d'},{'e','f'},{'g','h','i','k'}};
//		int sum=0;
//	
//		
//			for (int i=0; i<arr[0].length;i++) {
//				sum+= arr[0][i]; }
//			System.out.println(sum);
//			
		
		int arr[][]= {{1,2},{3},{4,5,6}};
		int sum=0;
		for (int i=0;i<arr.length;i++) {
			for (int j=0; j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
		}
		
		System.out.println(sum);
 }
					  
	}

	


