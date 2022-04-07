package day32_dateTime;

import java.time.LocalDate;
import java.time.Period;

public class C05_IkiTarihArasiniBulma {
    public static void main(String[] args) {
        LocalDate bugün= LocalDate.now();
        LocalDate dogumGunu= LocalDate.of(1992,1,3);

        System.out.println(Period.between(dogumGunu,bugün)); // P30Y2M28D
        System.out.println(Period.between(dogumGunu,bugün).getYears()); // 30

        // FIXME: 3/31/2022

    }
}
