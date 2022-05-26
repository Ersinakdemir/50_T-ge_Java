package day16MethodCreation;

public class C03Overloading {
    public static void main(String[] args) {
        //verilen ikisayiyi toplayip yazdiran bir method olusturalim

        int num1 = 10;
        int num2 = 20;
        ikiSayiTopla (num1,num2);
        double num3 =30;
        double num4 =30;
        ikiSayiTopla (num3,num4);
        //eger  variable olusturmadan direk sayilari yazarak method call yaparsak
        int num9 = 8;
        double num8 = 5.9;
        ikiSayiopla(num9,
                num8);

        ikiSayiTopla(25,63);

        // bir int ile bir double toplamini yazdiran bir methot olusturalim
        int num5 = 5;
        double num6 = 7;
        ikiSayiTopla(num5,num6);
        ikiSayiTopla(5.8,9);


    }

    private static void ikiSayiopla(int num9, double num8) {
        System.out.println("sectiginiz int ve double in toplami : "+ (num8+num9));
    }

    private static void ikiSayiTopla(double num3, double num4) {
        System.out.println("sectiginiz double lerin toplami :" +(num3 + num4));
    }

    private static void ikiSayiTopla(int num1, int num2) {
        System.out.println("sectiginiz int lerin toplami :" +(num1 + num2));
    }
}
