package az.atlacademy.lesson31;

public class BubbleSortTask {
    public static void main(String[] args) {
        int[] numbers = new int[] { 9, 15, 10, 2, 23, 27, 39, 29 };
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j + 1] < numbers[j]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }
    }
}
