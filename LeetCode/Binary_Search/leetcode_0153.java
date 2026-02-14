// LeetCode 153: Find Minimum in Rotated Sorted Array  
// Approach: Use modified binary search; compare nums[mid] with nums[high] to determine which half is sorted, move low = mid + 1 if mid is in the left sorted portion, otherwise set high = mid to narrow toward the minimum  
// Time Complexity: O(log n)  
// Space Complexity: O(1)  
// Learning: Comparing mid with high efficiently identifies the unsorted half containing the minimum in a rotated sorted array

// Solution
class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while(low<high){
            int mid = low+(high-low)/2;
            if(nums[mid]>nums[high]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return nums[low];
    }
}
