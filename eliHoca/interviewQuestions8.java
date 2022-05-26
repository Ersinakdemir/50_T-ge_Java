package eliHoca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class interviewQuestions8 {
    //  PART 1
// create a method that accepts ArrayList<Integer> and Set<Integer> as parameters
// and add all elements from ArrayList to Set

// ArrayList<Integer> ve Set<Integer> öğelerini parametre olarak kabul eden bir yöntem oluşturun
// ve tüm öğeleri ArrayList'ten Set'e ekleyin

// PART 2
// create a method that takes Set<Character> and varargs of char as parameters
// and adds all chars to the set

// Set<Character> ve char değişkenlerini parametre olarak alan bir yöntem oluşturun
// ve tüm karakterleri sete ekleyin
public static void main(String[] args) {
    ArrayList<Integer> arrList = new ArrayList<>();
    arrList.add(10);
    arrList.add(20);
    arrList.add(30);
    arrList.add(10);
    arrList.add(50);
    arrList.add(50);
        System.out.println(arrList);
        Set<Integer> set = new HashSet<>();

        arrdenSeteDönüstür(arrList, set);
        System.out.println("arrLoisti sete attiktan sonra");
        System.out.println("Set = " + set);


    //Bolum2
        Set<Character> setCharSet = new HashSet<>();
        karakterleriSeteEkleme(setCharSet,'A','B','C','D');
    System.out.println(setCharSet);

    }

    private static void karakterleriSeteEkleme(Set<Character> setCharSet, Character...chars) {
        for (int i = 0; i < chars.length; i++) {
            setCharSet.add(chars[i]);
        }
    }

    private static void arrdenSeteDönüstür(ArrayList<Integer> arrList, Set<Integer> set) {
        for (Integer sayi : arrList
        ) {
            set.add(sayi);

        }
    }
}
