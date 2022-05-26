package day23MultiDimensionalArrays;

import java.util.Arrays;

public class C05Arrays {
    public static void main(String[] args) {
        //verilen bir #Array e yeni bir element ekleyen bir method olusturun
        int arr []= {3,4,5};
        //arr [3] = 8; array de olmayan bir index e atama yapamayiz
        // var olan bir Array e ayni boyutta bile olsa direk yeni degerler iceren bir array atayamayiz
        arr = new int[4];
        System.out.println(Arrays.toString(arr));
        arr = new int[2];
        System.out.println(Arrays.toString(arr));
        int arrYeni [] = new int [5];
        arr =arrYeni;
        System.out.println(Arrays.toString(arr));
    }
}
