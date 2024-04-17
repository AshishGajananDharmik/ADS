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

public class DoublyLinkedListdelete {
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

    // Delete a node from the list
    public void deleteNode(ListNode nodeToDelete) {
        if (nodeToDelete == null) {
            return;
        }

        // Update pointers of adjacent nodes
        if (nodeToDelete.prev != null) {
            nodeToDelete.prev.next = nodeToDelete.next;
        } else {
            head = nodeToDelete.next; // Update head if deleting the first node
        }

        if (nodeToDelete.next != null) {
            nodeToDelete.next.prev = nodeToDelete.prev;
        } else {
            tail = nodeToDelete.prev; // Update tail if deleting the last node
        }

        // Clear pointers of the node to be deleted
        nodeToDelete.prev = null;
        nodeToDelete.next = null;
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

        // Delete node with value 30
        ListNode nodeToDelete = dll.head.next.next; // Node with value 30
        dll.deleteNode(nodeToDelete);

        System.out.println("List after deleting node with value 30:");
        dll.printList();
    }
}
