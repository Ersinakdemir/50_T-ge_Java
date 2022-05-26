package day05Matematikselislemler;

import java.util.Scanner;

public class C03Modulus {
    public static void main(String[] args) {
        //kullanicidan aldiginiz nbir 4 basamakli sayinin basamaklari toplamini bulunuz
        int rakamlartop =0;
        int rakam = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sayiyi giriniz");
        int sayi = scan.nextInt();
       // int birler = sayi % 10;
        //sayi = sayi /10;
        //int onlar = sayi % 10;
        //sayi = sayi /10;
        //int yuzler = sayi % 10;
        //sayi = sayi /10;
        //System.out.println(birler + onlar + yuzler + sayi);
        rakam = sayi % 10;
        rakamlartop +=rakam;
        sayi /= 10;

        rakam = sayi % 10;
        rakamlartop +=rakam;
        sayi /= 10;

        rakam = sayi % 10;
        rakamlartop +=rakam;
        sayi /= 10;

        rakam = sayi % 10;
        rakamlartop +=rakam;
        sayi /= 10;
        System.out.println(rakamlartop);


    }
}
