package day33VarargsStringBuilder;

public class C02Varargs {
    public static void main(String[] args) {
        //parametre olarak bir int ve istedigimizt kadar alan en uzun kelimenin harf sayisi
        // ile int parametre degerini carpip sonucu yazdiran bir method olusturun
        int sayi = 5;
        String str1 = "Zulal";
        String str2 = "Zeynep";
        carpim(sayi,str1,str2);
    }//bir methodta varargs disinda parametre kullanacaksak önce diger
    // pareametreleri yazip varagsi ensona yazmaliyiz
    //bu sebeple bir methodda birden fazla Varags olmaz

    private static void carpim(int sayi, String str1, String... str) {
        String enuzunStr ="";
        for (String each:str
        ) {
            if(each.length()>enuzunStr.length()){
                enuzunStr =each;
            }

        }
        System.out.println(sayi*enuzunStr.length());
    }
}
