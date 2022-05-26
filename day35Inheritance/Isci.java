package day35Inheritance;

import org.hamcrest.core.Is;

public class Isci extends Personel {
    public static void main(String[] args) {

        Personel objPers = new Personel();
        objPers.isim ="Ramle";
        objPers.soyisim="Akdemir";
        objPers.adres="pulheim";

        Isci objIsci = new Isci();
        objIsci.isim ="Nihat";
        objIsci.soyisim="Akdemir";
        objIsci.adres="Akdemir";
    }
}
