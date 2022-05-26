package day19DoWhileloop;

public class C05Scope {
    public static void main(String[] args) {
        //bir method icerisind olusturdugumuz variable lar sadece olusturulduklari
        // method larda kullanilr baska methodlar kullani mazlar
        int sayi =10;
        do {
            System.out.println(sayi);
            sayi++;
        }while (sayi<12);



    }
}
