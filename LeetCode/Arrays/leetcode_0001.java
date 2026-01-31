// leetcode 1: two sum
// approach: use two nested loops to check all possible pairs and return indices when their sum equals the target
// time complexity: o(n^2)
// space complexity: o(1)
// learning: brute-force solutions are easy to implement but do not scale well for large inputs

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
