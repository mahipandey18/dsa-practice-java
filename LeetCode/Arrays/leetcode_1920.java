// LeetCode 1920: Build Array From Permutation
// Approach: Create a new array and for each index i assign nums[nums[i]] to the result array
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: Direct indexing allows building permutation-based arrays efficiently in a single pass

// Solution
class Solution {
    public int[] buildArray(int[] nums) {
        int arr[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}
