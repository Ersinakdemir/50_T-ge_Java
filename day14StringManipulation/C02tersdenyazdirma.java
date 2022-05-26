package day14StringManipulation;

public class C02tersdenyazdirma {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
        String input ="mavi";
        System.out.println(input.substring(3,4) + input.substring(2,3) + input.substring(1,2) + input.substring(0,1));
    }
}
