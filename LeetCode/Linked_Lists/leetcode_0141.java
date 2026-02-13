// LeetCode 141: Linked List Cycle

// 1. By Hashing

// Approach: Traverse the linked list while storing visited node references in a HashSet; if a node is encountered again (already present in the set), a cycle exists
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: Storing node references (not values) allows cycle detection by identifying repeated memory addresses during traversal

// Solution
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set <ListNode> set = new HashSet<>();
        ListNode temp = head;

        if (head==null)return false;

        while(temp!=null){
            if(set.contains(temp)){
                return true;
            }
            set.add(temp);
            temp = temp.next;
        }
        return false;
    }
}

// 2. Using Two-Pointers (Floyd's Method)

// Approach: Use Floyd’s Cycle Detection algorithm with two pointers (slow and fast); move slow by one step and fast by two steps, and if they ever meet, a cycle exists
// Time Complexity: O(n)
// Space Complexity: O(1)
// Learning: Two-pointer technique detects cycles efficiently without extra space by leveraging relative speed inside a loop

// Solution
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
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
