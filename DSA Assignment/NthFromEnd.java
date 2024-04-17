class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class NthFromEnd {
    public ListNode findNthFromEnd(ListNode head, int n) {
        if (head == null || n <= 0) {
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        // Move the fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return null; // n is greater than the length of the list
            }
            fast = fast.next;
        }
        
        // Move both pointers until the fast pointer reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow; // slow pointer is now at the nth node from the end
    }
    
    public static void main(String[] args) {
        NthFromEnd nthFromEnd = new NthFromEnd();
        
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        int n = 2; // Find the 2nd element from the end
        
        ListNode nthNode = nthFromEnd.findNthFromEnd(head, n);
        if (nthNode != null) {
            System.out.println("Value of " + n + "th node from end: " + nthNode.val);
        } else {
            System.out.println("Invalid input or node not found.");
        }
    }
}
