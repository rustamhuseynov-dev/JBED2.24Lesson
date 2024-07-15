package az.atlacademy.DataStructuresAndAlgorithms;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 14;
        a[1] = 15;
        a[2] = 13;
        a[3] = 12;
        a[4] = 11;
        int[] b = new int[10];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];  // burada bizim a arrayimiz 5 size var və b arrayimizin 10 size var a-nı b-yə boşaldırıq
            for (int j = 0; j < b.length; j++) {
                if (b[j] == 0){
                    b[j] = count + 20;  // burada 0 olan elementleri doldururuq
                    count++;
                }
            }
        }

        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));
    }
}
