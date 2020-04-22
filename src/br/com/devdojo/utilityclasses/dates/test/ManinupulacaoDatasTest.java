package br.com.devdojo.utilityclasses.dates.test;

import java.util.Calendar;
import java.util.Date;

public class ManinupulacaoDatasTest {

    public static void main(String[] args) {

        Date date = new Date();
        date.setTime(date.getTime() + 3_600_000L);
        System.out.println(date);

        Calendar c = Calendar.getInstance();
        if(Calendar.SUNDAY ==c.getFirstDayOfWeek()) {
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
       c.add(Calendar.HOUR, 24);
       c.roll(Calendar.MONTH, 9);
        Date date2 = c.getTime();
        System.out.println(date2);

        //Classes para se trabalhar com números, datas e moedas
        //NumberFormat, Locale, Calendar, Date, DateFormat
    }
}
