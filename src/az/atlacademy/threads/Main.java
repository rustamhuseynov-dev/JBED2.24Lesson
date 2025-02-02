package az.atlacademy.threads;

public class Main {
    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();
        threadTest.stop();
        threadTest.start();
    }
}
