package az.atlacademy.advanced_java.sealed;

public final class Person extends SealedClass {

    private int salary;

    public Person(String name,int age,int salary){
        super(name,age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "salary=" + salary + "name=" + getName() + "age=" + getAge() +
                '}';
    }
}
