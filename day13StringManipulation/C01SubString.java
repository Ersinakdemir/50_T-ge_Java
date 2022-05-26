package day13StringManipulation;

public class C01SubString {
    public static void main(String[] args) {
        String str = "java ile IT cok güzel";
        System.out.println(str.substring(5));
        // yukaridaki String "Mehmet hoca ile java cok güzel" yazdiralim
        System.out.println(str.replace("java", "Mehmet hoca"));
        System.out.println("Mehmet hoca " + str.substring(5));

        //Eger bir index ten sonra sona kadar degilde belli bir araligi almak istiyorsak
        // baslangic ve bitis index i ni yazmaliyiz
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(4,5));

        str = "java gün gectikce güzellesiyor";
        System.out.println(str.substring(7, 7));
        //System.out.println(str.substring(5, 2));// 5. indexten sora ikinci index olmadigi icin hata verir
        //bitis index baslangic index inden kücük olamaz
        System.out.println(str.substring(str.length() - 1));
        System.out.println(str.substring(str.length() - 5));// son 5 harfi verir
    }
}
