package day18;

public class C03nestedForloop {
    public static void main(String[] args) {
        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * *
         * * *
         * *
         *


         */
        int input = 6;
        for (int i = 1; i <= input ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");

        }
        for (int i = 1; i <= input ; i++) {
            for (int j = 1; j <= input - i; j++) {
                System.out.print("* ");

            }
            System.out.println("");


        }
    }
}
