package az.atlacademy.lesson20;

import java.time.LocalDate;

public class AddDaysFromDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("indiki vaxt : " + localDate);

        long daysToAdd = 20;

        LocalDate newDate = localDate.plusDays(daysToAdd);
        System.out.println("yeni vaxt : " + newDate);
    }
}
