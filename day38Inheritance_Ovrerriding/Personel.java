package day38Inheritance_Ovrerriding;

public class Personel {
   public String statu= "personel";
   public String haklar= "Tüm personel esit haklara sahiptir";
   public String izin= "Tüm personel yilda 4 hafta izi hakkina sahiptir";

   public void mesai(){
       System.out.println("tüm personel 5 gün, günde 8 saat calisir");
   }
   public void maasHesapla(){
       System.out.println("Tüm personel 30 gün * 8 saat * 10euro = "+ (30*8*10)+ "maas alir");
   }
}
