package az.atlacademy.lesson13.oopPrinciple.abstraction;

public class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println(getName() + "bark");
    }
}
