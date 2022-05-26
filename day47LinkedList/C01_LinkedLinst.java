package day47LinkedList;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedLinst {
    public static void main(String[] args) {
        LinkedList<Integer>ll1 = new LinkedList<>();
        ll1.add(10);//linkedList hem Qeue hem List interface ini impoliment ettigi icin
                    // ikisininde methodlarini calistirir ama data türü olarak hangisini secersek onun methodlarini kullaniriz

        //sadece listden gelen method lari kullanmakk istersek

        List<Integer>ll2 =new LinkedList<>();
        ll2.add(34);
        ll2.remove(0);

        //sadece DEque den gelen methodlar icin
        Deque<Integer>ll3 = new LinkedList<>();
        ll3.add(3);
        ll3.add(8);
        ll3.remove(0);
    }
}
