package day19DoWhileloop;

import java.util.Scanner;

public class C04DoWhileloop {
    public static void main(String[] args) {
        //Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin.
        // Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve “Negatif sayi giremezsiniz”
        // yazdirip basa donun
        // Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini, yanlislikla kac negative sayi girdigini
        // ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
        Scanner scan = new Scanner(System.in);
        int sayi =1;
        int toplam =0;
        int sayacpozitif=0;
        int sayacnegatif=0;
        do {
            System.out.println("tam sayi girin \nbitirmek icin 0 a basin");
            sayi = scan.nextInt();
            if (sayi < 0) {
                System.out.println("Negatif sayi giremezsiniz");
                sayacnegatif++;
            }else if (sayi>0){
                toplam +=sayi;
                sayacpozitif++;
            }

         }while (sayi!=0);
        System.out.println("toplam" + toplam);
        System.out.println("pozitif tekra :" + sayacpozitif);
        System.out.println("negatif tekrar :" + sayacnegatif);




    }
}
