package eliHoca;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadFile_Txt {
    public static void main(String[] args) {

        String str = "java güzel java ögrenmek kolaydir calisirsan aykut java ";
        String arr [] =str.split(" ");

        System.out.println(Arrays.toString(arr));
        ArrayList<String>list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int sayac =1;
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i].equalsIgnoreCase(arr[j])){
                        sayac++;
                    }
                }
            if (!list.contains(arr[i])){
                list.add(arr[i]);
                System.out.println(arr[i] + " : "+ sayac);
            }
        }
    }
}
