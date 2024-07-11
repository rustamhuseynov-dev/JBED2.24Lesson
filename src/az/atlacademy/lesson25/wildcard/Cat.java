package az.atlacademy.lesson25.wildcard;

public class Cat extends Animal{

    public Cat(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }
}
