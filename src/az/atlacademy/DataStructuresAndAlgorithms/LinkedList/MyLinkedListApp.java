package az.atlacademy.DataStructuresAndAlgorithms.LinkedList;

public class MyLinkedListApp {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>(5,5);
        myLinkedList.add(90);
        myLinkedList.add(11);
        System.out.println(myLinkedList);
        myLinkedList.delete();
        System.out.println(myLinkedList);

    }
}
