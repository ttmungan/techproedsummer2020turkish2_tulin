package day23daytime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Time01 {

	public static void main(String[] args) {
		
		LocalTime lt= LocalTime.now();
		System.out.println(lt);
		System.out.println(lt.plusMinutes(7));
		
		System.out.println(lt.minusSeconds(23));
		
		DateTimeFormatter dtf1= DateTimeFormatter.ofPattern(":mm");
		System.out.println(dtf1.format(lt));
		
		System.out.println(LocalTime.now(ZoneId.of("Turkey")));
		System.out.println(LocalTime.now(ZoneId.of("Japan")));
		System.out.println(LocalTime.now(ZoneId.of("Europe/Moscow")));
		System.out.println(LocalTime.now(ZoneId.of("")));
	}

}
