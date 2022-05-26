package day34accessmodofier_Encapsulasion;

public class C03 {
    //burada encupsule edecegimiz 2 variable olsun

    // encapsule edecegimiz 2 variable olusturalim
    private int sayi;
    private String str;
    public int getSayi() {
        return sayi;
    }
    public String getStr() {
        return str;
    }
    public void setStr(String str) {
        this.str = str;
    }
    @Override
    public String toString() {
        return
                "sayi=" + sayi +
                        ", str=" + str;
    }
}
