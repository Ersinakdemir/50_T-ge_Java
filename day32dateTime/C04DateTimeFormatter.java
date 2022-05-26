package day32dateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04DateTimeFormatter {
    public static void main(String[] args) {
        LocalDateTime tarihsaat= LocalDateTime.now();
        System.out.println(tarihsaat);//2022-03-31T21:39:40.254346200

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/M/YY");
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/YY");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MMM/YY");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MMMM/YY");

        System.out.println(formatter.format(tarihsaat));
        System.out.println(formatter1.format(tarihsaat));
        System.out.println(formatter2.format(tarihsaat));
        System.out.println(formatter3.format(tarihsaat));
        /*
         format olustururken
         GUN
         d : basta 0 varsa onu yazmadan gun numarasi
         dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD : yilin kacinci gunu oldugunu yazar
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE : gun isminin tamamini

         AY (Ay icin M, dakika icin m kullanilir)
         M : basta 0 varsa onu yazmadan ay numarasi
         MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami

         YY : yilin son iki rakamini
         YYYY : Yilin tamamini


         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati

         a yazarsak AM veya PM degerini yazar


         */














    }
}
