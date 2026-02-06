// LeetCode 344: Reverse String
// Approach: Use two pointers starting from the beginning and end of the character array; swap characters at both pointers and move them inward until they meet
// Time Complexity: O(n)
// Space Complexity: O(1)
// Learning: Two-pointer technique is ideal for in-place array manipulation and avoids using extra space

// Solution
class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while(left < right){
            char temp = s[left]; 
            s[left] = s[right]; 
            s[right] = temp;

            left++;
            right--;
        }
    }
}

