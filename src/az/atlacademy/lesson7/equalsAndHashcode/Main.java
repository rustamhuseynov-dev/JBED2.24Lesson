package az.atlacademy.lesson7.equalsAndHashcode;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Money income = new Money(55,"USD");
        Money expenses = new Money(55,"USD");
        boolean balanced = income.equals(expenses);
        System.out.println(balanced);

        //2
        Point p1 = new Point(1,2);
        Point p2 = new Point(1,2);
        System.out.println(p1.equals(p2)); // Point classinda eger Object classin equals ve
        //Hashcode metodunu override etmesen bu kod false verecek cunki referanslari beraber deyil
        //amma metodlari override etsen onda Point classin fieldlari olan id,age onlarin deyerleri
        //muqayise edecek

        //Garbage Collection
        Money m = new Money(11,"s");
        m = new Money(11,"ela");
        System.out.println(m.currencyCode);
        //ilk novbede verdiyimiz m referansin obyekti Garbage Collection terefinden silinir
        //ikinci m = new Moner() yeni obyekt olur

    }
}
