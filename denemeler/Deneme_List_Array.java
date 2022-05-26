package denemeler;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deneme_List_Array {
    public static void main(String[] args) {

        //1. kisim

        Integer arr []={1,2,3,4,5};
        List<Integer> list= Arrays.asList(arr);
        System.out.println(list.set(1,9));//add,remove exception firlatiyor

        //2.kisim

        ArrayList<Integer>list2 =new ArrayList<>(Arrays.asList(5,6,7,8,9));
        System.out.println(list2.add(10));
        System.out.println(list2.remove(3));
        System.out.println(list2.set(3,9));
        //listede kullandigimiz bütün methodlari kullana biliyoruz
    }
}
