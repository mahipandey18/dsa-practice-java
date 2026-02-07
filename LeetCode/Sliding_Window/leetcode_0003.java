// LeetCode 3: Longest Substring Without Repeating Characters
// Approach: Use a sliding window with two pointers i and j and a HashSet to track characters in the current window; expand the window by moving j, and shrink it from the left by moving i whenever a duplicate character is found
// Time Complexity: O(n)
// Space Complexity: O(min(n, charset))
// Learning: Sliding window with a HashSet efficiently maintains a substring with unique characters while dynamically adjusting its size

// Solution
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> c = new HashSet<>();
        int n = s.length();
        int i = 0;
        int maxLen = 0;
        for(int j = 0; j < n; j++){
            while(c.contains(s.charAt(j))){
                c.remove(s.charAt(i));
                i++;
            }
            c.add(s.charAt(j));
            maxLen = Math.max(maxLen, j-i+1);
        }
        return maxLen;
    }
}
