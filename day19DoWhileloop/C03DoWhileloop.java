package day19DoWhileloop;

public class C03DoWhileloop {
    public static void main(String[] args) {
        //while loop ile 5 ten kücük sayilari yazdiralim
        int input =5;
        int num =1;
        int sayac =1;
        while (num<5){
            System.out.println(num);
            sayac++;
            num++;
        }
        System.out.println("sayac : "+ sayac);

        //ayni soruyu do whoile blokuylamyazdirin
        num = 1;
        do {
            System.out.println(num);
            num++;

        }while (num<input);


    }
}

