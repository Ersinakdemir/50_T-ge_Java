package day10SwitchStringManipulation;

import java.util.Locale;

public class C04charAt {
    public static void main(String[] args) {
        //Stringten herhangi bir karakteri almak istedigimizde o
        // harfin index ini kullanarak str.Char At  yazarak aliriz
        String str = "Java cok guzel";
        System.out.println(str.charAt(9));
        //cOK seklinde yazdiralaim
        System.out.println(str.toLowerCase(Locale.ROOT).charAt(5)+"" +
                str.toUpperCase(Locale.ROOT).charAt(6) + "" +
                str.toUpperCase(Locale.ROOT).charAt(7));

        //Sonharfi yazdir
        System.out.println(str.charAt(str.length() -1));


    }
}
