package day15MethodCreation;

import java.util.Scanner;

public class C02Merhodcreation {
    public static void main(String[] args) {
        // kullanicidan bir kelime isteyim efer kelime 3 harftan kisa ise "kelime cok kisa " yazdirin
        // eger kelime 3 4 5 harfli
        // ise harf sayisini ve kelimenin tersten yazilisini yazdiriniz
        //ilk harf büyük digerleri kücük yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime kiriniz");
        String wort = scan.next();
        String terskelime ="";
        if (wort.length()<3){
            System.out.println("kelime cok kisa");

        }else if (wort.length() <= 5){
            if(wort.length()==3){
               terskelime= wort.substring(2)+
                       wort.substring(1,2) +
                       wort.substring(0,1);
            }else if (wort.length()==4){
                terskelime= wort.substring(3)+
                        wort.substring(2,3) +
                        wort.substring(1,2) +
                        wort.substring(0,1);

            }else{
                terskelime= wort.substring(4)+
                        wort.substring(3,4) +
                        wort.substring(2,3) +
                        wort.substring(1,2) +
                        wort.substring(0,1);
                System.out.println(terskelime);
            }
            System.out.println("girdiginiz kelimedeki harf sayisi : " + wort.length());
            System.out.println("kelimenin tersten yazilisi : " + terskelime);



        }else{
            System.out.println("kelime cok uzun");

        }


    }
}
