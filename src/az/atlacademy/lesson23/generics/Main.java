package az.atlacademy.lesson23.generics;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        GenericClass<Integer> genericClass = new GenericClass<>(5);
        int n = genericClass.getData();
        System.out.println(n);
        //burada 2 örnək var
        GenericClass<String> stringGenericClass = new GenericClass<>("Salam");
        String hello = stringGenericClass.getData();
        System.out.println(hello);

        genericsMap();
    }

    private static void genericsMap() {
        // K = String, V = Integer
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


    }
}
