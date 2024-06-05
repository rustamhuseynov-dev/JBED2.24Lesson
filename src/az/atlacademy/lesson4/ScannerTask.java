package az.atlacademy.lesson4;

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        //scannerExample();
        fizzBuzzApp();
    }

    public static void fizzBuzzApp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("deyeri daxil et : ");
        int num = sc.nextInt();
        if (num % 3 == 0 && !(num % 5 == 0)) {
            System.out.println("FIZZ");
        } else if (num % 5 == 0 && !(num % 3 == 0)) {
            System.out.println("BUZZ");
        } else if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FIZZBUZZ");
        } else {
            System.out.println(num);
        }
    }

    public static void scannerExample() {
        Scanner sc = new Scanner(System.in);
        System.out.println("deyeri daxil et : ");
        int num = sc.nextInt();
        if (num % 2 == 0 && num > 0) {
            System.out.println("Even");
        } else if (!(num % 2 == 0)) {
            System.out.println("Odd");
        } else if (num == 0) {
            System.out.println("Zero");
        }
        sc.close();
    }
}

