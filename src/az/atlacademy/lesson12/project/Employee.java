package az.atlacademy.lesson12.project;

public class Employee {

    int no;

    String name;

    int year;

    String department;

    public static final int BASE_SALARY = 500;

    public void work(){
        System.out.println("Employee is working");
    }

    public double calculateSalary(){
        return year * BASE_SALARY;
    }

    public void printInfo(){
        System.out.println("\nNO: " + no);
        System.out.println("name: " + name);
        System.out.println("year: " + year);
        System.out.println("department : " + department);
    }

    public static int getBaseSalary(){
        return BASE_SALARY;
    }

    public Employee(int no, String name, int year, String department) {
        this.no = no;
        this.name = name;
        this.year = year;
        this.department = department;
    }
}
