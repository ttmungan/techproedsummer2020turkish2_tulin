package day36collectionmaps;

import java.util.Deque;
import java.util.LinkedList;

public class Dq01 {

	public static void main(String[] args) {
		
		Deque<String> dq01 = new LinkedList<>();
		dq01.add("Ali");
		dq01.addFirst("Veli");
		dq01.addLast("Can");
		dq01.add("Ayse");
		dq01.addFirst("Emine");
		dq01.addLast("Reyhan");
		System.out.println(dq01);
		System.out.println(dq01.element());
		System.out.println(dq01);
		System.out.println(dq01.peek());
		System.out.println(dq01);
		System.out.println(dq01.peekLast());
		System.out.println(dq01.poll());
		System.out.println(dq01.pollLast());
		System.out.println(dq01.pollFirst());

	}

}
