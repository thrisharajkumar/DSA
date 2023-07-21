package Linked_List;

/*Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, 
where the tail connects to the 1st node (0-indexed). */
public class Linked_List_Cycle {
    // Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

        }
        return false;
    }

}
