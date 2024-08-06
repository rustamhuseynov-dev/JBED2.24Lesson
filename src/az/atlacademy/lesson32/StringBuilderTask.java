package az.atlacademy.lesson32;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringBuilderTask {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "programming");
        String delimiter = "-";
        String result = capitalizeAndJoin(words, delimiter);
        System.out.println(result); // Çıxış: "Hello-World-Java-Programming"
    }

    public static String capitalizeAndJoin(List<String> words, String delimiter) {
        return words.stream()
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(delimiter));
    }
}

