package az.atlacademy.threads;

public class ThreadTest extends Thread {
    @Override
    public void run() {
        System.out.println("Thread isleyir: " + Thread.currentThread().getName());
    }
}
