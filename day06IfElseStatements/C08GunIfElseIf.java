package day06IfElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C08GunIfElseIf {
    public static void main(String[] args) {
        //ggirilen gunun haftaici mi hafta sonu oldugunu veren bir program yaziniz
        // eger gun ismini yanlis girdiyse yanlis giris yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfeen gun ismini giriniz");
        String gun = scan.next().toLowerCase(Locale.ROOT);

        if (gun.equals("pazar") || gun.equals("cumartesi")) {
            System.out.println("girdiginiz gun hafta sonu");

        }
        else if(gun.equals("pazartesi") || gun.equals("sali")||gun.equals("carsamba") ||gun.equals("persembe") ||
                gun.equals("cuma")) {
            System.out.println("girdiginiz gun hafta ici");

        }
        else {
            System.out.println("Lutfen gun ismini dogru giriniz");

        }//If Else If statemant else ile bitiyorsa olasiliklardan sadece biri mutlaka calisir
        //Java ilk bulsugu true ait kodu calistirir


    }
}
