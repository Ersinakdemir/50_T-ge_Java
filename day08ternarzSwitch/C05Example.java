package day08ternarzSwitch;

public class C05Example {
    public static void main(String[] args) {
        //
        short shortMax = Short.MAX_VALUE;
        System.out.println("shortMax = " + shortMax);
        byte byteMax = Byte.MAX_VALUE;
        System.out.println("byteMax = " + byteMax);
        long longMax = Long.MAX_VALUE;
        System.out.println("longMax = " + longMax);
        int monat = 8;
        switch (monat) {
            case 1:
                System.out.println("Januar");
                break;
            case 2:
                System.out.println("Februar");
                break;

            case 3:
                System.out.println("März");
                break;
            default:
                System.out.println("yilin ilk cegregindedegil");

        }
        int Jahr = 2022, Monat =03, Tag = 03;
                System.out.println("Jahr = " + Jahr);


        System.out.println(" \"Hello\"");


    }
}
