package day03VariablesScaner;

import java.util.Scanner;

public class c4Scanner {
    public static void main(String[] args) {
        //Scanner olusturmakicin 3 adim takipmedilir
        //1, once kendimize bir scanner olusturmaliyiz
        Scanner scan = new Scanner(System.in);
        //2. Adim kullanicidan istedigimiz bir deger icin aciklayici bir mesaj yaziniz
        System.out.println("Lutfen isminizi giriniz");

        //3. Adim kullanicini girdigi bilgiyi uygun bir

      //  String kullaniciismi = scan.next();
        //bu adimdan sonra artik kullanicinin girdigi ismi kullanici ismi olarak kaydettik
       // System.out.println("kullanicinin girdigi isim "+ kullaniciismi);
        String kullaniciismi = scan.nextLine();  // satir sonuna kadar girilen bilgileri alir
        System.out.println("kullanicinin girdigi isim "+ kullaniciismi);


    }
}
