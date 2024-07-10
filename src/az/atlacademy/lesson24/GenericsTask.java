package az.atlacademy.lesson24;

public class GenericsTask {
    public static void main(String[] args) {
        Box<Integer> b = randomNumber();
        System.out.println(b);
    }

    private static Box<Integer> randomNumber() {
        int v = (int) (Math.random() * 100);
        Box<Integer> box = new Box<>(true,v);
        boolean isEven = box.getData()%2==0;
        if (isEven){
            return new Box<>(isEven,v);
        }else {
            return new Box<>(false,v);
        }
    }
}
