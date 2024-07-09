package az.atlacademy.lesson23;

import az.atlacademy.lesson22.classTask.CustomException;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        //oneTask();
        //tooTask();
        //taskThree();
    }

    private static void taskThree() {
        String[] array = new String[]{"Elnur","Kod","Yazir"};
        String writeCodeElnur = "";
        for (int i = 0; i < array.length; i++) {
            writeCodeElnur+=array[i] + " ";
        }
        System.out.println(writeCodeElnur);
    }

    private static boolean tooTask() {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] array = new String[]{"Salam","Necesen","Nicatdi"};
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(a)){
                return true;
            }
        }
        return false;
    }

    private static void oneTask() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        try {
            Integer.parseInt(name);
        }catch (NumberFormatException c){
            throw new CustomException(c);
        }
    }
}
