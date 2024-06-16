package az.atlacademy.lesson13.oopPrinciple.abstraction;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();// bunlar polymorphismdir
        cat.setName("Mesi");//bunlar encapsulationdir setter ile private olan fielda data gonderirik
        dog.setName("Jack");
        cat.sound(); // Animal abstract class oldugu ucun onun metodu {} bloksuz olur yalniz child
        dog.sound(); // classlar vasitesi ile impl metod edib mentiqi kodlari yazmaq olar
    }
}
