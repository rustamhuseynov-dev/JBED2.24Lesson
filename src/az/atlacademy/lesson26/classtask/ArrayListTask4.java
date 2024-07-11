package az.atlacademy.lesson26.classtask;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        double input;

        System.out.println("Double tipində ədədlər daxil edin (dayandırmaq üçün hər hansı bir ədədi daxil etməyin):");

        // Kullanıcıdan double tipinde veri alma
        while (true) {
            String userInput = scanner.nextLine();
            // Boş input girilirse döngüden çık
            if (userInput.isEmpty()) {
                break;
            }
            try {
                input = Double.parseDouble(userInput);
                list.add(input);
            } catch (NumberFormatException e) {
                System.out.println("Xahiş olunur düzgün double ədədi daxil edin.");
            }
        }

        // ArrayList'i ekrana yazdırma
        System.out.println("Daxil edilən double ədədlər: " + list);

        // ArrayList'teki elemanların aritmetik ortalamasını hesaplama
        if (!list.isEmpty()) {
            double sum = 0;
            for (double num : list) {
                sum += num;
            }
            double average = sum / list.size();
            System.out.println("Ədədi orta: " + average);
        } else {
            System.out.println("Heç bir ədəd daxil edilməyib.");
        }
    }
}

