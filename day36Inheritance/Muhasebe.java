package day36Inheritance;

public class Muhasebe extends Personel{
    protected int saatücreti;
    protected String statu;
    protected int maas;

    protected int maasHersapla (){
        int maas = saatücreti*8*30;
        return maas;
    }
}
