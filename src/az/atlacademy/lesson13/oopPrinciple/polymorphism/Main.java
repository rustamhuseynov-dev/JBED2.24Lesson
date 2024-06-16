package az.atlacademy.lesson13.oopPrinciple.polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(); // burada animal classini create oldu
        Animal cat = new Cat(); // burada Animal classinda extend olmus cat create olur
        Animal dog = new Dog(); //  burada Animal classinda extend olmus dog create olur

        animal.sound(); //burada Animal yeni parent classin metodu cagrilir
        cat.sound(); // burada override olmus sekilde cagrilir buna polymorphism deyilir.
        dog.sound();
    }
}
