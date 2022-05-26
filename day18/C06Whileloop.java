package day18;

public class C06Whileloop {
    public static void main(String[] args) {
        //kullanicidan ikisayi alip bu sayilari ve aralarindaki tüm sayilari
        // ve aralarindaaki tüm sayilari yazdirin
        int baslangic = 40;
        int bitis = 60;
        for (int i = baslangic; i <= bitis ; i++) {
            System.out.print(i + " ");

        }
        System.out.println("");

        //aynisoruyu while loop ile yapalim
        while (baslangic <= bitis ){
            System.out.print(baslangic +" ");
            baslangic++;

        }
        System.out.println("");
    }
}
