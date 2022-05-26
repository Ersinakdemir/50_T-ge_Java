package day06IfElseStatements;

import java.util.Locale;
import java.util.Scanner;

public class C06GunIfELse {
    public static void main(String[] args) {
        //ggirilen gunun haftaici mi hafta sonu oldugunu veren bir program yazuniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfeen gun ismini giriniz");
        String gun = scan.next().toLowerCase(Locale.ROOT);

        if (gun.equals("pazar") || gun.equals("cumartesi")) {
            System.out.println("girdiginiz gun hafta sonu");

        }
        else {
            System.out.println("girdiginiz gun hafta ici");

        }
        scan.close();
    }
}
