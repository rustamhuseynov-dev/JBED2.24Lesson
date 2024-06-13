package az.atlacademy.lesson10.encapsulation;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "Saleh";
        employee.work.setBusiness("Fehle");
        System.out.println(employee.work.getBusiness());

    }
}
