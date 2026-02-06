// LeetCode 977: Squares of a Sorted Array
// Approach: Use two pointers at the beginning and end of the sorted array; compare squared values and place the larger square at the end of the result array, moving pointers inward
// Time Complexity: O(n)
// Space Complexity: O(n)
// Learning: In a sorted array, opposite-end two pointers combined with filling from the back avoid unnecessary sorting

// Solution
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int l = 0;
        int r = n - 1;
        int pos = n - 1;

        while (l <= r) {
            int lsq = nums[l]*nums[l];
            int rsq = nums[r]*nums[r];

            if (lsq > rsq) {
                res[pos] = lsq;
                l++;
            } else {
                res[pos] = rsq;
                r--;
            }
            pos--;
        }
        return res;
    }
}
