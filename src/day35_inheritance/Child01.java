package day35_inheritance;

public class Child01 extends Parent{
    public static void main(String[] args) {

        /*
        Child clas hic bir obj ye ihtiyac duymadan parent clastaki
        variable ve methodlara ulasabilir.

         */
        System.out.println(isim);
        System.out.println(fabrika);
        method1();
        method2();

        //Parent obj1 = new Parent();


    }
}
