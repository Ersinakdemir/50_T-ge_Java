package day48collections;

import java.util.HashSet;
import java.util.Set;

public class C01_set {
    public static void main(String[] args) {
        //verilen bir Array i tekrar eden elemanlarini 
        //sadece bir kere yazdiran bir method olusturalim
        Integer arr[] = {3,5,4,6,3,1,2,7,6,1,4,2,8};
        arrayiTekrarsizYazdirma(arr);


    }

    private static void arrayiTekrarsizYazdirma(Integer[] arr) {
        Set<Integer> tekrarsizElementKumesi =new HashSet<>();
        for (Integer each:arr
             ) {
            tekrarsizElementKumesi.add(each);
        }
        System.out.println(tekrarsizElementKumesi);
    }
}
