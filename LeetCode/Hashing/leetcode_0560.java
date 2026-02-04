// LeetCode 560: Subarray Sum Equals K
// Approach: Use prefix sum and a HashMap to store how many times each cumulative sum has occurred; for each new sum, check if (sum - k) exists to count valid subarrays
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: Storing prefix sums with their frequencies allows counting multiple subarrays efficiently, even when negative numbers are present

// Solution
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();

        map.put(0,1);
        int sum = 0;
        int count = 0;

        for(int num : nums){
            sum += num;
            if(map.containsKey(sum - k)){
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0) +1);
        }
        return count;
    }
}
