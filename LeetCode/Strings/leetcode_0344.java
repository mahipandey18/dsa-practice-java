// LeetCode 344: Reverse String
// Approach: Use two pointers starting from the beginning and end of the array, swapping characters until they meet
// Time Complexity: O(n)
// Space Complexity: O(1)
// Learning: Two-pointer technique allows in-place reversal without extra memory

// Solution
class Solution {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;

        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;

            l++;
            r--;
        }
    }
}
