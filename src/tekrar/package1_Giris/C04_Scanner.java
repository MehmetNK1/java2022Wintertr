package tekrar.package1_Giris;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {
        // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi yazdirin

        // next() only can read the first word
        // nextLine() can read the whole line

        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen adinizi giriniz : ");
        String isim=scan.nextLine();

        System.out.print("Lütfen yasadiginiz sehri giriniz : ");
        String sehir=scan.nextLine();

        System.out.print("Lütfen boyunuzu giriniz : ");
        double boy=scan.nextDouble();

        System.out.print("yasadiginiz " + sehir + " i seviyormusun ? true/false ");
        boolean seviyorMu = scan.hasNextBoolean();

        System.out.println("************");
        System.out.println("isiminiz : " + isim  );
        System.out.println("sehriniz : " + sehir  );
        System.out.println("yasadiginiz yeri seviyormusunuz : " + seviyorMu  );



        char dörtHarf=scan.next().charAt(3);

        System.out.println("girdiginiz ismin dördüncü harfi =  " + dörtHarf );




    }
}
