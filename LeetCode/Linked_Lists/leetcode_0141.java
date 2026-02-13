// Solution
// 1. By Hashing
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
