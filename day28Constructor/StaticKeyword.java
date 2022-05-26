package day28Constructor;

public class StaticKeyword {
    static  int sayi1;
    int sayi2;
//Static variable lar dreckt class lara baglidir class icdrrisinde yaüpilan her
// türlu degisiklik static variable larda kalici olur .
// Instance variableler ise objeye baglidir intance variable lara
// sadece obje üzerinden erisilir ve degisiklikler o objede gecerlidir.
// instance veriable'in degerini tum objeler icin kalici olarak degistirmez
//   sadece o obje icin instance veriable degerini kalici olarak degistirir.


    public static void main(String[] args) {
        System.out.println(sayi1);
        //System.out.println(sayi2); sayi2 static olmadigi icin main methoddan drek kullanamayiz
        StaticKeyword obj1 = new StaticKeyword();
        System.out.println(obj1.sayi2);
        sayi1++;
        obj1.sayi2++;
        System.out.println(obj1.sayi1);

        StaticKeyword obj2 = new StaticKeyword();
        System.out.println(obj2.sayi2);//0
        System.out.println(obj2.sayi1);//1 static degiskenler objeden bagamsizdir

        obj2.sayi1++;
        obj1.sayi2++;
        System.out.println(obj2.sayi2);//0
        System.out.println(obj2.sayi1);//2 static degiskenler objeden bagamsizdir


    }
}
