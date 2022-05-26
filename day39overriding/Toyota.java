package day39overriding;

public class Toyota extends Araba {
    String hiz ="Toyota araclar max 220 km hiz yapar";
    String sirketMerkezi ="japonya";
    String marka ="Toyoto";

    public void motor(){
        System.out.println("Toyota arabalar toyota marka markalarda motor kullanirlar");
    }
    public void yakitTuketimi(){
        System.out.println("arabalar motor gücüne göre yakit tüketirler");
    }public void garanti(){
        System.out.println("Toyota arabalar 10 karantilidir");
    }

}
