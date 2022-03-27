package day19_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        // while loop ile 5 den kucuk pozitif tam sayilari yazdiralim

        int input = 3;
        int sayi = 1;

        while (sayi < input){
            System.out.println(sayi);
            sayi++;
            }
            sayi =1;
            do {
                System.out.println(sayi);
                sayi++;
            }while (sayi < input);
    }
}
