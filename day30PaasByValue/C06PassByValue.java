package day30PaasByValue;

import java.util.Arrays;

public class C06PassByValue {
    public static void main(String[] args) {
        int arr []= {1,2,3};
        System.out.println(Arrays.toString(arr));
        arrDegistirr(arr);
        System.out.println("method call sonrasi : "+Arrays.toString(arr));
    }

    private static void arrDegistirr(int[] arr) {
        arr = new int[5];
        System.out.println(Arrays.toString(arr));
    }

}
