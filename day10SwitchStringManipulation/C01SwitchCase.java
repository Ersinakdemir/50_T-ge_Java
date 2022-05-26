package day10SwitchStringManipulation;

import java.util.Scanner;

public class C01SwitchCase {
    public static void main(String[] args) {
        //Kullanicidan sayi olarak kacinci ayda oldugunu alip
        // istenen ay ismini yazdiran bir program yaziniz
        Scanner scan  = new Scanner(System.in);
        System.out.println("Lütfen kacinciayda oldugunuzu giriniz");
        int ayNo = scan.nextInt();
        switch (ayNo) {
            case 1:
                System.out.println("Januar");
                break;
            case 2:
                System.out.println("Februar");
                break;

            case 3:
                System.out.println("März");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("Mai");
                break;
            case 6:
                System.out.println("Juni");
                break;
            case 7:
                System.out.println("Juli");
                break;
            case 8:
                System.out.println("Agust");
                break;
            case 9:
                System.out.println("Sebtember");
                break;
            case 10:
                System.out.println("Oktober");
                break;
            case 11:
                System.out.println("Novenbar");
                break;
            case 12:
                System.out.println("Dezember");
                break;


            default:
                System.out.println("lütfen gecerli bir ay numarasi giriniz");

    }   }
}
