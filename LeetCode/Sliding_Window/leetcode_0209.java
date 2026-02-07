// LeetCode 209: Minimum Size Subarray Sum
// Approach: Use a sliding window with two pointers i and j; expand the window by moving j to add elements to the sum, and shrink the window by moving i when the sum is >= target
// Time Complexity: O(n)
// Space Complexity: O(1)
// Learning: Sliding window avoids checking all subarrays and efficiently finds the smallest valid window

// Solution
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i = 0;
        int sum = 0;
        int minLen = n+1;

        for(int j = 0; j<n;j++){
            sum += nums[j];
            while(sum>=target){
                minLen = Math.min(minLen, j-i+1);
                sum-=nums[i];
                i++;
            }
        }
        if(minLen == n+1){
            return 0;
        }
        return minLen;
    }
}
