package day12stringManipulation;

public class C03Contains {
    public static void main(String[] args) {
        //Soru 1) Kullanicidan email adresini girmesini isteyin, mail @gmail.com icermiyorsa
        // “lutfen gmail adresi giriniz”, @gmail.com ile bitiyorsa
        // “Email adresiniz kaydedildi “ , @gmail.com ile bitmiyorsa lutfen yazimi kontol edin" yazdirin
        String email = "akdemir@gmail.com";
        String arananMetin = "@gmail.com";
        if (!email.contains(arananMetin)){//basinda ! oldugu zaman email icermiyorsa oluyor boolleen ifadeyin
            // sonucunu buluyor sonra tersini aliyor
            System.out.println("lütfen Gmail adresi giriniz");

        }else if (email.lastIndexOf(arananMetin) ==(email.length()-10)){
            System.out.println("Email adresiniz kaydedildi");
        }else {
            System.out.println("lutfen yazimi kontrol ediniz");
        }

    }
}
