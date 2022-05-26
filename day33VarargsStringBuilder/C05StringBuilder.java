package day33VarargsStringBuilder;

public class C05StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Prize dikkat");
        System.out.println(sb1.insert(12," edin"));
        String str = "Hayatta cok güzel seyler var";
        System.out.println(sb1.insert(0,str,0,9));

        System.out.println(sb1.reverse());
    }
}