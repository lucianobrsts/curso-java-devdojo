package br.com.devdojo.utilityclasses.dates.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTest {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        String mascara = "'Fortaleza', dd 'de' MMMM 'de' yyyy'.'";
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        System.out.println(formatador.format(calendar.getTime()));
    }
}
