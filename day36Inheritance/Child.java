package day36Inheritance;

public class Child extends Parend{
    Child(){
        System.out.println("Child method calisti");
    }
//Tüm classlarda biz görmesekte javanin olus turdugu default constructer vardir.
//Extens keyword kullanan tüm constructer larin ilk satirinda biz görmesekte
//super() constructor call vardir yani parent class in
// parametresiz constructor call
    public static void main(String[] args) {
        Child child = new Child();
    }

}
