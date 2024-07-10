package az.atlacademy.lesson24;

public class Main {
    public static void main(String[] args) {
        Generics<Integer> generics = staticMethod(5);
        System.out.println(generics);
        Generics<Object> objectGenerics = staticMethod(null);
        System.out.println(objectGenerics);
    }

    private static <T> Generics<T> staticMethod(T t) {
        if (t == null){
            return new Generics<>();
        }
        return new Generics<>(t,t.getClass().getName());

    }
}
