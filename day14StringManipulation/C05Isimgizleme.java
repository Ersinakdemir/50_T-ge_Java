package day14StringManipulation;

import java.util.Locale;

public class C05Isimgizleme {
    public static void main(String[] args) {
       // Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
       // isim-soyisim : M***** B*******
       // kart no : **** **** **** 1234
        String isim = "Nihat";
        String soyisim = "Akdemir";
        String kkno = "12345678965412";
        String yeniisim = isim.substring(0,1).toUpperCase(Locale.ROOT) +
                isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim = soyisim.substring(0,1).toUpperCase(Locale.ROOT) +
                isim.substring(1).replaceAll("\\S", "*");
        String yenikkno = "**** **** ****" + kkno.substring(kkno.length() -4);
        System.out.println("isim - soyisim : " + yeniisim + yeniSoyisim+  " yeni kart no :" + yenikkno);
    }
}
