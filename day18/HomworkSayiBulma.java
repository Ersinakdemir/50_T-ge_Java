package day18;

import java.util.Random;
import java.util.Scanner;

public class HomworkSayiBulma {
    public static void main(String[] args) {
        //bilgisayara 1 ile 100 arasinda bir sayi tutturun kullanicidan bu sayiyi tahmin etmesinisteyin
        //girilen her tahminle ilgili büyük yada kücük diye kullanici sayiyi buldugunda kac tahmin de buldugunu npaylasin
        Scanner scan = new Scanner(System.in);
        Random rnd =new Random();
        int remembernum = rnd.nextInt(100);
        int tekrar = 1;
        int num =1;


        while (num != remembernum){
            System.out.println("lütfen bir sayi giriniz");

            num = scan.nextInt();
            if (num<100) {
                if (num < remembernum) {
                    System.out.println("girdiginiz sayi bilgisayarin tuttugu sayidan daha kücük");

                } else if (num > remembernum) {
                    System.out.println("girdiginiz sayi bilgisayarin tuttugu sayidan daha büyük");

                } else {
                    System.out.println("tebrikler sayiyi " + tekrar + " tekrarda buldunuz.");

                }
                tekrar++;

            }else{
                System.out.println("girdiginiz sayi 100 ile 0 arasinda olmali");
            }
        }



    }
}
