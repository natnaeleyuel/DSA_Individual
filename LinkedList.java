package LinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    // To insert at the end of the list
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = null;
        Node current = head;
        while(current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // To insert a new node at a specific position
    void insertAtPos(int value, int pos) {
        Node newNode = new Node(value);
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 0; current != null && i < pos - 1; i++) {
            current = current.next;
        }
        if (current ==
                null) {
            System.out.println("Position out of bounds");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // To delete a node at a specific position
    void deleteAtPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        if (pos == 0) {
            head = temp.next;
            return;
        }
        for (int i = 0; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds");
            return;
        }
        Node next = temp.next.next;
        temp.next = next;
    }

    // To delete a node after a given node
    void deleteAfterNode(Node deleteAfter) {
        if (deleteAfter == null || deleteAfter.next == null) {
            System.out.println("No node to delete");
            return;
        }
        Node temp = deleteAfter.next;
        deleteAfter.next = temp.next;
    }

    // To search for a node with a specific value
    boolean searchNode(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // To display the linked list
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(4);
        list.insert(5);
        list.insert(6);

        System.out.println("(1) Initial List:");
        list.display();
        System.out.println("\n(2) Inserting 1, 2, 3 at position 0, 1, 2 respectively:");
        list.insertAtPos(1, 0);
        list.insertAtPos(2, 1);
        list.insertAtPos(3, 2);
        list.display();

        System.out.println("\n(3) Deleting node at position 2:");
        list.deleteAtPosition(2);
        list.display();

        System.out.println("\n(4) Deleting node after head:");
        list.deleteAfterNode(list.head);
        list.display();

        System.out.println("\n(5) Searching for node with value 2:");
        System.out.println(list.searchNode(5) ? "Found" : "Not Found");

    }
}
