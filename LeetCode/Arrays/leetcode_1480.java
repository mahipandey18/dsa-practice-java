// LeetCode 1480: Running Sum of 1d Array
// Approach: Create a prefix sum array where each element stores the sum of all previous elements including itself
// Learning: Prefix sum technique allows cumulative calculations in linear time using previous results

//Solution
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
