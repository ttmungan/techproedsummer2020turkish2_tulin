package day36collectionmaps;

import java.util.HashMap;

public class Map01 {

	public static void main(String[] args) {
		HashMap <Integer, String> hm01 = new HashMap<>();
		hm01.put(100,"Ali");
		hm01.put(101,"Emine");
		hm01.put(102,"Veli");
		hm01.put(103,"Ayse");
		
		hm01.put(102, "XXXX");
		
		hm01.put(104, "XXXX");
		
		hm01.put(null,"ZZZZ");
		
		hm01.put(105,null);
		System.out.println(hm01);
		System.out.println(hm01.containsKey(102));
		System.out.println(hm01.containsValue(12));
		System.out.println(hm01.containsValue("Ayse"));
		System.out.println(hm01.containsValue("Ramazan"));
		System.out.println(hm01.get(101));
		System.out.println(hm01.getOrDefault(11, "oyle bir isim yok"));
		System.out.println(hm01.keySet());
		System.out.println(hm01.values());
		System.out.println(hm01.putIfAbsent(108, "Kemal"));
		System.out.println(hm01);
		System.out.println(hm01.putIfAbsent(108, "Muharrem"));
		System.out.println(hm01);
		hm01.remove(null);
		System.out.println(hm01);
		hm01.remove(103,"Ayse");
		System.out.println(hm01);
		hm01.remove(102,"Vahid");
		System.out.println(hm01);
	}

}
