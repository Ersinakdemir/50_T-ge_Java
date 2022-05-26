package day26forEachloopConstructor;

public class C04Araba {
    // Javada her Class olusturdugumuzda java o Class tan ileride objeler olusturmak gerekecegini bilir
    //biz özellikle belirtmesekte her olusturdugu classa constructor koyar
    //Java nin Class olustururken olusturdugu contsructor a deFAULT CONSRUCTOR denir ve constructor olsun
    // istersek default constructor ile ayni görevi yaspan bir constructor olustura biliriz
    // veya istersek ayni kaliptan farkli desenlerde olusturmak icin farkli özelliklerde constructor da olusturabiliriz

    public C04Araba() {
        System.out.println("parametrrsiz constructor calisti");
    }
    public C04Araba(String renk) {
        System.out.println(renk + "renginde bir araba ürertildi");
    }
    public C04Araba(int yil) {
        System.out.println(yil + " yilinda bir araba üretildi");
    }    public C04Araba(int yil, String renk) {
        System.out.println(renk +" renginde "+ yil +  " modelinde bir araba üretildi");
    }



}
