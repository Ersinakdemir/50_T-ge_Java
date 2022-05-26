package day45Interface;

public interface I01_Default_Static {
    /*
    Interfacelerde sadece abstract methodlar bulunur
    body si olan concrete bir method olusturmak istedigimizde java CTE verir

    Ancak Java 8 densonra istisnai olarak static veya default olarak tanimlanabilir
    ancak kullanilan default acsess modifier degildir
    cunku Interfaceler de tüm methodlar public ve abstract ti

    asagidaki örnekte görülebilecegi gibi default olarak tanimlanmis bir methoda acsess
    modifier olarak public yazabilirsiniz
     */
    void method1();
    default void method2(){
        System.out.println("Interfacedeki default method");
    }
    static void method3 (){
        System.out.println("Interface deki static method");
    }


}
