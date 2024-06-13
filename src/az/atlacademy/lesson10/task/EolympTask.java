package az.atlacademy.lesson10.task;

import java.util.Scanner;

public class EolympTask {
    public static void main(String[] args) {
        //taskOne();
        //taskToo();
        //taskThree();
        //taskFour();
    }

    private static void taskFour() {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        int quarter;
        if (x > 0 && y > 0){
            quarter = 1;
        } else if (x < 0 && y > 0) {
            quarter = 2;
        } else if (x < 0 && y < 0) {
            quarter = 3;
        } else if (x > 0 && y < 0) {
            quarter = 4;
        }
        else {
            quarter = 0;
        }
        System.out.println(quarter);
        sc.close();
    }

    private static void taskThree() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int median;
        if ((a > b && a < c) || (a < b && a > c)) {
            median = a;
        } else if ((b > a && b < c) || (b < a && b > c)) {
            median = b;
        } else {
            median = c;
        }
        System.out.println(median);

        sc.close();
        
    }

    private static void taskToo() {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int num = i / 100;
        int num1 = i % 100;
        int sum = num1 / 10;
        int num2 = i % 10;
        int total = num * sum * num2;
        System.out.println(total);
        sc.close();
    }

    private static void taskOne() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int digitCount;

        if (n == 0) {
            digitCount = 1;
        } else {
            digitCount = 0;
            while (n > 0) {
                n /= 10;
                System.out.println(n);
                digitCount++;
            }
        }
        System.out.println(digitCount);
        scanner.close();
        }
}
