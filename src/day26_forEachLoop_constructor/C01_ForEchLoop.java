package day26_forEachLoop_constructor;

public class C01_ForEchLoop {
    public static void main(String[] args) {

        int arr []={2,4,6,8,11};
        // elementleri for loop ileyazdiralim
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("");
        // bunun for-each loop la yapacak olursak
        // for-each loop u calistirmak icin hedef bir colletion vermeliyiz
        for (int each : arr
             ) {
            System.out.println(each + " ");
        }
        // avantaji : index, baslangic degeri, bitis degeri gibi detaylarla
        // ugrasmaniza gerek kalmadan collection dan tum elementleri bize getirir
        // dezavantaji : index e bagli bir islem yapamayiz
    }
}
