// LeetCode 76: Minimum Window Substring
// Approach: Use a sliding window with two pointers i and j and a frequency array to track required characters from t; expand the window by moving j and decreasing counts, and when all characters are matched (count == 0), try to shrink the window from the left by moving i to find the minimum length valid window
// Time Complexity: O(n)
// Space Complexity: O(1)
// Learning: Sliding window with a fixed-size frequency array efficiently tracks character requirements and helps find optimal substrings in linear time

// Solution
class Solution {
    public String minWindow(String s, String t) {
        int freq[] = new int[128];
        int count = t.length();
        int i = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for(int m = 0; m < t.length(); m++){
            freq[t.charAt(m)]++;
        }

        for(int j = 0; j < s.length(); j++){
            if(freq[s.charAt(j)] > 0){
                count--;
            }
            freq[s.charAt(j)]--;

            while(count == 0){
                if(minLen > j-i+1){
                    minLen = j-i+1;
                    start = i;
                }
                freq[s.charAt(i)]++;
                if(freq[s.charAt(i)] > 0){
                    count++;
                }
                i++;
            }
        }
        if(minLen == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+ minLen);
    }
}
