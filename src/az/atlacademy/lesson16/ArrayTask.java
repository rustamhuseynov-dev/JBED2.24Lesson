package az.atlacademy.lesson16;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
       //TaskOne();
       //TaskToo();
        TaskThree();


    }

    private static void TaskThree() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            if (array[i] % 2 == 1){
                System.out.println(array[i]);
            }
        }

    }

    private static void TaskToo() {
        int[] arrays = new int[10];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * 100);
            if (arrays[i] % 2 == 1){
                System.out.println(arrays[i]);
            }
        }
    }

    private static void TaskOne() {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 5);
        }
        System.out.println(Arrays.toString(array));
    }
}
