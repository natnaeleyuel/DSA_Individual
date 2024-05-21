package LinkedList;

public class Stack {

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public Stack() {
        this.top = null;
    }

    // to add an element to the stack
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed element: " + data);
    }

    // to remove and return the top element of the stack
    public void pop() {
        if (top == null) {
            System.out.println("Empty stack");
            return;
        }
        System.out.println("Popped element: " + top.data);
        top = top.next;
    }

    // to return the top element of the stack without removing it
    public void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top element: " + top.data);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(); // For new line

        stack.peek();
        System.out.println();

        stack.pop();
        stack.pop();
        System.out.println();

        stack.peek(); // The top element after pop twice
        System.out.println();

        stack.pop();
        stack.pop();
        System.out.println();

        stack.pop(); // Trying to pop from an empty stack
    }
}
