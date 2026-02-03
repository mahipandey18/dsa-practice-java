// LeetCode 125: Valid Palindrome
// Approach: Remove all non-alphanumeric characters using regex, convert the string to lowercase, then compare characters from both ends to check for palindrome
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: Preprocessing the string simplifies the palindrome check logic

// Solution
class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int len = s.length();

        for(int i = 0; i < len; i++){
            if(s.charAt(i) != s.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
}
