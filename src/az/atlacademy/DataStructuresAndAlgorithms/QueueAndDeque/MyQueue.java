package az.atlacademy.DataStructuresAndAlgorithms.QueueAndDeque;

import java.util.Deque;
import java.util.LinkedList;

public class MyQueue {

    private static Deque<Operation> operations = new LinkedList<>();

    public static void main(String[] args) {
        doOperation();
        System.out.println(operations);
        doOperation();
        System.out.println(operations);
        doOperation();
        System.out.println(operations);
        doOperation();
        System.out.println(operations);
        doOperation();
        System.out.println(operations);
        ctrlZ();
        System.out.println(operations);
        ctrlZ();
        System.out.println(operations);
        ctrlZ();
        System.out.println(operations);
        ctrlZ();
        System.out.println(operations);


    }

    private static void ctrlZ() {
        operations.pop();
    }

    private static Operation doOperation() {
        operations.push(getRandomOperation());
        return operations.peek();
    }

    public enum Operation{
        END,
        UNDO,
        REDO,
        HOME,
        ENTER,
        RENAME,
        DELETE;
    }
    public static Operation getRandomOperation(){
        final int random = (int) (Math.random() * Operation.values().length);
        return Operation.values()[random];
    }

}
