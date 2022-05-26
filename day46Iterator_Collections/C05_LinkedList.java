package day46Iterator_Collections;

import java.util.LinkedList;

public class C05_LinkedList {
    public static void main(String[] args) {
        //hem list hemde Queue nun child class'idir
        LinkedList<Integer>list = new LinkedList<>();
        list.add(5);
        list.add(10);//add methodu list ten geldigi icin hep sona ekler
        list.addFirst(11);//addfirt deque dan gelir
        list.addLast(12);//addLast deque dan gelir
        list.add(2,25);
        System.out.println(list);
    }
}
