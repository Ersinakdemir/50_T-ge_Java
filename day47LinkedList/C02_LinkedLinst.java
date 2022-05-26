package day47LinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class C02_LinkedLinst {
    public static void main(String[] args) {
        //Listden gelen özellikleri biliyoruz
        //onun icin Dequeden gelen özelliklere bakalim

        Deque<Integer> ll1 = new LinkedList<>();
        ll1.addFirst(10);//basa elemet ekler
        ll1.addLast(11);//sona elelment ekler, add e göre hizlidir
        System.out.println(ll1);
        System.out.println(ll1.element());//ilk elementi silmeden bize döndürür.bossa exception firlatir bossa exception firlatir
        System.out.println(ll1.getLast());//silmeden son elementi getirir
        System.out.println(ll1.getFirst());//silmeden ilk elementi getirir
        System.out.println(ll1.getLast());//silmeden son elementi getirir
        ll1.offer(35);//listeye element ekliyor
        System.out.println(ll1);
        System.out.println(ll1.offer(22));//sona ekler
        System.out.println(ll1);
        System.out.println(ll1.peek());//bastaki elementi getirir amam silmez.eger list bossa null döndürüyor
        System.out.println(ll1.poll());//bastaki elementi siler ve bize döndürür
        System.out.println(ll1);

    }
}
