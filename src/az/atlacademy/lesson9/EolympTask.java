package az.atlacademy.lesson9;

import java.util.Scanner;

public class EolympTask {
    public static void main(String[] args) {
        //taskOne();
        //taskToo();
        //taskThree();
        //taskFour();
        //taskFive();
    }

    private static void taskFive() {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        if (month >= 1 && month <= 3) {
            System.out.println("FIRST");
        } else if (month >= 4 && month <= 6) {
            System.out.println("SECOND");
        } else if (month >= 7 && month <= 9) {
            System.out.println("THIRD");
        } else {
            System.out.println("FOURTH");
        }
        sc.close();
    }

    private static void taskFour() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if ((n > 0 && m > 0) || (n < 0 && m < 0)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        sc.close();
    }

    private static void taskThree() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 1){
            System.out.println("ODD");
        }
        else {
            System.out.println("EVEN");
        }
        sc.close();
    }

    private static void taskToo() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= x && x <= b){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        sc.close();
    }

    private static void taskOne() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int max = a;
        if (b > max){
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max){
            max = d;
        }

            System.out.println("en boyuk reqem : " + max);

        sc.close();

    }
}
