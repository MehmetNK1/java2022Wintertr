package day32_dateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {

        LocalTime tm = LocalTime.now();
        System.out.println(tm); // 21:11:31.177479500


        // bir islemin ne kadar surede bittigini bulmak icin
        // islemden once ve sonra birer time objesi olusturup
        //aradaki farki hesaplaya biliriz
        int sayi =0;
        for (int i = 0; i < 100000 ; i++){
            sayi++;
        }
        LocalTime tmLoopSonrasi= LocalTime.now();
        System.out.println(tm); // 21:15:06.866425500

        double nano1 =tm.getNano();
        double nano2 =tmLoopSonrasi.getNano();
        System.out.println("islem " + (nano2-nano1) + " nano saniyede bitti"); // islem 2343700.0 nano saniyede bitti

        // ileri veya geri gidebiliriz
        System.out.println(tm.plusMinutes(1000)); // 14:00:30.550096900

        // istersek zone id kull. istedimiz bolgenin saati icin obje olusrurabiliriz

    }
}
