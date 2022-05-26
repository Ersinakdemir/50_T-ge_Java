package day03VariablesScaner;

import java.util.Scanner;

public class c05Scanneer {
    public static void main(String[] args) {
        //Kullanicidan ismini soyismini alin arada bosluk birakarak isim - soyisim : seklinde yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("soyisminizi giriniz");
        String soyisim = scan.nextLine();
        System.out.println("isim -soyisim: " + isim +soyisim);

    }
}
