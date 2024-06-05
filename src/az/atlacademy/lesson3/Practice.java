package az.atlacademy.lesson3;

import java.util.Scanner;

public class Practice {


    public static void main(String[] args) {
        //task1
        System.out.println("Hello\nAlexandra Abramov!");
        //taskToo(25,55);
        //taskThird(50,5);
        //taskFour(-5,8,6);
        //taskFive();
        //taskSix();
        //taskSeven(8,11);
        //taskNine(25.5,3.5,40.5,4.5);
        taskTenth();

    }

    public static void taskToo(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }

    public static void taskThird(int a, int b){
        int sum = a / b;
        System.out.println(sum);
    }

    public static void taskFour(int a, int b, int c){
        int sum1 = a + b * c;
        System.out.println(sum1);
    }

    public static void taskFive(){
        Scanner scanner = new Scanner(System.in);
        //ilk reqemi daxil et;
        System.out.println("first number : " );
        int num = scanner.nextInt();
        //diger reqemi daxil et;
        System.out.println("second number : ");
        int num1 = scanner.nextInt();
        int sum = num * num;
        System.out.println(num + " x " + num + " = " + sum );
        scanner.close();
    }

    public static void taskSix(){
        Scanner scanner = new Scanner(System.in);
        //first number
        System.out.println("first number : ");
        int num = scanner.nextInt();
        //second number
        System.out.println("second number : ");
        int num1 = scanner.nextInt();
        int sum = num + num1;
        int sum1 = num - num1;
        int sum2 = num * num1;
        int sum3 = num / num1;
        int sum4 = num % num1;
        System.out.println(num + " + " + num1 + " = " + sum);
        System.out.println(num + " - " + num1 + " = " + sum1);
        System.out.println(num + " x " + num1 + " = " + sum2);
        System.out.println(num + " / " + num1 + " = " + sum3);
        System.out.println(num + " mod " + num1 + " = " + sum4);
        scanner.close();


    }

    public static void taskSeven(int num, int count) {
        for (int i = 1; i < count ; i++) {
            int sum = num * i;
            System.out.println(num + " x " + i + " = " + sum);
        }
    }


    public static void taskNine(double a, double b, double c ,double d){
        double sum = (a * b - b * b) / (c - d);
        System.out.println(sum);
    }

    public static void taskTenth(){
        double result = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(result);
    }


}
