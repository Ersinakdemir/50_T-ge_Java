package day30PaasByValue;

public class C03PassByValue {
    public static void main(String[] args) {
        /* java Pass By Value programlama dilidir
        yani bir primive variable i argumrnt olarak bir methoda yollarsaniz  java o variable i degil degerini(value)
methoda aktari         */
        double etiketFiyati = 100;
        yüdeonIndirimYap(etiketFiyati);
        yüdeonIndirimYap(etiketFiyati);
        System.out.println("iki indirimden sonra : "+ etiketFiyati);

    }

    public static void yüdeonIndirimYap(double etiketFiyati) {
        etiketFiyati = etiketFiyati*0.9;
        System.out.println("sizin icin %10 indirimli fiyatimiz : " + etiketFiyati);
    }
}
