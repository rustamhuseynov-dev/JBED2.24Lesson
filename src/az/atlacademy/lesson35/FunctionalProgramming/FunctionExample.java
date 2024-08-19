package az.atlacademy.lesson35.FunctionalProgramming;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample {
    public static void main(String[] args) {

        Function<String, Integer> function = s -> s.length();

        function = f -> f.length();
        int result = function.apply("Salam");
        System.out.println(result);

        Predicate<String> predicate = s -> false;

    }
}
