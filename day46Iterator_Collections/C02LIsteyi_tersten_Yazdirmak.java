package day46Iterator_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C02LIsteyi_tersten_Yazdirmak {
    public static void main(String[] args) {
        //verilen listedeki tüm elemalari 3 arttirma
        List<Integer> liste =new ArrayList<>();
        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(9);
        System.out.println(liste);

        Iterator itr =liste.iterator();
        while (itr.hasNext()){//yaninda element oldugu müddetce calisacak
            itr.next();

        }
        ListIterator itr1 =liste.listIterator();//listIteretor olunca methodlari kullanabiliyoruz
        while (itr1.hasNext()){//yaninda element oldugu müddetce calisacak
            Object sayi = itr1.next();
            itr1.set((Integer)sayi +3);

        }
        System.out.println(liste);




    }
}
