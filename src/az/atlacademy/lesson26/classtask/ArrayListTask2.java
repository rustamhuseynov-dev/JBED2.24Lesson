package az.atlacademy.lesson26.classtask;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTask2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Elnur");
        arrayList.add("Saleh");
        arrayList.add("Rasim");
        arrayList.add("Knyaz");

            if (arrayList.contains(name)){
                System.out.println(name);
            }
            else {
                System.out.println("not found");
            }
        }
}
