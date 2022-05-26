package day52_MapsEntrySet;

import day49Maps.MapOlustur;

import java.util.Map;
import java.util.Set;

public class C01_EntrySet {
    public static void main(String[] args) {
        Map<Integer,String>sinifListMap = MapOlustur.myMap();
        System.out.println(sinifListMap.entrySet());//Set
        /*
        myMap.entrySet();methodu  bize Entrylerde olusan bir set dondurür
         Eger bu entry leri manipule etmek icin methodun döndürdügü seti
         yeni bir set olusturupstore etmeliyit
         */
        Set<Map.Entry<Integer,String>> sinifEntrySet = sinifListMap.entrySet();
        System.out.println("No  Isim   Soyisim   Brans  ");
        System.out.println("----------------------------- ");
        for (Map.Entry<Integer,String>each:sinifEntrySet){
            //System.out.println(each);
            String entryStr = each.toString();
            Integer keyEntry = each.getKey();
            String valieEntry= each.getValue();
            String valueArr[]= valieEntry.split(", ");
            System.out.printf("%-4d %-6s %-6s %-6s %-7s\n",keyEntry, valueArr[0],valueArr[1],valueArr[2],valueArr[3]);

        }        System.out.println("----------------------------- ");

    }
}
