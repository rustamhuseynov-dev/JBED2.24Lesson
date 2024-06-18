package az.atlacademy.lesson12.project;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee(1,"Saleh",5,"IT");
        System.out.println("salary : " + e.calculateSalary());
        e.printInfo();

        System.out.println("----------");

        Manager m = new Manager(2,"Kamil",10,"IT","IT manager");
        System.out.println("salary : " + m.calculateSalary());
        m.printInfo();

        System.out.println("----------");

        Director d = new Director(3,"Murad",15,"IT","IT Director");
        System.out.println("salary : " + d.calculateSalary());
        d.printInfo();

        System.out.println("------------");
    }
}
