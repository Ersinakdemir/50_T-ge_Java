package day30PaasByValue;

public class C04PassByValue {
    //Eger bir methodda yapilan degisikligin kalici olmasini istiyorsak ikiyöntem kullana bilirtiz
    //1 - varianble class levelda static olarak olusturabilirim

    static double etiketFiyati;
    static double indirimyüzdesi;

    public static void main(String[] args) {
        etiketFiyati = 100;
        indirimyüzdesi=10;
        etiketFiyati = kaliciIndirimYap();
        System.out.println(etiketFiyati);
    }

    public static double kaliciIndirimYap() {
        etiketFiyati = etiketFiyati*(100-indirimyüzdesi)/100;
        System.out.println("indirimli fiyat : "+ etiketFiyati);
        return etiketFiyati;
    }

}
