package az.atlacademy.lesson26.classtask;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String input;

        System.out.println("String daxil edin (dayandırmaq üçün 'q' daxil edin):");

        while (true) {
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }
            list.add(input);
        }

        System.out.println("Daxil edilen stringler: " + list);

        System.out.println("Silmek istediyiniz elementi daxil edin:");
        String elementToRemove = scanner.nextLine();

        if (list.contains(elementToRemove)) {
            list.remove(elementToRemove);
            System.out.println("Daxil etdiyiniz element ArrayListdən silindi.");
        } else {
            System.out.println("Silmək istədiyiniz element tapılmadı.");
        }
        System.out.println("Güncel ArrayList: " + list);
    }
}
