package day21arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray02 {

	public static void main(String[] args) {
		List <String> myList= new ArrayList<>();
		
		
		myList.add("Python");
		myList.add("JAVA");
		myList.add("PHP");
		myList.add("Perl");
		myList.add("C#");
		myList.add("C++");

		System.out.println(myList);
		
		Object [] myArr=myList.toArray();
		
		System.out.println(Arrays.toString(myArr));

	}

}
