package denemeler;

import java.util.ArrayList;
import java.util.List;

public class Ögretmen_Ögrenci {
    public static void main(String[] args) {
        List<Okull> okullList = new ArrayList<>();
        Okull ögrenci = new Okull();
        ögrenci.method1();

        Okull ögrenci1 = new Okull(ögrenci.schule, "Ali","yilmaz",79);
        System.out.println(ögrenci1.toString());
        Okull ögrenci2 = new Okull(ögrenci.schule, "Veli","yol",87);
        System.out.println(ögrenci2.toString());

        Okull ögretmen =new Okull(ögrenci.schule, "Ahmet","yildiz");
        System.out.println(ögretmen.toStringÖgretmen());

        okullList.add(ögrenci1);
        okullList.add(ögretmen);
        okullList.add(ögrenci2);
        System.out.println(okullList);

    }


}
