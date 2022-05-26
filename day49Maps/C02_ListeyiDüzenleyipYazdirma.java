package day49Maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class C02_ListeyiDüzenleyipYazdirma {
    public static void main(String[] args) {
        //sinif listesini düzenli bir sekilde yazdirmak
        Map<Integer,String>sinif =MapOlustur.myMap();
        System.out.println(sinif);
        sinifListesiniYazdirma(sinif);
    }

    private static <collection> void sinifListesiniYazdirma(Map<Integer, String> sinif) {
        System.out.println("Numara Isim Soyisim Brans");
        System.out.println("=========================");

        //Map yapisinda yazdirdigimizda kullanicilar bir sey anlamaya bilir
        //bunun icin önce map yapisnni  kodlarla manipula edip map deki datalari,
        //istedigimiz formata sokmazmiz gerekiyor
        //1.adim keyve value lari map den alip iki farkli atadik.

        Set<Integer> keyset =sinif.keySet();
        Collection<String> valueSet = sinif.values();

        //Set<String> valueSet = (Set)sinif.values();

        System.out.println(keyset);
        System.out.println(valueSet);
        System.out.println(valueSet.size());

        for (String each:valueSet
             ) {
            System.out.println(each);
        }
    }
}
