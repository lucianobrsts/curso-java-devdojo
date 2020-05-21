package br.com.devdojo.datetime.test;

import br.com.devdojo.associationandinheritance.associationexercise.classes.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeAPI5Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String s4 = "20170221";
        String s5 = "2017-02-21";

        LocalDate parse1 = LocalDate.parse(s4, DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse(s5, DateTimeFormatter.ISO_DATE);
        System.out.println(parse1);
        System.out.println(parse2);

        LocalDateTime dateTime = LocalDateTime.now();
        String s6 = dateTime.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s6);

        LocalDateTime parse = LocalDateTime.parse("2020-05-20T22:54:20.545");
        System.out.println(parse);

        //dd/MM/yyyy
        DateTimeFormatter formaterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formaterBR);
        System.out.println(formatBR);
        String dataBRString = "01/12/2017";
        LocalDate parse3 = LocalDate.parse(dataBRString, formaterBR);
        System.out.println(parse3);

        DateTimeFormatter formatterFR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.FRANCE);
        String formatFR = LocalDate.now().format(formatterFR);
        System.out.println(formatFR);

    }
}
