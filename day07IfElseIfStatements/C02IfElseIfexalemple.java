package day07IfElseIfStatements;

import java.util.Scanner;

public class C02IfElseIfexalemple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen islem yapmak istediginiz sayilari giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        if (sayi1<0 && sayi2<0){
            System.out.println("girdiginiz sayilarin carpimi: "+ (sayi1*sayi2));
        }else if (sayi1>0 && sayi2>0){
            System.out.println("girdiginiz sayilarin toplami: "+ (sayi1+sayi2));
        }else if (sayi1==0 ||sayi2==0){
            System.out.println("0 carpmaya göre yutan elemandir ");

        }
        else {
            System.out.println("Farkli isaretli sayilarda islem yapamazsiniz");
        }
        scan.close();

    }

}

