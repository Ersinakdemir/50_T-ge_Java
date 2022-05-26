package day46Iterator_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C03_Listeyi_Tersinden_Olusturmak {
    public static void main(String[] args) {
        List<Integer>liste = new ArrayList<>();
        liste.add(5);
        liste.add(6);
        liste.add(7);
        liste.add(8);
        liste.add(9);

        ListIterator itr = liste.listIterator();
        while (itr.hasNext()){
            itr.next();
        }while (itr.hasPrevious()){
            System.out.print(itr.previous() +" ");
        }


    }
}
