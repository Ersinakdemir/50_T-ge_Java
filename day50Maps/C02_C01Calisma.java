package day50Maps;

import day49Maps.MapOlustur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class C02_C01Calisma {
    public static void main(String[] args) {
        Map<Integer,String> sinifMap = MapOlustur.myMap();
        //keyler ve Value lara ulasmamiz gerekiyor
        //keyleriu alip listeye atalim
        List<Integer> keyList =new ArrayList<>();//bos bir list olustu


        keyList.addAll(sinifMap.keySet());//keyler liste atildi
        System.out.println(keyList);

        //Valuelari bir Liste atalim
        List<String> valueList = new ArrayList<>();
        valueList.addAll(sinifMap.values());
        System.out.println(valueList);
        System.out.println(valueList.size());



        //Vlaue nin uzunlugunu bulup array olusturalim
        System.out.println(valueList.get(0).length());
        valueList.get(0).split(", ");

        for (int i = 0; i < keyList.size(); i++) {
            System.out.print(keyList.get(i));
            String valueArr[]= valueList.get(i).split(", ");
            for (int j = 0; j < valueArr.length; j++) {
                System.out.print("   " +valueArr[j]+ "   ");
            }
            System.out.println("");
        }
    }
}

