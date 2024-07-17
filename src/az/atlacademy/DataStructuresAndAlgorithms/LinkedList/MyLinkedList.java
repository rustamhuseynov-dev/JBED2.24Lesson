package az.atlacademy.DataStructuresAndAlgorithms.LinkedList;


public class MyLinkedList<E> {

    private MyNode<E> head;

    public MyLinkedList(E data, int i) {
        this.head = new MyNode<>(data);
    }

    public MyNode<E> getHead() {
        return head;
    }

    public void setHead(MyNode<E> head) {
        this.head = head;
    }

    public void add(E data) {
        if (head == null) {
            head = new MyNode<>(data);
            return;
        }

        MyNode<E> curr = head;

        while (curr.getNext() != null){
            curr = curr.getNext();
        }
        curr.setNext(new MyNode<>(data));
    }

    public void delete(){
        if (head == null){
            throw new NullPointerException();
        }
        MyNode<E> next = head.getNext();
        for (int i = 0; i < next.getSize(); i++) {
            if (next != null){
                head.setNext(next);
            }
        }


    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}
