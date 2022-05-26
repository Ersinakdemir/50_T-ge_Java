package day21Arrays;

import java.util.Arrays;

public class C02Arrays {
    public static void main(String[] args) {
        String arr1[] = {"Ali", "Veli","Ayse"};
        //Array in icinde elemente ulasmak icin index kullaniriz

        System.out.println(arr1[1]);//Ali
        arr1[1] ="Esila";
        System.out.println(arr1[1]);
        //arrayin icin  deki indexi kullanarak elementlere ulasabili ve update edebiliriz
        int arr2 [] = new int[4];
        System.out.println(arr2[1]);
        System.out.println(arr2[3]);
        //Arrayin tamamini yazdirmak
        System.out.println(arr2);//[I@3b9a45b3
                                 // array ler non primitive olduklarimdan direk yazdirmak
                                 //istersek java referans bilgisini yazdirir
        for (int i = 0; i < 4; i++) {
            System.out.print(arr2[i] + " ");

        }
        System.out.println("");
        //array i yazdirmak icin javadaki Arrays class indan toString() kullanilir

        System.out.println(Arrays.toString(arr2));
        arr2[1]=11;
        arr2[2] = 22;
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr1));





    }
}
