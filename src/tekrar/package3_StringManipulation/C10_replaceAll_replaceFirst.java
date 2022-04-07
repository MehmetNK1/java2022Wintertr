package tekrar.package3_StringManipulation;

public class C10_replaceAll_replaceFirst {
    public static void main(String[] args) {


        // 14. yöntem replaceAll
        // char icin kullanilmaz Regular Expression kullanilabilir
        // mantigi bütün a lar  veya java yi dgistir degi
        // all mantigi bütün harfeleri rakamalri space leri demek icin kullaniliyor

    /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d   : tum rakamlar
		  	 \\D  : tum rakam disi character ler
		 2) \\w   mn : Bütün kücük büyük harfler ve rakamalr  _
		 	 \\W  : Bütün kücük büyük harfler ve rakamalr disinda kalan hersey
		 3) \\s   : space
		 	 \\S  : space disindaki hersey  */

        String str = "Hava'da sayilar 12345&&";

        System.out.println(str.replace("\\s","*")); //Hava'da sayilar 12345&&
        System.out.println(str.replaceAll("a", "*")); //H*v*'d* s*yil*r 12345&&
        System.out.println(str.replaceAll("\\s", "*")); //Hava'da*sayilar*12345&&
        System.out.println(str.replaceAll("\\S", "*")); //******* ******* *******
        System.out.println(str.replaceAll("\\w", "*")); //****'** ******* *****&&
        System.out.println(str.replaceAll("\\W", "*"));//Hava*da*sayilar*12345**
        System.out.println(str.replaceAll("\\d", "*")); //Hava'da sayilar *****&&
        System.out.println(str.replaceAll("\\D", "*")); //****************12345**

        // 15. replaceFirst stringteki karakterlerin ilkini istenen yeni karakterle degistiri

        System.out.println(str.replaceFirst("a", "*")); //H*va'da sayilar 12345&&
        System.out.println(str.replaceFirst("lar", "*"));//Hava'da sayi* 12345&&
        System.out.println(str.replaceFirst("\\D", "*"));//*ava'da sayilar 12345&&
        System.out.println(str.replaceFirst("\\W", "*"));//Hava*da sayilar 12345&&
    }
}