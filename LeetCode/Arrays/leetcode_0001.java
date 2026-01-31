// LeetCode 1: Two Sum
// Approach: Use two nested loops to check all possible pairs and return indices when their sum equals the target
// Learning: Brute-force solutions are simple to implement but have O(n^2) time complexity, which can be optimized using hashing

//Solution
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
