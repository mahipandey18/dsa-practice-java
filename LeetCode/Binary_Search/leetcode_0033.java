// LeetCode 33: Search in Rotated Sorted Array  
// Approach: Use modified binary search; at each step determine which half is sorted by comparing nums[low] and nums[mid], then check if the target lies within the sorted half and adjust low or high accordingly  
// Time Complexity: O(log n)  
// Space Complexity: O(1)  
// Learning: In rotated sorted arrays, one half is always sorted, and combining sorted-half detection with boundary checks enables efficient logarithmic search

// Solution
class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target)
                return mid;

            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
