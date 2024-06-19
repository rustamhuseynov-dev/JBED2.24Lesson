package az.atlacademy.javaproject;

public class Teacher extends Person{
    String science;

    public Teacher(int id, String fullName, String role,int age,String science) {
        super(id, fullName, role,age);
        this.science = science;
    }

    public Teacher(){

    }

    public String getScience() {
        return science;
    }

    public void setScience(String science) {
        this.science = science;
    }
}
