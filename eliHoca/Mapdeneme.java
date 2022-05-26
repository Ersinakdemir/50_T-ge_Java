package eliHoca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Mapdeneme {

    public static HashMap<Integer, List<String>> kisiler = new HashMap<>();
    static Scanner scan =new Scanner(System.in);

    public static void main(String[] args) {
         /*
    1- Kullanicidan bir kisinin kimlikno, isim, soyisim, adresi telefonu alin.
    2- kimlik noyu key diger bilgileri value olareak bir mape depolayin
    3- kimlik noyu girerek kullanici bilgilerini ekrana yazdirin
    4- Tüm kullanicilarin isimlerini ekrana yazdirin
     */
        islemler();
        }
        public static void islemler() {
            System.out.println("Lütfen yapmak istediginiz islememi seciniz\nKisi eklemek icin : 1'i\nKisiyi görüntülemek" +
                    " icin ; 2'yi\nTüm kullanicilarin isimlerini yazdirmak icin : 3'ü\ncikis icin 4`ü  tuslayin");
            int islem =scan.nextInt();
            List<String> kisiBilgisi =new ArrayList<>();
            switch (islem) {
                case 1:
                    kisiEkle(kisiBilgisi);
                    karar();
                    break;
                case 3:
                    tumKisileriGoruntule();
                    karar();
                    break;
                case 2:
                    kisiGoruntule();
                    karar();
                    break;
                case 4:
                    cikis();
                    break;
                default:
                    System.out.println("Lütfen seciminizi dogru yapiniz");

            }
        }
    public static void kisiEkle(List<String> kisiBilgisi){
        scan.nextLine();
        System.out.println("Lütfen isminizi giriniz");
        kisiBilgisi.add(scan.nextLine());
        System.out.println("Lütfen soyisminizi giriniz");
        kisiBilgisi.add(scan.next());
        scan.nextLine();//dummy
        System.out.println("Lütfen adresinizi giriniz");
        kisiBilgisi.add(scan.nextLine());
        System.out.println("Lütfen telefon numaranizi giriniz");
        kisiBilgisi.add(scan.next());
        scan.nextLine();//dummy
        System.out.print("");
        System.out.println("Lütfen kimlik numaranizi giriniz");
        kisiler.put(scan.nextInt(),kisiBilgisi);
    }
    public static void kisiGoruntule(){
        System.out.println("görümtülemek istediginiz kisini kimlik nosunu giriniz");
        System.out.println(kisiler.get(scan.nextInt()));
    }
    public static void tumKisileriGoruntule(){
        kisiler.values().stream().forEach(t-> System.out.println(t.get(0)+" "+t.get(1)));
    }
    public static void cikis(){
        System.out.println("isleminiz tamamlanmistir iyi günler");
    }
    public static void karar(){
        System.out.println("devam etmek icin 1'i \ncikmak icin 2'yi tuslayin");
        int karar=0;
        try {
            karar = scan.nextInt();
        } catch (Exception e) {
            System.out.println("devam etmek icin 1'i \ncikmak icin 2'yi tuslayin");
        }
        if (karar==1){
            islemler();
        }else {
            cikis();
        }
    }
}
