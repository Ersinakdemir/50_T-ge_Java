package day42Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01FileInputStream {
    public static void main(String[] args) {
        String dosyaYolu = "src/day41Exceptions/Dosya.txt";

        try {
            FileInputStream fis =new FileInputStream(dosyaYolu);
            int k =0;
            while ((k=fis.read())!=-1){
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*Exception larda oarent Child iliskisi mevcuttur
        Eger bir Code icin birden fazla exeption olusma ihtimali varsa
        öncelikle olasi exception lar parent -Child iliskisi tasiyor mu  bakmak gerekir
        Eger Parent- Child iliskisi yoksa istedigimiz sirada catch cümleri olusturabiliriz

        Eger Parent Child iliskisi varsa
         */
/*Alti kirmizi cizili her kod CTE degidir Java syntax hatalarini derleme
 esnasinda (compile) farkeder ve altini cizer
biz bu gune kadar tamamina CTE diyorduk ancak exception konusu ole birlikte
Compile time Exception kavrami da hayatimiza girdi
 */
    }
}
