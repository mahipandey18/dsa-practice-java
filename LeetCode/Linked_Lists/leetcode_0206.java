// LeetCode 206: Reverse Linked List
// Approach: Iteratively reverse the list using three pointers: prev, curr, and next. For each node, redirect its next pointer to prev and move pointers forward.
// Time Complexity: O(n)
// Space Complexity: O(1)
// Learning: Iterative reversal is efficient and in-place, no extra memory allocation needed


// Solution
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
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null){
            ListNode newNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = newNode;
        }  
        return prev;      
    }
}
