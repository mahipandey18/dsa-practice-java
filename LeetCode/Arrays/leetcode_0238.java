// LeetCode 238: Product of Array Except Self
// Approach: Compute prefix (left) and suffix (right) product arrays and multiply them to get the result for each index
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: Splitting the product into independent left and right parts avoids division and handles zero values safely

// Solution
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int output[] = new int[n];

        //left
        left[0] = 1;
        for(int i = 1; i<n; i++){
            left[i] = left[i-1]*nums[i-1];
        }

        //right
        right[n-1] = 1;
        for(int j = n-2; j>= 0; j--){
            right[j] = right[j+1]*nums[j+1];
        }

        for(int k = 0; k<n; k++){
            output[k] = left[k]*right[k];
        }
        return output;
    }
}
