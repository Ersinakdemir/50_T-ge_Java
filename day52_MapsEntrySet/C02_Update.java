package day52_MapsEntrySet;

import day49Maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C02_Update {
    public static void main(String[] args) {
        Map<Integer,String>sinifListMap = MapOlustur.myMap();

        Set<Map.Entry<Integer,String>> sinifEntrySet = sinifListMap.entrySet();
        //System.out.println("No  Isim   Soyisim   Brans  ");
        //System.out.println("----------------------------- ");
        for (Map.Entry<Integer,String>each:sinifEntrySet){
            //System.out.println(each);
            //String entryStr = each.toString();
            Integer keyEntry = each.getKey();
            String valieEntry= each.getValue();
            String valueArr[]= valieEntry.split(", ");
            valueArr[2]="Java";

            String valueYeni =  valueArr[0] + ", "+ valueArr[1] + ", "+ valueArr[2] + ", "+valueArr[3];

            sinifListMap.put(keyEntry,valueYeni);
        }
        System.out.println(sinifListMap);
    }
}
