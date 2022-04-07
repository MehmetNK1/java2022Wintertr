package tekrar.package3_StringManipulation;

import java.util.Scanner;

public class C04_indexsOfSoru {

    public static void main(String[] args) {
        /* kullanicidan mail adresini isteyin @ isareti icermiyorsa gecersiz yazdirin
         iceriyorsa mailiniz kabul edildi yazin

         Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen mailinizi yazin");
        String mail=scan.next();

        if (mail.indexOf("@")==(-1) ){
            System.out.println("Gecersiz");

        }else{
            System.out.println("mailiniz kabul edildi");
        } */
        // Bir cumle ve bir kelime yazin
        // kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //        - Girilen kelime cumlede kullanilmamis.
        //        - Girilen kelime cumlede 1 kere kullanilmis.
        //        - Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle="Al su taka tuka lari taka tuka ciya götür";
        String kelime="Al  ";

        int ilkKullanim=cumle.indexOf(kelime); // ilk kullanimi bulacaz yoksa -1 veya cümlede varsa index cikar
        //  ilkkullnim olmazsa bile -1+1 den dolayi 0 cikar ve yinede calisir
        int ikinciKullanim=cumle.indexOf(kelime, ilkKullanim+1);


        if(ilkKullanim==-1){ // cümlede olmadigini gösterir
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        }else if (ikinciKullanim==(-1)){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
        } else {
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        }

    }
}
