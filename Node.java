package LinkedList.ToDoList;

class Node {
    Task task;
    Node next;

    // Constructor to initialize a node with a task
    public Node(Task task) {
        this.task = task;
        this.next = null; // Initially, next is null
    }
}