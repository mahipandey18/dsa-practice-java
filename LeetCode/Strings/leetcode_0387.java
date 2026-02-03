// LeetCode 387: First Unique Character in a String
// Approach: Use a HashMap to count the frequency of each character, then iterate through the string to find the first character with frequency one
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: Combining a frequency map with ordered string traversal helps identify the first unique character efficiently

// Solution
class Solution {
    public int firstUniqChar(String s) {
        Map <Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0) + 1);
        }

        for(int i = 0; i<s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
