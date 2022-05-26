package day03VariablesScaner;

public class c02SwapVariables {
    public static void main(String[] args) {
        //verilen sayi1 ve sayi2 degerlerini degistiren bir brogram yaziniz
        int sayi1 = 10;
        int sayi2 = 20;
        System.out.println("Swaptan once sayi1 "+ sayi1 +"Swaptan once sayi2 "+ sayi2);
        int sayi3 =sayi2;
        sayi2 =sayi1;
        sayi1 = sayi3;
        System.out.println("sayi1: " +sayi1 + " sayi2: " + sayi2);

    }
}
