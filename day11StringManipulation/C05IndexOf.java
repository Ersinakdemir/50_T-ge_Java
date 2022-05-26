package day11StringManipulation;

import java.util.Scanner;

public class C05IndexOf {
    public static void main(String[] args) {
        String str1 = "Java bir baska guzel";
        //Istersek char olarak verdigimiz bir harfin index ini döndürür
        System.out.println(str1.indexOf('J'));
        //istersek bir harf yada metinolarak verdigimizString in index ini verir
        System.out.println(str1.indexOf("l"));
        System.out.println(str1.indexOf("baska"));

        System.out.println(str1.indexOf('J'));
        // Ayni harften bir den den fazla vrasa ilkini alir
        System.out.println(str1.indexOf('a',5));

        //ikinci 'a' nin index gibi durumlarida yaza biliriz

        int ilkindex = str1.indexOf('a');//1. index
        System.out.println(str1.indexOf('a',ilkindex+1));
// belli indexten sonra stringte aratabiliriz
        //int ilkindex = str1.indexOf('a');//1. index
        System.out.println(str1.indexOf("ka"));
 // Stringin icinde olmayan bir karakter veya metin aratirsaniz (-1) döner

 // kullanicidan mail adresini isteyin @ isareti icermiyorsa gecersiz
        // icderiyorsa mailiniz kabul edildi yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz");
        String mail = scan.next();
        if(mail.indexOf('@')==(-1)){
            System.out.println("gecersiz");
        }else{
            System.out.println("mailiniz kabul edildi");
        }






    }
}
