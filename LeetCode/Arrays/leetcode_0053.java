// LeetCode 53: Maximum Subarray
// Approach: Apply Kadane’s algorithm by resetting the running sum when it becomes negative and tracking the maximum sum found
// Time Complexity: O(n)
// Space Complexity: O(1)
// Learning: Negative prefix sums hurt future subarrays, so discarding them leads to an optimal linear-time solution

// Solution
class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int totalSum = 0;
        for(int n : nums){
            if(totalSum < 0){
                totalSum = 0;
            }
            totalSum +=n;
            res = Math.max(res,totalSum);
        }
        return res;
    }
}
