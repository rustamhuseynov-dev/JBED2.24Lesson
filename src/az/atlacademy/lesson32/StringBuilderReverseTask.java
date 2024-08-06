package az.atlacademy.lesson32;

public class StringBuilderReverseTask {
    public static void main(String[] args) {
        String  string = "Hello world Java programming";
        System.out.println(string);
        StringBuilder stringBuilder = new StringBuilder(string);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(reverse);
    }
}
