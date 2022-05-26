package day25List;

import java.util.ArrayList;
import java.util.List;

import static day25List.C02ExampleArrays.istenmeyenElementiSil;

public class C03ListedenIstenmeyenElemaniSilme {
    public static void main(String[] args) {
        //verilen bir Listedenden istenen elementi silip, kalanlari bir liste olarak yazdiran bir method olusturunuz
        int arr [] = {3,4,5,1,2,6,7,8,4,10};
        int silinecek = 11;
        istenmeyenElementiSilveYazdir(arr,silinecek);


    }

    public static void istenmeyenElementiSilveYazdir(int[] arr, int silinecek) {
        List<Integer> yeniList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] !=silinecek){
                yeniList.add(arr[i]);
            }
        }
        System.out.println(yeniList);
    }
}
