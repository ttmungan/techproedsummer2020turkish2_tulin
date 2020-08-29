package day18arrays;

import java.util.Arrays;

public class A05 {

	public static void main(String[] args) {
		
		int myArr[]= {1,3,5,7};
		reverse (myArr);
		

	}
	
	
	public static void reverse (int myArray[]) {
		int myArr[]= {1,3,5};
		for (int i=0; i<=4; i++) {
		int t=0;
		int temp =myArr[0];
		myArr[t] = myArr[myArr.length-t-1];
		myArr[myArr.length-t-1]=temp;
		}
		
		System.out.println(Arrays.toString(myArr));}
	}


