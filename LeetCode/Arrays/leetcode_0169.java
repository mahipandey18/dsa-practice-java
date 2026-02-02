// Solution
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int num = 0;
        for(int curr : nums){
            if(count == 0){
                num = curr;
            }
            if(curr == num){
                count++;
            }
            else{
                count--;
            }
        }
        return num;
    }
}
