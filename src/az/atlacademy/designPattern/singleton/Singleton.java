package az.atlacademy.designPattern.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton(){
        System.out.println("Singleton created");
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Double-Checked Locking - Singleton
    public static Singleton getDoubleInstance(){
        if (instance==null){
            synchronized (Singleton.class){
                if (instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
