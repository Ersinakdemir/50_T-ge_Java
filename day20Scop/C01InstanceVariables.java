package day20Scop;

public class C01InstanceVariables {
    int sayi =5;
    String branjIsmi = "Kimya";
    boolean okulAcildimi;
    public static void main(String[] args) {
        //sayi = 100 sayi variable staticolmadigi icin main methoddan direk kullanilamaz
        //instance variable lara static method lardan ulasabilmek icin obje olusturmamiz gerekir
        C01InstanceVariables obj1 = new C01InstanceVariables();
        System.out.println(obj1.sayi);//0
        obj1.sayi = 10;
        System.out.println(obj1.sayi);//10
        System.out.println(obj1.okulAcildimi);//10

        C01InstanceVariables obj2 =new C01InstanceVariables();
        obj2.sayi=30;
        System.out.println(obj2.sayi);// bu yeni bir obje oldugu icin 0 dir yani default degerdir
        System.out.println(obj2.branjIsmi);//kimya
        obj2.okulAcildimi= true;


    }
}
