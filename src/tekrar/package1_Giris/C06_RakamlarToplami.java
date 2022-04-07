package tekrar.package1_Giris;

import java.util.Scanner;

public class C06_RakamlarToplami {
    public static void main(String[] args) {

        //  kullanicidan aldigimiz 3 basamakli bir sayinin rakamalri toplamini bulunuz

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen 3 basamakli bir tam sayi giriniz");
        int sayi= scan.nextInt();

        int rakam=0;
        int rakamlarToplami=0;

        // 1. adim r=0 , rt=0  sayi =123
        rakam=sayi%10;
        rakamlarToplami +=rakam; // 3
        sayi/=10; //12.3 ama int . dan sonarlki kismi atar

        // 2. adim r=2 rt=2 sayi =12
        rakam=sayi%10;
        rakamlarToplami +=rakam; // 5
        sayi/=10; //1

        // 3. adim r=1 rt =5 sayi=1
        rakam=sayi%10;
        rakamlarToplami +=rakam; //6
        sayi/=10; //0

        System.out.println("Girdiginiz sayinin rakamalr toplami = " + rakamlarToplami);



    }
}
