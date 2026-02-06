// LeetCode 125: Valid Palindrome
// Approach: Clean the string by removing non-alphanumeric characters using regex, convert it to lowercase, then use two pointers from both ends to compare characters until they meet
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: Preprocessing a string simplifies comparison logic, and the two-pointer technique efficiently checks palindromes

// Solution
class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int len = s.length();

        int left = 0;
        int right = len-1;
        
        while(left < right && left < len && right >= 0){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
