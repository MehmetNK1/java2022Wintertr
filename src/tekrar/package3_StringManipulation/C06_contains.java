package tekrar.package3_StringManipulation;

import java.util.Scanner;

public class C06_contains {
    public static void main(String[] args) {
        // 9. yöntem contains string in istenen karakterler i icerip icermedigini kontrol eder true-false


        // 	 Kullanicidan bir cumle isteyin.
        // Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
        // “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        // iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfenbir cumle giriniz");


        String cumle=scan.nextLine();

        if(cumle.contains("kücük")){
            System.out.println(cumle.toLowerCase());
        }else if(cumle.contains("büyük")){
            System.out.println(cumle.toUpperCase());
        }else {
            System.out.println("Cumle kücük yada büyük kelimesi icermiyor");
        }


    }
}
