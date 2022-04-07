package tekrar.package2_IfElse_Switch;

import java.util.Scanner;

public class C02_NotHesaplama {

    public static void main(String[] args) {
        /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int deger=scan.nextInt();


        if (deger>= 90 && deger<=100){
            System.out.println("Notunuz A ve Mükemmel");
        }else if (deger<90 && deger>=80){
            System.out.println("Notunuz B ve güzel");
        }else if (deger<80 && deger>=70){
            System.out.println("Notunuz C ve iyi");
        }else if (deger<70 && deger>=60){
            System.out.println("Notunuz C ve orta");
        }else if (deger<60 && deger>=0) {
            System.out.println("Notunuz D ve kötü");
        }else {
            System.out.println("Gecersiz girdiniz");
        }


    }
}
