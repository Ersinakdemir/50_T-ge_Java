package eliHoca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterViewCollection{
    // Create 2D ArrayList which can store String ArrayLists
// Create 3 ArrayLists which are Employees, Employers, Companies
// Store this 3 ArrayList in 2D ArrayList

    // String ArrayList'leri depolayabilen 2D ArrayList oluşturun
// Çalışanlar, İşverenler, Şirketler olmak üzere 3 DiziListesi oluşturun
// Bu 3 ArrayList'i 2D ArrayList'te saklayın
    public static void main(String[] args) {
        ArrayList<List>listeler = new ArrayList<>();
        ArrayList<String> calisanlar =new ArrayList<>(Arrays.asList("Ahmet","Ali","Elif"));
        ArrayList<String> isverenler =new ArrayList<>(Arrays.asList("mehmet","Ayse","Ersin"));
        ArrayList<String> sirketler =new ArrayList<>(Arrays.asList("Amazon","Google","Microsoft"));
        listeler.add(calisanlar);
        listeler.add(sirketler);
        listeler.add(isverenler);
        System.out.println(listeler);

    }
}
