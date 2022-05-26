package day06IfElseStatements;

import java.util.Scanner;

public class C03TekCiftSayi {
    public static void main(String[] args) {
        //kullanicidan bir sayi aliniz ve busayini cift mi tek mi oldugunu yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sayiyi giriniz");
        int sayi = scan.nextInt();
        if (sayi % 2 == 0) {
            System.out.println("cift");

        }
        if (sayi % 2 == 1) {
            System.out.println("tek");
        }

    }
}
