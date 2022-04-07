package tekrar.package2_IfElse_Switch;

import java.util.Scanner;

public class C08_Switch {
    public static void main(String[] args) {

        // Girilen uc haneli bir sayının onlar basamağının değerini yazı ile yazdırınız.

            Scanner scan = new Scanner(System.in);
            System.out.print("sayi giriniz :");
            int sayi = scan.nextInt();

            int onlarBasamagi= (sayi/10) %10, birlerBasamgi=(sayi%10), yüzlerBasamagi=sayi/100;
            if (sayi>99 && sayi<1000)

                switch(yüzlerBasamagi){
                    case 0: System.out.println(""); break;
                    case 1: System.out.println("yuz"); break;
                    case 2: System.out.println("ikiyuz"); break;
                    case 3: System.out.println("ucyuz"); break;
                    case 4: System.out.println("dortyuz"); break;
                    case 5: System.out.println("besyuz"); break;
                    case 6: System.out.println("altiyuz"); break;
                    case 7: System.out.println("yediyuz"); break;
                    case 8: System.out.println("sekizyuz"); break;
                    case 9: System.out.println("dokuzyuz"); break;
                }
        switch(onlarBasamagi){
            case 0: System.out.println(""); break;
            case 1: System.out.println("on"); break;
            case 2: System.out.println("yirmi"); break;
            case 3: System.out.println("otuz"); break;
            case 4: System.out.println("kirk"); break;
            case 5: System.out.println("elli"); break;
            case 6: System.out.println("altmis"); break;
            case 7: System.out.println("yetmis"); break;
            case 8: System.out.println("seksen"); break;
            case 9: System.out.println("doksan"); break;

            }
        switch(birlerBasamgi){
            case 0: System.out.println(""); break;
            case 1: System.out.println("bir"); break;
            case 2: System.out.println("iki"); break;
            case 3: System.out.println("uc"); break;
            case 4: System.out.println("dort"); break;
            case 5: System.out.println("bes"); break;
            case 6: System.out.println("alti"); break;
            case 7: System.out.println("yedi"); break;
            case 8: System.out.println("sekiz"); break;
            case 9: System.out.println("dokuz"); break;
        }






    }
}
