package day10SwitchStringManipulation;

public class C03StringConcate {
    public static void main(String[] args) {
        //Cocatination yapmak icin ya + operatörünü kullaniriz veya String
        // classendan gelen aconcet methodunu kullanabiliriz
        String str1 = "Java";
        String str2 = "Candir";
        System.out.println(str1 + " "+ str2);
        String cumle = str1.concat(str2);
        System.out.println(cumle);
        cumle = str1.concat(" ").concat(str2);
        System.out.println(cumle);
        //Cocet Methodu bir icine bir String data ister
    }
}
