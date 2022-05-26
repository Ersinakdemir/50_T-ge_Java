package day06Concatenation_Operators;

public class C02MantikOPerators {
    public static void main(String[] args) {
        System.out.println(5+2 ==8);
        boolean sonuc1 = 5>4 && 7<9 && 6+3==9;
        System.out.println(sonuc1);

        // 15 in 10 ile 20arasinda oldugunu gösterin
        int sayi3 = 15;
        System.out.println(10<sayi3 && sayi3<20);
        //sayi4 un 10 ile 20 arasimda olmadigini true diyerek gösteriniz
        int sayi4 = 5;
        System.out.println(sayi4<10 || sayi4>20);
    }
}
