package tekrar.package2_IfElse_Switch;

public class C06_NestedTernary {

    /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

    public static void main(String[] args) {

        char finaNotu='B';

        String sonuc= (finaNotu=='A') ? "Gayet Basarili" : (finaNotu=='B') ? "Basarili" :
                (finaNotu=='C') ? "Ha gayret devam" :  "Digerleri ";

        System.out.println("final notu : " + sonuc);
    }



}
