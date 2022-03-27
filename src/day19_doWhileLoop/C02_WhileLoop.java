package day19_doWhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {

        //  Kullanicidan bir sayi alin
        //  ve bu sayinin rakamlari toplamini yazdirin


        int input = 15 ;
        int rakam = 0 ;
        int rakamalartoplami = 0 ;

        while (input>0){
         rakam=input%10;
         rakamalartoplami += rakam;
         input/=10;
        }
        System.out.println(rakamalartoplami);
    }
}
