package day14_stringManipulation;

public class C01_trim {
    public static void main(String[] args) {

        String str = "    Siz nederseniz deyin, Java bildigini okur.     ";

        str.trim();
        System.out.println(str); //  bosluklar ve sayilarla
        System.out.println(str.length());

        str = str.trim();
        System.out.println(str); // bosluksuz ve sayilarla
        System.out.println(str.length());

    }
}
