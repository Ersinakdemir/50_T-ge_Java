package day18;

import java.util.Scanner;

public class C08ForLoopVsWhileLoop {
    public static void main(String[] args) {
        // kullanicidan toplamak istedigi sayilari alin ve 0 a basincaya kadar devam edin
        // ve 0 bastigui anda girdigin sayilari toplayin
        Scanner scan = new Scanner(System.in);
        int sayi = 1;
        int toplam = 0;
        while (sayi !=0){
            System.out.println("lütfen sayi giriniz");
            sayi = scan.nextInt();
            toplam += sayi;
        }
        System.out.println(toplam);
        // baslangic ve bitis gedrleri adim sayisi belli olmayan
        // durumlarda while loop daha avantajlidir


    }
}
