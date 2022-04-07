package tekrar.package3_StringManipulation;

public class C09_replace {
    public static void main(String[] args) {
        // 13. yöntem replace istenilen karakterleri istenen karakterle yer degistiri

        String str="gökyüzü mavi dir";

        System.out.println("Bu cümlede bosluk disindaki karakter casisi : " + str.replace(" ","").length()); //14
        System.out.println("Orjinal karakter saysi : " + str.length()); //16
        System.out.println(str.replace("a","x")); // gökyüzü mxvi dir
        System.out.println(str.replace("dir","oldu")); //gökyüzü mavi oldu
        System.out.println(str.replace("mavi","***")); //gökyüzü *** dir
        System.out.println(str.replace(str.charAt(5),' ')); //  gökyü ü mavi dir
        System.out.println(str.replace("ü", " ")); //göky z  mavi dir
        System.out.println(str.replace('ü', ' ')); //göky z  mavi dir

        System.out.println(str); //gökyüzü mavi dir

        str=str.replace("mavi","gri"); // atama

        System.out.println("kalici degisiklikten sonra : " + str); //gökyüzü gri dir



    }
}
