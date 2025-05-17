package az.atlacademy.advanced_java.instance_of;

public class MainClass {
    public static void main(String[] args) {
        Developer developer = new Developer();
        if (developer instanceof Person){
            System.out.println("developer classi personda extend eliyir");
        }else {
            System.out.println("extend olunmur");
        }
    }
}
