package az.atlacademy.lesson36.createArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Elnur");
        list.add("Rustam");
        list.add("Saleh");
        list.add("Emil");
        //list.printList();
        System.out.println(list);
    }
}
