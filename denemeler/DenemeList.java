package denemeler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DenemeList {
    String name ="ali";
    int schulerNo = 3;

    static List<DenemeList> denemeList = new ArrayList<>();

    public DenemeList(String name, int schulerNo) {
        this.name = name;
        this.schulerNo = schulerNo;
    }

    public static void addDenemeList(DenemeList k){
        denemeList.add(k);
    }

    public static  void main(String[] args) {
        java.util.List<Integer> nenemeList =new ArrayList<>(Arrays.asList(1,2,3,4));//bos bir list olustu
        System.out.println(nenemeList);
        System.out.println(nenemeList.get(3));

        System.out.println(denemeList);
    }
}
