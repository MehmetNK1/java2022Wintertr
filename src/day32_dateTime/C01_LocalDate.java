package day32_dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01_LocalDate {
    public static void main(String[] args) {
        LocalDate trh= LocalDate.now(); // objenin olusturuldugu tarihi trh ye atama yapar.
        LocalDate baskatrh= LocalDate.of(1992,1,3);
        // istedigimiz yil ,ay , gun , degerlerine gore obje olusturur.

        System.out.println(trh); // 2022-03-31
        // get'li method'larla tarih ile ilgili detay bilgileri alabiliriz
        System.out.println(trh.getDayOfMonth()); // 31
        System.out.println(trh.getDayOfWeek()); // THURSDAY
        System.out.println(trh.getMonthValue()); // 3
        System.out.println(trh.getYear()); // 2022

        // bir tarihte istedimiz kadar ileri veya geri gidebiliriz
        System.out.println(trh.minusWeeks(20)); // 2021-11-11
        System.out.println(trh.minusWeeks(3).minusDays(3)); // 2022-03-07

        System.out.println(trh.plusMonths(9).plusDays(10)); // 2023-01-10

        // istedimiz ulkenin o andaki tarihi elde etmek istersek
        LocalDate trhZone= LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone); // 2022-04-01

        // ".is" ile baslayan methodlar boolean sonuc verir
        System.out.println(LocalDate.now().isLeapYear()); // false
        System.out.println(trh.isAfter(baskatrh)); // true





    }
}
