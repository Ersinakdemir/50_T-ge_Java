package day14StringManipulation;

public class C04Stringsayitoplama {
    public static void main(String[] args) {
        //Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String str1 = “$13.99”
        // String str2 = “$10.55”
        // ipucu : Double.parseDouble() methodunu kullanabilirsiniz.
        String str1 = "$13.99";
        String str2 ="“$10.55";
        str1 = str1.replaceAll("\\D", "");
        str2 = str2.replaceAll("\\D", "");
        double str1sayi = Double.valueOf(str1);
        double str2sayi = Double.valueOf(str2);
        System.out.println("Verilen String sayilarin toplami: $ "+(str1sayi+str2sayi) /100 );
        double str1sy = Double.parseDouble(str1);
        double str2sy = Double.parseDouble(str2);
        System.out.println("Verilen String sayilarin toplami: $ "+(str1sy +str2sy) /100 );

    }

}
