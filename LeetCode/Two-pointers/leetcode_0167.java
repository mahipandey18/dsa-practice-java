// LeetCode 167: Two Sum II – Input Array Is Sorted
// Approach: Use two pointers starting at the beginning and end of the sorted array; compute the sum and move the left pointer right if the sum is smaller than target, or move the right pointer left if the sum is larger
// Time Complexity: O(n)
// Space Complexity: O(1)
// Learning: In a sorted array, opposite-end two pointers efficiently narrow the search space without nested loops
// Solution
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(left<right){
            int sum = numbers[left]+numbers[right];
            if(sum == target){
                return new int[]{left+1,right+1};
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{};
    }
}
