package day07IfElseIfStatements;

import java.util.Locale;
import java.util.Scanner;

public class NestedIfElseIfstatments {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen once cinsiyetini  yasinizi "+ "\nkadin icin K, Erkek icin E" );
        char cinsiyet = scan.next().toUpperCase(Locale.ROOT).charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();
        if(cinsiyet =='K'){
            if(yas>=60){
                System.out.println("Emekliolabilirsiniz");
            }else{
                System.out.println("emekli olabilmeniz icin "+ (60 - yas) +"yil calismalisiniz");
            }

        }else if(cinsiyet=='E'){
            if(yas>=65){
                System.out.println("Emekliolabilirsiniz");
            }else{
                System.out.println("emekli olabilmeniz icin "+ (65 - yas) +"yil calismalisiniz");
            }


        }else{
            System.out.println("Lütfen cinsiyet icin gecerli bir harf giriniz");
        }

    }
}
