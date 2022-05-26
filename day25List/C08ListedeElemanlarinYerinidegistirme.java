package day25List;

import java.util.ArrayList;
import java.util.List;

public class C08ListedeElemanlarinYerinidegistirme {
    public static void main(String[] args) {
        //Verilen bir listede istenen iki index deki elementlerin yerini
        // kalici olarak dagistiren bir method olusturun
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(15);
        sayilar.add(16);
        sayilar.add(17);

        int ilkindex =2;
        int ikinciindex =5;
        sayilar = swapElements(sayilar,ilkindex,ikinciindex);

    }

    public static List<Integer> swapElements(List<Integer> sayilar, int ilkindex, int ikinciindex) {
        //bir Tem(degisken) sayi olusturup verilen indexlerdeki sayilari yerdegistirin
        //indexleri kontrol edip sinirin ötesinde index verildiyse uyari mesaji yazdirin
        return sayilar;
    }
}
