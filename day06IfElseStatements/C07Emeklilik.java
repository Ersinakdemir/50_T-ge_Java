package day06IfElseStatements;

import java.util.Scanner;

public class C07Emeklilik {
    public static void main(String[] args) {
        //kullanicidan yasini isteyin 65 veya daha büyük se emekli olabilirsin
        // 65 den kucukse emekli olamazsin yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int sayi = scan.nextInt();
        if (sayi >=65) {
            System.out.println("Emekli olabilirsiniz");

        }
        else {
            System.out.println("Emekli olamazsiniz");
            System.out.println(65 -sayi +" yil daha calismalisiniz");

        }

    }
}
