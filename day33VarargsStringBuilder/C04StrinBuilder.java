package day33VarargsStringBuilder;

public class C04StrinBuilder {
    public static void main(String[] args) {
        /*Compare iki sb i esitmi diye  ilk harften baslayarak tüm karakterleri karsilastirir ayni
         olan karakterler icin ascii tablosuna göre geride veya ileride oldugunu yzdiririz
         */
        StringBuilder sb1  = new StringBuilder("Ali Can");
        StringBuilder sb2  = new StringBuilder("Ali Can");
        String str = "Ali Can";
        System.out.println(sb1.compareTo(sb2));

        // bir sb ile String i compare etmek isttersek Java cte verir
        System.out.println(sb1.toString().equals(sb2.toString()));//true
        System.out.println(sb1.toString().equals(str));//true
        System.out.println(str.equals(sb1));//false
    }
}
