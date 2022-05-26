package day22Arrays;

import java.util.Arrays;

public class C07Split {
    public static void main(String[] args) {
        String str= "Java gun gectikce güzellesiyor";
        String kelimeler [] = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        System.out.println(kelimeler[1]);
        String gectikce[]=str.split("gectikce");
        System.out.println(Arrays.toString(gectikce));//Java gun ,  güzellesiyor hem günden sonra hemde güzellesiyordan önce iki bosluk var
        // biri Stringin icinde ki bosluk digeri javanin kelimelere ayirdiginda koydugu bosluk
        String harfler[] = str.split("");
        System.out.println(Arrays.toString(harfler));
    }
}
