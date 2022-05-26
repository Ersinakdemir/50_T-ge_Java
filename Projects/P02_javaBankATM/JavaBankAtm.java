package projects.P02_javaBankATM;

import java.util.Scanner;


class JavaBankAtm {
   /*      ATM
        Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

        Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.

        Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,       */


    static int bakiye = 1000;
    static Scanner scan = new Scanner(System.in);
    static String parola = "Akdemir25";

    public static void main(String[] args) {
        String kartno = "1234567987";

        System.out.println("lütfen kart numaranizi giriniz");
        String kartnoin = scan.nextLine().replaceAll(" ", "");
        System.out.println("lütfen sifrenizi giriniz");
        String parolain = scan.nextLine();

        if (!kartno.equals(kartnoin) || !parola.equals(parolain)) {
            System.out.println("kartnumaraniz veya parolaniz yanlis lütfen tekrar deneyiniz");
        } else {
            islemYap();
        }
    }
    //1-Bakiye sorgula, 2-para yatirma, 3-para çekme, 4-para gönderme, 5-sifre değiştirme ve 6-cikis.

    private static void islemYap() {
        System.out.println("Lütfen yapacaginiz islemi seciniz\nBakiye sorgulamak icin: 1'i, \npara yatirmak icin 2'yi," +
                " \npara çekmek icin 3'ü, \npara göndermek icin 4'ü, \nsifre değiştirmek icin 5'  ve \ncikis icin 6'yi tuslayin.");
        int islem = scan.nextInt();

        switch (islem) {
            case 1:
                bakiyeSorgula();
                break;
            case 2:
                paraYatir();
                break;
            case 3:
                paraCek();
                break;
            case 4:
                paraGönder();
                break;
            case 5:
                SifreDegistir();
                break;
            case 6:
                cik();
                break;

        }
    }

    private static void cik() {
        System.out.println("cikisiniz yapildi. iyi günler");
    }
    private static void SifreDegistir() {
        System.out.println("Lütfen eski sifrenizi giriniz");
        System.out.println("test");
        Scanner scan = new Scanner(System.in);
        String oldparola = scan.nextLine();
        System.out.println("test**********");
        if (parola.equals(oldparola)) {
            System.out.println("yeni parolayi giriniz");
            parola = scan.nextLine();
            System.out.println("parolaniz basariyla degistirilde \ndevam etmek icin: 1'i" +
                    " \ncikis icin: 0'i tuslayin");
            int karar = scan.nextInt();
            if (karar == 1) {
                islemYap();
            } else if (karar == 0) {
                cik();
            }else{
                System.out.println("");
            }
        } else {
                System.out.println("Sifreniz yanlis \nlütfen yapmak istediginiz islemi seciniz");
                islemYap();
            }

    }
    private static void paraGönder() {
        System.out.println("göndermek istediginiz IBAN No yu yaziniz");
        Scanner scan = new Scanner(System.in);
        String ibanno = scan.nextLine();
        if (ibanno.startsWith("TR")&& ibanno.length()==26) {
            System.out.println("göndereceginiz miktari giriniz");
            double gönderilecek = scan.nextDouble();
            if (bakiye > gönderilecek) {
                bakiye -= gönderilecek;
                System.out.println("isleminiz basariyla gerceklesti \nyeni bakiyeniz : " + (bakiye ));
                System.out.println("devam etmek icin: 1'i \ncikis icin: 0'i tuslayin ");
                int karar = scan.nextInt();
                if (karar == 1) {
                    islemYap();
                } else if (karar == 0) {
                    cik();
                }
            } else {
                System.out.println("yetersiz bakiye");
                islemYap();
            }
        } else {
            System.out.println("IBAN NO TR ile baslamali");
            islemYap();
        }
    }
    private static void paraCek() {
        System.out.println("cekmek istediginiz miktari giriniz");
        Scanner scan = new Scanner(System.in);
        double cekilecek = scan.nextDouble();
        if (bakiye >= cekilecek) {
            bakiye -= cekilecek;
            System.out.println("isleminiz basariyla gerceklesti \nyeni bakiyeniz : " + (bakiye));
            System.out.println("devam etmek icin: 1'i \ncikis icin: 0'i tuslayin ");
            int karar = scan.nextInt();
            if (karar == 1) {
                islemYap();
            } else if (karar == 0) {
                cik();
            }
        } else {
            System.out.println("yetersiz bakiye");
            islemYap();
        }
    }
    private static void paraYatir() {
        System.out.println("yatirmak istediginiz miktari giriniz");
        Scanner scan = new Scanner(System.in);
        double yatirilacak = scan.nextDouble();
        bakiye+= yatirilacak;
        System.out.println("isleminiz basariyla gerceklestrildi\nyeni bakiyeniz : " +bakiye +"Euro");
        System.out.println("devam etmek icin: 1'i \ncikis icin: 0'i tuslayin ");
        int karar = scan.nextInt();
        if (karar == 1) {
            islemYap();
        } else if (karar == 0) {
            cik();
        }
    }
    private static void bakiyeSorgula() {
        System.out.println("Güncel bakiyeniz : " + bakiye + "Euro!");
        System.out.println("*************************");
        System.out.println("devam etmek icin: 1'i \ncikis icin: 0'i tuslayin ");
        int karar = scan.nextInt();
        if (karar == 1) {
            islemYap();
        } else if (karar == 0) {
            cik();
        }
    }
}


