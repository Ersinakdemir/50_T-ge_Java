package day05Matematikselislemler;

import java.util.Locale;

public class C04WrapperClass {
    public static void main(String[] args) {
        //primitive ile non Primitiv data arasimdaki farklar nelerdi
        String str= "Java";
        int sayi= 10;
        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str);
        //non Primitite data tipleri data depolamak disinda bircok yararli method a sahiptgir
        // ama Primivtive data tipleri  sadece deger saklar

        //Primitive data turleri icin method gerektiginde ara cozum olustumus,
        //her bir Primitive data turu icin non Primitive olarak kullana bil,ek icin
        // ozel class lar olusturmus ve bunlara wapper Class denir
        double sayi2 = 5;
        //sayi2 primitive oldugunda sayi2. dedigimizde hicbir method gelmez Ams
        Double sayi3 =15.2;
        //Sayi3 Wrapper clas olan Double ini 0kullandigimizdan sayi3. dedimizde birsürü Method gelir

    }
}
