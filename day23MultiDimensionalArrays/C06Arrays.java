package day23MultiDimensionalArrays;

import java.util.Arrays;

public class C06Arrays {
    public static void main(String[] args) {
        //verilen bir #Array e yeni bir element ekleyen bir method olusturun
        int arr []= {3,4,5,8};
        int eklenecekElement =11;
        arrayeElementEkleme(arr,eklenecekElement);
        arr =arrayeElementEkleme(arr,eklenecekElement);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] arrayeElementEkleme(int[] arr, int eklenecekElement) {
        int yeniarr[] = new int[arr.length+1];
        yeniarr[arr.length] = eklenecekElement;
        for (int i = 0; i < arr.length; i++) {
            yeniarr[i] = arr[i];

        }
        return yeniarr;

    }
}
