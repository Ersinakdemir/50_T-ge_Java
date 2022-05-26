package day22Arrays;

import java.util.Arrays;

public class C06BinarySearch {
    public static void main(String[] args) {
        int arr[] ={1,33,4,5,6,77,87,98};
        int istenenSayi =5;
        // Javada hazir BinarySearch Mehodu ilede yapilir
        //once sort methodunu kullanip siralanmali
        //binarySearch() bize istenen sayinin index noyu verir
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,istenenSayi));
        // eger olmayan bir element i arattirirsak
        //bize o eleman olsaydi sirasi neolurduyysa oindex i veriyor

    }
}
