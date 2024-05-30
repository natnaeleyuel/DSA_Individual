package LinkedList.ToDoList;

public class ToDoList {
    private Node head;

    // Method to add a new task to the end of the linked list
    public void addToDo(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to mark a task as completed based on its title
    public void markToDoAsCompleted(String title) {
        Node current = head;
        while (current != null) {
            if (current.task.getTitle().equals(title)) {
                current.task.markCompleted();
                return;
            }
            current = current.next;
        }
        System.out.println("Task not found: " + title);
    }

    // Method to display the list of tasks in the to-do list
    public void viewToDoList() {
        Node current = head;
        int count = 0;
        while (current != null) {
            System.out.println(STR."Task \{++count}");
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        // Adding tasks
        toDoList.addToDo(new Task("Visit the Data Center of AAiT", "Arrange a tour of the Addis Ababa Institute of Technology (AAiT) data center to understand its infrastructure, operations, and the technologies used for data storage, management, and security."));
        toDoList.addToDo(new Task("Study for Networking Lab Exam", "Review key concepts and practical skills required for the networking lab exam, including subnetting, IP addressing, router and switch configurations."));
        toDoList.addToDo(new Task("Prepare for Final Exam", "Create a comprehensive study plan covering all course material, focus on areas of weakness, and practice past exam papers to ensure thorough preparation for the final exam."));

        // Viewing the to-do list
        System.out.println("\n[***************|To-Do List|***************]");
        toDoList.viewToDoList();

        // Marking a task as completed
        toDoList.markToDoAsCompleted("Study for Networking Lab Exam");

        // Viewing the to-do list after marking a task as completed
        System.out.println("\nTo-Do List after marking Task 2 as completed:");
        toDoList.viewToDoList();
    }
}
