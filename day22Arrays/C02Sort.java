package day22Arrays;

import java.util.Arrays;

public class C02Sort {
    public static void main(String[] args) {
        //verilen bir arrayde en kücük ve en büyük ksayimi carpuimimi bulunuz
        int arr[]= {2,4,5,67,8,99};
        //sort methodu olmadan alalim
        int enkucukSayi =Integer.MAX_VALUE ;//veyada arr[0] da alina bilir
        int enbüyükSayi = Integer.MIN_VALUE;//arr[0] da alina bilir
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < enkucukSayi) {
                enkucukSayi =arr[i];
            }
            if (arr[i]>enbüyükSayi){
                enbüyükSayi =arr[i];
            }
        }
        System.out.println("arraydeki en kucuk sayi : "+ enkucukSayi);
        System.out.println("arraydeki en büyük sayi : "+ enbüyükSayi);

// Arrays.sort methoduyla daha kolay yapilir
        Arrays.sort(arr);
        System.out.println("arraydeki en kucuk sayi : "+ arr[0]);
        System.out.println("arraydeki en büyük sayi : "+ arr[arr.length -1]);



    }
}
