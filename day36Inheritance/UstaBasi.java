package day36Inheritance;

public class UstaBasi extends Isci{
    public static void main(String[] args) {
        UstaBasi ustaBasi = new UstaBasi();
        ustaBasi.isim= "Ahmet";
        ustaBasi.soyisim= "Demir";
        ustaBasi.statu= "Isci";
        ustaBasi.iscistatu= "Ustabasi";
        ustaBasi.saatücreti= 15;
        ustaBasi.maas= ustaBasi.maasHersapla();
        System.out.println(ustaBasi);


    }

    public String toString() {
        return "UstaBasi{" +
                "iscistatu='" + iscistatu + '\'' +
                ", saatücreti=" + saatücreti +
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
