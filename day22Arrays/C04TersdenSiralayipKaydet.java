package day22Arrays;

import java.util.Arrays;

public class C04TersdenSiralayipKaydet {
    public static void main(String[] args) {
        // verilen bir arry i büyükten kücüge siralayip  bize döndüren bir method olusturun

        int arr[] ={1,33,4,5,6,77,87,98};
        arr = terstenSirala(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] terstenSirala(int[] arr) {
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        int tersArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tersArr[i] = arr[arr.length - 1 - i];

        }
        return tersArr;


    }
}
