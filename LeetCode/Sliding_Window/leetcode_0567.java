// LeetCode 567: Permutation in String
// Approach: Use a fixed-size sliding window of length s1 over s2 and compare character frequencies using two arrays
// Time Complexity: O(n)
// Space Complexity: O(1)
// Learning: Sliding window with frequency matching is ideal for permutation/anagram problems

// Solution
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int freq1[] = new int[26];
        int freq2[] = new int[26];

        if(n1>n2){
            return false;
        }

        for(int i = 0; i < n1; i++){
            freq1[s1.charAt(i)-'a']++;
            //freq2 also to match the freq of 1. (no of elements)
            freq2[s2.charAt(i)-'a']++;
        }
        
        for(int i = 0; i<n2-n1; i++){
            if(matches(freq1,freq2)){
                return true;
            }
            freq2[s2.charAt(i+n1)-'a']++;
            freq2[s2.charAt(i)-'a']--;
        }
        return matches(freq1,freq2);
    }
    public boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}
