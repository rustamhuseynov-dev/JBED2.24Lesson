package az.atlacademy.lesson13.oopPrinciple.abstraction;

public class Cat extends Animal{
    @Override
    public void sound() {
        System.out.println(getName() + "meow");
    }
}
