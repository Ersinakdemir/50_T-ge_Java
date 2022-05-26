package day17ForLoop;

public class C06ForLoop {
    public static void main(String[] args) {
        // Verilen iki harf ve aralarindaki harfleri yazdiran bir cod yaziniz

        char ilkHarf = 'm';
        char sonHarf = 't';
        for (char i = ilkHarf; i <= sonHarf; i++) {
            System.out.print(i + " ");

        }
        double baslangic =10;
        double bitis = 20;
        double artis= 0.2;
        //baslangic vebitis sayilari arasinda artis miktari ile olusacak tam sayilari yazdirin

        for (double i = baslangic; i <=bitis; i= i + artis) {
            System.out.println(i);

        }
    }
}
