package day11StringManipulation;

import java.util.Locale;

public class C01toLowerCaseUppeerCase {
    public static void main(String[] args) {
        String str = "Java güzeldir";
        //String methodlari arka arkaya kullanabiliriz
        //mesaela ikinci kelimenin ilk harfini kucuk olarak yazdiralim
        System.out.println(str.charAt(5));// böyle yazdigimiz da sonuc artik String degil char olacaktir dolayisiyla Stringde
        // yapmak istedigimiztüm degisiklikleri önce yapip sonra charAt kullanabiliriz
        System.out.println(str.toUpperCase(Locale.ROOT).charAt(6));

    }
}
