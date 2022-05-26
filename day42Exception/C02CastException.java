package day42Exception;

import java.util.Scanner;

public class C02CastException {
    public static void main(String[] args) {
        int sayi =10;
        //String str =sayi;CTE
        Object sayi2 =20;//ClassCastException
        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");

        try {
            int sayi3 =scan.nextInt();
            System.out.println(2*sayi3);
        } catch (Exception e) {
            System.out.println("lütfen dogru sayi giriniz");;
        }

    }
}
