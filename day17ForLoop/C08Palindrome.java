package day17ForLoop;

public class C08Palindrome {
    public static void main(String[] args) {
        //       // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        //        // Kullanicinin girdigi String’in palindrome(tersi kendisi gibi olan)
        //        olup olmadigini kontrol eden bir program yazin.
        String input = "ava";
        palindromeKontrolEt(input);
    }

    private static void palindromeKontrolEt(String input) {
        String terstenInput ="";
        for ( int i = input.length() -1; i >=0 ; i--) {
            terstenInput += input.charAt(i);

        }
        System.out.println("girdiginiz kelimenin tersten yazilimi " +  terstenInput);
        if (input.equalsIgnoreCase(terstenInput)){
            System.out.println("girdiginiz kelime Palindromdur");
        }else {
            System.out.println("girdiginiz kelime Palindrom degildir");
        }

    }
}
