package az.atlacademy.lesson5;

import java.util.Scanner;

public class ForLoopTask {
    public static void main(String[] args) {
        //question1();
        //question2(5);
        //question3();
        //question4(5);
        //question5();
        //question7(0,0);
        //question8();
        //question9();
        //question10();
        question11();
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int number = scanner.nextInt();
//        int reversedNumber = reverseNumber(number);
//        System.out.println("Reversed number: " + reversedNumber);
//        scanner.close();
    }

    private static void question11() {

    }

    private static void question10() {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.println("ilk sayi girin : ");
            int num = sc.nextInt();
            System.out.println("ikinci sayi girin : ");
            int num1 = sc.nextInt();

            int total = num + num1;
            System.out.println("Toplam : " + total);
            System.out.println("yeniden istifade etmek isteyirsinizmi? (isteyirsinizse 'Y',istemirsizse 'N' basin");
            choice = sc.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        sc.close();
    }

    private static void question9() {
        Scanner scanner = new Scanner(System.in);

        // İki sayıyı oku
        System.out.println("İlk sayıyı giriniz:");
        int a = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        int b = scanner.nextInt();

        // Euclidean algoritmasını kullanarak EBOB'u hesapla
        int hcf = calculateHCF(a, b);

        // Sonucu yazdır
        System.out.println(a + " ve " + b + " sayılarının EBOB'u: " + hcf);

        // Scanner'ı kapat
        scanner.close();
    }

    // Euclidean algoritmasını kullanarak EBOB'u hesaplayan metod
    public static int calculateHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


    public static int reverseNumber(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static void question1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("deyeri daxil et : ");
        int num = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < num; i++) {
            System.out.println(count+i);
        }
        scanner.close();
    }

    public static void question2(int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum +=i;
        }
        System.out.println("sum : " + sum);
    }

    public static void question3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("first number : ");
        int num = sc.nextInt();
        int sum;
        for (int i = 0; i < 10; i++) {
            sum = num * i;
            System.out.println(num + "x" + i + "=" + sum);
        }
        sc.close();
    }

    public static void question4(int factNum) {
        Scanner sc = new Scanner(System.in);
        System.out.println("deyeri daxil et : ");
        int num = sc.nextInt();
        for (int i = 1; i < num; i++) {
            factNum *= i;
        }
        System.out.println("yekun deger : " + factNum);
        sc.close();
    }

    public static void question5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ededi daxil et : ");
        int numberFirst = sc.nextInt();
        int result = 1;
        for (int i = 0; i < 10; i++) {
            result *=numberFirst;
        }
        System.out.println(result);
        sc.close();

    }

    public static void question7(int evenSum, int oddSum) {
        Scanner sc = new Scanner(System.in);
        System.out.println("tam eded daxil et : ");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0){
                evenSum += number;
            }
            else {
                oddSum += number;
            }
            sc.close();
        }
        System.out.println("Tek ededlerin cemi : " + oddSum);
        System.out.println("Cut ededlerin cemi : " + evenSum);
    }

    public static void question8() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Musbet eded daxil et : ");
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println("bu bir asal reqemdir : " + num);
        }
        else {
            System.out.println("bu bir asal reqem deyil : " + num);
        }
        sc.close();
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }



}
