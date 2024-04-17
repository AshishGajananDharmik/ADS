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

public class BubbleSortDoublyLinkedList {
    public static ListNode bubbleSort(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Already sorted or empty list
        }

        ListNode lastNode = null; // Variable to keep track of last sorted node
        boolean swapped;

        do {
            swapped = false;
            ListNode current = head;

            while (current.next != lastNode) {
                if (current.val > current.next.val) {
                    swapNodes(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
            lastNode = current; // Update last sorted node
        } while (swapped);

        return head;
    }

    private static void swapNodes(ListNode node1, ListNode node2) {
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(64);
        head.next = new ListNode(34);
        head.next.prev = head;
        head.next.next = new ListNode(25);
        head.next.next.prev = head.next;
        head.next.next.next = new ListNode(12);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new ListNode(22);
        head.next.next.next.next.prev = head.next.next.next;
        head.next.next.next.next.next = new ListNode(11);
        head.next.next.next.next.next.prev = head.next.next.next.next;
        head.next.next.next.next.next.next = new ListNode(90);
        head.next.next.next.next.next.next.prev = head.next.next.next.next.next;

        System.out.println("Original List:");
        printList(head);

        head = bubbleSort(head);

        System.out.println("Sorted List:");
        printList(head);
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
