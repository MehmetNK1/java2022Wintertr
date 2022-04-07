package tekrar.package3_StringManipulation;

public class C05_lastIndexOf {
    public static void main(String[] args) {

        // 8. yöntem lastIndexOf istenen karakterin kullanildigi son index i döndürü

        // Bir cumle ve bir kelime yazin
        // kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //        - Girilen kelime cumlede kullanilmamis.
        //        - Girilen kelime cumlede 1 kere kullanilmis.
        //        - Girilen kelime cumlede 1’den fazla kullanilmis.

        String cumle="Java ogren, yeni program ile yeni bir sayfa ac";
        String kelime="yeni";

        int ilkKullanim=cumle.indexOf(kelime); // 0 dan Aramaya bastan baslar index olarak kelime nerden basliyor onu verri 11
        int sonKullanim=cumle.lastIndexOf(kelime); // Aramaya sondan baslar - saymaya bastan basyacak  28

        if(ilkKullanim==-1){
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        }else if (ilkKullanim==sonKullanim){ // bastan ve sondan ayni kelime kullanimis
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
        } else {
            System.out.println("Girilen kelime cumlede 1’den fazla kullanilmis.");
        }
       

    }
}
