package eliHoca;

import java.util.HashMap;
import java.util.Scanner;

public class Map {
    /*
    1- Kullanicidan bir kisinin kimlikno, isim, soyisim, adresi telefonu alin.
    2- kimlik noyu key diger bilgileri value olareak bir mape depolayin
    3- kimlik noyu girerek kullanici bilgilerini ekrana yazdirin
    4- Tüm kullanicilarin isimlerini ekrana yazdirin
     */
    public static void main(String[] args) {
        HashMap<Integer,HashMap<String,String>>kisiler =new HashMap<>();
        HashMap<String,String> kisiBilgileri = new HashMap<>();
        int karar;

        Scanner scan =new Scanner(System.in);

       do {
           System.out.println("Lütfen isminizi giriniz");
           kisiBilgileri.put("isim",scan.nextLine());
           System.out.println("Lütfen soyisminizi giriniz");
           kisiBilgileri.put("soyIsim",scan.nextLine());
           System.out.println("Lütfen adresinizi giriniz");
           kisiBilgileri.put("adres",scan.nextLine());
           System.out.println("Lütfen telefon numaranizi giriniz");
           kisiBilgileri.put("telefon No",scan.nextLine());
           scan.nextLine();//dummy
           System.out.println("Lütfen kimlik numaranizi giriniz");
           kisiler.put(scan.nextInt(),kisiBilgileri);
           System.out.println("Devam etmek istiyorsaniz : 1'i \nBirirmek icin 2'yi tuslayin");
           karar=scan.nextInt();
       }while (karar==1);
        System.out.println("görmek istediginiz kisinin kimlik no sunu giriniz : ");
        System.out.println(kisiler.get(scan.nextInt()));



    }

}
