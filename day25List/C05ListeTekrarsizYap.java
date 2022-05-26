package day25List;

import java.util.ArrayList;
import java.util.List;

public class C05ListeTekrarsizYap {
    public static void main(String[] args) {
        //verilen bir listeden tekrar eden sayilari sadece 1 tane yapan   bir method olusturun
        //arnek [1,2,3,4,5,3,4,5,5,6] bu listi
        // [1,2,3,4,5,6] bu hale dönüstürün
        List<Integer> sayilar = new ArrayList<>();
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

        sayilar = terarsizListeOlusturan(sayilar);
        System.out.println(sayilar);

    }

    private static List<Integer> terarsizListeOlusturan(List<Integer> sayilar) {
        List<Integer>tekrarsizList = new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            if (!tekrarsizList.contains(sayilar.get(i))){
                tekrarsizList.add(sayilar.get(i));
            }

        }
        return tekrarsizList;

    }
}
