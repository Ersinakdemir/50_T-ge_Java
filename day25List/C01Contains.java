package day25List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class C01Contains {
    public static void main(String[] args) {
        List<String>harfler = new ArrayList<>();
        harfler.add("D");
        harfler.add("M");
        harfler.add(1,"T");
        harfler.add("A");
        System.out.println(harfler.contains("M"));
        System.out.println(harfler.contains("F"));

        List<String>karakterler = new ArrayList<>();
        karakterler.add("Da");
        karakterler.add("Db");
        System.out.println(harfler.containsAll(karakterler));//True
        System.out.println(harfler.equals(karakterler));

        // Egeer bir listenin icin
        // de baska bir listeyi aratiyorsak ContainsAll
        // ile sorgulanir bize boolen döner
        List<String>karakterler2 = new ArrayList<>();
        karakterler2.add("D");
        karakterler2.add("M");
        System.out.println(karakterler.equals(karakterler2));

        Collections.sort(karakterler);
        System.out.println(karakterler);
        System.out.println(karakterler.equals(karakterler2));
    }
}
