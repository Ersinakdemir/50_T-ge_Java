package day14StringManipulation;

public class C06Sifre {
    public static void main(String[] args) {
      //Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        // sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        //    - Ilk harf buyuk harf olmali
        //    - Son harf kucuk harf olmali
        //    - Sifre bosluk icermemeli
        //    - Sifre uzunlugu en az 8 karakter olmali
        String sifre = "A23455aass";
        boolean ilkHarf = false;
        if (sifre.charAt(0)>= 'A'&& sifre.charAt(0) <= 'Z'){
            ilkHarf = true;
        }else {
            System.out.println("Sifrenizin ilk harfi büyükj harf olmali");
        }
        boolean sonharf = false;
        if (sifre.charAt(sifre.length() -1)>= 'a' && sifre.charAt(sifre.length() -1)<= 'z' ){
            sonharf = true;
        }else {
            System.out.println("sifrenizin son harfi kücük harf olmali");
        }
        boolean bosluk = false;
        if (!sifre.contains(" ")){
            bosluk = true;
        }else {
            System.out.println("sifreniz bosluk icermemeli");
        }
        boolean uzunluk = false;
        if (sifre.length() >= 8) {
            uzunluk = true;
        }else {
            System.out.println("sifreniz en az 8 harf olmali");
        }
        if (ilkHarf== true&& sonharf== true && bosluk == true && uzunluk== true){
            System.out.println("sifreniz kaydedildi");
        }
    }
}
