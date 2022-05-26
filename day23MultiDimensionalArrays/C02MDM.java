package day23MultiDimensionalArrays;

public class C02MDM {
    public static void main(String[] args) {
        //veriler Multidimensional array in tüm elementlerinnin toplamaini bulunuz
        int arr[][] ={{5,1,6},{6,10,54},{8,9}};
        int toplam = 0;
        elementlerintoplama(arr,toplam);

    }

    private static void elementlerintoplama(int[][] arr, int toplam) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                int sayi = arr[i][j];
                toplam+=sayi;
            }
            

        }
        System.out.println(toplam);
    }
}
