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
