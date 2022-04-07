package tekrar.package2_IfElse_Switch;

import java.util.Scanner;

public class C03_HaftaninGünleri {
    public static void main(String[] args) {
        // Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        // eger kullanici gün ismini yanlis girerse "yanlis giris" yazdirin
        //  Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
        // *** String icin equals method’unu kullanin
        // pazar veya cumartesi ise ===> hafta sonu
        // pazartesi veya sali veya carsamba veya persembe veya cuma ise ==> hafta ici

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir gün giriniz = ");
       String gün=scan.nextLine().toLowerCase();

       if (gün.equals("pazar") || gün.equals("cumartesi")){
           System.out.println("Girdiginiz gün = "  + gün + " hafta sonudur. Iyi tatiller");

       }else if (gün.equals ("pazartesi") || gün.equals("sali") ||gün.equals("carsamba") ||
               gün.equals("persembe") || gün.equals("cuma") ){
           System.out.println("Girdiginiz gün = "  + gün + " hafta icidir. Iyi calismalar");

       }else {
           System.out.println("Hatali giris yaptiniz");
       }

    }
}
