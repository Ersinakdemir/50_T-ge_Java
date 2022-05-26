package day42Exception;

import java.util.Scanner;

public class C03IllegalArgumentException {
    public static void main(String[] args) throws IllegalArgumentException{
        //kullanicida yasini isteyin kullanici yas olarak negatif sayi  0 veya 120
        // den büyük bir sayi girerse IllegalArgumentException olusacak sekilde bir program yazin
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas<0 ||yas>120){
            //System.out.println("lütfen gecerli bir yas giriniz");
            //Java bizim istedigimizdurumlarda exception firlatabilir
            throw new IllegalArgumentException();
        }else{
            System.out.println("Uygun yasgirdiniz,tesekkürler0");
        }


    }
}
