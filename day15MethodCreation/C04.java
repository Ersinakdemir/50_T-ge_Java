package day15MethodCreation;

public class C04 {
    //1- method olusturmak icin methodun adini yazariz
    // 2- Method a giderken methoda giderken götürmemiz ke
    //3- Main method olmadanda bir class olusturulabilir ama calistirilmaz
    // sadece baska kilaslarda variable ve methodlae icerir depo gibi
    public static void besHarfiTersiniCevirme(String wort) {
        String terskelime= wort.substring(4)+
                wort.substring(3,4) +
                wort.substring(2,3) +
                wort.substring(1,2) +
                wort.substring(0,1);
        System.out.println(terskelime);

    }

    public static void dörtHarfiTersiniCevirme(String wort) {
        String  terskelime= wort.substring(3)+
                wort.substring(2,3) +
                wort.substring(1,2) +
                wort.substring(0,1);
        System.out.println(terskelime);
    }

    public static void ücHarfiTersiniCevirme(String wort) {

        String terskelime= wort.substring(2)+
                wort.substring(1,2) +
                wort.substring(0,1);
        System.out.println(terskelime);
    }
}
