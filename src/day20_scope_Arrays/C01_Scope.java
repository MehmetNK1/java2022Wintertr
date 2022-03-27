package day20_scope_Arrays;

public class C01_Scope {

    int sayi;
    String bransIsmi ="Java";
    boolean okuldaMi;

    public static void main(String[] args) {
        // sayi =10; sayi variable 'i static olmadigi icin main method dan direk kullanilmaz
        // instance variable lar static methodlardan ulasabilmek icin obje olusturmaniz gerekir

        C01_Scope obj1 = new C01_Scope();
        System.out.println(obj1.sayi); // 0
        obj1.sayi=10;
        System.out.println(obj1.sayi); // 10
        obj1.bransIsmi="SQL";

        C01_Scope obj2 = new C01_Scope();
        System.out.println(obj2.sayi); // 0
        System.out.println(obj2.bransIsmi); //Java

        obj1.okuldaMi = true;
        System.out.println(obj2.okuldaMi);
    }
}
