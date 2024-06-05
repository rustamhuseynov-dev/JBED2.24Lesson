package az.atlacademy.lesson5;

import java.util.Scanner;

public class ExampleApp {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("ayi daxil et : ");
//        int monts = sc.nextInt();
//        switch (monts){
//            case 1:
//                System.out.println("Yanvar");
//                break;
//            case 2:
//                System.out.println("Fevral");
//                break;
//            case 3:
//                System.out.println("Mart");
//                break;
//
//        }
//        sc.close();

        //task2
        Scanner s = new Scanner(System.in);
        System.out.println("eded daxil et : ");
        int num = s.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("*");

        }
        System.out.println();
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }
}
