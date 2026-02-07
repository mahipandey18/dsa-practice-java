// LeetCode 424: Longest Repeating Character Replacement
// Approach: Use a sliding window with two pointers i and j and a frequency array to count characters in the current window; expand the window by moving j and updating the maximum frequency character, and shrink the window from the left when the number of required replacements exceeds k
// Time Complexity: O(n)
// Space Complexity: O(1)
// Learning: The key insight is that a window is valid if (window length − frequency of the most common character) ≤ k, allowing efficient window expansion without recalculating frequencies each time

// Solution
class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int i = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for(int j = 0; j < s.length(); j++){
            freq[s.charAt(j) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(j)-'A']);
            while(((j-i+1) - maxFreq)>k){
                freq[s.charAt(i) -'A']--;
                i++;
            }
            maxLen = Math.max(maxLen, j-i+1);
        }
        return maxLen;
    }
}
