package day15MethodCreation;

import java.util.Locale;

public class C09MethodCreation {
    public static void main(String[] args) {
        String isim = "Nihat";
        String soyisim = "Akdemir";
        String kkno = "12345678965412";
        String yeniisim = isim.substring(0,1).toUpperCase(Locale.ROOT) +
                isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim = soyisim.substring(0,1).toUpperCase(Locale.ROOT) +
                isim.substring(1).replaceAll("\\S", "*");
        String yenikkno = "**** **** ****" + kkno.substring(kkno.length() -4);
        System.out.println("isim - soyisim : " + yeniisim + yeniSoyisim+  " yeni kart no :" + yenikkno);
        isimSoyiaimGizle(isim,soyisim);
        kredikartinogizle(kkno);
    }

    public static void kredikartinogizle(String kkno) {
    }

    private static void isimSoyiaimGizle(String isim, String soyisim) {
    }
}
