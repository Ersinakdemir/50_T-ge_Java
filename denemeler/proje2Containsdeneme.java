package denemeler;

import java.util.ArrayList;
import java.util.List;

public class proje2Containsdeneme {
    public static void main(String[] args) {
        int UseThisArray1 [] = {1,2,3,4,5,6};
        int UseThisArray2 [] = {1,2,3,9};

        List<Integer> myList = new ArrayList<>();
        boolean iceriyorMu =false;
        for (int i = 0; i < UseThisArray1.length; i++) {
            for (int j = 0; j < UseThisArray2.length; j++) {
                if (UseThisArray1[i] == UseThisArray2[j]) {
                    myList.add(UseThisArray1[i]);
                }
            }

        }if (UseThisArray2.length==myList.size()){
            iceriyorMu =true;
        }else{
            iceriyorMu = false;
        }
        System.out.println(iceriyorMu);



    }
}
