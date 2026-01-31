// leetcode 1480: running sum of 1d array
// approach: create a prefix sum array where each element is the sum of itself and all previous elements
// time complexity: o(n)
// space complexity: o(n)
// learning: prefix sum technique helps solve cumulative sum problems efficiently

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
