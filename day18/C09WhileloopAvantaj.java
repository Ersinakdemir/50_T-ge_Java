package day18;

import java.util.Scanner;

public class C09WhileloopAvantaj {
    public static void main(String[] args) {
        // kulanicidan istedigi kadar sayi girmesini isteyin kullanicin girdigi
        // syilyarin toplami 500 ü gecerse yeter girdigin sayilarin toplami 500 ü gecti
        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        while (toplam<500) {
            System.out.println("lütfen sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
        }
        System.out.println("artik yeter cok sayi girdin "+ "toplam 500 ´yecti");
   }
}
