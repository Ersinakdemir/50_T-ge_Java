package day41Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02FileInpurStream {
    public static void main(String[] args){ //throws FileNotFoundException {

        /*Bir code yazilirken olasi hatalar öngörülüp exception olustugunda Javanin ne yapmasini belirtmeliyiz
        1- Eger exception olustugunuda kodun calismaya devam etmesini istemiyorsak method isminin yanina
         olusa bilecek exception ideklare edebiliriz

         2- Eger Exception olussursa da kodun calismaya devam etmesini istiyorsak sorun olusturabilecek kodu try
          catch blogunun icine alir try bloguna sorun cikarabilecek code Catch bloguna olusa bilecek exception i ve
          olasi exception durumuda Javanin ne yapmasini istedigimizi yazabiliriz
         */
        String dosyaYolu="src/day41Exceptions/Dosya.txt";
        try {
            FileInputStream fis=new FileInputStream(dosyaYolu);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
