package az.atlacademy.lesson3;

import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {
        //taskOne(7.5,2);
        //taskToo();
        //taskThree();
        //taskFour(10,15);
        //taskFive();
    }

    public static void taskOne(double radius, double num){
        double perimeter = num * Math.PI * radius;

        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }

    public static void taskToo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("first number : ");
        int num1 = sc.nextInt();
        System.out.println("second number : ");
        int num2 = sc.nextInt();
        System.out.println("third number : ");
        int num3 = sc.nextInt();

        System.out.println("the average of the numbers is : " + (num1 + num2 + num3) / 3);
        sc.close();
    }

    public static void taskThree(){
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 70; j++) {
                if(i < 9 && j < 12){
                    if((i+j)%2 == 0 && j != 11){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("=");
                }
            }
            System.out.println();
        }
    }

    public static void taskFour(int a,int b){
        System.out.println("ilkin deyer : " + a + "," + b);
        int sum = a;
        a = b;
        b = sum;
        System.out.println("Sonuncu deyer : " + sum);
    }

    public static void taskFive() {
            for (int j = 0; j < 7; j++) {
                if (j < 1){
                    System.out.print("  + ");
                }else if (j<6){
                    System.out.print("\"");
                } else if (j==6) {
                    System.out.println("+");
                }
            }
            for (int j = 0; j < 9; j++) {
                if (j==0){
                    System.out.print("[ ");
                } else if (j==1) {
                    System.out.print("|");
                } else if (j==3 || j ==5) {
                    System.out.print(" o");
                } else if (j==7) {
                    System.out.print("  |");
                } else if (j==8){
                    System.out.println(" ]");
                }
            }
            for (int j = 0; j < 8; j++) {
                if (j==1){
                    System.out.print("  | ");
                } else if (j==4) {
                    System.out.print(" ^ ");
                }
                else if (j==7){
                    System.out.println("  | " );
                }
            }
        for (int i = 0; i < 10; i++) {
            if (i==1){
                System.out.print("  |");
            } else if (i==4) {
                System.out.print(" '");
            } else if (i==5) {
                System.out.print("-");
            } else if (i==6) {
                System.out.print("'");
            } else if (i==9) {
                System.out.println("  |");
            }
        }
        for (int j = 0; j < 7; j++) {
            if (j < 1){
                System.out.print("  +");
            }else if (j<6){
                System.out.print("-");
            } else if (j==6) {
                System.out.println(" +");
            }
        }

        

    }

}
