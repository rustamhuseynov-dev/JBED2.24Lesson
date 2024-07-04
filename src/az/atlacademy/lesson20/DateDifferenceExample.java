package az.atlacademy.lesson20;

import java.time.LocalDate;
import java.time.Period;

public class DateDifferenceExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2002,12,15);
        LocalDate localDate1 = LocalDate.of(1998,3,12);

        Period period = Period.between(localDate,localDate1);

        System.out.println("il : " + period.getYears());
        System.out.println("ay : " + period.getMonths());
        System.out.println("gun : " + period.getDays());
    }
}
