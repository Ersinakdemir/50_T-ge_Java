package day32dateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C01LocalDate {
    public static void main(String[] args) {
        LocalDate trh =LocalDate.now();//objenin olusturuldugu tarihi thr ye atar
        LocalDate baskatrh =LocalDate.of(1988,11,03);//istedigimiz yil ay
        // ve gün degerlerine göre bize obje olusturur.
        System.out.println(trh);
        System.out.println(baskatrh);
        //get li methodlarla tarih ile ilgili detay bilgileri alabiliriz
        System.out.println(trh.getDayOfMonth());
        System.out.println(trh.getDayOfWeek());
        System.out.println(trh.getMonthValue());
        System.out.println(trh.getDayOfYear());

        //bir tarihten istedigimiz kadar ileri veya geri gide biliriz

        System.out.println(trh.minusWeeks(34));// 34 hafta geriye
        System.out.println(trh.plusDays(987));

        //tarih dile
        LocalDate trhZone = LocalDate.now(ZoneId.of("Japan"));
        System.out.println(trhZone);

    }
}
