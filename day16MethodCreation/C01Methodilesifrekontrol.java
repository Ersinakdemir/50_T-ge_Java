package day16MethodCreation;

public class C01Methodilesifrekontrol {
    public static void main(String[] args) {
        //Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //    - Ilk harf buyuk harf olmali
        //    - Son harf kucuk harf olmali
        //    - Sifre bosluk icermemeli
        //    - Sifre uzunlugu en az 8 karakter olmali
        //    - Bu 4 kontrolu Method ile yapin

        String sifre = "Askjdh67899";
        boolean ilkHarfKontrol = ilkHarfKontrolet(sifre);
        boolean sonHarfKontrol = sonHarfKontrolEt(sifre);


    }

    private static boolean sonHarfKontrolEt(String sifre) {
        boolean sonHarfSonuc = false;
        char sonHarf= sifre.charAt(sifre.length() -1);
        if (sonHarf>= 'a' && sonHarf<= 'z' ){
            sonHarfSonuc = true;
        }else {
            System.out.println("sifrenizin son harfi kücük harf olmali");
        }
        return sonHarfSonuc;
    }

    private static boolean ilkHarfKontrolet(String sifre) {
        char ilkHarf = sifre.charAt(0);
        boolean ilkHarfSonuc =false;
        if (ilkHarf>= 'A'&& ilkHarf <= 'Z'){
            ilkHarfSonuc = true;
        }else {
            System.out.println("Sifrenizin ilk harfi büyükj harf olmali");
            ilkHarfSonuc = false;
        }


        return ilkHarfSonuc;

    }
}
