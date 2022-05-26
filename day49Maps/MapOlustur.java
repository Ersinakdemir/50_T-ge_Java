package day49Maps;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {
    public static Map<Integer,String> myMap(){
        Map<Integer,String>siniflist = new HashMap<>();
        siniflist.put(101, "ali, can, dev, mathe");
        siniflist.put(102, "veli, yan, java, fizik");
        siniflist.put(103, "Deli, van, c#, sprac");

        return siniflist;
    }
}
