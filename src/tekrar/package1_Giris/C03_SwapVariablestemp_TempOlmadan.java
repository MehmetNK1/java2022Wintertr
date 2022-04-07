package tekrar.package1_Giris;

public class C03_SwapVariablestemp_TempOlmadan {

    public static void main(String[] args) {

        /* Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
      Orn  : sayi1=20 ve sayi2=15;
        kod calistiktan sonra
               sayi1=15 ve sayi2=20 */

        int sayi1=20;
        int sayi2=15;
        System.out.println("Swap'tan önce sayi1 = " + sayi1 + " sayi2 = " + sayi2);

        int temp=sayi1;
        sayi1=sayi2;
        sayi2=temp;
        System.out.println("Swap'tan sonra sayi1 = " + sayi1 + " sayi2 = " + sayi2);

         /*
        1- Verilen sayi1 ve sayi2 variable’larinin degerlerini
        ucuncu bir variable kullanmadan degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */

        int s1=47;
        int s2=35;
        System.out.println("Swap'tan önce s1 = " + s1 + " s2 = " + s2);

        s1=s1+s2;
        s2=s1-s2;
        s1=s1-s2;
        System.out.println("Swap'tan önce s1 = " + s1 + " s2 = " + s2);







    }
}
