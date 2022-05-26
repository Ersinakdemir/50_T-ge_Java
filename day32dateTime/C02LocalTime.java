package day32dateTime;

import java.time.LocalTime;

public class C02LocalTime {
    public static void main(String[] args) {
        LocalTime tm = LocalTime.now();
        System.out.println(tm);//21:09:56.177469700
        int sayi = 0;
        for (int i = 0; i < 100000; i++) {
            sayi+=1;

        }
        LocalTime tmloopSonrasi = LocalTime.now();

        System.out.println(tmloopSonrasi);//21:09:56.177469700
        double nano1 =tm.getNano();
        double nano2 =tmloopSonrasi.getNano();
        System.out.println("islem : "+(nano2-nano1)+ "nano saniyede bitti");

    }
}
