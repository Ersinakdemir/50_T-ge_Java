package day06Concatenation_Operators;

public class C01Concatenation {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Güzel";
        int sayi1 = 5;
        int sayi2 = 3;
        //variablelarin degerlerini degistirmeden asagidaki ifadeleri yazdirin
        //Java5Guzel
        System.out.println(str2+sayi1+str2);
        //2Guzel15
        System.out.println(sayi1 -sayi2 + str2+sayi1*sayi2);

        //Java22
        System.out.println(str2+(sayi1 -sayi2)+(sayi1-sayi2));
        //53Guzel
        System.out.println(""+sayi1+sayi2+str2);
        /*Eger tamamen sayilardan olusan bir String varsa ve biz bunu Int a cevirmek istersek Integar.valueOf(str)

        bir sayisi String e cevirmek istersek Basina "" +sayi ekleriz
         */




    }
}
