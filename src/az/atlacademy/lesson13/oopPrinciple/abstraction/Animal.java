package az.atlacademy.lesson13.oopPrinciple.abstraction;

abstract class Animal {
    private String name; // encapsulation get ve set metodlari sayesinde field elimiz catir

    public abstract void sound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
