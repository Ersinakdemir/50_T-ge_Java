package day51Maps;

import java.util.HashMap;
import java.util.Map;

public class C01_KullanicininSayfasiniBulma {
    public static void main(String[] args) {
        /*
        verilen bir Stringdeki harfleri ve harflerin  kacarkez kullanildigini
        return eden bir method creat ediniz
        orn: Input : Helloooo output : H=1, e=1, l=2, e=3
         */
        String input = "Helllllooooooo";
        String harflerArr []= input.split("");

        Map<String, Integer> kullanimSayilari =new HashMap<>();

        for (String w:harflerArr
             ) {
            if (kullanimSayilari.containsKey(w)){
                kullanimSayilari.put(w,kullanimSayilari.get(w) +1);
            }else {
                kullanimSayilari.put(w,1);
            }
        }
        System.out.println(kullanimSayilari);
    }
}
