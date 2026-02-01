// LeetCode 724: Find Pivot Index
// Approach: Compute total sum first, then iterate while maintaining left sum and derive right sum using total - leftSum - current
// Time Complexity: O(n)
// Space Complexity: O(1)
// Learning: Prefix sum logic allows comparing left and right partitions in a single pass without extra space

// Solution
class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int num : nums){
            total +=num;
        }
        int leftSum = 0;
        for(int i = 0; i < nums.length; i++){
            int rightSum = total - leftSum - nums[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
