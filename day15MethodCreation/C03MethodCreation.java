package day15MethodCreation;

import java.util.Scanner;

public class C03MethodCreation {
    public static void main(String[] args) {
        // kullanicidan bir kelime isteyim efer kelime 3 harftan kisa ise "kelime cok kisa " yazdirin
        // eger kelime 3 4 5 harfli
        // ise harf sayisini ve kelimenin tersten yazilisini yazdiriniz
        //ilk harf büyük digerleri kücük yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime kiriniz");
        String wort = scan.next();
        int harfsayisi = wort.length();

        if (harfsayisi<3){
            System.out.println("kelime cok kisa");
        }else if (harfsayisi==3 ){
            ücHarfiTersiniCevirme(wort);
        }else if (harfsayisi ==4){
            dörtHarfiTersiniCevirme(wort);
        }else if (harfsayisi ==5){
            besHarfiTersiniCevirme(wort);
        }else{
            System.out.println("kelime cok uzun");
        }

    }
// 1- method olusturmak icin methodun adini yazariz
    // 2- Method a giderken methoda giderken götürmemiz ke
    private static void besHarfiTersiniCevirme(String wort) {
        String terskelime= wort.substring(4)+
                wort.substring(3,4) +
                wort.substring(2,3) +
                wort.substring(1,2) +
                wort.substring(0,1);
        System.out.println(terskelime);

    }

    private static void dörtHarfiTersiniCevirme(String wort) {
        String  terskelime= wort.substring(3)+
                wort.substring(2,3) +
                wort.substring(1,2) +
                wort.substring(0,1);
        System.out.println(terskelime);
    }

    private static void ücHarfiTersiniCevirme(String wort) {

        String terskelime= wort.substring(2)+
                wort.substring(1,2) +
                wort.substring(0,1);
        System.out.println(terskelime);
    }
}
