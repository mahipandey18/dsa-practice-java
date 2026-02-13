// LeetCode 142: Linked List Cycle II
// Approach: Use Floyd’s Cycle Detection to detect the cycle; once slow and fast meet, reset one pointer to head and move both one step at a time; the node where they meet is the cycle start
// Time Complexity: O(n)
// Space Complexity: O(1)
// Learning: After detecting a cycle, moving one pointer to head and advancing both at same speed guarantees they meet at the cycle entry

// Solution
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow==fast){
                slow = head;
                while(slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
