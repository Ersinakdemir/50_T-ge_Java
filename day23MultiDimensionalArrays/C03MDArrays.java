package day23MultiDimensionalArrays;

public class C03MDArrays {
    public static void main(String[] args) {
        //Boyutlari belirli bir arr i elementleri girmeden olusturalim
        //bir okuldas icinde 24 ögrenci olan 8 sinif vardir
        int arr [][]= new int[8][24];
        //bir ilcede her birinde 24 ogrencilik 8 sinif bulunan 5 okul vardir

        int ilce [][][] = new int[5][8][24];

        // olustururken elementleri atama yaparsak farkli uzunlukta inner array ler tanimlaya biliriz

        int arr1 [][] = {{3,1,2}, {67,7,8,9}};
        System.out.println(arr1[0]);

    }
}
