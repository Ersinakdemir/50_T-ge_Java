package day25List;

import java.util.ArrayList;
import java.util.List;

public class C04ListedenTekrarliElemanlariSlme {
    public static void main(String[] args) {
        //verilen bir listeden tekrar eden sayilari sadece 1 kere yazdiran bir method olusturun
        //arnek [1,2,3,4,5,3,4,5,5,6]
        //output [1,2,3,4,5,6]
        List<Integer>sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        sayilar.add(5);
        sayilar.add(6);

        terarsizListeOlustur(sayilar);
    }

    static void terarsizListeOlustur(List<Integer> sayilar) {
        List<Integer>tekrarsizList = new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            if (!tekrarsizList.contains(sayilar.get(i))){
                tekrarsizList.add(sayilar.get(i));
            }

        }
        System.out.println(tekrarsizList);


    }
}
