package day52_MapsEntrySet;

import java.util.HashMap;
import java.util.Map;

public class C03Map_Methodlari {
    public static void main(String[] args) {
        Map<String,Integer> myMap =new HashMap<>();
        myMap.put("H",3);
        myMap.putIfAbsent("K",5);

        //Bir ekleme yapmak iytedigimizde key daha önce eklenmisse map e eklensin
        //daha önce eklenmisse,eskiyi silmemek icin bizi uyarsin
        System.out.println(myMap.putIfAbsent("A",6));
        //System.out.println(myMap.putIfAbsent("K",7));
        if (myMap.putIfAbsent("K",7)!= null){
            System.out.println("Girdiginiz Key Map dezaten var");
        }
        System.out.println(myMap);

        myMap.put("A",10);// icinde A varsa bile degerini degistiriyor
        System.out.println(myMap);

        myMap.computeIfAbsent("A" ,v  -> 20);//Eger deger yoksa koyar
        System.out.println(myMap);//{A=10, H=3, K=5}

        myMap.compute("A",(key,value) ->45);//deger varsa bile degistirir
        System.out.println(myMap);// {A=45, H=3, K=5}


    }
}
