package day04dataCasting_Increment;

public class C04ExplicitNarrowing {
    public static void main(String[] args) {
        int sayi1 = 879;
        double sayi2 = 10;
        double sayi3 = sayi1 /sayi2;
        System.out.println(sayi3);
        int sayi4 = (int) (sayi1/sayi2);//deger double variable int yani variable daha dar dolayisiyla java otomatik olarak
        // yapmaz sorumlulugu üstlenmeizi ister
        System.out.println(sayi4);//java daraltmayi(Narrowing) otomotik yaümaz

        int sayi5 =-130;
        byte sayi6 = (byte) sayi5;
        System.out.println(sayi6);

    }
}
