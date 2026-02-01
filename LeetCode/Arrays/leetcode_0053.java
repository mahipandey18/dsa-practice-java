// Solution
class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int totalSum = 0;
        for(int n : nums){
            if(totalSum < 0){
                totalSum = 0;
            }
            totalSum +=n;
            res = Math.max(res,totalSum);
        }
        return res;
    }
}
