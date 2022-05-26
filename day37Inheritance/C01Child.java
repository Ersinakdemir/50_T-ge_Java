package day37Inheritance;

import day36Inheritance.Parend;

public class C01Child extends Parend {
    C01Child(){
        super();
        System.out.println("Child class parametresit cons");
    }
    C01Child(int s){
        System.out.println("child class parametreli cons");
    }
    C01Child(int sayi1,int sayi2){
        //Eger parent class dan parametresiz constructor i ddegil de
        // baska constructor i calistirmajk isterseniz bunu
        // Child class daki constructor in Ilk satiraina yazmalisiniz
        super(sayi1,sayi2);
        System.out.println("Child iki parametreli cons");
    }


    public static void main(String[] args) {
        C01Child child = new C01Child(5,8);
    }
}
