package day18_nestedForLoop;

import java.util.Random;
import java.util.Scanner;

public class H_sayiBulmaca {
    public static void main(String[] args) {

        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen 1 - 100 arasi sayi giriniz");

        int tahmin = scan.nextInt();

        Random rnd =new Random();
        int sayi=rnd.nextInt(100); // burasi 100'den kucuk rastgele bir sayi olusturur
        int sayac =1;

        while (sayi!= tahmin){
            if (tahmin>sayi){
                System.out.println("Sayiyi kucult");
            }else {
                System.out.println("Sayiyi buyult");
            }
            sayac++;
            System.out.println("lutfen tahmininizi girin : ");
            tahmin = scan.nextInt();
        }
        System.out.println(sayi +" sayisini "+ sayac +" adimda bulundunuz");



    }
}
