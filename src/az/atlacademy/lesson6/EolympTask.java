package az.atlacademy.lesson6;

import java.util.Scanner;

public class EolympTask {
    public static void main(String[] args) {
        //taskOne();
        //taskToo();
        //taskThree();
        //taskFour();
        //taskFive();
        //taskSix();
        //taskSeven();
        //taskEight();
        //taskNine();
        //taskTen();
        //taskEleven();
        //taskTwelve();
        //taskThirteen();
        //taskFourteen();
        //taskFifteen();
    }

    private static void taskFifteen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("n-i daxil edin : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        sc.close();
    }

    private static void taskFourteen() {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the size of the matrix
        int n = scanner.nextInt();

        // Initialize the matrix
        int[][] matrix = new int[n][n];

        // Fill the matrix with numbers in a "snake" pattern
        int num = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                // Fill left to right for odd lines (0-indexed)
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = num++;
                }
            } else {
                // Fill right to left for even lines (0-indexed)
                for (int j = n - 1; j >= 0; j--) {
                    matrix[i][j] = num++;
                }
            }
        }

        // Print the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }

    private static void taskThirteen() {
        int[] number = {1,2,3,4,5,9,7};
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            count += number[i];
        }
        System.out.println(count);
        System.out.println(number.length);
    }

    private static void taskTwelve() {
        Scanner sc = new Scanner(System.in);
        System.out.println("tam eded daxil edin : ");
        int a = sc.nextInt();
        if (a < 0){
            System.out.println("Error negative number : " + a);
        }else {
            int numberOfDigits = String.valueOf(a).length();
            System.out.println("Sizin verdiyiniz eded : " + a + " ve onun reqem sayi : " + numberOfDigits);
        }
        sc.close();
    }

    private static void taskEleven() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        double x = scanner.nextDouble();

        int sgn;
        if (x > 0) {
            sgn = 1;
        } else if (x == 0) {
            sgn = 0;
        } else {
            sgn = -1;
        }
        System.out.println("The value of the sgn function is: " + sgn);
        scanner.close();
    }

    private static void taskTen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("natural eded daxil edin : ");
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("EVEN");
        }else {
            System.out.println("ODD");
        }
        sc.close();
    }

    private static void taskNine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("uzunlugu : ");
        int a = sc.nextInt();
        System.out.println("eni : ");
        int b = sc.nextInt();
        int result = a * b;
        System.out.println("Duzbucaqlinin sahesi : " + result);
        sc.close();
    }

    private static void taskEight() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    private static void taskSeven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("havanin tempuratoru : ");
        double t = sc.nextDouble();
        if (t >= 0){
            System.out.println("Water");
        }
        else {
            System.out.println("Ice");
        }
        sc.close();
    }

    private static void taskSix() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
            if (num >= 3 && num <= 5){
                System.out.println("Spring");
            } else if (num >= 6 && num <= 8 ) {
                System.out.println("Summer");
            } else if (num >= 9 && num <= 11) {
                System.out.println("Autumn");
            } else if (num == 12 || num <= 2) {
                    System.out.println("Winter");
            }
            sc.close();

    }

    private static void taskFive() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ucreqemli ededi daxil et : ");
        int threeNum = sc.nextInt();
        int firstNum = threeNum / 100;
        int lastNum = threeNum % 10;
        if (firstNum > lastNum){
            System.out.println("birinci eded boyukdur " + firstNum);
        } else if (lastNum > firstNum) {
            System.out.println("ikinci eded boyukdur " + lastNum);
        }
        sc.close();
    }

    private static void taskFour() {
        Scanner sc = new Scanner(System.in);
        System.out.println("bali daxil et : ");
        int num = sc.nextInt();
        if (num >= 1 && num <= 3){
            System.out.println("ilkin");
        } else if (num >= 3 && num <= 6) {
            System.out.println("orta");
        } else if (num >= 6 && num <= 9) {
            System.out.println("kafi");
        }
        else {
            System.out.println("yuksek");
        }
        sc.close();
    }

    private static void taskThree() {
        Scanner sc = new Scanner(System.in);
        System.out.println("n-i daxil et");
        int n = sc.nextInt();
        System.out.println("uzunlugu daxil et : ");
        int m = sc.nextInt();
        int result = 2 * (n + m);
        System.out.println(result);
        sc.close();
    }

    public static void taskToo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nece mektebli var?:");
        int number1 = sc.nextInt();
        System.out.println("nece alma var?:");
        int number2 = sc.nextInt();
        int result = number2/number1;
            System.out.println(result);
            sc.close();
    }

    public static void taskOne() {
        for (int i = 10; i < 99 ; i++) {
            int even = i / 10;
            int odd = i % 10;
            System.out.println(even + " " + odd);
        }
    }
}
