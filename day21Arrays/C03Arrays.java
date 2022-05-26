package day21Arrays;

import java.util.Arrays;

public class C03Arrays {
    public static void main(String[] args) {
        int arr[] ;// deger atamasi yapmadik ama java kabul etti ancak kullanmamiza izin vermez

        arr =new int[6];
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);//6
                                       // Stringdeki length() bunda yok
        //arraydeki  her bir elemani index degeri kadar arttiralim

        for (int i = 0; i < arr.length; i++) {
            arr[i] +=i;


        }
        System.out.println(Arrays.toString(arr));


    }
}
