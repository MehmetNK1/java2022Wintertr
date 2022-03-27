package day17_forLoop;

public class C08_Palindrome {
    public static void main(String[] args) {

        // Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        // Kullanicinin girdigi String’in palindrome
        // olup olmadigini kontrol eden bir method yazin.

        String input = " madam ";
        palindromeKontrolEt (input);  // girilen kelime tersden de ayni oluyorsa PALINDROME OLUR
    }
    private static void palindromeKontrolEt(String input) {
        String terstenInput = "";
        for (int i = input.length()-1;i>=0 ; i--) {
            terstenInput+=input.charAt(i);
        }
        System.out.print("Giridiginiz kelimenin tersten yazilisi : "+ terstenInput);
        if (input.equalsIgnoreCase(terstenInput)) {
            System.out.println("Girdiginiz kelime palindrome");
        }else{
            System.out.println(" Girdiginiz kelime palindrome degil");
        }
    }
}
