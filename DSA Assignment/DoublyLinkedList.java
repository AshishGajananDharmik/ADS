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

    // Insert node at the beginning of the list
    public void insertAtBeginning(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
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

    // Insert node after a specific node in the list
    public void insertAfter(ListNode prevNode, int val) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null.");
            return;
        }

        ListNode newNode = new ListNode(val);
        newNode.next = prevNode.next;
        if (prevNode.next != null) {
            prevNode.next.prev = newNode;
        }
        prevNode.next = newNode;
        newNode.prev = prevNode;
        if (prevNode == tail) {
            tail = newNode; // Update tail if inserted after the last node
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

        dll.insertAtBeginning(10); // Insert 10 at the beginning
        dll.insertAtEnd(20); // Insert 20 at the end
        dll.insertAtBeginning(5); // Insert 5 at the beginning
        dll.insertAfter(dll.head.next, 15); // Insert 15 after the second node

        dll.printList(); // Print the doubly linked list: 5 10 15 20
    }
}
