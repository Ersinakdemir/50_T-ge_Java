package day12stringManipulation;

import java.util.Scanner;

public class C06ReplaceAll {
    public static void main(String[] args) {
        //kullanicidan isim soyisim bilgisini alip bütün harf leri yildiz yapalim
        Scanner scan = new Scanner(System.in);
        System.out.println("isim soy isim");
        String isimsoyisim = scan.nextLine();
        System.out.println(isimsoyisim.replaceAll("\\S","*" ));
    }
}
