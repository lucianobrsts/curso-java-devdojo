package academy.devdojo.maratonajava.javacore.Rdatas.teste;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
	public static void main(String[] args) {
		Calendar calendar =  Calendar.getInstance();
		if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
			System.out.println("Domingão é o primeiro dia da semana no Brasil...");
		}
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
		calendar.add(Calendar.DAY_OF_MONTH, 0);
		calendar.roll(Calendar.HOUR, 12);
		Date date = calendar.getTime();
		System.out.println(date);
	}
}
