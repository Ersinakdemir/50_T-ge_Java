package day27Constructor;

public class VolvoRunner {
    public static void main(String[] args) {
        Volvo araba1 =new Volvo();
        System.out.println(araba1.marka);
        araba1.yakit = "Dizel";
        araba1.elektrikliMi = false;
        System.out.println(araba1.maxHiz);
        System.out.println(araba1.toString());

        Volvo araba2 =new Volvo();
        araba2.elektrikliMi =true;
        araba2.yakit="Elektrikli";
        araba2.model ="XC90";
        araba2.maxHiz = araba2.maxHizAta();
        System.out.println(araba2.toString());

    }
}
