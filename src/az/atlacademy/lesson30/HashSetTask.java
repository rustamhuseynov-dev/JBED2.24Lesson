package az.atlacademy.lesson30;

import java.util.HashSet;
import java.util.Scanner;

public class HashSetTask {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Nici");
        names.add("Turac");
        names.add("Elnur");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
            if (names.contains(name)){
                names.remove(name);
            }
        System.out.println(names);
    }
}
