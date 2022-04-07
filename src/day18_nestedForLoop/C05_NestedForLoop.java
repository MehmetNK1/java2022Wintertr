package day18_nestedForLoop;

public class

C05_NestedForLoop {
    public static void main(String[] args) {

        /*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F

        şeklini yazdırınız.
         */

        char input = 'Z';
        for (char i = 'A'; i <=input ; i++){
            for (char j = 'A'; j <=i ; j++){
                System.out.print(j + " ");// 3.classtan tek farki burasi
            }
            System.out.println("");
        }
    }
}
