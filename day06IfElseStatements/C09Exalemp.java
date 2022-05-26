package day06IfElseStatements;

import java.util.Scanner;

public class C09Exalemp {
    public static void main(String[] args) {
        /*Soru 6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,

sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli
isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen islem yapmak istediginiz sayilari giriniz");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        if (sayi1<0 && sayi2<0){
            System.out.println("girdiginiz sayilarin carpimi: "+ (sayi1*sayi2));
        }else if (sayi1>0 && sayi2>0){
            System.out.println("girdiginiz sayilarin toplami: "+ (sayi1+sayi2));

        }else if (sayi1==0 ||sayi2==0){
            System.out.println("0 carpmaya göre yutan elemandir ");

        }
        else {
            System.out.println("Farkli isaretli sayilarda islem yapamazsiniz");
        }

    }

}
         */
        /*Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.

        Kullanicidan bir sifre girmesini isteyin
        Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise
“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.
                Eger ilk harf kucuk harf ise “z” olup olmadigini kontrol edin. Ilk harf z ise
“Gecerli Sifre” degilse “Gecersiz Sifre” yazdirin.

         */
       /* Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre = scan.nextLine();
        if(sifre.charAt(0)>= 'A'&& sifre.charAt(0)<='Z'){
            if(sifre.charAt(0) =='A'){
                System.out.println("Girdiginiz sifre gecerlidir");
            }
            else {
                System.out.println("Lütfen gecerli bir sifre giriniz");
            }

        }else {
            if (sifre.charAt(0)=='z'){
                System.out.println("gecerli sifre");
            }
            else {
                System.out.println("girdiginiz sifre gecerli degildir");
            }
        }
*/
        // Girilen bir karaktrin,harf olup olmadigini bulalim
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter = scan.next().charAt(0);
        if ((karakter>='A'&& karakter<= 'Z') || (karakter>='a' && karakter <='z')){
            System.out.println("girilen karakter bir harftir");
        }else {
            System.out.println("girilen karakter bir harf degildir");
        }
      System.out.println(Character.isAlphabetic(karakter));//Wrapper clasla direk karaktrer olup olmadigibulabiliriz
    }
}