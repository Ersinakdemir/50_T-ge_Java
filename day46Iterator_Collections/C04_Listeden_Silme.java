package day46Iterator_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C04_Listeden_Silme {
    public static void main(String[] args) {
       //bir listedeki isteninen sayi araliginda olmayan elementleri sileleim
        //orn [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi(sinirlar dahil)
        //output [23,45]
        List<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(13);
        list.add(56);
        list.add(23);
        list.add(45);
        list.add(14);
        list.add(40);

        ListIterator itr = list.listIterator();
        while (itr.hasNext()){
            Object sayi = itr.next();
            if ((Integer)sayi<20||(Integer)sayi>40)
            itr.remove();
        }
        System.out.println(list);
    }
}
