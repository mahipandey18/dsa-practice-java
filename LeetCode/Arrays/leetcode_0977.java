// LeetCode 977: Squares of a Sorted Array
// Approach: Square each element of the array and store it in a new array, then sort the resulting array
// Time Complexity: O(n log n)
// Space Complexity: O(n)
// Learning: A straightforward solution works, but sorting can be avoided by leveraging the original sorted order

// Solution
class Solution {
    public int[] sortedSquares(int[] nums) {
        int res[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            res[i] = nums[i]*nums[i];
        }
        Arrays.sort(res);
        return res;
    }
}
