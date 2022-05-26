package day26forEachloopConstructor;

import java.util.ArrayList;
import java.util.List;

public class C03ForEachLoop {
    public static void main(String[] args) {
        //iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        //Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
        String arr1[]= {"Ali", "Ayse", "Can", "Fatma","Rukiye"};
        String arr2[]= {"Eren", "Emre", "Can", "Fatma"};

        List<String>ortakElemanlar = new ArrayList<>();
        for (String each1:arr1
             ) {
            for (String each2:arr2
                 )
                if (each1.equals(each2)){
                    ortakElemanlar.add(each1);

            }

        }
        if (ortakElemanlar.isEmpty()){
            System.out.println("Orta elaman yok");
        }
        else {
            System.out.println(ortakElemanlar);
        }

    }
}
