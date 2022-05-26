package day22Arrays;

public class C08split {
    public static void main(String[] args) {
        //Verilen bir cumlede istenen harfin kac defa kullanildigini yazdiran
        //bir method olusturun
        String cumle = "nerede o 'hello world ' yazdiramayan ogrenciler";
        String harf= "e";
        harfKackereKullanilmis(cumle,harf);
    }

    private static void harfKackereKullanilmis(String cumle, String harf) {
        int sayac = 0;
        String kararakter [] = cumle.split("");
        for (int i = 0; i < kararakter.length-1; i++) {
            if (kararakter[i] .equals(harf)){
                sayac++;
            }

        }
        System.out.println(harf + "cümlede"+sayac+ "kere kullanilmistir");
    }

}
