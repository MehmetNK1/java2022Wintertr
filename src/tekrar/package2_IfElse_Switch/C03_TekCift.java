package tekrar.package2_IfElse_Switch;

import java.util.Scanner;

public class C03_TekCift {
    public static void main(String[] args) {
        // kullanicidan bir tam sayi isteyin ve tek mi cift mi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%2==0){
            System.out.println("Sayi cift bir sayidir");
        }else  {
            System.out.println("Sayi tek bir sayidir");
        }







    }
}
