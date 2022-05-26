package day24ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C03Remove {
    public static void main(String[] args) {
        List<Integer> sayilar =new ArrayList<>();
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(0,7);
        sayilar.add(2,9);
        System.out.println(sayilar);

        sayilar.remove(3);// index 3 deki elemani siler
        //sayilar.remove(5);//indexOfBoundsException

        //sayilardan olusan bir listede objeyi vererek element silme methodu calismaz sayi degeri
        // girdigimizde java otomatik olaraksayiyi index kabul ediyor
        Integer sayi =5;
        System.out.println(sayilar.remove(sayi));
        System.out.println(sayilar);

    }
}
