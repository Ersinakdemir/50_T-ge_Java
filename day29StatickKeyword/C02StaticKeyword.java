package day29StatickKeyword;

public class C02StaticKeyword {
    public static void main(String[] args) {
        //baska class daki statick clas üyelerine ulasabilmek
        // icin sadece clasismi. staticüye ismi yazmamiz yeterlidir.
        System.out.println(C01Static.okulTelefonu);
        C01Static.okulTelefonu ="0324567898";
        System.out.println(C01Static.okulTelefonu);

        //Baska class daki static olmayan üyelere ancak o class tan obj olusturarak ulasa bilirit

        C01Static obj1 =new C01Static();
        C01Static obj2 = new C01Static();

        System.out.println(obj1.okuladi);
        obj2.okuladi ="sabir koleji";
        System.out.println(obj2.okuladi);
        System.out.println(obj1.okuladi);

    }
}
