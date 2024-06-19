package az.atlacademy.javaproject;

import java.util.Objects;

public class Person {
    int id;
    String fullName;
    String role;
    int age;

    public Person(int id, String fullName, String role, int age) {
        this.id = id;
        this.fullName = fullName;
        this.role = role;
        this.age = age;
    }

    public Person() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(Teacher teacher,int age) {
        if (teacher.getRole().equals("teacher")){
            if (age>20){
                System.out.println("Salam mellim");
            }
            else {
                System.out.println("Salam telebe");
            }
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
