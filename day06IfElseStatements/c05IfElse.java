package day06IfElseStatements;

import java.util.Scanner;

public class c05IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sayiyi giriniz");
        int sayi = scan.nextInt();
        if (sayi % 2 == 0) {
            System.out.println("Girilen sayi cifttir");

        }
        else {
            System.out.println("Girilen sayi tektir");
        }

    }
}




