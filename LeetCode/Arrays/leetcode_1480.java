// LeetCode 1480: Running Sum of 1D Array
// Approach: Create a prefix sum array where each element is the sum of itself and all previous elements
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: Prefix sum technique helps solve cumulative sum problems efficiently

// Solution
class Solution {
    public int[] runningSum(int[] nums) {
        int arr[] = new int[nums.length];
        arr[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            arr[i] = arr[i - 1] + nums[i];
        }
        return arr;
    }
}
