package az.atlacademy.lesson22.classTask;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2000,12,15);
        Bmw bmw = new Bmw();
        bmw.carYear(localDate);
        bmw.carEngine(1);
        bmw.carYear((LocalDate) null);

    }
}
