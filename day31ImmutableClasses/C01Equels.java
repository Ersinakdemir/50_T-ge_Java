package day31ImmutableClasses;

public class C01Equels {
    public static void main(String[] args) {
        String str1= "Eren";
        String str2= "Eren";

        String str3= new String( "Eren");
        String str4= str1+"";
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str1.equals(str4));//true


        System.out.println(str1 ==str2);//true
        System.out.println(str1 ==str3);//False
        System.out.println(str1 ==str4);//False

    }
}
