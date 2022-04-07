package tekrar.package3_StringManipulation;

import java.util.Scanner;

public class C07_endsWith_startsWith {
    public static void main(String[] args) {
        // 10. yöntem endsWith istenilen string le bitiyor mu diye konrol eder true -false

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfenbir cumle giriniz");


        String cumle=scan.nextLine();

      /*  if(cumle.endsWith("kücük")){
            System.out.println(cumle.toLowerCase());
        }else if(cumle.endsWith("büyük")){
            System.out.println(cumle.toUpperCase());
        }else {
            System.out.println("Cumle kücük yada büyük kelimesi ile bitmiyor");
        } */

        // 11. yöntem startsWith basliyor mu

        if(cumle.startsWith("kücük")){
            System.out.println(cumle.toLowerCase());
        }else if(cumle.startsWith("büyük")){
          System.out.println(cumle.toUpperCase());
        }else {
            System.out.println("Cumle kücük yada büyük kelimesi ile bitmiyor");
        }


        String str = "Hava güzel olunca parka giderim";

        System.out.println(str.startsWith("ü",5)); // 5.dahil  indexsten sonrasi ü ile mi baslar false
        System.out.println(str.endsWith("erim")); // true





    }
}
