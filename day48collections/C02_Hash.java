package day48collections;

import java.util.HashSet;
import java.util.Set;

public class C02_Hash {
    public static void main(String[] args) {
        String str ="java cok güzel";
        String str2 ="hava cok güzel";
        System.out.println(str.hashCode());//524426925
        System.out.println(str2.hashCode());//1535544175

        Set<Integer> sayiKumesi =new HashSet<>();
        System.out.println(sayiKumesi.hashCode());
        sayiKumesi.add(10);//10
        System.out.println(sayiKumesi.hashCode());
        sayiKumesi.add(20);//10
        System.out.println(sayiKumesi.hashCode());
        sayiKumesi.add(30);//[10 20 30 ] 60
        System.out.println(sayiKumesi.hashCode());

        String str3 ="a";//97
        System.out.println(str3.hashCode());
        String str4 ="ab";//3105
        System.out.println(str4.hashCode());

    }
}
