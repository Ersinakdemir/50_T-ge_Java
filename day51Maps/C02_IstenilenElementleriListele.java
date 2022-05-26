package day51Maps;

import day49Maps.MapOlustur;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class C02_IstenilenElementleriListele {
    public static void main(String[] args) {

//Verilen Mapte istenen programlama dilini bilenleri List olarak döndüren bir method creat ediniz

        Map<Integer,String> sinifMap = MapOlustur.myMap();
        String istenenDil ="Java";
        List<String>istenenDiliBilenler = istenenDiliOlustur(sinifMap,istenenDil);
        System.out.println(istenenDiliBilenler);
    }
    public static List<String> istenenDiliOlustur(Map<Integer, String> sinifMap, String istenenDil) {
        List<String>istenenDiliBilenler = new ArrayList<>();
        List<String> values =new ArrayList<>();
        values.addAll(sinifMap.values());

        for (String w:values
             ) {
            String valuesArr[] =w.split(", ");
            if (valuesArr[2].equalsIgnoreCase(istenenDil)){
                istenenDiliBilenler.add(valuesArr[0]);
            }
        }
       // System.out.println(istenenDiliBilenler);


      return istenenDiliBilenler;
    }
}
