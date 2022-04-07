package tekrar.package3_StringManipulation;

public class C03_lengthIndexs {
    public static void main(String[] args) {

        // 6. yöntem length (uzunluk) karakter sayisini verir 1 den basliyor

        String str1="Gökyüzü Mavi";
        System.out.println(str1.length());// 12

        String str2=""; // hiclik bir degerdir
        System.out.println(str2.length()); // 0

        String str3=null; //  bir deger degildir null pointer demek yano deger atanmadigini biliyoruz ve buna null diyoruz
       // System.out.println(str3.length()); // hata verir

        // 7. yöntem IndexsOf 0 dan baslar verilen stirg te istenilen karakterin kullanildigi ilk index i verir

        String str4="Gökyüzü Bulutlu Yagmur mu Yagacak";

        System.out.println(str4.indexOf('G')); //0
        System.out.println(str4.indexOf("G"));//0
        System.out.println(str4.length()-1); //32
        System.out.println(str4.indexOf("utlu")); //11
        System.out.println(str4.indexOf("u")); // buldugu ilk u 9

        System.out.println(str4.indexOf('u',9)); // 9 buradaki fromIndex  ink 9 dahil olarak arar
        int ilkindex=str4.indexOf('u');
        System.out.println(str4.indexOf('u',ilkindex+1)); //11 ilk u dan sonra kini  yazar
        System.out.println(str4.indexOf("mu",20)); //23
        System.out.println(str4.indexOf('J')); //-1 java yok demenin sayisal karsiligi olarak tercih etmis









    }
}
