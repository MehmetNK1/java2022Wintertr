package day19_doWhileLoop;

public class C05_Scope {
    // bir method icerisinde olusturulan variable' lar sadece olusturulduklari
    // method'da kullanila bilir baska methodlarda kullanilmazlar
    // tum methodlarn kullanilabilmesini istedigimiz variableri
    // Class level ' da olustururuz
    // Class level da olusturdugumuz variablari
    // -- static yaparsak tum methodlr kullanilarbilir
    // static olmazsa o zaman sadece static olmayanlar kullanir
    // loop icinde olusturulan variable lar loop icerisiinde kullanilabilir
    // ama loopun disinda kullanilamaz

    static String kurs= "Java";
    int level=10;

    public static void main(String[] args) {

        int sayi=10;
        System.out.println(kurs);
       // System.out.println(level); // static olmadigi icin calismaz
        for (int i=0; i<10; i++)
            System.out.println(i);
        int loopSayi=20;


    }
    public static void method1(){

    }

    public void method2(){
        System.out.println(level);
        System.out.println(kurs);
    }
}
