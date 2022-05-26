package day23MultiDimensionalArrays;

public class C08Exampl {
    public static void main(String[] args) {
        //s2 asagidaki multudimesional arry in ic arraylerdeki son elemanlarin carpimini
        //ekrana yazdiran bir program yaziniz  {{1,2,3},{4,5},{6}}

        int arr[][] = {{1,2,7},{4,5},{3}};
        int carpim =1;
        carpimlar(arr,carpim);

    }

    private static void carpimlar(int[][] arr, int carpim) {
        for (int i = 0; i < arr.length; i++) {
            carpim *= arr[i][arr[i].length-1];

        }
        System.out.println("arr Array indeki sayilarin carpimi : "+carpim);
    }
}
