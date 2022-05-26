package day26forEachloopConstructor;

public class ForEachLoop {
    public static void main(String[] args) {
        int arr[]= {2,4,6,8,10};
        //elementleri forloop ile yazdiralim

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");

        }
        System.out.println("");

        //binu for each loop ile yapacak olursak for each loop u calistirmak icin hedef bir collection vermeliyiz
        for (int each:arr
             ) {
            System.out.print(each + " ");
        }
        // Avantajim index baslangic degferi bitis degeri gibi detaylarla ugrasmamiza
        // gerek kalmadan colections dan tum elemetleri bize getirir
        //dezavantaji : index e bagli bir isalem yapamayiz
    }
}
