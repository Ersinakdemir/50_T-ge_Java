package day49Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {
    public static void main(String[] args) {
        //Javada collection üyesi bir yapida data turu objekt secilirse herr data turunden deger
        // ekleyebiliriz ancak  bi durumda sürekli casting problemleri ile karsilasabiliriz
        List<Object>list =new ArrayList<>();
        list.add("Ergin");
        list.add(15);
        list.add(10.3);
        System.out.println(list);
        list.set(1,(Integer)(list.get(1)) +10);


        Map<Integer,String>siniflist = new HashMap<>();
        // birsinifta ögrenci no ve isim ,soy isim brans olarak map olusturmak istiyoruz
        //key tek bir inigue(benzersiz) degerdir
        //ama value/deger birden fazla bilginin birlesiminden olusa bilir
        //bu durumda daha sonra istedigimiz bilgilere digru sekilde ilasa bilmek icin
        //tum elementler icin value ayni bicimde olusmalidir

        siniflist.put(101, "ali, can, dev");
        siniflist.put(102, "veli, yaan, QA");
        System.out.println(siniflist);  //{101=ali, can, dev, 102=veli, yaan, QA}
        System.out.println(siniflist.keySet());//[101, 102]
        System.out.println(siniflist.values());//[ali, can, dev, veli, yaan, QA]
    }
}
