package day46Iterator_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01Iterater {
    public static void main(String[] args) {
        List<Integer> liste =new ArrayList<>();
        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(9);
        System.out.println(liste);

        Iterator itr= liste.iterator();//iterator methodunu olusturdugumuz liste objesi
                                       // üzerindde ArrayList classinda calisiyoriu
        /*
        iterator nasil calisir
        bir iterator objesi olusturmak icin collection üyesi bir obje kullanmaliyiz
        yani biz bu iterator ojjrsini bizim ornegimizde Liste objesini üzerinde calismak icin olusturmusolduk
        Biz Iterator objesini olusturdugumuzda
        Iterator collection in ilk elementini oncesine gidip bekler
        [(itr)5,6,7,8,9]
        itr.hasNext()===>true

        itr.next(); ==> iterator bir sonraki elemanin yanina gecer ve üstünden gectigi elemanin bnize döndörü
        [5,(itr)6,7,8,9]==> bize 5 döndörör

         */

        System.out.println(itr.hasNext());//true
        System.out.println(itr.next());//5
        System.out.println(itr.next());//6
        //System.out.println(itr.remove());//6
        itr.remove();
        System.out.println(liste);
    }
}
