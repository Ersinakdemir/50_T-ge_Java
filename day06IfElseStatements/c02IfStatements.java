package day06IfElseStatements;

public class c02IfStatements {
    public static void main(String[] args) {
        int a =10;
        int b= 20;
        if (a<b && b<100){
            System.out.println(" a bedeb b de 100 den kucuk");
        }
        if (a>0) System.out.println("süslü parantez olmazsa sasece bir satir calisir");
        //süsülü parantez olmadan da if calisir nama sadece ilk ; e kadare
        //ama sart gerceklesmezse direk atlar.
        System.out.println("ikinci calisti");
        //13 . satirdaki kod 10 daki sart dogru olsada calisir olmazsada
    }
}
