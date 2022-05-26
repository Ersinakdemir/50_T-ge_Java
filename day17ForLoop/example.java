package day17ForLoop;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        //Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
        //
        //sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayim giriniz");
        int num = scan.nextInt();
        int faktoryel = 1;
        if (num>=0){
            if (num==0){
                System.out.println(num + "! = 1");
            }else{
                for (int i = num; i >1 ; i--) {
                    faktoryel *= i;


                }
                System.out.println(faktoryel);
            }

        }else {
            System.out.println("negatif sayilarin Faktoriyeli alinmiyor");
        }
    }
}
