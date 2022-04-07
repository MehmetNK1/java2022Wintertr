package tekrar.package1_Giris;

public class C08_ConcatValuoefParse {

    public static void main(String[] args) {

        String str1 = "merhaba";
        String str2 = "olsun";
        System.out.println(str1.concat(" " + str2)); //merhaba olsun

        String a = "12";
        String b = "9";

        int sayi1= Integer.valueOf(a);
        int sayi2= Integer.valueOf(b);

        System.out.println("ValueOf ile toplam = " +(sayi1+sayi2)); //21

        int sayi3= Integer.parseInt(a);
        int sayi4= Integer.parseInt(b);

        System.out.println("parse ile toplam = " +(sayi3+sayi4)); //21



    }

}
