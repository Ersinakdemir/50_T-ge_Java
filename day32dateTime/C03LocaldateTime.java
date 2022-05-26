package day32dateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03LocaldateTime {
    public static void main(String[] args) {
        LocalDateTime tarihsaat = LocalDateTime.now();
        System.out.println(tarihsaat);
        System.out.println(tarihsaat.plusDays(3).plusHours(9).plusDays(8).plusMinutes(767));
    }
}
