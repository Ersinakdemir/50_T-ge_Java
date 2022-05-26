package day27Constructor;

public class VolvoRunner2 {
    public static void main(String[] args) {
        //Her obje olusturdugumuzda mode, yakiz, yil gibi degerleri tek tek atama yapmak istemiyorsak
        Volvo arb1 =new Volvo("XC60",true, 2023, "Elektrik");
        System.out.println(arb1.toString());
        System.out.println(arb1);
    }
}
