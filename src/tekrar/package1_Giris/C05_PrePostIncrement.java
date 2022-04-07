package tekrar.package1_Giris;

public class C05_PrePostIncrement {

    public static void main(String[] args) {
        int sayi=15;

        sayi++;
        System.out.println(sayi); //16

        System.out.println("pre-incrementten once " + sayi); //16
        System.out.println("pre-incrementten satirinda " + ++sayi);//17
        System.out.println("pre-incrementten sonra " + sayi);//17
        System.out.println("post-incrementten satirinda " + sayi++); //17
        System.out.println("post-incrementten sonra " + sayi);//18



    }
}
