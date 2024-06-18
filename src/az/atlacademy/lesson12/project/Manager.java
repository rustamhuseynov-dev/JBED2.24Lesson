package az.atlacademy.lesson12.project;

public class Manager extends Employee{
    String departmentManaged;
    public static final int MANAGEMENT_PAYMENT = 5000;

    public Manager(int no, String name, int year, String department,String departmentManaged) {
        super(no, name, year, department);
        this.departmentManaged = departmentManaged;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Manager department : " + departmentManaged);
    }

    @Override
    public double calculateSalary() {
        return year * BASE_SALARY + MANAGEMENT_PAYMENT;
    }

    @Override
    public void work() {
        System.out.println("Manager is working");
        manage();
    }

    void manage() {
        System.out.println("Manager manages IT Department");
    }
}
