package Linked_List;

public class Palindrome {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;
        ListNode head1 = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;

        }
        prev.next = null;
        ListNode next1 = null;
        ListNode prev1 = null;
        ListNode cur = slow;

        while (cur != null) {
            next1 = cur.next;
            cur.next = prev;
            prev1 = cur;
            cur = next1;
        }
        slow = prev1;
        while (head1 != null && slow != null) {
            if (head1.val != slow.val) {
                return false;
            }
            head1 = head1.next;
            slow = slow.next;
        }
        return true;
    }
}
