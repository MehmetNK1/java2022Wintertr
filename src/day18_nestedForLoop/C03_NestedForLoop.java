package day18_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        //Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin ve
        // girilen rakama gore asagidaki sekli cizdirin
        // *
        // * *
        // * * *
        // * * * *

        int input =4;
         for (int i = 1; i <=input ; i++){
             for (int j = 1; j <=i ; j++){
                 // bir onceki dersten farki ucgen yapila bilmesi icin
                 // " j <=i " yapildi
                 // dikdortgen icinde " i<= "ve"j<= " ifadelerini
                 // "input1,input2 ve i gibi sirayla degisitirerek sglanir
                 System.out.print((i*j) + " ");
             }              // (parantez icine "*" koyarsan hepsi degisir)
             System.out.println("");
         }
    }
}
