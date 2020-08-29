package day22forecahloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L01 {

	public static void main(String[] args) {
		
		String s[]= {"A","B","C"};
		List <String>sl= new ArrayList<>();
		sl= Arrays.asList(s);
		System.out.println(sl);
		
		Object [] ListtenArray[]= sl.toArray();

	}

}
