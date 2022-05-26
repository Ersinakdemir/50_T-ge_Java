package day24ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C04Set {// set methodu ArrayList deki bir elemani degistirmeye yarar index numarasini
    // verip o index e verilen elemani koyar digerini siler
    public static void main(String[] args) {
        List<String>isimler =new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Nihat");
        isimler.add("Ramle");
        System.out.println(isimler);
        isimler.set(1,"seckin");//Yusuf gitti yerine seckin döndürüyor
        System.out.println(isimler.set(1,"Ahmet"));// set bize silineni dönüyor

         //daha önceden listede olanlarida arsiv gibi tutmak istersek
        List<String> LogListesi =new ArrayList<>();
        LogListesi.add(isimler.set(2,"cosmos"));
        System.out.println(LogListesi);
        System.out.println(isimler);
    }
}
