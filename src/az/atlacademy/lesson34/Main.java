package az.atlacademy.lesson34;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        ClassA classA = new ClassA(1,"Rustam",21);

        // Obyekti fayla yazmaq
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("lesson33a.txt"))) {
            oos.writeObject(classA);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Obyekti fayldan oxumaq
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("lesson33a.txt"))) {
            ClassA readPerson = (ClassA) ois.readObject();
            System.out.println(readPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
