package day33VarargsStringBuilder;

public class C03StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("java cok güzel");
        StringBuilder sb3 = new StringBuilder(10);
        System.out.println("sb1 lenght : "+(sb1.length()));
        System.out.println("sb1 capacity : "+(sb1.capacity()));

        System.out.println("sb1 lenght : "+(sb2.length()));
        System.out.println("sb1 capacity : "+(sb2.capacity()));

        System.out.println("sb1 lenght : "+(sb3.length()));
        System.out.println("sb1 capacity : "+(sb3.capacity()));

        //append methoduyla sb a ekleme yapabiliriz

        System.out.println(sb1.append("java").append(" ").append("cok").append(" ").append("güzel"));
        System.out.println("sb1 lenght : "+(sb1.length()));
        System.out.println("sb1 capacity : "+(sb1.capacity()));
        sb1.append(3).append(true);
        System.out.println(sb1);
        System.out.println("sb1 lenght : "+(sb1.length()));
        System.out.println("sb1 capacity : "+(sb1.capacity()));
        sb1.trimToSize();// sonun da fazla olan kapasiteleri alir
        System.out.println("sb1 lenght : "+(sb1.length()));
        System.out.println("sb1 capacity : "+(sb1.capacity()));







    }
}
