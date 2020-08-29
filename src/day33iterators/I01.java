package day33iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I01 {

	public static void main(String[] args) {
		
		List<String>  list1= new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);
//		for (String w : list1) {
//			System.out.print(w+"A"+" ");
//			
//		}
		
		ListIterator<String> li1= list1.listIterator();
		
		while (li1.hasNext()) {
			Object element = li1.next();
			li1.set(element +"A");
		}
		
		System.out.println(list1);
		
		List<String> strArr= new ArrayList<>();
		strArr.add("t");
		strArr.add("u");
		strArr.add("l");
		strArr.add("i");
		strArr.add("n");
		
		ListIterator <String> li2 = strArr.listIterator();
		while(li2.hasNext()) {
			Object element = li2.next();
			li2.set("K"+ element + "L");
		}
		
		System.out.print(strArr);
		

	}

}
