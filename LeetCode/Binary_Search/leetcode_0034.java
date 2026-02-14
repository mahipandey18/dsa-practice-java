// LeetCode 34: Find First and Last Position of Element in Sorted Array  
// Approach: Use two separate binary searches; the first search moves left (high = mid - 1) after finding the target to get the first occurrence, and the second search moves right (low = mid + 1) after finding the target to get the last occurrence  
// Time Complexity: O(log n)  
// Space Complexity: O(1)  
// Learning: Boundary-based binary search allows direct computation of first and last occurrences in a sorted array without linear scanning

// Solution
class Solution {
    public int[] searchRange(int[] nums, int target) {
           int f = first(nums, target);
           int l = last(nums, target);
           return new int[]{f,l};    
    }

    private int first(int[] nums, int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = -1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if (nums[mid] == target) {
                ans = mid;
                high = mid-1; 
            } 
            else if (nums[mid] < target) {
                low = mid+1;
            } 
            else {
                high = mid-1;
            }
        }
        return ans;
    }

    private int last(int[] nums, int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = -1;

        while(low<=high){
            int mid = low+(high-low)/2;
            if (nums[mid] == target) {
                ans = mid;
                low = mid+1; 
            } 
            else if (nums[mid] < target) {
                low = mid+1;
            } 
            else {
                high = mid-1;
            }
        }
        return ans;
    }
}
