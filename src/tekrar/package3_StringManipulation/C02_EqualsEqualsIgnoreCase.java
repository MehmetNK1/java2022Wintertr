package tekrar.package3_StringManipulation;

public class C02_EqualsEqualsIgnoreCase {
    public static void main(String[] args){

        // 4. yöntem equqls verilen iki stirng ii esit olup olmadigi ni konrol eder
        // == degere ve referansa bakar

        String str1="Ali Can";
        String str2="Ali" + " Can";

        System.out.println(" == ile karsilastirma : " + (str1==str2)); // herzaman dogru sonuc vermediginden dolayi bu tercih edilmiyor
        System.out.println("equals ile karsilastima : " + str1.equals(str2));

        String str5="ali";
        String str6="ALI";

        System.out.println(str5.equals(str6)); // false
        System.out.println(str5.toUpperCase().equals(str6)); // true

        // 5 . yöntem equalsignorecase büyük kücük harf ile ugrasmamak icin


        System.out.println(str1.equalsIgnoreCase(str2)); //true









    }
}
