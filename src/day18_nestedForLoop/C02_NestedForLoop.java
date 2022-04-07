package day18_nestedForLoop;

public class C02_NestedForLoop
{
    public static void main(String[] args)
    {
        // kullanicidan bir rakam carpim tablosu olusturalim
        // 1 2 3        1*1 1*2 1*3
        // 2 4 6        2*1 2*2 2*3

        int input =5;
        for (int d = 1; d <= input ; d++) {
            for (int j = 1; j <= input; j++) {
                System.out.print((d * j) + " ");
            }
            System.out.println("");
        }


         // satiri asagiya gecirmek icin

            //dis loop ( outer lop) bir deger aldiginda ic  loop ( inner loop )
            //bastan sona calisir sonra dis loop deger degistirir


        System.out.println("+++++++++++++");



        int n =5;
        for (int i =0; i < n; i++){ // outer
            for (int j =0; j < n; j++){ // inner
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("+++++++++++++");

        int s = 5 , i =1;
        while (s > i){ // outer
            for (int j = 0; j < s; j++) { // inner
                System.out.print("* ");
            }
            System.out.println();
            ++i;
        }

    }
}
