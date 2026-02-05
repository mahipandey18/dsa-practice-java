// LeetCode 128: Longest Consecutive Sequence
// Approach: Use a HashMap to remove duplicate elements, copy the unique keys into an array, sort the array, and then scan it to find the longest consecutive sequence by maintaining a running count and a maximum length
// Time Complexity: O(n log n), due to sorting the unique elements
// Space Complexity: O(n), for the HashMap and the auxiliary array
// Learning: When scanning sorted data for streaks, always reset the current count on breaks and track the maximum separately to avoid mixing multiple sequences

// Solution
class Solution {
    public int longestConsecutive(int[] nums) {
        Map <Integer, Integer> map = new HashMap<>();
        int count = 1;
        int maxLen = 1;

        for(int x : nums){
            map.put(x,1);
        }
        if(map.size() == 0){
            return 0;
        }
        int res[] = new int[map.size()];
        int j = 0;

        for (int val : map.keySet()) {
            res[j++] = val;
        }

        Arrays.sort(res);

        for(int i = 1; i< res.length; i++){
            if(res[i] == res[i-1]+1){
                count ++;
                maxLen = Math.max(maxLen, count);
            }
            else{
                count = 1;
            }
        }
        return maxLen;
    }
}
