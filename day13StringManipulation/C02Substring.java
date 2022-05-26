package day13StringManipulation;

public class C02Substring {
    public static void main(String[] args) {
        //1-48 of 88 results for "nutella"
        //bu arama sonucundaki bulunan sonuc sayisi 100 den cok ise süper
        //az ise "az sonuc bulundu"
        String str = "1-48 of 104 results for \"nutella\"";
        System.out.println(str);
        System.out.println(str.substring((str.indexOf('f') + 2), str.indexOf('r')));

        int ilkspace = str.indexOf(" ");
        int ikincispace = str.indexOf(" ",ilkspace+1);
        int ücüncüspace = str.indexOf(" ",ikincispace+1);

        String aramaSonucSayisistr = str.substring(ikincispace +1 ,ücüncüspace);
        int aramaSonucsayisiint = Integer.valueOf(aramaSonucSayisistr);
        if (aramaSonucsayisiint >100){
            System.out.println("süpper");
        }else {
            System.out.println("az sonuc bulundu");
        }

    }
}
