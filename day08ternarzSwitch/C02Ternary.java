package day08ternarzSwitch;

import java.util.Scanner;

public class C02Ternary {
    public static void main(String[] args) {
        //Ternary ile yapilan tüm islemler If Else ile yapilabilir.
        //Ternary nin tercih edilmesinin sebebi yapinin basit olmasidir TErnary icerisinde komplex kodlar +olmaz,,,
        // sadece sonuc veya bizi sonuca gotüren basit islemler olabilir


        //Kullanicidan bor sayi alip ütek mi cift mi diye bakalim
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi % 2 ==0){
            System.out.println("sayi cift");
        }else {
            System.out.println("sayi tek");
        }
        System.out.println(sayi % 2 ==0 ? "Sayi cift": "Sayi tek");
    }
}
