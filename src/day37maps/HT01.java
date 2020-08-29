package day37maps;

import java.util.Hashtable;

public class HT01 {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(100,"Ali");
		ht.put(101,"Veli");
		ht.put(102,"Aylin");
		ht.put(103,"Emine");
		ht.put(104,null);
		
		System.out.println(ht);

	}

}
