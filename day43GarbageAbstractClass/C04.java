package day43GarbageAbstractClass;

public abstract class C04 {
    /*
    bir abstract class ta abstract veya concrete method lar buluna bilir Child Class
    larin abstract methodlari override etmesi Mecburi iken concrete methodlari override
    etmesi OPSIONELdir
     */
    public abstract void absMethod();
    public void concreteMethod(){
        System.out.println("C04 concrete method");
    }

    public static void main(String[] args) {
        /*Bstrackt classlar constructor a sahiptir ancak abstract classlardan OBJE OLUSTURULAMAZ
        C04 obj = new C04() ;

        Abstract class lar Obje barindirmayan sadece child lar icin uyulmasi sart olan veya
        opsionel birakilan özellikleri tanimladigimiz bir depo class gibidir


*/
        System.out.println("bu class abstract");
    }

}
