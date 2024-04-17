class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // An empty list or a list with one node is considered a palindrome
        }
        
        // Step 1: Find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // Step 2: Reverse the second half of the linked list
        ListNode secondHalf = reverseLinkedList(slow);
        
        // Step 3: Compare the first half with the reversed second half
        ListNode p1 = head;
        ListNode p2 = secondHalf;
        while (p2 != null) {
            if (p1.val != p2.val) {
                return false; // Not a palindrome
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        
        return true; // Palindrome
    }
    
    private ListNode reverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev; // Return the new head of the reversed list
    }
    
    public static void main(String[] args) {
        PalindromeLinkedList palindromeChecker = new PalindromeLinkedList();
        
        // Example 1: Palindrome linked list
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(2);
        head1.next.next.next.next = new ListNode(1);
        System.out.println("Is linked list 1 a palindrome? " + palindromeChecker.isPalindrome(head1));
        
        // Example 2: Non-palindrome linked list
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        System.out.println("Is linked list 2 a palindrome? " + palindromeChecker.isPalindrome(head2));
    }
}
