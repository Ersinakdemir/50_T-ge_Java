package day38Inheritance_Ovrerriding;

public class UstaBasi extends Isci{
    String statu= "Usta basi";
    String haklar= "Usta basi haftada extra 1 gün tatil hakkina sahiptir";

    public void mesai(){
        System.out.println("Ariza varsa Usta basi extra ucfret almadan calisir");
    }
    public void maasHesapla(){
        System.out.println("Ustabasi 30 gün * 8 saat * 12euro = "+ (30*8*12)+ "maas alir");
    }

    public static void main(String[] args) {
        /*icinde oldugumuz Class dan klasik haliyle bir obje olusturursak o obje ile cagirdigimiz variable ve met

         */
        UstaBasi yasin = new UstaBasi();
        System.out.println(yasin.statu);//Ustabasi
        System.out.println(yasin.haklar);//Usta basi haftada extra 1 gün tatil hakkina sahiptir
        System.out.println(yasin.ikramiya);
        System.out.println(yasin.izin);
        yasin.maasHesapla();
        yasin.mesai();
        /*Eger isci olarak özelliklerini özellikleri ni görmek istesek
  Class adini(data türünü Isci seceriz) sadece esitligin saginda ki Class ismi
         */
        Isci ahmet = new UstaBasi();
        System.out.println(ahmet.statu);//
        System.out.println(ahmet.haklar);//Tüm personel esit haklara sahiptir
        System.out.println(ahmet.ikramiya);//
        System.out.println(ahmet.izin);
        ahmet.maasHesapla();
        ahmet.mesai();
/*Siz bir obj yi hangi classtan tanimlarsaniz o cs´lassa ait özellik leri alir/*
Personel adem = new UstaBasi();
 */
        Personel adem = new UstaBasi();
        System.out.println(adem.statu);//
        System.out.println(adem.haklar);//Tüm personel esit haklara sahiptir
        //System.out.println(adem.ikramiya);//CTE verir
        System.out.println(adem.izin);
        adem.maasHesapla();
        adem.mesai();
    }
}
