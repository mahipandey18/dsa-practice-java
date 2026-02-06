// LeetCode 283: Move Zeroes
// Approach: Use two pointers where the right pointer scans the array and the left pointer tracks the position to place the next non-zero element by swapping
// Time Complexity: O(n)
// Space Complexity: O(1)
// Learning: Fast and slow pointer technique helps rearrange elements in-place while preserving order

// Solution
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int l = 0;
        for(int r = 0; r < n; r++){
            if(nums[r] != 0){
                int temp = nums[l]; 
                nums[l] = nums[r]; 
                nums[r] = temp;

                l++;
            }
        }
    }
}
