package az.atlacademy.javaproject;

public class Student extends Person{
    int teacherId;

    public Student(int id, String fullName, String role,int age,int teacherId) {
        super(id, fullName, role,age);
        this.teacherId = teacherId;
    }

    public Student(){

    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
