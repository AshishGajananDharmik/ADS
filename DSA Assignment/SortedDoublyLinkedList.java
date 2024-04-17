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

public class SortedDoublyLinkedList {
    private ListNode head;
    private ListNode tail;

    public SortedDoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Insert node in sorted order
    public void insert(int val) {
        ListNode newNode = new ListNode(val);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else if (val <= head.val) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else if (val >= tail.val) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            ListNode current = head;
            while (current != null && current.val < val) {
                current = current.next;
            }

            // Insert newNode before current
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
        }
    }

    // Print the sorted doubly linked list
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortedDoublyLinkedList sortedDll = new SortedDoublyLinkedList();

        // Insert elements into the sorted doubly linked list
        sortedDll.insert(30);
        sortedDll.insert(10);
        sortedDll.insert(50);
        sortedDll.insert(20);
        sortedDll.insert(40);

        System.out.println("Sorted list:");
        sortedDll.printList();
    }
}
