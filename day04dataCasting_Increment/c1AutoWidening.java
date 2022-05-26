package day04dataCasting_Increment;

public class c1AutoWidening {
    public static void main(String[] args) {
        byte sayi1 = 44;
        System.out.println(sayi1);
        short sayi2 = sayi1;
        System.out.println(sayi2);// esitligin solu short sagi sasgi ise byte olmasina ragman java itiraz etmiyor
        // deger olarak atanan veri türü variable dataa turunden kucuk oldugu icin problem ol,maz
        //bunada autoWidening denir

        double sayi3 = sayi2;//bunada itiraz etmez cünkü double>short
        System.out.println(sayi3);

    }
}
