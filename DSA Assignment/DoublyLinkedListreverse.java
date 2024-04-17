class ListNode {
    int val;
    ListNode prev;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Insert node at the end of the list
    public void insertAtEnd(int val) {
        ListNode newNode = new ListNode(val);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Reverse the doubly linked list
    public void reverseList() {
        ListNode current = head;
        ListNode temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev; // Move to the next node
        }

        if (temp != null) {
            head = temp.prev; // Update the head to the new first node
        }
    }

    // Print the doubly linked list
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        // Insert elements into the doubly linked list
        dll.insertAtEnd(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);
        dll.insertAtEnd(50);

        System.out.println("Original list:");
        dll.printList();

        // Reverse the doubly linked list
        dll.reverseList();

        System.out.println("Reversed list:");
        dll.printList();
    }
}
