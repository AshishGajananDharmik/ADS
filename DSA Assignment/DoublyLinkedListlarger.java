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

public class DoublyLinkedListlarger {
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

    // Find the largest node in the doubly linked list
    public ListNode findLargestNode() {
        ListNode largestNode = null;
        ListNode current = head;

        while (current != null) {
            if (largestNode == null || current.val > largestNode.val) {
                largestNode = current;
            }
            current = current.next;
        }

        return largestNode;
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

        // Find the largest node in the list
        ListNode largestNode = dll.findLargestNode();
        if (largestNode != null) {
            System.out.println("Largest node value: " + largestNode.val);
        } else {
            System.out.println("List is empty.");
        }
    }
}
