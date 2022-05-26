package day23MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04Arrays {
    public static void main(String[] args) {
        //kullanicidan kac elementlik bir Array olusturacagini sorup
        //olusturup kullanicidan degerleri alin ve array e atayin
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen kac elementli bir array istediginizi yaziniz");
        int uzunluk = scan.nextInt();

        int arr [] = new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            System.out.println("Array icin" + (i+1) + ". elemani giriniz");
            arr[i] = scan.nextInt();

        }
        System.out.println(Arrays.toString(arr));

    }
}
