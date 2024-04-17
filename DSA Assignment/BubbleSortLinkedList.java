class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class BubbleSortLinkedList {
    public static ListNode bubbleSort(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Already sorted or empty list
        }

        boolean swapped;
        ListNode dummy = new ListNode(-1); // Dummy node to handle the case when head changes
        dummy.next = head;

        do {
            swapped = false;
            ListNode prev = dummy;
            ListNode curr = head;
            ListNode nextNode = head.next;

            while (nextNode != null) {
                if (curr.val > nextNode.val) {
                    // Swap nodes
                    prev.next = nextNode;
                    curr.next = nextNode.next;
                    nextNode.next = curr;
                    swapped = true;
                }
                prev = prev.next;
                curr = curr.next;
                nextNode = curr != null ? curr.next : null;
            }
        } while (swapped);

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(64);
        head.next = new ListNode(34);
        head.next.next = new ListNode(25);
        head.next.next.next = new ListNode(12);
        head.next.next.next.next = new ListNode(22);
        head.next.next.next.next.next = new ListNode(11);
        head.next.next.next.next.next.next = new ListNode(90);

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
