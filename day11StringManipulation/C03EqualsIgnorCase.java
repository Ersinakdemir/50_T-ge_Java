package day11StringManipulation;

import java.util.Scanner;

public class C03EqualsIgnorCase {
    public static void main(String[] args) {
        // mullaniciya derse katilip katilmak istemedini sorup evet derse cevabini ve
        // "derse takilim talebiniz alinmistir" haryirders "sonraki drslere bekleriz "
        Scanner scan = new Scanner(System.in);
        System.out.println("Derse katilmak istiyor musunuz? \nEvet veya Hayir yaziniz");
        String cevap = scan.next();
        if (cevap.equalsIgnoreCase("Evet")){
            System.out.println("cevabiniz " + cevap + " derse katilimiz oinaylanmistir");
        }else if (cevap.equalsIgnoreCase("Hayir")){
            System.out.println("cevabiniz "+ cevap + " Sonraki nderslere bekleriz");

        }else{
            System.out.println("Lutfen Evet veya Hayir giriniz");
        }


    }
}
