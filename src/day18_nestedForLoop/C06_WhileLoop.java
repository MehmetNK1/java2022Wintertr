package day18_nestedForLoop;

public class C06_WhileLoop {
    public static void main(String[] args) {
        // kullanicidan iki tam sayi alip
        // bu sayilari ve aralarindaki tum tamsayilari yazdiran bir kod olusturalim

        int baslangic = 40;
        int bitis = 60;
        for (int i =baslangic; i <= bitis; i++) {
            System.out.print(i + " ");
        }
        System.out.println(""); // her zaman asagiya bos satir yazdirin
        /*
        while ile yapimi
         */
        System.out.println("while ile yapimi");
        int i=baslangic;
        while (i<=bitis){
            System.out.print(i + " ");
            i++;
        }
        System.out.println(""); // bunu silersen 61 cikar
        System.out.println(baslangic); //61
    }
}
