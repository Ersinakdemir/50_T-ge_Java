package day07IfElseIfStatements;

import java.util.Scanner;

public class C01IfElseIfStatements {
    public static void main(String[] args) {
        //Kullanicidan notunu isteyin
        //50 den kucukse D
        // 50 -60 arasi D
        // 60 ile 80 arasi B
        // 80 ustü A
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        double notsayi=scan.nextDouble();
        if(notsayi>100 ||notsayi<0){
            System.out.println("Lutfen gerli bir not giriniz");
        }
        else if(notsayi<50){
            System.out.println("notunuz D");
        }else if( notsayi<60){
            System.out.println("notunuz C");
        }else if( notsayi<80){
        System.out.println("notunuz B");
        }else{
            System.out.println("notunuz A");
        }//Else ile bittiginden durumlardan mutlaka biri calisir

        scan.close();

    }
}
