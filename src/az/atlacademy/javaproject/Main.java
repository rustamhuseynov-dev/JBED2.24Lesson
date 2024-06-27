package az.atlacademy.javaproject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String teacherName = sc.nextLine();
        String studentName = sc.nextLine();
        int teacherAge = sc.nextInt();
        int studentAge = sc.nextInt();
        Person person = new Person();
        Student student = new Student(1,studentName,"student",teacherAge,1);
        Teacher teacher = new Teacher(1,teacherName,"teacher",studentAge,"IT");
        //
        person.setAge(teacher,teacherAge);
        //

        Course course = new Course();
        course.setName("Developia");
        course.teachers.setScience(teacher.getScience());
        if (teacher.getRole().equals("teacher")){
            teacherInfo(teacher,student,course);
        }
        sc.close();
    }

    private static void teacherInfo(Teacher teacher,Student student ,Course course) {
        student.setTeacherId(teacher.getId());
        System.out.println(teacher.getFullName() + ": " + course.getName() + " kursunda mellimdi");
        System.out.println(teacher.getFullName() + " telebesi : " + student.getFullName());
        System.out.println(teacher.getFullName() + ": " + teacher.getScience() + " dersi kecir");
    }
}
