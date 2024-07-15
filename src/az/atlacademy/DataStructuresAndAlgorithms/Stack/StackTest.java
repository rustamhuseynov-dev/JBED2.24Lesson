package az.atlacademy.DataStructuresAndAlgorithms.Stack;

public class StackTest {
    public static void main(String[] args) {
        //shouldPopWhenStackHasValues();
        //shouldReturnNullWhenStackIsEmpty();
        //shouldFailWhenPushingToAFullStack();
        shouldPeekWhenStackHasValues();

    }

    private static void shouldPeekWhenStackHasValues() {
        MyStack myStack = new MyStack(3);
        if (myStack.peek() == null) {
            myStack.push(25);
            myStack.push(50);
        }
        System.out.println(myStack);
    }

    private static void shouldFailWhenPushingToAFullStack() {
        MyStack<Integer> myStack = new MyStack(3);
        myStack.push(25);
        myStack.push(30);
        myStack.push(45);
        myStack.push(50);
    }

    private static void shouldReturnNullWhenStackIsEmpty() {
        MyStack<Integer> myStack = new MyStack(3);
        System.out.println(myStack.pop());
    }

    private static void shouldPopWhenStackHasValues() {
        MyStack<Integer> myStack = new MyStack(3);
        myStack.push(25);
        myStack.push(30);
        myStack.push(45);
        System.out.println(myStack);
    }
}
