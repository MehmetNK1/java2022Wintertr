package tekrar.package3_StringManipulation;

import java.util.Locale;

public class C01_ConcatCharAtToUpperToLowerCase {

    public static void main(String[] args) {

        // STRING MANIPULATION 1. yöntem CONCAT birden fazla stringi birlestirmek icin
     String str1="Gökyüzü";
     String str2="Mavidir";

     // 1. yol
        System.out.println(str1 + " " + str2); //Gökyüzü Mavidir

     // 2. yol concat methodu

        String ifade=str1.concat(str2);
        System.out.println(str1.concat(" ").concat(str2)); //Gökyüzü Mavidir

//burada string olmasina dikkat edecez int veya diger bur data türü olursa string e cevirmek gerekiyor
        ifade= str1.concat(" "+3);

        System.out.println(ifade); //Gökyüzü 3

        // 2. Manipulation Yöntem CharAt karakterin kacinci index te oldugunu bulmaya yarar

        // stringte indexs 0 dan baslar bosluklari da bir karakter olarak sayar
        // max index stringin uzunlugu -1

        String str="Gökyüzü Mavidir";

        System.out.println(str.charAt(3)); //y

        System.out.println(str.charAt(8)); // M

        System.out.println(str.charAt(8)+str.charAt(9)); // asci degerlerini alir isleme sokunca 199

        System.out.println(""+str.charAt(8)+str.charAt(9)); // hiclik koyunca gerceklesir Ma

        System.out.println(str.charAt(15-1)); // son karakteri uzunluk-1

        // 3. Yöntem toUpperCase (BÜYÜK) - toLowerCase (kücük)  harfleri istenilen bicime ceviri

        System.out.println(str.toLowerCase().charAt(3)+
                ""+str.toUpperCase().charAt(4)+""+str.toUpperCase().charAt(5)); // yÜZ

        System.out.println(str.toUpperCase(Locale.GERMANY)); // olmayan diller icin Locale.forLanguage("Tr")







    }
}
