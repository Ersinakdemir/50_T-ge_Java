package day04dataCasting_Increment;

public class IncrementArttirma {
    public static void main(String[] args) {
        int sayi = 20;
        System.out.println(sayi+10);//bu satirda sayiyi arttirmadik sadece 10 fazlasini yazdirdik
        System.out.println(sayi);
        sayi += 10;
        System.out.println(sayi);
        System.out.println( sayi+=10);//40
        // Bir variable in degferini kalici olarak arttirmak icin assigment sartdir

        System.out.println(sayi++); // bu 50
        System.out.println(sayi);//51
        System.out.println(++sayi); // bu 52
    }
}
