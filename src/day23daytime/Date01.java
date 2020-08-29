package day23daytime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date01 {

	public static void main(String[] args) {
		LocalDate ld= LocalDate.now();
		System.out.println(ld);
		
		System.out.println(ld.plusDays(41));
		System.out.println(ld.plusMonths(3));
		
		// geçmiþ tarihler için
		System.out.println(ld.minusYears(4));
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		
		System.out.println(dtf1.format(ld.plusMonths(1)));
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM.d.yy");
		System.out.println(dtf2.format(ld));
		
		
		
		
		
		
		
		
		
		
		
	}

}
