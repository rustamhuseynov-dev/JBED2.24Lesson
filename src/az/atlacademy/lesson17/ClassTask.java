package az.atlacademy.lesson17;

import java.util.Scanner;

public class ClassTask {
    public static void main(String[] args) {
        taskOne();
    }

    private static void taskOne() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int sum = 0;
        long prod = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            sum += array[i];
            prod *= array[i];
        }
        System.out.println(sum);
        System.out.println(prod);
    }
}
