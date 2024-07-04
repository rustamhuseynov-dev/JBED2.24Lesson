package az.atlacademy.lesson20;

import java.time.LocalDate;
import java.time.Period;

public class SubtractDaysFromDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("vaxt : " + localDate);

        long daysToSubtract = 21;

        LocalDate newDate = localDate.minusDays(daysToSubtract);
        System.out.println("yeni vaxt : " + newDate);
    }
}
