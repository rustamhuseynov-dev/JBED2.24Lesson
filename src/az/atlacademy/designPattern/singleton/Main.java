package az.atlacademy.designPattern.singleton;

public class Main {
    public static void main(String[] args) {
        singletonTest();
        doubleCheckedLockingSingleton();
    }

    private static void doubleCheckedLockingSingleton() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        boolean result = singleton2 == singleton;
        System.out.println(result);
    }

    private static void singletonTest() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if (singleton2 == singleton){
            System.out.println("salam");
        }
        else {
            System.out.println("aleykum");
        }
    }

}
