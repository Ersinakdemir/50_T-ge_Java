package day15MethodCreation;

public class C06MethodCreation {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //iki variablenin degerlerini toplayan bir method olusturun
        //1- mthod adini yazip parante koyalim
        //2- methoda göndermem gereken margument var mi varsa gönder
        ikiSayiyiTopla(80,20);
        C04.dörtHarfiTersiniCevirme("java");
    }
// bir methodu olusturmak yrterli degildir cagirinca  calisir
    private static void ikiSayiyiTopla(int a, int b) {
        System.out.println("verilen ikisayinin toplami : " + (a + b));
    }
}

