package day03VariablesScaner;

import java.util.Scanner;

public class c5ScannerOrnek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yari capi giriniz");
        double yaricap = scan.nextDouble();
        System.out.println("cemberin cevresi = " +(2*yaricap * 3.14) );
        System.out.println("cemberin cevresi = " + (2*yaricap * yaricap * 3.14));
    }
}
