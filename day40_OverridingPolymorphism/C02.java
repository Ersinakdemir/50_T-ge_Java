package day40_OverridingPolymorphism;

public class C02 extends C01 {
    @Override
    public void method2() {
        System.out.println("Child method2");
//@Override notasyonu overriden method ile overriding methodu birbirinine
// baglar dolayisiyla over riden method method silinir veya signatur degistirilirse
// bu iliski bozulacagi icin  java CTE verir

        //Notasyon kullanilmazsa Java bunlarin iliskisini bilir ama overriden method
        // silinirse sesini cikarmaz
   }

    @Override
    protected String method3() {//Eger parent class daki return type daha genis ise override kabul eder
        // ama Child  class daki Return Typr daha genis ise kabul etmez CTE verir
       return "java";
    }
    private void method4(){
        System.out.println("Child class method4");//parent classdaki private methoda baska bir class tan
        // ulasmak mümkün olmadigindan burda ki methodu tamamen yeni bir method olarak algilar
    }

    public static void main(String[] args) {
        C02 obj = new C02();
        obj.method1();//Parent method1
        obj.method2();//Parent method1

        C01 obj2 =new C02();
        obj2.method1();//parent method1
        obj2.method2();//Child method2

        C01 obj3 =new C01();
        obj3.method1();//parent method1
        obj3.method2();//Parent method2

    }
}
