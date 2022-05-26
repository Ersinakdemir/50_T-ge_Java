package day36Inheritance;

public class SurekliIsciler extends Isci{

    public static void main(String[] args) {
        SurekliIsciler surIsci1 =new SurekliIsciler();
        surIsci1.isim="Cem";
        surIsci1.soyisim ="Akay";
        surIsci1.statu ="Isci";
        surIsci1.saatücreti=11;
        surIsci1.persNo=1003;
        surIsci1.maas= surIsci1.maasHersapla();

        System.out.println(surIsci1);

    }
    public String toString() {
        return "SurekliIsciler{" +
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
