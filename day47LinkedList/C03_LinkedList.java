package day47LinkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class C03_LinkedList {
    public static void main(String[] args) {
        Deque<Integer> ll1 = new LinkedList<>();
        //System.out.println(ll1.element());//bosken  element(); methodunu kullanirsak exception firlatir
        System.out.println(ll1.peek());//bosken peek() null döndürüyor normalde ilk elementi getirir bosa null
        System.out.println(ll1.poll());//normalde listedeki ilk elementi siler ve bize döndürür eger bossa null döndürür
        //ll1.pop();//ilk elementi silip bize döndürür eger bulamazsa exception firlatir
        ll1.push(30);
        ll1.push(20);//listedenin basina element ekler
        System.out.println(ll1);

        System.out.println(ll1.remove());//ilk melemnti siler biz edöndürür
        ll1.push(40);
        ll1.push(50);
        System.out.println(ll1);
        ll1.remove(50);// drek objekt olarak 50 yi siler
    }
}
