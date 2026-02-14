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
