package day05Matematikselislemler;

public class C01PreandPostIncrement {
    public static void main(String[] args) {
        int sayi = 10;
        //bu sayiyi 1 artirmak istiyorsak
        sayi++;
        System.out.println(sayi);//11
        sayi++;
        System.out.println("Pre Incrementten önce " + sayi);//12
        //ayni satirda hem yazdirmak hemde arttirirsak java hangisini önce yapacagini bilmek ister
        System.out.println("Pre Increment satirinda " + ++sayi);// 13önce arttir sonra yazdir demek
        System.out.println("Pre Incrementten sonra " + sayi);//13
        System.out.println("Post Increment satirinda " + sayi++);//13
        System.out.println("Post Increment satirindan sonra  " + sayi);//14

    }
}
