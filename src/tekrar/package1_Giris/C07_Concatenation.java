package tekrar.package1_Giris;

public class C07_Concatenation {
    public static void main(String[] args) {


        String str1 = "merhaba";
        String str2 = "olsun";
        int sayi1=5;
        int sayi2=6;

        System.out.println(str1+str2+sayi1); //merhabaolsun5
        System.out.println(str1+(sayi1+sayi2)); //merhaba11
        System.out.println(str2+sayi1*sayi2); //olsun30
        System.out.println(""+str2+""+sayi1*sayi2);//olsun30
        System.out.println(" " +str2+ " " +sayi1*sayi2); // olsun 30


        boolean sonuc1=5+2!=7;
        System.out.println(5*2!=7); // esit degil true
        System.out.println(sonuc1);// esit degil false
        boolean sonuc2=5+2>=7;
        System.out.println(5*2>=15);// esit degil false
        boolean sonuc3=5+2<=7;
        System.out.println(5*2<=15);// esit degil true

        boolean sonuc4=(5+2==7)&&(4+3!=5);  // true
        System.out.println((5*2!=15)&&(5>7)); //false  1 yanlis olsa && AND ONU FALSE yapar

        boolean sonuc5=5>4 && 7>9 && 6+3==9 && 5+4!=8 ;
        System.out.println(sonuc5); // false

        boolean sonuc6=5>4 & 7>9 & 6+3==9 & 5+4!=8 ;
        System.out.println(sonuc6); // false

        // && ile & arasi fark  && islemde bir false gördümü durur & ise sona kadar gider
        // Aralik isteniyorsa &&
        int sayi7=15;

        System.out.println(10<sayi7 && sayi7<20);  //aralik isteniyorsa AND && VE mükemmeliyetci hersey tam olmali

        int sayi4=5;

        // sayi4 in 10 ile 20 arasinda olmadigini true diye döndürün

        System.out.println(sayi4<10 || sayi4>20);  // belritilen disina ise veya || kullanilar VEYA hepsi yanlis olmaliki false olsun


    }
}
