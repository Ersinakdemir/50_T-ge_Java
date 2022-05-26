package day12stringManipulation;

public class C07Example {
    public static void main(String[] args) {
        //Soru 1) String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ” String’ini
        //
        //“Java ogrenmek cok guzel.” sekline getirin.
        String str = " Java ogrenmek123 Cok guzel@ ";
        System.out.println(str.trim().replace("123", "").replace("C","c"));
    }
}
