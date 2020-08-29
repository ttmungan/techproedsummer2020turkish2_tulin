package day34iterators;

import java.util.LinkedList;
import java.util.List;

public class Li01 {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Veli");
		linkedList.add("Aliye");
		linkedList.add("Burhan");
		linkedList.add("Canan");
		linkedList.add("Kemal");
		linkedList.add("Reyhan");
		System.out.println(linkedList);
		linkedList.add(1,"Cemal");
		System.out.println(linkedList);
		linkedList.addFirst("Kayahan");
		System.out.println(linkedList);
		
		LinkedList<String> linkedList1 = new LinkedList<>();
		linkedList1.add("XXX");
		linkedList1.add("YYY");
		linkedList1.add("ZZZ");
		System.out.println(linkedList1);
		linkedList.addAll(linkedList1);
		System.out.println(linkedList);
		linkedList.addAll(5,linkedList1);
		System.out.println(linkedList);
		linkedList.remove();
		System.out.println(linkedList);
		linkedList.remove(1);
		System.out.println(linkedList);
		linkedList.remove("Canan");
		System.out.println(linkedList);
		linkedList.remove("Tlin");
		System.out.println(linkedList);
		linkedList.remove("YYY");
		System.out.println(linkedList);
		linkedList.removeFirstOccurrence("ZZZ");
		System.out.println(linkedList);
		linkedList.removeLastOccurrence("XXX");
		System.out.println(linkedList);
		linkedList.removeAll(linkedList1);
		System.out.println(linkedList);
		linkedList.removeFirst();
		System.out.println(linkedList);
		
		

		
		
		
		
		
		

		

	}

}
