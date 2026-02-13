// LeetCode 19: Remove Nth Node From End of List
// Approach: First, count the total nodes; then traverse to the (count-n)th node and skip the next node; handle edge case when head needs to be removed
// Time Complexity: O(n)
// Space Complexity: O(1)
// Learning: Two-pass approach is simple; careful handling of edge cases like removing the head is important

// Solution
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;

        while(temp!=null){
            count++;
            temp = temp.next;
        }

        if (n == count) {
            return head.next;
        }

        temp = head;
        for(int i = 1; i<count-n; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        
        return head;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
