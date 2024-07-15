package az.atlacademy.lesson28;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;

public class SecondLargest {

    public static void main(String[] args) {
        // 1. ArrayList<Integer> yaradırıq
        List<Integer> list = new ArrayList<>();

        // 2. List-i təsadüfi ədədlərlə doldururuq (size = 50)
        Random rand = new Random();
        for (int i = 0; i < 50; i++) {
            list.add(rand.nextInt(100)); // 0-99 arasında təsadüfi ədədlər
        }

        // Listi çap edirik
        System.out.println("Generated List: " + list);

        // 3. Listdən ikinci ən böyük ədədi tapan metod
        int secondLargest = findSecondLargest(list);
        System.out.println("Second Largest Number: " + secondLargest);
    }

    public static int findSecondLargest(List<Integer> list) {

        // Birinci və ikinci ən böyük ədədləri tapmaq
        Integer largest = Integer.MIN_VALUE;
        Integer secondLargest = Integer.MIN_VALUE;

        for (Integer num : list) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && !num.equals(largest)) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }
}

