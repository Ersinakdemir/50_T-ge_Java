package day15MethodCreation;

public class C07MethodCreation {
    public static void main(String[] args) {

        //string i yazdiran method olusturalim// Hosgeldiniz diyen bir methad olusturun
        // kapanma methodu olusturan bir method olusturun
        hosgeldinYazdir();
    }

    public static void hoscakal() {
        System.out.println("Hoscakal");
    }

    public static void hosgeldinYazdir() {
        System.out.println("hosgeldin" );
        stringYazdirma("böylede  olur");
    }

    private static void stringYazdirma(String str) {
        System.out.println(str);
        hoscakal();
    }
}
