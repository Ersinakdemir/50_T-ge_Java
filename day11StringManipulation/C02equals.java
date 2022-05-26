package day11StringManipulation;

public class C02equals {
    public static void main(String[] args) {
        String str1 ="Ali Can";
        String str2 = "Ali" +" Can";
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("== ile karsilastir :" + (str1==str2));
        System.out.println("equals ile karsilastir :" + str1.equals(str2));
        String str3 =str1+"";
        System.out.println("== ile karsilastir :" + (str1==str3));
        System.out.println("equals ile karsilastir :" + str1.equals(str3));

        //Stringde == herzaman dogru sonuc vermez.
        // Bu un icin equals methodunu kullan mayi tercin ediyoruz
        String str5 ="hasan";



    }
}
