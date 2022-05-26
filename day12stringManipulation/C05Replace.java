package day12stringManipulation;

public class C05Replace {
    public static void main(String[] args) {
        String str = "Bugun ne cok sey ögrendik";
        //Bu cümledeki bosluk disindaki karakter sayisini bulunuz

        System.out.println("space haric karakter sayisi " +str.replace(" ","").length());

        System.out.println("orjinal str karakter sayisi " + str.length());
        String str1= str.replace('B','b');
        System.out.println(str);

    }
}
