package day23MultiDimensionalArrays;

import java.util.Arrays;

public class C01MultiDimensionalArrays {
    public static void main(String[] args) {
        int arr[][] ={{3,1,2},{6,10,54}};
        System.out.println(arr[0][2]);//2
        System.out.println(arr[1][1]);//10
        //ilk Arryin tum elementlerini yazdirin
        //System.out.println(arr[0]);// arr[0] bir Array oldugundan direk yazdirilamaz

        System.out.println(Arrays.toString(arr[0]));//[3,1,2]

        //MDArrays de tümn elementleri yazdirmak istersek
        System.out.println(Arrays.deepToString(arr));


    }
}
