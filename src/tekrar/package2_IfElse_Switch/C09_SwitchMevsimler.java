package tekrar.package2_IfElse_Switch;

import java.util.Scanner;

public class C09_SwitchMevsimler {

    public static void main(String[] args) {

        // kullanicidan ay al kacinci mevsim oldugunu giriniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kacinci ay oldugunu giriniz");
        int ayNo=scan.nextInt();

        switch(ayNo){
            case 12:
            case 1:
            case 2:
                System.out.println("Kis");
            break;
            case 3:
            case 4:
            case 5:
                System.out.println("Ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar");
                break;

            default:
                System.out.println("Gecersiz veri girdiniz");

                  /*switch (ay){
    case 3,4,5:
        System.out.println("Ilkbahat"); break;
    case 6,7,8:
        System.out.println("Yaz"); break;
    case 9,10,11:
        System.out.println("Sonbahar"); break;
    case 12,1,2:
        System.out.println("Kis"); break;
    default:
        System.out.println("Lutfen duzgun deger giriniz");
}*/



        }





    }
}
