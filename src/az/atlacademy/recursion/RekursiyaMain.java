package az.atlacademy.recursion;

public class RekursiyaMain {
    static int factorial(int n){
        if (n==1){
            return 1;
        }else {
            return n * factorial(n-2);
        }
    }
    public static void main(String[] args) {
        int num = 5;
        int result = factorial(num);
        System.out.println("Faktorial : " + num + " netice : " + result);
    }
}
