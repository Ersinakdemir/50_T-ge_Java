package day30PaasByValue;

public class StaticCodBloku {
    static {
        System.out.println("static blok calisti");
        //static blok class ilk calismaya basladiginda devreye girer
        //
    }
    StaticCodBloku(){
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        System.out.println("main method baslangici");
        StaticCodBloku obj1;
        new StaticCodBloku();
        System.out.println("main method sonu");
    }
}
