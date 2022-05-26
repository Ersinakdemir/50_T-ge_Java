package day20Scop;

public class C02StatricVariables {
    static String okuladi = "Yildiz Koleji";
    static int okulNo ;
    static boolean okulAcikmi;
    public static void main(String[] args) {
        System.out.println(okuladi);//Yiliz koleji
        System.out.println(okulNo);//0
        okulNo =208;
        System.out.println(okulNo);//0
        System.out.println(okulAcikmi);
        staticMethod();
        System.out.println(okulNo);

    }
    public static void staticMethod(){
        okulNo =200;
        System.out.println(okulNo);//200
    }
}
