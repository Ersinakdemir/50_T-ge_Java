package day27Constructor;

public class C02Constructor {
    public static void main(String[] args) {
        C01Constructor obj1 = new C01Constructor();//default constructer devrede
        // C01Constructor  classinda Hic constructer yokken java default constructor i kullan digindan
        // obj1 i urete bildik.
        //Ancak biz parametreli veya parametresiz bir constructor oöusturdumuzda java gefault e siler
        C01Constructor obj2 = new C01Constructor("java");
    }
}
