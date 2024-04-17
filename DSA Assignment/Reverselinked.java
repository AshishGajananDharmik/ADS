class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the beginning of the list
    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Method to reverse the linked list
    void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Method to display the elements of the list
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Reverselinked  {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();
        myList.insert(10);
        myList.insert(20);
        myList.insert(30);
        myList.insert(40);
        System.out.println("Original list:");
        myList.display();

        myList.reverse();
        System.out.println("Reversed list:");
        myList.display();
    }
}
