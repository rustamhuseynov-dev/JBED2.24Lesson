package az.atlacademy.lesson11;

import java.util.Scanner;

public class EolympTask {
    public static void main(String[] args) {
        //taskOne();
        //taskToo();
        //taskThree();
    }

    private static void taskThree() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int friend = n - 1;
        System.out.println(friend);
    }

    private static void taskToo() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result;
        while (n > 0){
            result = n % 10;
            System.out.println(result);
            break;
        }
        sc.close();
    }

    private static void taskOne() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n > 0) {
            int digit = n % 10;
            System.out.print(digit);
            n /= 10;
        }
        scanner.close();
    }
}
