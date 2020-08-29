package day36collectionmaps;

import java.util.Arrays;
import java.util.HashMap;

public class Map02Ornek {

	public static void main(String[] args) {
		
		String s = "Java ogrenmek zevkliydi. Java ogrenmek kolay ama tekrar gerekiyor. Java tekrarý zevkliydi ama vaktim yoktu";
		String kelime[]= s.replace(".", "").split(" ");
		System.out.println(Arrays.toString(kelime));
		int count=0;
		for (int i=0; i<kelime.length-1;i++) {
			if (kelime[i]==kelime[i+1]) {
				count ++;
				
			}
		}
		System.out.println(count);
		

			}
			
		

	}


