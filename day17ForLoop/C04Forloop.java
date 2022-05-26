package day17ForLoop;

public class C04Forloop {
    public static void main(String[] args) {
        //10 ile 30 arasindaki sayilari aralarinda virgül olarak ayni satirda yazdiriniz

        for (int i = 10; i <= 30; i++) {
            System.out.print(i + ",");

        }
        int baslangic =10;
        int bitis = 30;
        for (int i =baslangic; i <= bitis; i++) {
            if (i <bitis){
                System.out.print(i +",");
            }else{
                System.out.print(i);
            }

        }


    }
}
