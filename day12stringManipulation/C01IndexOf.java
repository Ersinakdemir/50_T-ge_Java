package day12stringManipulation;

public class C01IndexOf {
    public static void main(String[] args) {
        // Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak
        // asagidaki 3 cumleden uygun olani yazdirin
        //        - Girilen kelime cumlede kullanilmamis.
        //        - Girilen kelime cumlede 1 kere kullanilmis.
        //        - Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle = "Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime = "nih";
        int ilkkullanim = cumle.indexOf(kelime);
        int ikincikullanim = cumle.indexOf(kelime,ilkkullanim+1);
        System.out.println(ilkkullanim);
        if (ilkkullanim ==-1){
            System.out.println("Girilen kelime cumlede kullanilmamis");
        }else if(ikincikullanim ==(-1)){
            System.out.println("Girilen kelime cumlede 1 dfen fazla kullanilmamis");

        }else{
            System.out.println("Girilen kelime cimlede bir den fazla kullanilmistir");
        }
    }
}
