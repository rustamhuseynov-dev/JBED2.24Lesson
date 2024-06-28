package az.atlacademy.lesson18;

import java.util.Arrays;
import java.util.Scanner;

public class EolympTask {
    public static void main(String[] args) {
        int[] array = {3, 1, 7, 1, 8, 9, 2, 6, 4, 8, 9};

        System.out.println(Arrays.toString(array));

        replaceMaxMin(array);

        System.out.println(Arrays.toString(array));
    }
    public static void replaceMaxMin(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        int max = array[0];
        int min = array[0];

        for (int num : array) {
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                array[i] = min;
            } else if (array[i] == min) {
                array[i] = max;
            }
        }
    }

}
