package day25List;

import java.util.Arrays;
import java.util.List;

public class C06ArraydenListOlusturma {
    public static void main(String[] args) {
        //verile bir arrayi listeye cevirin
        String arr[] = {"Ali", "Ahmet", "Ayse"};
        List<String> arraydenList =Arrays.asList(arr);
        //arrayden liste cevirdigimiz zaman yeni listin uzunlugu degistiremeyizdolayisiyla yeni list ile add(), remove(),
        //clear(),gibi methodlar calistirmak istedigimizde Exception olusur
        //arraydenList.add("J"); //UnsupportedoperationException
        System.out.println("14.satirda List" + arraydenList);

        arr[1] = "Fatma";
        System.out.println("17.  satirda Array"+ Arrays.toString(arr));
        System.out.println("18.satirda List" + arraydenList);//Liste islem yapmama ragmen
        // array de degisiklik yaptigim icin Listte degisti
        arraydenList.set(0,"Rukiye");
        System.out.println("20.  satirda Array"+ Arrays.toString(arr));




    }
}
