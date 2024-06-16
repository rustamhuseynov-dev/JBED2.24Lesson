package az.atlacademy.lesson13.oopPrinciple.encapsulation;

public class Main {
    public static void main(String[] args) {
        Person p = new Person(); // burada biz Person obyektinin fieldina deyer gondere bilmirik
        p.setName("Kamil"); // lakin set metodu ile deyer atamaq olur
        System.out.println(p.getName());
    }
}
