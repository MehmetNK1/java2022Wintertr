package day16_methodCreation;

public class C04_ForLoop {
    public static void main(String[] args) {

        // verilen stringi tersten terseden yazdiran bir kod yaziniz

        String  str= "Valla bu java cook zevkli";

        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.substring(i,i+1));
        }
    }
}