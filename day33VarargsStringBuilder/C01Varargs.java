package day33VarargsStringBuilder;

public class C01Varargs {
    public static void main(String[] args) {
        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Nihat";
        //argument sayisi sabitse her zaman ki gibi normal method yazila bilir ama argument sayisinin degisme
        // ihtimali varsa o zaman varargs tercih edilir
        enuzunKelime(str1,str2,str3);
    }

    private static void enuzunKelime(String... str1) {
        String enuzunStr ="";
        for (String each:str1
             ) {
            if(each.length()>enuzunStr.length()){
                enuzunStr =each;
            }

        }
        System.out.println(enuzunStr);
    }
}
