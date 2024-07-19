package az.atlacademy.lesson29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BinarySearchExample {

    public static void main(String[] args) {
        // Random integer-ləri ArrayList-ə əlavə etmək
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));  // 0-dan 999-a qədər random ədədlər
        }

        // ArrayList-i sıralamaq
        Collections.sort(list);

        // Listi çap edirik (istəyə bağlı)
        System.out.println("Sorted List: " + list);

        // Binary search üçün bir element seçirik
        int target = 14;

        // Elementi binary search metodu ilə axtarırıq
        int index = binarySearch(list, target);

        // Nəticəni çap edirik
        if (index != -1) {
            System.out.println("Element " + target + " is found at index: " + index);
        } else {
            System.out.println("Element " + target + " is not found in the list.");
        }
    }

    // Binary search metodu
    public static int binarySearch(ArrayList<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Element ortada yerləşibsə, onu qaytarırıq
            if (list.get(mid) == target) {
                return mid;
            }

            // Element ortadan kiçikdirsə, sağ alt listi yoxlayırıq
            if (list.get(mid) < target) {
                left = mid + 1;
            } else {
                // Element ortadan böyükdürsə, sol alt listi yoxlayırıq
                right = mid - 1;
            }
        }

        // Element tapılmayıbsa, -1 qaytarırıq
        return -1;
    }
}
