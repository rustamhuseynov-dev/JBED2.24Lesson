package az.atlacademy.lesson8;

import java.util.Scanner;

public class EolypmTask {
    public static void main(String[] args) {
        //taskOne();
        //taskToo();
        //taskThree();
        //taskFour();
        //taskFive();
        taskSix();
    }

    private static void taskSix() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>0){
            System.out.println("Positive");
        } else if (n<0) {
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
        sc.close();
    }

    private static void taskFive() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a < b || a > c ){
            System.out.println("OUT");
        }
        else {
            System.out.println("IN");
        }
        sc.close();
    }

    private static void taskFour() {
        Scanner sc = new Scanner(System.in);
        System.out.println("a degerini daxil edin : ");
        int numOne = sc.nextInt();
        System.out.println("b degerini daxil edin : ");
        int numToo = sc.nextInt();
        if (numOne % numToo == 0 ){
            System.out.println(numOne + " degeri " + numToo + " degerine qaliqsiz bolunur");
        }
        else {
            System.out.println("tam bolunmur");
        }
        sc.close();
    }

    private static void taskThree() {
        Scanner sc = new Scanner(System.in);
        System.out.println("n-i daxil edin : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
//        int firstNum = n / 10;
//        int secondNum = n % 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        sc.close();
    }

    private static void taskToo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("reqemi daxil ele : ");
        int num = sc.nextInt();
        if (num>0){
            int firstNum = num / 10;
            int secondNum = num % 10;
            int total = (firstNum * firstNum) + (secondNum * secondNum);
            System.out.println(total);
        }
    }

    private static void taskOne() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Pozitif bir tamsayı giriniz: ");
            int n = scanner.nextInt();

            int sum = 0;

            for (int i = 1; i <= n; i++) {
                sum += i * i;
            }

            System.out.println("1^2 + 2^2 + 3^2 + ... + " + n + "^2 = " + sum);

            scanner.close();
        }
    }

