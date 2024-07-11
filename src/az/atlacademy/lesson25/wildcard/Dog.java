package az.atlacademy.lesson25.wildcard;

public class Dog extends Animal{

    public Dog(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }


}
