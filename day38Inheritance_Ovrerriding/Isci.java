package day38Inheritance_Ovrerriding;

public class Isci extends Personel {
   public String statu= "Isci";
    public String haklar= "Isciler kidem tazminati alirlar";
    public String ikramiya= "Isciler yilda 1 kere ikramiye alir";
    public void mesai(){
        System.out.println("tüm personel 5 gün, günde 8 saat calisir");
    }
    public void maasHesapla(){
        System.out.println("Tüm Isciler 30 gün * 8 saat * 11euro = "+ (30*8*11)+ "maas alir");
    }
}
