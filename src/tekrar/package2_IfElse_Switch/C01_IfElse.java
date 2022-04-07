package tekrar.package2_IfElse_Switch;

import java.util.Scanner;

public class C01_IfElse {
    public static void main(String[] args) {
        /*
         * Kullanicidan Ali / Veli ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Ali ,  Veli
         * OUTPUT : Can ; Canan
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz = ");
        String isim=scan.nextLine();

        if (isim.equals("ALI") || isim.equals("ali") ){
            System.out.println("Can");
        }else if (isim.equals("VELI") || isim.equals("veli") ){
            System.out.println("Canan");
        }else {
            System.out.println("yanlis isim girdiniz");
        }

        /*
          Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen isminizi giriniz = ");
        String isim = scan.nextLine();
        if (isim.equalsIgnoreCase("ALI")) {
            System.out.println("Can");
        } else if (isim.equalsIgnoreCase("veli")) {
            System.out.println("Canan");
        } else {
            System.out.println("yanlis isim girdiniz");
        }
         */
    }

}
