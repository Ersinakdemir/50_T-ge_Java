package day43GarbageAbstractClass;

public class C02Final extends C01Final{
    public static void main(String[] args) {
        System.out.println(C01Final.okulIsmi);
        //C01Final.okulIsmi="java kolleji"; final olarak isaretlendigi icin yeni atama yapilamaz
    }
/*Override parent class daki methodu child class a uyarlamak demekti yani islevini degistirmek istiyoruz
ancak parent classdaki method  final olarak tanimlandigi icin java methodun uyarlanmasina izin vermiyor
 */
    //public static final void method1() {
     //   System.out.println("Parent class final method1");


}