package day22Arrays;

import java.util.Arrays;

public class C05BinarySearch {
    public static void main(String[] args) {
        //verilen Arryde istenen bir elementin olupolmadigini gösteren true/false yazdiran bir method olusturun
        int arr[] ={1,33,4,5,6,77,87,98};
        int istenenSayi =17;
        isteneElamanVarMi(arr,istenenSayi);
        // Javada hazir BinarySearch Mehodu ilede yapilir


    }

    private static void isteneElamanVarMi(int[] arr, int istenenSayi) {
        boolean sonuc = false;
        for (int i = 0; i < arr.length; i++) {
            if (istenenSayi==arr[i]){
                sonuc =true;
                break;
            }

        }
        System.out.println(sonuc);

    }
}
