package day12stringManipulation;

public class C02LastIndexOf {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak
        // asagidaki 3 cumleden uygun olani yazdirin
        //        - Girilen kelime cumlede kullanilmamis.
        //        - Girilen kelime cumlede 1 kere kullanilmis.
        //        - Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle = "Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime = "ye";
        int ilkkullanim = cumle.indexOf(kelime);
        int sonkullanim = cumle.lastIndexOf(kelime);
        if (ilkkullanim==(-1)){
            System.out.println("Girilen kelime cumlede kullanilmamistir");
        }else if (ilkkullanim==sonkullanim){
            System.out.println("Girilen kelime 1 kez kullanilmamistir");
        }else{
            System.out.println("Girilen kelime cumlede 1 den fazla kullanilmistir");
        }

        String str = "Eclipse";
        System.out.println(str.lastIndexOf("i",4));


    }
}
