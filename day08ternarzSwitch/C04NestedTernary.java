package day08ternarzSwitch;

import javax.swing.*;

public class C04NestedTernary {
    public static void main(String[] args) {
        //verilen sayinin poziitifd mi negatif mi oldugunu kontrol edip..
        //0 veya  pozitif sayi ise tek veya cift....
        // Negatif sayi ise -100 den butuk veya kucük oldugunu belirleyen bir program
        int sayi = 125;
        if (sayi >= 0){
            if (sayi %2 ==2){
                System.out.println("sayi pozitif cift sayi");
            }else {
                System.out.println("sayi pozitif tek sayi");
            }
        }else{
            if(sayi<-100){
                System.out.println("sayi -100 de kücük negatif sayi");
            }else {
                System.out.println("sayi -100 den büyükj negatif sayi");
            }
        }
        String sonuc = sayi>=0 ? (sayi % 2 ==0 ? "pozitif cift saayi" :"pozirif tek sayi "):
                        (sayi <-100 ? "-100 den kucuk negatif sayi": "-100 den büyük negatif sayi");
        System.out.println(sonuc);


    }
}
