// Solution
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i = 0;
        int sum = 0;
        int minLen = n+1;

        for(int j = 0; j<n;j++){
            sum += nums[j];
            while(sum>=target){
                minLen = Math.min(minLen, j-i+1);
                sum-=nums[i];
                i++;
            }
        }
        if(minLen == n+1){
            return 0;
        }
        return minLen;
    }
}
