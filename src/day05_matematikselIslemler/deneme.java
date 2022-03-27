package day05_matematikselIslemler;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("notunuzu giriniz :");
        double vize=scan.nextDouble();
        System.out.println(" vize notu");
        double finalNotu =scan.nextDouble();
        System.out.println(" final notu");
        double yilSonuNotu=((vize/100)*30)+((finalNotu/100)*70);
        if (50<=yilSonuNotu){
            System.out.println(" gecti");
        }else
            System.out.println(" kaldi");
    }
}
