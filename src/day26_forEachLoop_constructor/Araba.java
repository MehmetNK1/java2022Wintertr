package day26_forEachLoop_constructor;

public class Araba {
    /*
       java da her clas olusturdugumuzda
       java o clas tan ileride objeler uretecegini bilir ve
       biz ozellikleri belirtmesek de java
       her olusturdugu class a bir constructer koyar

       java nin clas olusturuken class a koydugu const.
       default cont. denir ve bu const. gorunmez.

       eger biz gorunur bir const. olsun istersek
       default const. ile ayni gorevi yapan bir const.olusturabiliriz
       veya istersek ayni kaliptan farkli desenlerde objeler olusturmak icin
       farkl ozelliklerede const. da olusturabiliriz

       const. birbirinden farklilastiran tek ayricalik
       kullanilan parametre sayisi ve parametre data turudur

     */
    public Araba(){
        System.out.println("parametresiz const. calistirma");
    }
    /* bir kod blogunun method veya cont. olmasindan emin olmak istiyorsaniz
       iki seye dikkat etmeliyiz
       - const. ismi clas ismi ile ayni olmak zorundadir yani buyuk harfle baslar
       - const. return type i olmaz

       ozetle : const. const. adi clas adi ile ayni olmalidir ve
                return type olmamalidir
     */
    public Araba(String renk){
        System.out.println(renk + " renkli bir araba uretildi");
    }
    public Araba(int yil){
        System.out.println(yil + " model bir araba uretme");
    }
    public Araba(int yil,String renk){
        System.out.println(yil + " model "+ renk + " renginde bir araba ");
    }
}
