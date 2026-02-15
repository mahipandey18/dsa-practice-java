// LeetCode 704: Binary Search  
// Approach: Iterate through the array linearly and compare each element with the target; update the index if a match is found and return -1 if the target does not exist  
// Time Complexity: O(n)  
// Space Complexity: O(1)  
// Learning: Linear search guarantees correctness but does not utilize the sorted property of the array, missing the intended O(log n) binary search optimization

// Solution
class Solution {
    public int search(int[] nums, int target) {
        int ans = -1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target){
                ans = i;
            }
        }
        return ans;
    }
}
