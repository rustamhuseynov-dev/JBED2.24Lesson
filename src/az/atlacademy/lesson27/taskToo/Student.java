package az.atlacademy.lesson27.taskToo;

import java.util.Comparator;

public class Student implements Comparable<Student> {

    private String name;

    private Integer age;

    private Double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {
        if (this.name.equals(o.name)){
            return (int) (o.grade - this.grade);
        }
        return o.grade.compareTo(this.grade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
