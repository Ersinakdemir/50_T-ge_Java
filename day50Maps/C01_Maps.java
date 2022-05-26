package day50Maps;

import day49Maps.MapOlustur;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
        //siniftaki ögrenci listesini düzenli olarak yazdiralim
        Map<Integer, String> sinifListMap = MapOlustur.myMap();//Map olusturmak icin Mapolustur klkasindaki methodu cagirdik
        System.out.println(sinifListMap);
        Set<Integer> sinifKeyseti = sinifListMap.keySet();//Map deki key leri sinifKeySeti diye bit set attik
        List<Integer> keyList = new ArrayList<>();//set deki key leri atip index e göre islem yapabilmek
        // icin bos bir List olusturduk
        keyList.addAll(sinifKeyseti);//keyler list e atandi ve tektek ulasa biliriz
        System.out.println(sinifKeyseti);
        //Simdi de value leri index ile ulasabilecegimiz bir sekle sokalim

        sinifListMap.values();//collection döndürüyor

        Collection<String> sinifValueColl = sinifListMap.values();
        System.out.println(sinifValueColl.size());

        List<String> sinifValuelist = new ArrayList<>();//set deki value lari collection a attik simdi de ordan Liste atiyoruz
        sinifValuelist.addAll(sinifValueColl);

        //Her bir value birden fazla bilgi iceriyor onun icin value leri multidimensional bir array
        // e atmak mantikli gibi duruyor ancak MDA olusturmak icin boyutlari bilmeye ihtiyacimiz var

        int outerArrayBoyut = sinifValuelist.size();

        //neer array lerin boyutunu bulmak biraz daha kompleks olacak

        String ilkValue = sinifValuelist.get(0);
        System.out.println(ilkValue);

        String ilkValueArray[] = ilkValue.split(", ");
        int innerArrayBoyut = ilkValueArray.length;

        String valueMDA[][] = new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i < outerArrayBoyut; i++) {
            String tepm[] = sinifValuelist.get(i).split(", ");
            for (int j = 0; j < innerArrayBoyut; j++) {
                valueMDA[i][j] = tepm[j];
            }
        }
        //Bu satira kadar keyleri index ile ulasabildigim keylist e atadim
        //value lari valueMDArr e atadik
        //Simdi bu key ve value leri istedigimiz gibi manuple edebilirim
        System.out.println("Numara Isim Soyisism Brans");
        System.out.println("===========================");
        for (int i = 0; i < keyList.size(); i++) {
            System.out.print(keyList.get(i) + "   ");
            for (int j = 0; j < innerArrayBoyut; j++) {
                System.out.print(valueMDA[i][j] + "   ");
            }
            System.out.println("");
        }

    }
}

