package day18;

import java.sql.SQLOutput;
import java.util.Scanner;

public class C07Whileloop {
    public static void main(String[] args) {
        //kullanicidan kac sayi toplamak istedigini alin
        //Busayilari alin ve bu sayilarin toiplamini ekrana yazdzrin
        Scanner scan = new Scanner(System.in);

        int sayiAdedi = 0;
        int toplam =0;
        for (int i = 1; i <=sayiAdedi ; i++) {
            System.out.println("lütfen bir sayiadedini giriniz");
            int num = scan.nextInt();
            toplam +=num;

        }
        System.out.println(toplam);

        //While ile yapalim
        //int sayi = 0;
        toplam=0;
        int sayac = 1;
        while (sayac<=sayiAdedi){
            System.out.println("lütfen bir sayiadedini giriniz");
            int sayi = scan.nextInt();
            toplam += sayi;
            sayac++;


        }
        System.out.println(toplam);

    }
}
