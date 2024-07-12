package az.atlacademy.lesson27.taskToo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // birinci siralama
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("Saleh",15,45.5));
        arrayList.add(new Student("Saleh",14,44.5));
        arrayList.add(new Student("Saleh",13,50.5));
        Collections.sort(arrayList);
        System.out.println("adlari eynidise grade gore sirala");
        for (Student student : arrayList) {
            System.out.println(student);
        }


        List<Student> list = new ArrayList<>();
        list.add(new Student("Cafer",15,2.5));
        list.add(new Student("Babek",15,2.5));
        list.add(new Student("Azer",15,2.5));
        //ikinci siralama
        Collections.sort(list,new ComparatorStudent());
        System.out.println("A-dan Z-ye ada gore sirala");
        for (Student student : list) {
            System.out.println(student);
        }

        //ucuncu siralama Anonim class

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Nicat",25,99));
        studentList.add(new Student("Rasim",30,88));
        studentList.add(new Student("Elsen",23,88));
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getGrade()==o2.getGrade()){
                    return o1.getAge()-o2.getAge();
                }
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("\nSort by Grade (desc) and Age (asc):");
        for (Student student : studentList) {
            System.out.println(student);
        }

    }
}
