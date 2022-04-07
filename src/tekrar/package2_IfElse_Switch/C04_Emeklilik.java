package tekrar.package2_IfElse_Switch;

import java.util.Scanner;

public class C04_Emeklilik {
    public static void main(String[] args) {
        // eger kadin ve 60 yas emekli
        // eger erkek ise 65 emekli


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi yaziniz" +
                "\n Kadin icin K  \nErkek icin E harfini giriniz");

        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yasinizi giriniz");
        double yas=scan.nextDouble();

        if (cinsiyet=='K'){
            if (yas<0 && yas>120){
                System.out.println("Lütfen girdiginz yasi kontrol ediniz");
            }else if (yas<60) {
                System.out.println("Emekli olamazsiniz " +(60-yas) + " yil daha calismaniz lazim ");
            }else {
                System.out.println("Emekli olabilirsin");
            }
        }else if(cinsiyet=='E'){
            if (yas<0 && yas>120){
                System.out.println("Lütfen girdiginz yasi kontrol ediniz");
            }else if (yas<65) {
                System.out.println("Emekli olamazsiniz " +(65-yas) + " yil daha calismaniz lazim ");
            }else {
                System.out.println("Emekli olabilirsin");
            }
        }else {
            System.out.println("Yanlis deger girdiniz");

        }

    }
}
