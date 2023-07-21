package Linked_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Merge_k_Sorted_Lists {

    // Definition for singly-linked list.
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

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;

        List<Integer> newList = new ArrayList<>();
        for (ListNode arr : lists) {
            while (arr != null) {
                newList.add(arr.val);
                arr = arr.next;
            }
        }
        Collections.sort(newList);

        ListNode ans = null;
        ListNode temp = null;
        for (Integer i : newList) {
            if (temp == null) {
                temp = new ListNode(i);
                ans = temp;
            } else {
                temp.next = new ListNode(i);
                temp = temp.next;
            }
        }
        return ans;
    }
}
