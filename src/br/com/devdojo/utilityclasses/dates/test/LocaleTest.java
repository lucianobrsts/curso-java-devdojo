package br.com.devdojo.utilityclasses.dates.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest {

    public static void main(String[] args) {
        //ISO 639 pt = Português, BR = Basil, en = Inglês, US = Estados Unidos
        Locale localeBrasil =  new Locale("pt","BR");
        Locale localeItaly =  new Locale("it","IT");
        Locale localeSuica =  new Locale( "it", "CH");
        Locale localeIndia =  new Locale( "hi","IN");
        Locale localeJapao =  new Locale("ja", "JA");

        Calendar calendar = Calendar.getInstance();

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeSuica);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);

        System.out.println("Brasil : " + df1.format(calendar.getTime()));
        System.out.println("Itália: " + df2.format(calendar.getTime()));
        System.out.println("Suíça: " + df3.format(calendar.getTime()));
        System.out.println("India: " + df4.format(calendar.getTime()));
        System.out.println("Japão: " + df5.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayLanguage(localeIndia));
        System.out.println(localeJapao.getDisplayLanguage(localeJapao));
        System.out.println(localeBrasil.getDisplayLanguage());
        System.out.println(localeSuica.getDisplayCountry(localeBrasil));

    }
}
