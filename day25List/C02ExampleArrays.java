package day25List;

import java.util.Arrays;

public class C02ExampleArrays {
    public static void main(String[] args) {
        //verilen bir Arrayden istenen elementi silip, kalanlari bir Array olarak yazdiran bir method olusturunuz

        int arr [] = {3,4,5,1,2,6,7,8,4,10};
        int silinecek = 4;
        istenmeyenElementiSil(arr,silinecek);

    }

    public static void istenmeyenElementiSil(int[] arr, int silinecek) {
        //1-istenmeyen eleman sayisini bulalim
        int sayac =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==silinecek){
                sayac++;
            }

        }
        //2-yeni arr olusturma
        int arryeni [] = new int[arr.length-sayac];

        //3-eski arrayden yeni arr e elementleri tasima
        int index= 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != silinecek){
                arryeni[index] =arr[i];
                index++;
            }

        }
        //4-listeyi yazdirmak
        System.out.println(Arrays.toString(arryeni));





    }
}
