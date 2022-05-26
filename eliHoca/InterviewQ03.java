package eliHoca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InterviewQ03 {
    // part 1: create list of 5 numbers from user input
// sort the list in reverse order and print it
// shuffle the list and print it
// rotate right by 3 places and print it

// bölüm 1: kullanıcı girişinden 5 sayı listesi oluşturun
// listeyi ters sırada sırala ve yazdır
// listeyi karıştır ve yazdır
// 3 yer sağa döndür ve yazdır

// part 2: find the max number and min number, print them
// replace all max number with min number

    // bölüm 2: maksimum sayıyı ve minimum sayıyı bulun, yazdırın
// tüm maksimum sayıları minimum sayı ile değiştir
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        ArrayList<Integer>arrayList=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("sayi giriniz : ");
            arrayList.add(scan.nextInt());
        }
        Collections.sort(arrayList,Collections.reverseOrder());//reverserOrde() ters siralar
                                                               //sort() siralar
        System.out.println("terssiraladiktan sonra arrList : "+ arrayList);
        Collections.shuffle(arrayList);//rastgele karistirr

        System.out.println("shuffle yaptiktan sonra : " + arrayList);
        Collections.rotate(arrayList,3);//belirtilen listedeki ogeleri kaydirir
        System.out.println("rotate edildikten sonra : "+ arrayList);

        System.out.println("Max : "+Collections.max(arrayList));
        System.out.println("Min : "+Collections.min(arrayList));

        System.out.println(Collections.replaceAll(arrayList,Collections.max(arrayList),Collections.min(arrayList)));
        System.out.println(arrayList);


    }
}
