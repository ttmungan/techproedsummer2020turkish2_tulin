package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L02 {

	public static void main(String[] args) {
	
		List <String> sl= new ArrayList <>();
		sl.add("Ali");
		sl.add("Kemal");
		sl.add("Ayþe");
		System.out.println(sl);
		
		sl.set(0,"Aliye");
		System.out.println(sl.set(0,"Aliye"));
		sl.contains("Kemal");
		System.out.println(sl.contains("Kemal"));
		
		Collections.sort(sl);
		System.out.println(sl);
		
		Collections.reverse(sl);
		System.out.println(sl);
		sl.clear();
		System.out.println(sl);
		
		List <Integer>il1= new ArrayList <>();
		il1.add(12);
		il1.add(13);
		il1.add(14);
		
		List <Integer>il2= new ArrayList <>();
		il2.add(12);
		il2.add(13);
		il2.add(14);
		
		System.out.println(il1.equals(il2));
		
		
		
		

	}

}
