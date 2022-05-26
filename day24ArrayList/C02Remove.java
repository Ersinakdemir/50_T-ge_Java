package day24ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02Remove {
    public static void main(String[] args) {
        List<String>isimler =new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Nihat");
        isimler.add("Ramle");
        System.out.println(isimler);
        boolean sonuc = isimler.remove("Berk");//true
        if(sonuc==true){
            System.out.println("istediginiz isim silindi");
        }else{
            System.out.println("istediginiz isim listede bulunmadigindan silinemedi");
        }
        System.out.println(isimler);
        System.out.println(isimler.remove(2));//index no veriyorsak remove methodu objenin kendisini(Strin )döndürür
        System.out.println(isimler);

    }
}
