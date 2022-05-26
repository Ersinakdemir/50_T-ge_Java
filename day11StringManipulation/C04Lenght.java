package day11StringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C04Lenght {
    public static void main(String[] args) {
        //kullanicida ismini aklip bas harfini ve son
        // harfini buxuk harflerle yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Ilk harf "+ isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0) +
                " son harf " + isim.charAt(isim.length()-1));

        String str1 = "";
        String str2 = null;

        System.out.println(str1.length());
        System.out.println(str2);

       // System.out.println(str2.length());//null Stringte uzunluk aranmaz

        String str3; // str3 ve str2 ayni sayilir ikisinede deger atanmamistir
        //str2 ye nullpointer olarak atandigini icin Java olayin
        // farkinda oldugumuzu düsünerek calistirirken problem cikarmaz



    }
}
