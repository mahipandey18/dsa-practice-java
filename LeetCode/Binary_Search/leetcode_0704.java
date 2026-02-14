// LeetCode 704: Binary Search  
// Approach: Use iterative binary search with two pointers low and high; compute mid = low + (high - low) / 2 to avoid overflow, compare nums[mid] with target, and shrink the search space accordingly until found or exhausted  
// Time Complexity: O(log n)  
// Space Complexity: O(1)  
// Learning: Maintaining correct boundary conditions (low <= high) and safe mid calculation ensures efficient and error-free binary search implementation

// Solution
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = low+(high - low)/2;
            if(target == nums[mid]){
                return mid;
            }
            else if(target<nums[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}
