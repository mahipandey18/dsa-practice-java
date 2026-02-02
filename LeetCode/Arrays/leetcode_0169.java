// LeetCode 169: Majority Element
// Approach: Use Boyer–Moore Voting Algorithm to maintain a candidate and adjust a counter while traversing the array
// Time Complexity: O(n)
// Space Complexity: O(1)
// Learning: Majority element cannot be completely canceled out, making a single-pass constant-space solution possible

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
