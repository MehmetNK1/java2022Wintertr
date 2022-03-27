package day14_stringManipulation;

public class C04_IsimGizleme {
    public static void main(String[] args) {


        //Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin
        // ve asagidaki gibi yazdirin
        //isim-soyisim : M***** B*******
        //kart no : **** **** **** 1234

        String isim = "oguzhan";
        String soyisim = "Balkaya";
        String kkNom = "1234567890123456";

        String yenisim = isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");

        String yenSoyisim = soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");

        String yeniKKNo = "**** **** **** " + kkNom.substring(12);

        System.out.println("isim-soyisim : " + yenisim + " " + yenSoyisim +
                "\nkart no :" + yeniKKNo );

    }
}
