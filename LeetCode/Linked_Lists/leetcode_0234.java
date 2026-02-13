// Solution
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode start = head;
        ListNode temp = head;
        int count = 0;

        while(temp!=null){
            count++;
            temp = temp.next;
        }
        
        int arr[] = new int[count];

        for(int i = 0; i<count; i++){
            arr[i] = start.val;
            start = start.next;
        }

        int i = 0;
        int j = count-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;        
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
