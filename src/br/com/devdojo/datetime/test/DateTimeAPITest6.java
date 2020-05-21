package br.com.devdojo.datetime.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class DateTimeAPITest6 {
    public static void main(String[] args) {
        for (Map.Entry<String, String> zonas : ZoneId.SHORT_IDS.entrySet()) {
            System.out.println(zonas.getKey() + " " + zonas.getValue());
        }
        System.out.println("--------------------------");
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokyoZone);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        ZonedDateTime zonedDateTime = dateTime.atZone(tokyoZone);
        System.out.println(zonedDateTime);

        Instant instant = Instant.now();
        System.out.println(instant);
        ZonedDateTime zonedDateTime2 = instant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset manausOffSet = ZoneOffset.of("-04:00");
        LocalDateTime dateTime2 = LocalDateTime.now();
        OffsetDateTime offSetDateTime = OffsetDateTime.of(dateTime2, manausOffSet);
        System.out.println(offSetDateTime);
        OffsetDateTime offSetDateTime2 = dateTime2.atOffset(manausOffSet);
        System.out.println(offSetDateTime2);

        Instant instant2 = Instant.now();
        System.out.println(instant2.atOffset(manausOffSet));

        JapaneseDate japoneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japoneseDate);
        LocalDate antigamente = LocalDate.of(1900, 2, 1);
        System.out.println(JapaneseDate.from(antigamente));

    }
}
