package tekrar.package2_IfElse_Switch;

public class C05_Ternary {
    public static void main(String[] args) {
        /*
         * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * olsun
         */

        int fiyat=25;

        String sonuc=(fiyat<10) ? "ucuz " : fiyat < 20 ? "normal" :  "pahalli";
        System.out.println(sonuc);

        int sayi=1400;


        String sonuc1 =sayi>=100 ? "Sayi 3 basamkli veya daha büyük" : "sayi negatif veya 3 basamaktan kücük";


        System.out.println("girdiginiz sayi analizi :" + sonuc1);
    }
}
