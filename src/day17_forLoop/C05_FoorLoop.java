package day17_forLoop;

public class C05_FoorLoop {
    public static void main(String[] args) {

        // kullanucudan 55 den kucuk bir tam sayi isteyin
        // 1´den baslayarak girilen sayiya kadar 3ún kati olan sayilari yazdirin

        int sayi = 55;
        for (int i =1; i <=sayi ; i ++){
            if (i%3==0){
                System.out.print(i + " ");
            }
        }
    }
}
