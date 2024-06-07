package az.atlacademy.lesson6.Constructor;

public class Employee {
    Integer id;
    String fullName;
    Integer salary;

    public Employee(Integer id, String fullName, Integer salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }
    public Employee(){
        //default cons
    }
    public Employee(Integer id,String fullName){
        this.id = id;
        this.fullName = fullName;
        this.salary = 1000;
    }

}
