package day47LinkedList;

import java.util.HashSet;
import java.util.Set;

public class C04ArraydenTekrarlariSilme {
    public static void main(String[] args) {
        //verilen bir arrayden tekrar eden elementleri silip
        //unique(benzersiz) elementler olusan bir Array haline dondüren bir method olusturun
        int arr[] = {3,5,4,6,3,1,2,7,6,1,4,2,8};
        arr = benzersizYap(arr);
        System.out.println(arr.toString());
    }

    private static int[] benzersizYap(int[] arr) {
        Set<Integer> benzersizSet=new HashSet<>();
        for (Integer each:arr
             ) {
            benzersizSet.add(each);
        }
        System.out.println(benzersizSet);
        //setlerde index yapisi yoktur dolayisi ile for loop kullanamayiz
        Integer arrBenzersiz[]= new Integer[benzersizSet.size()];
        int index =0;
        for (Integer i:benzersizSet
             ) {
            index++;
            arr[index]=i;
        }
        return arr;
    }
}
