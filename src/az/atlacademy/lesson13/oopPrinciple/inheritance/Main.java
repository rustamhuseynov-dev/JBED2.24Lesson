package az.atlacademy.lesson13.oopPrinciple.inheritance;

public class Main {
    public static void main(String[] args) {
        //constructorObject();
        //methodObject();

    }

    private static void methodObject() {
        Cat c = new Cat();
        Dog d = new Dog();
        c.setNickname("Mesi");
        c.setAge(1);
        c.sleep();
        c.eat();
        d.setNickname("qara");
        d.setAge(1);
        d.sleep();
        d.eat();
        //
        d.bark();
        c.meow();
    }

    private static void constructorObject() {
        Cat c = new Cat("Mestan",2);
        Dog d = new Dog("Reck" , 5);
        c.eat();
        c.sleep();
        d.eat();
        d.sleep();
        // bunlar child classin oz metodlaridi
        d.bark();
        c.meow();
    }
}
