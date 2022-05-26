package day05Matematikselislemler;

import com.sun.jdi.ShortValue;

public class C05WrapperClass {
    public static void main(String[] args) {
        short sayi1 = 20;
        Short sayi2 = 30;
        sayi1 =sayi2;//Wrapper Class ile ayni isimdeki primitive data tipi arasinda gecis olur
        System.out.println(Short.BYTES);


    }
}
