// LeetCode 160: Intersection of Two Linked Lists
// Approach: Use two pointers starting at the heads of the two lists; move each one step at a time, and when a pointer reaches the end, switch it to the head of the other list; the first node where they meet is the intersection, or null if no intersection
// Time Complexity: O(m + n)
// Space Complexity: O(1)
// Learning: Switching heads equalizes the path lengths without computing list lengths, ensuring the pointers meet at the intersection node if it exists

// Solution
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        ListNode l2 = headB;

        while(l1!=l2){
            if(l1!=null){
                l1 = l1.next;
            }
            else{
                l1 = headB;
            }
            if(l2!=null){
                l2=l2.next;
            }
            else{
                l2=headA;
            }
        }
        return l1;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
