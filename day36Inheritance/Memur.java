package day36Inheritance;

public class Memur extends Muhasebe{


    public static void main(String[] args) {
        Memur memur1 = new Memur();
        //memur1 objesi Memur classinin objesi olmasina ragmen
        //inherit ettigi icin Muhasebe ve onun Perant i olan Personel class larindaki tüm data lara kullanir

        //Personel class indam

        memur1.persNo=1001;
        memur1.isim="Ahmet";
        memur1.soyisim="Tepecik";
        memur1.adres="Ankara";
        memur1.tel="31254647";

        //Muhasabe classindan
        memur1.saatücreti=10;
        memur1.maas= memur1.maasHersapla();
        memur1.statu="memur";

        System.out.println(memur1);
        Memur memur2 =new Memur();
        memur2.persNo=1002;
        memur2.saatücreti=10;
        memur2.maasHersapla();
        System.out.println(memur2);
    }
    @Override
    public String toString() {
        return "Memur{" +
                "saatücreti=" + saatücreti +
                ", statu='" + statu + '\'' +
                ", maas=" + maas +
                ", persNo=" + persNo +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", adres='" + adres + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }


}
