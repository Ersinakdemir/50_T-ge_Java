package day19DoWhileloop;

public class C02Whileloop {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
        int input = 458;
        int rakam = 0 ;
        int toplam = 0;

        while (input>0){
            rakam =input % 10;
            toplam += rakam;
            input/=10;
        }
        System.out.println("rakamlar toplami : "+ toplam);

    }
}
