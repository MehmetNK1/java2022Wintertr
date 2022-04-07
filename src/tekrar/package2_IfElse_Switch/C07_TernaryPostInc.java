package tekrar.package2_IfElse_Switch;

public class C07_TernaryPostInc {

    public static void main(String[] args) {
        int y=1;
        int z=1;

        int a=y<10 ? y++ : z++ ;

        System.out.println(y + "," + z + "," + a);

        int sayi1=5;
        int sayi2=7;

        System.out.println(sayi1>sayi2 ? sayi1 : sayi2);
    }
}
