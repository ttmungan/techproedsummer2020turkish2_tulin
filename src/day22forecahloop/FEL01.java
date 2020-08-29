package day22forecahloop;

import java.util.ArrayList;
import java.util.List;

public class FEL01 {

	public static void main(String[] args) {
		
		List <Integer> il= new ArrayList<>();
		il.add(21);
		il.add(22);
		il.add(23);
		il.add(24);
		il.add(25);
		il.add(26);
		
		// for each loop = enhanced loop 
//		for(Integer w: il) {
//			System.out.println(w);}
//			int sum=0; 
//			for (Integer w:il) {
//				sum= sum+w;
//			}
//			System.out.println(sum);
			
		int count=0;
		
		for(Integer w: il) {
//				System.out.println(w);
//				count ++;
//				if (count==3) {
//					break;
//			}
				
			if (w%3!=0) {
				continue;}
				System.out.println(w);
				
			}
			
			}
				
			
			
			
		
			
		
	}

