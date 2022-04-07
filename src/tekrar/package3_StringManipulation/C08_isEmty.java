package tekrar.package3_StringManipulation;

public class C08_isEmty {
    public static void main(String[] args) {

        // 12. yöntem isEmpty string bos mu dolu mu diye kontrol eder true - false

        String str="gökyüzü mavidir";
        System.out.println(str.isEmpty()); // false

        String str1="";
        System.out.println(str1.isEmpty()); // true hiclik bostur

        String str2=null;
        System.out.println(str2.isEmpty()); // hata verir null in degeri yok fakar space in vardir

    }
}
