// LeetCode 1: Two Sum
// Approach: Use two nested loops to check all possible pairs and return indices when their sum equals the target
// Time Complexity: O(n^2)
// Space Complexity: O(1)
// Learning: Brute-force solutions are easy to implement but do not scale well for large inputs

// Solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = 1+i; j < nums.length; j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }        
        }
        return new int[]{};
   }
}
