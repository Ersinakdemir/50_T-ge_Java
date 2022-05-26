package day08ternarzSwitch;

public class C05Ternary {
    public static void main(String[] args) {
        //Bazen Ternary deki iki sonucun dsts turleri farkli olabilir

        //verilen sayi 100 den büyükse sayinin karesini alip yazdiran...
        // 100 den kucukse sayi 100 den büyük olmali yazdirin

        // Eger sonuclar farkli data türleri ise sadece direk yazdirabiliriz
        int a = 8;
        int b = a++;
        int d = a++;

        int c = b;
        int sayi = 150;
        System.out.println(sayi>100 ? sayi*sayi : "sayi 100 den büyük olmali");
        System.out.println(b);
        System.out.println(d);
    }
}
