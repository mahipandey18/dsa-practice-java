// LeetCode 242: Valid Anagram
// Approach: Convert both strings to character arrays, sort them, and compare for equality
// Time Complexity: O(n log n)
// Space Complexity: O(n)
// Learning: Sorting provides a simple and readable way to verify anagrams

// Solution
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        char [] a = s.toCharArray();
        char [] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}
