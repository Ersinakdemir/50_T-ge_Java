package day22Arrays;

import java.util.Arrays;

public class C03BüyükKücükegöre {
    public static void main(String[] args) {
        // verilen bir arry i büyükten kücüge siralayip yazdiran bir method olusturun

        int arr[] ={1,33,4,5,6,77,87,98};
        terstenSiralaYazdir(arr);

    }

    public static void terstenSiralaYazdir(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int tersArr[] = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
           tersArr[i] = arr[arr.length -1 -i];

        }
        System.out.println(Arrays.toString(tersArr));
    }
}
