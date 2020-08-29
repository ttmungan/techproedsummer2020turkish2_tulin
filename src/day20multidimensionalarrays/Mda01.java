package day20multidimensionalarrays;

import java.util.Arrays;

public class Mda01 {

	public static void main(String[] args) {
		
		int mda [][]= new int [3][2];
		mda [1][0]=7;
		mda [2][0]= 11;
		mda [0][1]=23;
		mda[0][0]=10;
		mda [1][1]=12;
		mda [2][1]=55;
		System.out.println(Arrays.toString(mda[0]));
		System.out.println(Arrays.toString(mda[1]));
		System.out.println(Arrays.toString(mda[2]));
		System.out.println(mda[0][0]);
		System.out.println(mda[1][1]);
		
		char mdac [][]= { {'a','b','c'}, {'d'},{'e','f'},{'g','h','i','k'} };
		
		System.out.println(Arrays.deepToString(mdac));
		int x= ((mdac[0][0]));
		int y= ((mdac[0][1]));
		int z= ((mdac[0][2]));
		System.out.println(x+y+z);
		int sum=0;
		for (int i=0; i<mdac[0].length;i++) {
		
			System.out.println(mdac[0][i]);
			sum+= mdac[0][i];
		}
		System.out.println(sum);
		
	}

}
