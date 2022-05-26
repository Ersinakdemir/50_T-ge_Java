package day43GarbageAbstractClass;

public class C01Final {
    final static double piSayisi =3.14;
    final static String okulIsmi ="yildiz koleji";
    public static void main(String[] args) {
        final int sayi =10;
       // sayi = 20; final variable lari görülür cagirilir islem yapilir ama yeni
        // deger atamasi yapilanaz hic degistirilmemesini istedigimiz degiskenleri final ile ataya biliriz
        //mesela pi sayisi gibi
    }
    public static final void method1() {
        System.out.println("Parent class final method1");
    }
}
