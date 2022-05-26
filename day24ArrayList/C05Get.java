package day24ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05Get {
    public static void main(String[] args) {
        List<String> isimler =new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Nihat");
        isimler.add("Ramle");
        System.out.println(isimler.get(3));
        System.out.println(isimler.contains("Aykut"));
    }
}
