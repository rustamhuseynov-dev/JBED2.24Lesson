package az.atlacademy.lesson26.classtask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListTask {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Integer v = (int) (Math.random() * 100);
            arrayList.add(v);
        }
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);

        //arrayList.remove(24);



    }
}
