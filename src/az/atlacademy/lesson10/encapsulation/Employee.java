package az.atlacademy.lesson10.encapsulation;

public class Employee extends Person{
    Integer salary;
    Work work;

    public Employee(Integer salary, Work work) {
        this.salary = salary;
        this.work = work;
    }

    public Employee() {
        this.work = new Work();
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
}
