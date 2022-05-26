package day26forEachloopConstructor;

import java.util.ArrayList;
import java.util.List;

public class C02ForEachLoop {
    public static void main(String[] args) {
       // 10 elementli bir list olusturalim
        int arr [] ={1,2,3,4,5,6,7,8,9,10};
        List<Integer> sayilar =new ArrayList<>();
        for (int each:arr
             ) {
            sayilar.add(each);

        }
        System.out.println(sayilar);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
// Sayilar lisresindenn 3 e bölünemeyen sayilari yazdiralim
        for (int each:sayilar
             ) {
            if (each % 3 != 0 ){
                System.out.print(each + " ");
            }

        }
    }
}
