package day25List;

import java.util.ArrayList;
import java.util.List;

public class C07List {
    public static void main(String[] args) {
        //bir listede ortalamanin üstünde kac elamanimiz var onu bulalaim

        List<Double>sayilar = new ArrayList<>();
        sayilar.add(1.0);
        sayilar.add(3.0);
        sayilar.add(4.0);
        sayilar.add(15.0);
        sayilar.add(16.0);
        sayilar.add(17.0);

        //ortalamayi bul
        double toplam =0.0;
        double ortalama =0.0;

        for (int i = 0; i < sayilar.size(); i++) {
            toplam +=sayilar.get(i);
        }
        ortalama =(toplam/ sayilar.size());
        System.out.println(ortalama);
        List<Double>ortalamaninUstündekiSayilar = new ArrayList<>();
        for (int i = 0; i < sayilar.size(); i++) {
            if (sayilar.get(i)>ortalama){
                ortalamaninUstündekiSayilar.add(sayilar.get(i));
            }

        }
        System.out.println(ortalamaninUstündekiSayilar);
        System.out.println("ortalamanin üstünde "+ortalamaninUstündekiSayilar.size()+ " kadar eleman vardir");
    }
}
