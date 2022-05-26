package day24ArrayList;

import day23MultiDimensionalArrays.C06Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01List {
    public static void main(String[] args) {
        int arr []={};
        // bu array e 5 ekleyelim
        arr = C06Arrays.arrayeElementEkleme(arr,5);
        System.out.println(Arrays.toString(arr));
        arr = C06Arrays.arrayeElementEkleme(arr,3);
        System.out.println(Arrays.toString(arr));

        //bir list olusturalim


        List<Integer> sayilarList = new ArrayList<>();
        System.out.println(sayilarList);

        sayilarList.add(5);
        sayilarList.add(3);
        sayilarList.add(0,7);
        sayilarList.add(2,7);
        System.out.println(sayilarList);

    }
}
